package com.devon.application.mzm.bookingmanagement.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.SeatBookedEntity;
import com.devon.application.mzm.bookingmanagement.logic.api.to.SeatBookedEto;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcManageSeatBooked;
import com.devon.application.mzm.bookingmanagement.logic.base.usecase.AbstractSeatBookedUc;

/**
 * Use case implementation for modifying and deleting SeatBookeds
 */
@Named
@Validated
@Transactional
public class UcManageSeatBookedImpl extends AbstractSeatBookedUc implements UcManageSeatBooked {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcManageSeatBookedImpl.class);

  @Override
  public boolean deleteSeatBooked(long seatBookedId) {

    SeatBookedEntity seatBooked = getSeatBookedRepository().find(seatBookedId);
    getSeatBookedRepository().delete(seatBooked);
    LOG.debug("The seatBooked with id '{}' has been deleted.", seatBookedId);
    return true;
  }

  @Override
  public SeatBookedEto saveSeatBooked(SeatBookedEto seatBooked) {

    Objects.requireNonNull(seatBooked, "seatBooked");

    SeatBookedEntity seatBookedEntity = getBeanMapper().map(seatBooked, SeatBookedEntity.class);

    // initialize, validate seatBookedEntity here if necessary
    SeatBookedEntity resultEntity = getSeatBookedRepository().save(seatBookedEntity);
    LOG.debug("SeatBooked with id '{}' has been created.", resultEntity.getId());
    return getBeanMapper().map(resultEntity, SeatBookedEto.class);
  }
}
