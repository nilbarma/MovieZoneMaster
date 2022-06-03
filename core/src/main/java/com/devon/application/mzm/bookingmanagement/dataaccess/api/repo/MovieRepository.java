package com.devon.application.mzm.bookingmanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.MovieEntity;
import com.devon.application.mzm.bookingmanagement.logic.api.to.MovieSearchCriteriaTo;
import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link MovieEntity}
 */
public interface MovieRepository extends DefaultRepository<MovieEntity> {

  /**
   * @param criteria the {@link MovieSearchCriteriaTo} with the criteria to search.
   * @return the {@link Page} of the {@link MovieEntity} objects that matched the search. If no pageable is set, it will
   *         return a unique page with all the objects that matched the search.
   */
  default Page<MovieEntity> findByCriteria(MovieSearchCriteriaTo criteria) {

    MovieEntity alias = newDslAlias();
    JPAQuery<MovieEntity> query = newDslQuery(alias);

    String title = criteria.getTitle();
    if (title != null && !title.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getTitle()), title, criteria.getTitleOption());
    }
    String poster = criteria.getPoster();
    if (poster != null && !poster.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getPoster()), poster, criteria.getPosterOption());
    }
    String genre = criteria.getGenre();
    if (genre != null && !genre.isEmpty()) {
      QueryUtil.get().whereString(query, $(alias.getGenre()), genre, criteria.getGenreOption());
    }
    Integer duration = criteria.getDuration();
    if (duration != null) {
      query.where($(alias.getDuration()).eq(duration));
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
  public default void addOrderBy(JPAQuery<MovieEntity> query, MovieEntity alias, Sort sort) {

    if (sort != null && sort.isSorted()) {
      Iterator<Order> it = sort.iterator();
      while (it.hasNext()) {
        Order next = it.next();
        switch (next.getProperty()) {
          case "title":
            if (next.isAscending()) {
              query.orderBy($(alias.getTitle()).asc());
            } else {
              query.orderBy($(alias.getTitle()).desc());
            }
            break;
          case "poster":
            if (next.isAscending()) {
              query.orderBy($(alias.getPoster()).asc());
            } else {
              query.orderBy($(alias.getPoster()).desc());
            }
            break;
          case "genre":
            if (next.isAscending()) {
              query.orderBy($(alias.getGenre()).asc());
            } else {
              query.orderBy($(alias.getGenre()).desc());
            }
            break;
          case "duration":
            if (next.isAscending()) {
              query.orderBy($(alias.getDuration()).asc());
            } else {
              query.orderBy($(alias.getDuration()).desc());
            }
            break;
          default:
            throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
        }
      }
    }
  }

}