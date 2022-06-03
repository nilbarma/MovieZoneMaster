package com.devon.application.mzm.bookingmanagement.logic.api.usecase;

import com.devon.application.mzm.bookingmanagement.logic.api.to.BookingEto;

/**
 * Interface of UcManageBooking to centralize documentation and signatures of methods.
 */
public interface UcManageBooking {

  /**
   * Deletes a booking from the database by its id 'bookingId'.
   *
   * @param bookingId Id of the booking to delete
   * @return boolean <code>true</code> if the booking can be deleted, <code>false</code> otherwise
   */
  boolean deleteBooking(long bookingId);

  /**
   * Saves a booking and store it in the database.
   *
   * @param booking the {@link BookingEto} to create.
   * @return the new {@link BookingEto} that has been saved with ID and version.
   */
  BookingEto saveBooking(BookingEto booking);

}
