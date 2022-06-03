package com.devon.application.mzm.bookingmanagement.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.AuditoriumEntity;
import com.devon.application.mzm.bookingmanagement.logic.api.to.AuditoriumEto;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcManageAuditorium;
import com.devon.application.mzm.bookingmanagement.logic.base.usecase.AbstractAuditoriumUc;

/**
 * Use case implementation for modifying and deleting Auditoriums
 */
@Named
@Validated
@Transactional
public class UcManageAuditoriumImpl extends AbstractAuditoriumUc implements UcManageAuditorium {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcManageAuditoriumImpl.class);

  @Override
  public boolean deleteAuditorium(long auditoriumId) {

    AuditoriumEntity auditorium = getAuditoriumRepository().find(auditoriumId);
    getAuditoriumRepository().delete(auditorium);
    LOG.debug("The auditorium with id '{}' has been deleted.", auditoriumId);
    return true;
  }

  @Override
  public AuditoriumEto saveAuditorium(AuditoriumEto auditorium) {

    Objects.requireNonNull(auditorium, "auditorium");

    AuditoriumEntity auditoriumEntity = getBeanMapper().map(auditorium, AuditoriumEntity.class);

    // initialize, validate auditoriumEntity here if necessary
    AuditoriumEntity resultEntity = getAuditoriumRepository().save(auditoriumEntity);
    LOG.debug("Auditorium with id '{}' has been created.", resultEntity.getId());
    return getBeanMapper().map(resultEntity, AuditoriumEto.class);
  }
}
