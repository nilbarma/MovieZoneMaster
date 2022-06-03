package com.devon.application.mzm.bookingmanagement.logic.api.to;

import com.devon.application.mzm.bookingmanagement.common.api.SeatBooked;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of SeatBooked
 */
public class SeatBookedEto extends AbstractEto implements SeatBooked {

  private static final long serialVersionUID = 1L;

  private Long seatId;

  private Long bookingId;

  private Long screeningId;

  @Override
  public Long getSeatId() {

    return seatId;
  }

  @Override
  public void setSeatId(Long seatId) {

    this.seatId = seatId;
  }

  @Override
  public Long getBookingId() {

    return bookingId;
  }

  @Override
  public void setBookingId(Long bookingId) {

    this.bookingId = bookingId;
  }

  @Override
  public Long getScreeningId() {

    return screeningId;
  }

  @Override
  public void setScreeningId(Long screeningId) {

    this.screeningId = screeningId;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();

    result = prime * result + ((this.seatId == null) ? 0 : this.seatId.hashCode());

    result = prime * result + ((this.bookingId == null) ? 0 : this.bookingId.hashCode());

    result = prime * result + ((this.screeningId == null) ? 0 : this.screeningId.hashCode());
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
    SeatBookedEto other = (SeatBookedEto) obj;

    if (this.seatId == null) {
      if (other.seatId != null) {
        return false;
      }
    } else if (!this.seatId.equals(other.seatId)) {
      return false;
    }

    if (this.bookingId == null) {
      if (other.bookingId != null) {
        return false;
      }
    } else if (!this.bookingId.equals(other.bookingId)) {
      return false;
    }

    if (this.screeningId == null) {
      if (other.screeningId != null) {
        return false;
      }
    } else if (!this.screeningId.equals(other.screeningId)) {
      return false;
    }
    return true;
  }
}
