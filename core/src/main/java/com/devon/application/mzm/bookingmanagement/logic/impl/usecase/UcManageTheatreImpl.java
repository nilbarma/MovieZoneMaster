package com.devon.application.mzm.bookingmanagement.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.TheatreEntity;
import com.devon.application.mzm.bookingmanagement.logic.api.to.TheatreEto;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcManageTheatre;
import com.devon.application.mzm.bookingmanagement.logic.base.usecase.AbstractTheatreUc;

/**
 * Use case implementation for modifying and deleting Theatres
 */
@Named
@Validated
@Transactional
public class UcManageTheatreImpl extends AbstractTheatreUc implements UcManageTheatre {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcManageTheatreImpl.class);

  @Override
  public boolean deleteTheatre(long theatreId) {

    TheatreEntity theatre = getTheatreRepository().find(theatreId);
    getTheatreRepository().delete(theatre);
    LOG.debug("The theatre with id '{}' has been deleted.", theatreId);
    return true;
  }

  @Override
  public TheatreEto saveTheatre(TheatreEto theatre) {

    Objects.requireNonNull(theatre, "theatre");

    TheatreEntity theatreEntity = getBeanMapper().map(theatre, TheatreEntity.class);

    // initialize, validate theatreEntity here if necessary
    TheatreEntity resultEntity = getTheatreRepository().save(theatreEntity);
    LOG.debug("Theatre with id '{}' has been created.", resultEntity.getId());
    return getBeanMapper().map(resultEntity, TheatreEto.class);
  }
}
