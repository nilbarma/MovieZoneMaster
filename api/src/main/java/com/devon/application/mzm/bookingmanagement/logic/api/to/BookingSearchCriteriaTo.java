package com.devon.application.mzm.bookingmanagement.logic.api.to;

import java.time.LocalTime;

import com.devon.application.mzm.general.common.api.to.AbstractSearchCriteriaTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.devon.application.mzm.bookingmanagement.common.api.Booking}s.
 */
public class BookingSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private Long screeningId;

  private Long userId;

  private LocalTime bookingTime;

  private Boolean booked;

  private Boolean active;

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

  /**
   * getter for userId attribute
   * 
   * @return userId
   */

  public Long getUserId() {

    return userId;
  }

  /**
   * @param user setter for user attribute
   */

  public void setUserId(Long userId) {

    this.userId = userId;
  }

  /**
   * @return bookingTimeId
   */

  public LocalTime getBookingTime() {

    return bookingTime;
  }

  /**
   * @param bookingTime setter for bookingTime attribute
   */

  public void setBookingTime(LocalTime bookingTime) {

    this.bookingTime = bookingTime;
  }

  /**
   * @return bookedId
   */

  public Boolean getBooked() {

    return booked;
  }

  /**
   * @param booked setter for booked attribute
   */

  public void setBooked(Boolean booked) {

    this.booked = booked;
  }

  /**
   * @return activeId
   */

  public Boolean getActive() {

    return active;
  }

  /**
   * @param active setter for active attribute
   */

  public void setActive(Boolean active) {

    this.active = active;
  }

}
