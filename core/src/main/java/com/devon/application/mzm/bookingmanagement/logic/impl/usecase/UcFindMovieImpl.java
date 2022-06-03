package com.devon.application.mzm.bookingmanagement.logic.impl.usecase;

import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.MovieEntity;
import com.devon.application.mzm.bookingmanagement.logic.api.to.MovieEto;
import com.devon.application.mzm.bookingmanagement.logic.api.to.MovieSearchCriteriaTo;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcFindMovie;
import com.devon.application.mzm.bookingmanagement.logic.base.usecase.AbstractMovieUc;

/**
 * Use case implementation for searching, filtering and getting Movies
 */
@Named
@Validated
@Transactional
public class UcFindMovieImpl extends AbstractMovieUc implements UcFindMovie {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindMovieImpl.class);

  @Override
  public MovieEto findMovie(long id) {

    LOG.debug("Get Movie with id {} from database.", id);
    Optional<MovieEntity> foundEntity = getMovieRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), MovieEto.class);
    else
      return null;
  }

  @Override
  public Page<MovieEto> findMovies(MovieSearchCriteriaTo criteria) {

    Page<MovieEntity> movies = getMovieRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(movies, MovieEto.class);
  }

}
