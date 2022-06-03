package com.devon.application.mzm.bookingmanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.SeatEntity;
import com.devon.application.mzm.bookingmanagement.logic.api.to.SeatSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link SeatEntity}
 */
public interface SeatRepository extends DefaultRepository<SeatEntity> {

  /**
   * @param criteria the {@link SeatSearchCriteriaTo} with the criteria to search.
   * @return the {@link Page} of the {@link SeatEntity} objects that matched the search. If no pageable is set, it will
   *         return a unique page with all the objects that matched the search.
   */
  default Page<SeatEntity> findByCriteria(SeatSearchCriteriaTo criteria) {

    SeatEntity alias = newDslAlias();
    JPAQuery<SeatEntity> query = newDslQuery(alias);

    Integer seatNumber = criteria.getSeatNumber();
    if (seatNumber != null) {
      query.where($(alias.getSeatNumber()).eq(seatNumber));
    }
    Long auditorium = criteria.getAuditoriumId();
    if (auditorium != null) {
      query.where($(alias.getAuditorium().getId()).eq(auditorium));
    }
    if (criteria.getPageable() == null) {
      criteria.setPageable(PageRequest.of(0, Integer.MAX_VALUE));
    } else {
      addOrderBy(query, alias, criteria.getPageable().getSort());
    }

    return QueryUtil.get().findPaginated(criteria.getPageable(), query, true);
  }

  /**
   * Add sorting to the given query on the given alias
   * 
   * @param query to add sorting to
   * @param alias to retrieve columns from for sorting
   * @param sort specification of sorting
   */
  public default void addOrderBy(JPAQuery<SeatEntity> query, SeatEntity alias, Sort sort) {

    if (sort != null && sort.isSorted()) {
      Iterator<Order> it = sort.iterator();
      while (it.hasNext()) {
        Order next = it.next();
        switch (next.getProperty()) {
          case "seatNumber":
            if (next.isAscending()) {
              query.orderBy($(alias.getSeatNumber()).asc());
            } else {
              query.orderBy($(alias.getSeatNumber()).desc());
            }
            break;
          case "auditorium":
            if (next.isAscending()) {
              query.orderBy($(alias.getAuditorium().getId().toString()).asc());
            } else {
              query.orderBy($(alias.getAuditorium().getId().toString()).desc());
            }
            break;
          default:
            throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
        }
      }
    }
  }

}