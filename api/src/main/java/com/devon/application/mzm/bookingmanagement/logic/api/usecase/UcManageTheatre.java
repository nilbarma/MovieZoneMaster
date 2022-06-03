package com.devon.application.mzm.bookingmanagement.logic.api.usecase;

import com.devon.application.mzm.bookingmanagement.logic.api.to.TheatreEto;

/**
 * Interface of UcManageTheatre to centralize documentation and signatures of methods.
 */
public interface UcManageTheatre {

  /**
   * Deletes a theatre from the database by its id 'theatreId'.
   *
   * @param theatreId Id of the theatre to delete
   * @return boolean <code>true</code> if the theatre can be deleted, <code>false</code> otherwise
   */
  boolean deleteTheatre(long theatreId);

  /**
   * Saves a theatre and store it in the database.
   *
   * @param theatre the {@link TheatreEto} to create.
   * @return the new {@link TheatreEto} that has been saved with ID and version.
   */
  TheatreEto saveTheatre(TheatreEto theatre);

}
