package com.devon.application.mzm.bookingmanagement.logic.api.to;

import com.devon.application.mzm.bookingmanagement.common.api.Seat;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of Seat
 */
public class SeatEto extends AbstractEto implements Seat {

  private static final long serialVersionUID = 1L;

  private Integer seatNumber;

  private Long auditoriumId;

  @Override
  public Integer getSeatNumber() {

    return seatNumber;
  }

  @Override
  public void setSeatNumber(Integer seatNumber) {

    this.seatNumber = seatNumber;
  }

  @Override
  public Long getAuditoriumId() {

    return auditoriumId;
  }

  @Override
  public void setAuditoriumId(Long auditoriumId) {

    this.auditoriumId = auditoriumId;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.seatNumber == null) ? 0 : this.seatNumber.hashCode());

    result = prime * result + ((this.auditoriumId == null) ? 0 : this.auditoriumId.hashCode());

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
    SeatEto other = (SeatEto) obj;
    if (this.seatNumber == null) {
      if (other.seatNumber != null) {
        return false;
      }
    } else if (!this.seatNumber.equals(other.seatNumber)) {
      return false;
    }

    if (this.auditoriumId == null) {
      if (other.auditoriumId != null) {
        return false;
      }
    } else if (!this.auditoriumId.equals(other.auditoriumId)) {
      return false;
    }

    return true;
  }
}
