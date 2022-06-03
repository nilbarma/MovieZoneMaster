package com.devon.application.mzm.bookingmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.repo.BookingRepository;
import com.devon.application.mzm.general.logic.base.AbstractUc;

/**
 * Abstract use case for Bookings, which provides access to the commonly necessary data access objects.
 */
public abstract class AbstractBookingUc extends AbstractUc {

  /** @see #getBookingRepository() */
  @Inject
  private BookingRepository bookingRepository;

  /**
   * @return the {@link BookingRepository} instance.
   */
  public BookingRepository getBookingRepository() {

    return this.bookingRepository;
  }

}
