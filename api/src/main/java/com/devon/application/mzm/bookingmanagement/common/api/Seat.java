package com.devon.application.mzm.bookingmanagement.common.api;

import com.devon.application.mzm.general.common.api.ApplicationEntity;

public interface Seat extends ApplicationEntity {

  /**
   * @return seatNumberId
   */

  public Integer getSeatNumber();

  /**
   * @param seatNumber setter for seatNumber attribute
   */

  public void setSeatNumber(Integer seatNumber);

  /**
   * getter for auditoriumId attribute
   * 
   * @return auditoriumId
   */

  public Long getAuditoriumId();

  /**
   * @param auditorium setter for auditorium attribute
   */

  public void setAuditoriumId(Long auditoriumId);

}
