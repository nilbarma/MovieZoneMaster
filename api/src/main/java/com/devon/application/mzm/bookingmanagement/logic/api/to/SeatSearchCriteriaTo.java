package com.devon.application.mzm.bookingmanagement.logic.api.to;

import com.devon.application.mzm.general.common.api.to.AbstractSearchCriteriaTo;

/**
 * {@link SearchCriteriaTo} to find instances of {@link com.devon.application.mzm.bookingmanagement.common.api.Seat}s.
 */
public class SeatSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private Integer seatNumber;

  private Long auditoriumId;

  /**
   * @return seatNumberId
   */

  public Integer getSeatNumber() {

    return seatNumber;
  }

  /**
   * @param seatNumber setter for seatNumber attribute
   */

  public void setSeatNumber(Integer seatNumber) {

    this.seatNumber = seatNumber;
  }

  /**
   * getter for auditoriumId attribute
   * 
   * @return auditoriumId
   */

  public Long getAuditoriumId() {

    return auditoriumId;
  }

  /**
   * @param auditorium setter for auditorium attribute
   */

  public void setAuditoriumId(Long auditoriumId) {

    this.auditoriumId = auditoriumId;
  }

}
