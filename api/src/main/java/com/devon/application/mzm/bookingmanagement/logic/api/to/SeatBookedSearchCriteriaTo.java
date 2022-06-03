package com.devon.application.mzm.bookingmanagement.logic.api.to;

import com.devon.application.mzm.general.common.api.to.AbstractSearchCriteriaTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.devon.application.mzm.bookingmanagement.common.api.SeatBooked}s.
 */
public class SeatBookedSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private Long seatId;

  private Long bookingId;

  private Long screeningId;

  /**
   * getter for seatId attribute
   * 
   * @return seatId
   */

  public Long getSeatId() {

    return seatId;
  }

  /**
   * @param seat setter for seat attribute
   */

  public void setSeatId(Long seatId) {

    this.seatId = seatId;
  }

  /**
   * getter for bookingId attribute
   * 
   * @return bookingId
   */

  public Long getBookingId() {

    return bookingId;
  }

  /**
   * @param booking setter for booking attribute
   */

  public void setBookingId(Long bookingId) {

    this.bookingId = bookingId;
  }

  /**
   * getter for screeningId attribute
   * 
   * @return screeningId
   */

  public Long getScreeningId() {

    return screeningId;
  }

  /**
   * @param screening setter for screening attribute
   */

  public void setScreeningId(Long screeningId) {

    this.screeningId = screeningId;
  }

}
