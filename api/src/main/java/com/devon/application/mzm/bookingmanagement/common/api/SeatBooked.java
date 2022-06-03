package com.devon.application.mzm.bookingmanagement.common.api;

import com.devon.application.mzm.general.common.api.ApplicationEntity;

public interface SeatBooked extends ApplicationEntity {

  /**
   * getter for seatId attribute
   * 
   * @return seatId
   */

  public Long getSeatId();

  /**
   * @param seat setter for seat attribute
   */

  public void setSeatId(Long seatId);

  /**
   * getter for bookingId attribute
   * 
   * @return bookingId
   */

  public Long getBookingId();

  /**
   * @param booking setter for booking attribute
   */

  public void setBookingId(Long bookingId);

  /**
   * getter for screeningId attribute
   * 
   * @return screeningId
   */

  public Long getScreeningId();

  /**
   * @param screening setter for screening attribute
   */

  public void setScreeningId(Long screeningId);

}
