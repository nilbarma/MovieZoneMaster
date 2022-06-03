package com.devon.application.mzm.bookingmanagement.logic.impl.usecase;

import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.TheatreEntity;
import com.devon.application.mzm.bookingmanagement.logic.api.to.TheatreEto;
import com.devon.application.mzm.bookingmanagement.logic.api.to.TheatreSearchCriteriaTo;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcFindTheatre;
import com.devon.application.mzm.bookingmanagement.logic.base.usecase.AbstractTheatreUc;

/**
 * Use case implementation for searching, filtering and getting Theatres
 */
@Named
@Validated
@Transactional
public class UcFindTheatreImpl extends AbstractTheatreUc implements UcFindTheatre {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindTheatreImpl.class);

  @Override
  public TheatreEto findTheatre(long id) {

    LOG.debug("Get Theatre with id {} from database.", id);
    Optional<TheatreEntity> foundEntity = getTheatreRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), TheatreEto.class);
    else
      return null;
  }

  @Override
  public Page<TheatreEto> findTheatres(TheatreSearchCriteriaTo criteria) {

    Page<TheatreEntity> theatres = getTheatreRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(theatres, TheatreEto.class);
  }

}
