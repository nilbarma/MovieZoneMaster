package com.devon.application.mzm.bookingmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.repo.AuditoriumRepository;
import com.devon.application.mzm.general.logic.base.AbstractUc;

/**
 * Abstract use case for Auditoriums, which provides access to the commonly necessary data access objects.
 */
public abstract class AbstractAuditoriumUc extends AbstractUc {

  /** @see #getAuditoriumRepository() */
  @Inject
  private AuditoriumRepository auditoriumRepository;

  /**
   * @return the {@link AuditoriumRepository} instance.
   */
  public AuditoriumRepository getAuditoriumRepository() {

    return this.auditoriumRepository;
  }

}
