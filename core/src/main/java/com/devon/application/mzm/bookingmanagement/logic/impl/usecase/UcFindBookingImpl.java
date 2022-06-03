package com.devon.application.mzm.bookingmanagement.logic.impl.usecase;

import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.BookingEntity;
import com.devon.application.mzm.bookingmanagement.logic.api.to.BookingEto;
import com.devon.application.mzm.bookingmanagement.logic.api.to.BookingSearchCriteriaTo;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcFindBooking;
import com.devon.application.mzm.bookingmanagement.logic.base.usecase.AbstractBookingUc;

/**
 * Use case implementation for searching, filtering and getting Bookings
 */
@Named
@Validated
@Transactional
public class UcFindBookingImpl extends AbstractBookingUc implements UcFindBooking {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindBookingImpl.class);

  @Override
  public BookingEto findBooking(long id) {

    LOG.debug("Get Booking with id {} from database.", id);
    Optional<BookingEntity> foundEntity = getBookingRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), BookingEto.class);
    else
      return null;
  }

  @Override
  public Page<BookingEto> findBookings(BookingSearchCriteriaTo criteria) {

    Page<BookingEntity> bookings = getBookingRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(bookings, BookingEto.class);
  }

}
