package com.devon.application.mzm.bookingmanagement.logic.api.to;

import com.devon.application.mzm.general.common.api.to.AbstractSearchCriteriaTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.devon.application.mzm.bookingmanagement.common.api.Auditorium}s.
 */
public class AuditoriumSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private Integer seatCount;

  private Long theatreId;

  /**
   * @return seatCountId
   */

  public Integer getSeatCount() {

    return seatCount;
  }

  /**
   * @param seatCount setter for seatCount attribute
   */

  public void setSeatCount(Integer seatCount) {

    this.seatCount = seatCount;
  }

  /**
   * getter for theatreId attribute
   * 
   * @return theatreId
   */

  public Long getTheatreId() {

    return theatreId;
  }

  /**
   * @param theatre setter for theatre attribute
   */

  public void setTheatreId(Long theatreId) {

    this.theatreId = theatreId;
  }

}
