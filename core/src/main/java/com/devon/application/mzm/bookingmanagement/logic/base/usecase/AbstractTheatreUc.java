package com.devon.application.mzm.bookingmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.repo.TheatreRepository;
import com.devon.application.mzm.general.logic.base.AbstractUc;

/**
 * Abstract use case for Theatres, which provides access to the commonly necessary data access objects.
 */
public abstract class AbstractTheatreUc extends AbstractUc {

  /** @see #getTheatreRepository() */
  @Inject
  private TheatreRepository theatreRepository;

  /**
   * @return the {@link TheatreRepository} instance.
   */
  public TheatreRepository getTheatreRepository() {

    return this.theatreRepository;
  }

}
