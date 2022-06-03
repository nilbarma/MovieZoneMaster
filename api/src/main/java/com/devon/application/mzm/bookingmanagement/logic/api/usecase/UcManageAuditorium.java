package com.devon.application.mzm.bookingmanagement.logic.api.usecase;

import com.devon.application.mzm.bookingmanagement.logic.api.to.AuditoriumEto;

/**
 * Interface of UcManageAuditorium to centralize documentation and signatures of methods.
 */
public interface UcManageAuditorium {

  /**
   * Deletes a auditorium from the database by its id 'auditoriumId'.
   *
   * @param auditoriumId Id of the auditorium to delete
   * @return boolean <code>true</code> if the auditorium can be deleted, <code>false</code> otherwise
   */
  boolean deleteAuditorium(long auditoriumId);

  /**
   * Saves a auditorium and store it in the database.
   *
   * @param auditorium the {@link AuditoriumEto} to create.
   * @return the new {@link AuditoriumEto} that has been saved with ID and version.
   */
  AuditoriumEto saveAuditorium(AuditoriumEto auditorium);

}
