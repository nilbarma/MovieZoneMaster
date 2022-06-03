package com.devon.application.mzm.bookingmanagement.logic.impl.usecase;

import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.AuditoriumEntity;
import com.devon.application.mzm.bookingmanagement.logic.api.to.AuditoriumEto;
import com.devon.application.mzm.bookingmanagement.logic.api.to.AuditoriumSearchCriteriaTo;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcFindAuditorium;
import com.devon.application.mzm.bookingmanagement.logic.base.usecase.AbstractAuditoriumUc;

/**
 * Use case implementation for searching, filtering and getting Auditoriums
 */
@Named
@Validated
@Transactional
public class UcFindAuditoriumImpl extends AbstractAuditoriumUc implements UcFindAuditorium {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindAuditoriumImpl.class);

  @Override
  public AuditoriumEto findAuditorium(long id) {

    LOG.debug("Get Auditorium with id {} from database.", id);
    Optional<AuditoriumEntity> foundEntity = getAuditoriumRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), AuditoriumEto.class);
    else
      return null;
  }

  @Override
  public Page<AuditoriumEto> findAuditoriums(AuditoriumSearchCriteriaTo criteria) {

    Page<AuditoriumEntity> auditoriums = getAuditoriumRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(auditoriums, AuditoriumEto.class);
  }

}
