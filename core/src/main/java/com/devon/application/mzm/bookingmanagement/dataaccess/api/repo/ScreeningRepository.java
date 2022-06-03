package com.devon.application.mzm.bookingmanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.ScreeningEntity;
import com.devon.application.mzm.bookingmanagement.logic.api.to.ScreeningSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link ScreeningEntity}
 */
public interface ScreeningRepository extends DefaultRepository<ScreeningEntity> {

  /**
   * @param criteria the {@link ScreeningSearchCriteriaTo} with the criteria to search.
   * @return the {@link Page} of the {@link ScreeningEntity} objects that matched the search. If no pageable is set, it
   *         will return a unique page with all the objects that matched the search.
   */
  default Page<ScreeningEntity> findByCriteria(ScreeningSearchCriteriaTo criteria) {

    ScreeningEntity alias = newDslAlias();
    JPAQuery<ScreeningEntity> query = newDslQuery(alias);

    Long movie = criteria.getMovieId();
    if (movie != null) {
      query.where($(alias.getMovie().getId()).eq(movie));
    }
    Long auditorium = criteria.getAuditoriumId();
    if (auditorium != null) {
      query.where($(alias.getAuditorium().getId()).eq(auditorium));
    }
    LocalDate date = criteria.getDate();
    if (date != null) {
      query.where($(alias.getDate()).eq(date));
    }
    LocalTime startTime = criteria.getStartTime();
    if (startTime != null) {
      query.where($(alias.getStartTime()).eq(startTime));
    }
    LocalTime endTime = criteria.getEndTime();
    if (endTime != null) {
      query.where($(alias.getEndTime()).eq(endTime));
    }
    Boolean full = criteria.getFull();
    if (full != null) {
      query.where($(alias.getFull()).eq(full));
    }
    Double price = criteria.getPrice();
    if (price != null) {
      query.where($(alias.getPrice()).eq(price));
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
  public default void addOrderBy(JPAQuery<ScreeningEntity> query, ScreeningEntity alias, Sort sort) {

    if (sort != null && sort.isSorted()) {
      Iterator<Order> it = sort.iterator();
      while (it.hasNext()) {
        Order next = it.next();
        switch (next.getProperty()) {
          case "movie":
            if (next.isAscending()) {
              query.orderBy($(alias.getMovie().getId().toString()).asc());
            } else {
              query.orderBy($(alias.getMovie().getId().toString()).desc());
            }
            break;
          case "auditorium":
            if (next.isAscending()) {
              query.orderBy($(alias.getAuditorium().getId().toString()).asc());
            } else {
              query.orderBy($(alias.getAuditorium().getId().toString()).desc());
            }
            break;
          case "date":
            if (next.isAscending()) {
              query.orderBy($(alias.getDate()).asc());
            } else {
              query.orderBy($(alias.getDate()).desc());
            }
            break;
          case "startTime":
            if (next.isAscending()) {
              query.orderBy($(alias.getStartTime()).asc());
            } else {
              query.orderBy($(alias.getStartTime()).desc());
            }
            break;
          case "endTime":
            if (next.isAscending()) {
              query.orderBy($(alias.getEndTime()).asc());
            } else {
              query.orderBy($(alias.getEndTime()).desc());
            }
            break;
          case "full":
            if (next.isAscending()) {
              query.orderBy($(alias.getFull()).asc());
            } else {
              query.orderBy($(alias.getFull()).desc());
            }
            break;
          case "price":
            if (next.isAscending()) {
              query.orderBy($(alias.getPrice()).asc());
            } else {
              query.orderBy($(alias.getPrice()).desc());
            }
            break;
          default:
            throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
        }
      }
    }
  }

}