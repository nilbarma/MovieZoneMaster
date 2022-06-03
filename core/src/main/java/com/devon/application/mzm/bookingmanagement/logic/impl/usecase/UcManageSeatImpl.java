package com.devon.application.mzm.bookingmanagement.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.SeatEntity;
import com.devon.application.mzm.bookingmanagement.logic.api.to.SeatEto;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcManageSeat;
import com.devon.application.mzm.bookingmanagement.logic.base.usecase.AbstractSeatUc;

/**
 * Use case implementation for modifying and deleting Seats
 */
@Named
@Validated
@Transactional
public class UcManageSeatImpl extends AbstractSeatUc implements UcManageSeat {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcManageSeatImpl.class);

  @Override
  public boolean deleteSeat(long seatId) {

    SeatEntity seat = getSeatRepository().find(seatId);
    getSeatRepository().delete(seat);
    LOG.debug("The seat with id '{}' has been deleted.", seatId);
    return true;
  }

  @Override
  public SeatEto saveSeat(SeatEto seat) {

    Objects.requireNonNull(seat, "seat");

    SeatEntity seatEntity = getBeanMapper().map(seat, SeatEntity.class);

    // initialize, validate seatEntity here if necessary
    SeatEntity resultEntity = getSeatRepository().save(seatEntity);
    LOG.debug("Seat with id '{}' has been created.", resultEntity.getId());
    return getBeanMapper().map(resultEntity, SeatEto.class);
  }
}
