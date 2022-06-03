package com.devon.application.mzm.bookingmanagement.logic.api.to;

import java.time.LocalTime;

import com.devon.application.mzm.bookingmanagement.common.api.Booking;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of Booking
 */
public class BookingEto extends AbstractEto implements Booking {

  private static final long serialVersionUID = 1L;

  private Long screeningId;

  private Long userId;

  private LocalTime bookingTime;

  private boolean booked;

  private boolean active;

  @Override
  public Long getScreeningId() {

    return screeningId;
  }

  @Override
  public void setScreeningId(Long screeningId) {

    this.screeningId = screeningId;
  }

  @Override
  public Long getUserId() {

    return userId;
  }

  @Override
  public void setUserId(Long userId) {

    this.userId = userId;
  }

  @Override
  public LocalTime getBookingTime() {

    return bookingTime;
  }

  @Override
  public void setBookingTime(LocalTime bookingTime) {

    this.bookingTime = bookingTime;
  }

  @Override
  public boolean isBooked() {

    return booked;
  }

  @Override
  public void setBooked(boolean booked) {

    this.booked = booked;
  }

  @Override
  public boolean isActive() {

    return active;
  }

  @Override
  public void setActive(boolean active) {

    this.active = active;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();

    result = prime * result + ((this.screeningId == null) ? 0 : this.screeningId.hashCode());

    result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());
    result = prime * result + ((this.bookingTime == null) ? 0 : this.bookingTime.hashCode());
    result = prime * result + ((Boolean) booked).hashCode();
    result = prime * result + ((Boolean) active).hashCode();

    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    // class check will be done by super type EntityTo!
    if (!super.equals(obj)) {
      return false;
    }
    BookingEto other = (BookingEto) obj;

    if (this.screeningId == null) {
      if (other.screeningId != null) {
        return false;
      }
    } else if (!this.screeningId.equals(other.screeningId)) {
      return false;
    }

    if (this.userId == null) {
      if (other.userId != null) {
        return false;
      }
    } else if (!this.userId.equals(other.userId)) {
      return false;
    }
    if (this.bookingTime == null) {
      if (other.bookingTime != null) {
        return false;
      }
    } else if (!this.bookingTime.equals(other.bookingTime)) {
      return false;
    }
    if (this.booked != other.booked) {
      return false;
    }
    if (this.active != other.active) {
      return false;
    }

    return true;
  }
}
