package com.devon.application.mzm.bookingmanagement.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.MovieEntity;
import com.devon.application.mzm.bookingmanagement.logic.api.to.MovieEto;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcManageMovie;
import com.devon.application.mzm.bookingmanagement.logic.base.usecase.AbstractMovieUc;

/**
 * Use case implementation for modifying and deleting Movies
 */
@Named
@Validated
@Transactional
public class UcManageMovieImpl extends AbstractMovieUc implements UcManageMovie {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcManageMovieImpl.class);

  @Override
  public boolean deleteMovie(long movieId) {

    MovieEntity movie = getMovieRepository().find(movieId);
    getMovieRepository().delete(movie);
    LOG.debug("The movie with id '{}' has been deleted.", movieId);
    return true;
  }

  @Override
  public MovieEto saveMovie(MovieEto movie) {

    Objects.requireNonNull(movie, "movie");

    MovieEntity movieEntity = getBeanMapper().map(movie, MovieEntity.class);

    // initialize, validate movieEntity here if necessary
    MovieEntity resultEntity = getMovieRepository().save(movieEntity);
    LOG.debug("Movie with id '{}' has been created.", resultEntity.getId());
    return getBeanMapper().map(resultEntity, MovieEto.class);
  }
}
