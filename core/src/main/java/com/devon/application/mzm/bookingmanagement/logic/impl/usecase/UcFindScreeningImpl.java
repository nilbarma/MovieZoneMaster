package com.devon.application.mzm.bookingmanagement.logic.impl.usecase;

import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.ScreeningEntity;
import com.devon.application.mzm.bookingmanagement.logic.api.to.ScreeningEto;
import com.devon.application.mzm.bookingmanagement.logic.api.to.ScreeningSearchCriteriaTo;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcFindScreening;
import com.devon.application.mzm.bookingmanagement.logic.base.usecase.AbstractScreeningUc;

/**
 * Use case implementation for searching, filtering and getting Screenings
 */
@Named
@Validated
@Transactional
public class UcFindScreeningImpl extends AbstractScreeningUc implements UcFindScreening {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindScreeningImpl.class);

  @Override
  public ScreeningEto findScreening(long id) {

    LOG.debug("Get Screening with id {} from database.", id);
    Optional<ScreeningEntity> foundEntity = getScreeningRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), ScreeningEto.class);
    else
      return null;
  }

  @Override
  public Page<ScreeningEto> findScreenings(ScreeningSearchCriteriaTo criteria) {

    Page<ScreeningEntity> screenings = getScreeningRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(screenings, ScreeningEto.class);
  }

}
