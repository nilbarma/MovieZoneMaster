package com.devon.application.mzm.bookingmanagement.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.ScreeningEntity;
import com.devon.application.mzm.bookingmanagement.logic.api.to.ScreeningEto;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcManageScreening;
import com.devon.application.mzm.bookingmanagement.logic.base.usecase.AbstractScreeningUc;

/**
 * Use case implementation for modifying and deleting Screenings
 */
@Named
@Validated
@Transactional
public class UcManageScreeningImpl extends AbstractScreeningUc implements UcManageScreening {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcManageScreeningImpl.class);

  @Override
  public boolean deleteScreening(long screeningId) {

    ScreeningEntity screening = getScreeningRepository().find(screeningId);
    getScreeningRepository().delete(screening);
    LOG.debug("The screening with id '{}' has been deleted.", screeningId);
    return true;
  }

  @Override
  public ScreeningEto saveScreening(ScreeningEto screening) {

    Objects.requireNonNull(screening, "screening");

    ScreeningEntity screeningEntity = getBeanMapper().map(screening, ScreeningEntity.class);

    // initialize, validate screeningEntity here if necessary
    ScreeningEntity resultEntity = getScreeningRepository().save(screeningEntity);
    LOG.debug("Screening with id '{}' has been created.", resultEntity.getId());
    return getBeanMapper().map(resultEntity, ScreeningEto.class);
  }
}
