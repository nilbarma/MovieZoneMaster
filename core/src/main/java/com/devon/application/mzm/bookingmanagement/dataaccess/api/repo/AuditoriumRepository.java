package com.devon.application.mzm.bookingmanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.AuditoriumEntity;
import com.devon.application.mzm.bookingmanagement.logic.api.to.AuditoriumSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link AuditoriumEntity}
 */
public interface AuditoriumRepository extends DefaultRepository<AuditoriumEntity> {

  /**
   * @param criteria the {@link AuditoriumSearchCriteriaTo} with the criteria to search.
   * @return the {@link Page} of the {@link AuditoriumEntity} objects that matched the search. If no pageable is set, it
   *         will return a unique page with all the objects that matched the search.
   */
  default Page<AuditoriumEntity> findByCriteria(AuditoriumSearchCriteriaTo criteria) {

    AuditoriumEntity alias = newDslAlias();
    JPAQuery<AuditoriumEntity> query = newDslQuery(alias);

    Integer seatCount = criteria.getSeatCount();
    if (seatCount != null) {
      query.where($(alias.getSeatCount()).eq(seatCount));
    }
    Long theatre = criteria.getTheatreId();
    if (theatre != null) {
      query.where($(alias.getTheatre().getId()).eq(theatre));
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
  public default void addOrderBy(JPAQuery<AuditoriumEntity> query, AuditoriumEntity alias, Sort sort) {

    if (sort != null && sort.isSorted()) {
      Iterator<Order> it = sort.iterator();
      while (it.hasNext()) {
        Order next = it.next();
        switch (next.getProperty()) {
          case "seatCount":
            if (next.isAscending()) {
              query.orderBy($(alias.getSeatCount()).asc());
            } else {
              query.orderBy($(alias.getSeatCount()).desc());
            }
            break;
          case "theatre":
            if (next.isAscending()) {
              query.orderBy($(alias.getTheatre().getId().toString()).asc());
            } else {
              query.orderBy($(alias.getTheatre().getId().toString()).desc());
            }
            break;
          default:
            throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
        }
      }
    }
  }

}