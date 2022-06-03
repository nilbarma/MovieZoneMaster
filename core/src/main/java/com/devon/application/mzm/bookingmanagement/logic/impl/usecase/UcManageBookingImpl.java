package com.devon.application.mzm.bookingmanagement.logic.impl.usecase;

import java.util.Objects;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.BookingEntity;
import com.devon.application.mzm.bookingmanagement.logic.api.to.BookingEto;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcManageBooking;
import com.devon.application.mzm.bookingmanagement.logic.base.usecase.AbstractBookingUc;

/**
 * Use case implementation for modifying and deleting Bookings
 */
@Named
@Validated
@Transactional
public class UcManageBookingImpl extends AbstractBookingUc implements UcManageBooking {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcManageBookingImpl.class);

  @Override
  public boolean deleteBooking(long bookingId) {

    BookingEntity booking = getBookingRepository().find(bookingId);
    getBookingRepository().delete(booking);
    LOG.debug("The booking with id '{}' has been deleted.", bookingId);
    return true;
  }

  @Override
  public BookingEto saveBooking(BookingEto booking) {

    Objects.requireNonNull(booking, "booking");

    BookingEntity bookingEntity = getBeanMapper().map(booking, BookingEntity.class);

    // initialize, validate bookingEntity here if necessary
    BookingEntity resultEntity = getBookingRepository().save(bookingEntity);
    LOG.debug("Booking with id '{}' has been created.", resultEntity.getId());
    return getBeanMapper().map(resultEntity, BookingEto.class);
  }
}
