package com.devon.application.mzm.bookingmanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devon.application.mzm.bookingmanagement.logic.api.to.BookingEto;
import com.devon.application.mzm.bookingmanagement.logic.api.to.BookingSearchCriteriaTo;

public interface UcFindBooking {

  /**
   * Returns a Booking by its id 'id'.
   *
   * @param id The id 'id' of the Booking.
   * @return The {@link BookingEto} with id 'id'
   */
  BookingEto findBooking(long id);

  /**
   * Returns a paginated list of Bookings matching the search criteria.
   *
   * @param criteria the {@link BookingSearchCriteriaTo}.
   * @return the {@link List} of matching {@link BookingEto}s.
   */
  Page<BookingEto> findBookings(BookingSearchCriteriaTo criteria);

}
