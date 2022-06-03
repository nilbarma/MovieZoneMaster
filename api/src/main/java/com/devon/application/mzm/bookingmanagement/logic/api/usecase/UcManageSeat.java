package com.devon.application.mzm.bookingmanagement.logic.api.usecase;

import com.devon.application.mzm.bookingmanagement.logic.api.to.SeatEto;

/**
 * Interface of UcManageSeat to centralize documentation and signatures of methods.
 */
public interface UcManageSeat {

  /**
   * Deletes a seat from the database by its id 'seatId'.
   *
   * @param seatId Id of the seat to delete
   * @return boolean <code>true</code> if the seat can be deleted, <code>false</code> otherwise
   */
  boolean deleteSeat(long seatId);

  /**
   * Saves a seat and store it in the database.
   *
   * @param seat the {@link SeatEto} to create.
   * @return the new {@link SeatEto} that has been saved with ID and version.
   */
  SeatEto saveSeat(SeatEto seat);

}
