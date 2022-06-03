package com.devon.application.mzm.bookingmanagement.logic.api.usecase;

import com.devon.application.mzm.bookingmanagement.logic.api.to.ScreeningEto;

/**
 * Interface of UcManageScreening to centralize documentation and signatures of methods.
 */
public interface UcManageScreening {

  /**
   * Deletes a screening from the database by its id 'screeningId'.
   *
   * @param screeningId Id of the screening to delete
   * @return boolean <code>true</code> if the screening can be deleted, <code>false</code> otherwise
   */
  boolean deleteScreening(long screeningId);

  /**
   * Saves a screening and store it in the database.
   *
   * @param screening the {@link ScreeningEto} to create.
   * @return the new {@link ScreeningEto} that has been saved with ID and version.
   */
  ScreeningEto saveScreening(ScreeningEto screening);

}
