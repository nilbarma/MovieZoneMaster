package com.devon.application.mzm.bookingmanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.SeatBookedEntity;
import com.devon.application.mzm.bookingmanagement.logic.api.to.SeatBookedSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link SeatBookedEntity}
 */
public interface SeatBookedRepository extends DefaultRepository<SeatBookedEntity> {

  /**
   * @param criteria the {@link SeatBookedSearchCriteriaTo} with the criteria to search.
   * @return the {@link Page} of the {@link SeatBookedEntity} objects that matched the search. If no pageable is set, it
   *         will return a unique page with all the objects that matched the search.
   */
  default Page<SeatBookedEntity> findByCriteria(SeatBookedSearchCriteriaTo criteria) {

    SeatBookedEntity alias = newDslAlias();
    JPAQuery<SeatBookedEntity> query = newDslQuery(alias);

    Long seat = criteria.getSeatId();
    if (seat != null) {
      query.where($(alias.getSeat().getId()).eq(seat));
    }
    Long booking = criteria.getBookingId();
    if (booking != null) {
      query.where($(alias.getBooking().getId()).eq(booking));
    }
    Long screening = criteria.getScreeningId();
    if (screening != null) {
      query.where($(alias.getScreening().getId()).eq(screening));
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
  public default void addOrderBy(JPAQuery<SeatBookedEntity> query, SeatBookedEntity alias, Sort sort) {

    if (sort != null && sort.isSorted()) {
      Iterator<Order> it = sort.iterator();
      while (it.hasNext()) {
        Order next = it.next();
        switch (next.getProperty()) {
          case "seat":
            if (next.isAscending()) {
              query.orderBy($(alias.getSeat().getId().toString()).asc());
            } else {
              query.orderBy($(alias.getSeat().getId().toString()).desc());
            }
            break;
          case "booking":
            if (next.isAscending()) {
              query.orderBy($(alias.getBooking().getId().toString()).asc());
            } else {
              query.orderBy($(alias.getBooking().getId().toString()).desc());
            }
            break;
          case "screening":
            if (next.isAscending()) {
              query.orderBy($(alias.getScreening().getId().toString()).asc());
            } else {
              query.orderBy($(alias.getScreening().getId().toString()).desc());
            }
            break;
          default:
            throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
        }
      }
    }
  }

}