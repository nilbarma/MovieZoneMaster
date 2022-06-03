package com.devon.application.mzm.bookingmanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.time.LocalTime;
import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.BookingEntity;
import com.devon.application.mzm.bookingmanagement.logic.api.to.BookingSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link BookingEntity}
 */
public interface BookingRepository extends DefaultRepository<BookingEntity> {

  /**
   * @param criteria the {@link BookingSearchCriteriaTo} with the criteria to search.
   * @return the {@link Page} of the {@link BookingEntity} objects that matched the search. If no pageable is set, it
   *         will return a unique page with all the objects that matched the search.
   */
  default Page<BookingEntity> findByCriteria(BookingSearchCriteriaTo criteria) {

    BookingEntity alias = newDslAlias();
    JPAQuery<BookingEntity> query = newDslQuery(alias);

    Long screening = criteria.getScreeningId();
    if (screening != null) {
      query.where($(alias.getScreening().getId()).eq(screening));
    }
    Long user = criteria.getUserId();
    if (user != null) {
      query.where($(alias.getUser().getId()).eq(user));
    }
    LocalTime bookingTime = criteria.getBookingTime();
    if (bookingTime != null) {
      query.where($(alias.getBookingTime()).eq(bookingTime));
    }
    Boolean booked = criteria.getBooked();
    if (booked != null) {
      query.where($(alias.isBooked()).eq(booked));
    }
    Boolean active = criteria.getActive();
    if (active != null) {
      query.where($(alias.isActive()).eq(active));
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
  public default void addOrderBy(JPAQuery<BookingEntity> query, BookingEntity alias, Sort sort) {

    if (sort != null && sort.isSorted()) {
      Iterator<Order> it = sort.iterator();
      while (it.hasNext()) {
        Order next = it.next();
        switch (next.getProperty()) {
          case "screening":
            if (next.isAscending()) {
              query.orderBy($(alias.getScreening().getId().toString()).asc());
            } else {
              query.orderBy($(alias.getScreening().getId().toString()).desc());
            }
            break;
          case "user":
            if (next.isAscending()) {
              query.orderBy($(alias.getUser().getId().toString()).asc());
            } else {
              query.orderBy($(alias.getUser().getId().toString()).desc());
            }
            break;
          case "bookingTime":
            if (next.isAscending()) {
              query.orderBy($(alias.getBookingTime()).asc());
            } else {
              query.orderBy($(alias.getBookingTime()).desc());
            }
            break;
          case "booked":
            if (next.isAscending()) {
              query.orderBy($(alias.isBooked()).asc());
            } else {
              query.orderBy($(alias.isBooked()).desc());
            }
            break;
          case "active":
            if (next.isAscending()) {
              query.orderBy($(alias.isActive()).asc());
            } else {
              query.orderBy($(alias.isActive()).desc());
            }
            break;
          default:
            throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
        }
      }
    }
  }

}