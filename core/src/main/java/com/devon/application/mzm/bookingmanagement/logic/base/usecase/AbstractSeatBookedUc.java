package com.devon.application.mzm.bookingmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.repo.SeatBookedRepository;
import com.devon.application.mzm.general.logic.base.AbstractUc;

/**
 * Abstract use case for SeatBookeds, which provides access to the commonly necessary data access objects.
 */
public abstract class AbstractSeatBookedUc extends AbstractUc {

  /** @see #getSeatBookedRepository() */
  @Inject
  private SeatBookedRepository seatBookedRepository;

  /**
   * @return the {@link SeatBookedRepository} instance.
   */
  public SeatBookedRepository getSeatBookedRepository() {

    return this.seatBookedRepository;
  }

}
