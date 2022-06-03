package com.devon.application.mzm.bookingmanagement.logic.api.usecase;

import com.devon.application.mzm.bookingmanagement.logic.api.to.SeatBookedEto;

/**
 * Interface of UcManageSeatBooked to centralize documentation and signatures of methods.
 */
public interface UcManageSeatBooked {

  /**
   * Deletes a seatBooked from the database by its id 'seatBookedId'.
   *
   * @param seatBookedId Id of the seatBooked to delete
   * @return boolean <code>true</code> if the seatBooked can be deleted, <code>false</code> otherwise
   */
  boolean deleteSeatBooked(long seatBookedId);

  /**
   * Saves a seatBooked and store it in the database.
   *
   * @param seatBooked the {@link SeatBookedEto} to create.
   * @return the new {@link SeatBookedEto} that has been saved with ID and version.
   */
  SeatBookedEto saveSeatBooked(SeatBookedEto seatBooked);

}
