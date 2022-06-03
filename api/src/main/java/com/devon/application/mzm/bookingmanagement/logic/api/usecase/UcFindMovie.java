package com.devon.application.mzm.bookingmanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devon.application.mzm.bookingmanagement.logic.api.to.MovieEto;
import com.devon.application.mzm.bookingmanagement.logic.api.to.MovieSearchCriteriaTo;

public interface UcFindMovie {

  /**
   * Returns a Movie by its id 'id'.
   *
   * @param id The id 'id' of the Movie.
   * @return The {@link MovieEto} with id 'id'
   */
  MovieEto findMovie(long id);

  /**
   * Returns a paginated list of Movies matching the search criteria.
   *
   * @param criteria the {@link MovieSearchCriteriaTo}.
   * @return the {@link List} of matching {@link MovieEto}s.
   */
  Page<MovieEto> findMovies(MovieSearchCriteriaTo criteria);

}
