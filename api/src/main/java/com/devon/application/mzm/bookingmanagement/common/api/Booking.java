package com.devon.application.mzm.bookingmanagement.common.api;

import java.time.LocalTime;

import com.devon.application.mzm.general.common.api.ApplicationEntity;

public interface Booking extends ApplicationEntity {

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

  /**
   * getter for userId attribute
   * 
   * @return userId
   */

  public Long getUserId();

  /**
   * @param user setter for user attribute
   */

  public void setUserId(Long userId);

  /**
   * @return bookingTimeId
   */

  public LocalTime getBookingTime();

  /**
   * @param bookingTime setter for bookingTime attribute
   */

  public void setBookingTime(LocalTime bookingTime);

  /**
   * @return bookedId
   */

  public boolean isBooked();

  /**
   * @param booked setter for booked attribute
   */

  public void setBooked(boolean booked);

  /**
   * @return activeId
   */

  public boolean isActive();

  /**
   * @param active setter for active attribute
   */

  public void setActive(boolean active);

}
