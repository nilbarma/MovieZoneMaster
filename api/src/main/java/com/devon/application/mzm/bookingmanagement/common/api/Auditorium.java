package com.devon.application.mzm.bookingmanagement.common.api;

import com.devon.application.mzm.general.common.api.ApplicationEntity;

public interface Auditorium extends ApplicationEntity {

  /**
   * @return seatCountId
   */

  public Integer getSeatCount();

  /**
   * @param seatCount setter for seatCount attribute
   */

  public void setSeatCount(Integer seatCount);

  /**
   * getter for theatreId attribute
   * 
   * @return theatreId
   */

  public Long getTheatreId();

  /**
   * @param theatre setter for theatre attribute
   */

  public void setTheatreId(Long theatreId);

}
