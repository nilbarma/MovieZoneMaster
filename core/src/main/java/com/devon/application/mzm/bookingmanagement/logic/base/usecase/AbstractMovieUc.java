package com.devon.application.mzm.bookingmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.repo.MovieRepository;
import com.devon.application.mzm.general.logic.base.AbstractUc;

/**
 * Abstract use case for Movies, which provides access to the commonly necessary data access objects.
 */
public abstract class AbstractMovieUc extends AbstractUc {

  /** @see #getMovieRepository() */
  @Inject
  private MovieRepository movieRepository;

  /**
   * @return the {@link MovieRepository} instance.
   */
  public MovieRepository getMovieRepository() {

    return this.movieRepository;
  }

}
