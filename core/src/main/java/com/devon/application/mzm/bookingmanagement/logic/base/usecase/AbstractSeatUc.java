package com.devon.application.mzm.bookingmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.repo.SeatRepository;
import com.devon.application.mzm.general.logic.base.AbstractUc;

/**
 * Abstract use case for Seats, which provides access to the commonly necessary data access objects.
 */
public abstract class AbstractSeatUc extends AbstractUc {

  /** @see #getSeatRepository() */
  @Inject
  private SeatRepository seatRepository;

  /**
   * @return the {@link SeatRepository} instance.
   */
  public SeatRepository getSeatRepository() {

    return this.seatRepository;
  }

}
