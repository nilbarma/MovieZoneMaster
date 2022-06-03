package com.devon.application.mzm.bookingmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.repo.ScreeningRepository;
import com.devon.application.mzm.general.logic.base.AbstractUc;

/**
 * Abstract use case for Screenings, which provides access to the commonly necessary data access objects.
 */
public abstract class AbstractScreeningUc extends AbstractUc {

  /** @see #getScreeningRepository() */
  @Inject
  private ScreeningRepository screeningRepository;

  /**
   * @return the {@link ScreeningRepository} instance.
   */
  public ScreeningRepository getScreeningRepository() {

    return this.screeningRepository;
  }

}
