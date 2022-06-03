package com.devon.application.mzm.bookingmanagement.logic.api.to;

import com.devon.application.mzm.bookingmanagement.common.api.Auditorium;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of Auditorium
 */
public class AuditoriumEto extends AbstractEto implements Auditorium {

  private static final long serialVersionUID = 1L;

  private Integer seatCount;

  private Long theatreId;

  @Override
  public Integer getSeatCount() {

    return seatCount;
  }

  @Override
  public void setSeatCount(Integer seatCount) {

    this.seatCount = seatCount;
  }

  @Override
  public Long getTheatreId() {

    return theatreId;
  }

  @Override
  public void setTheatreId(Long theatreId) {

    this.theatreId = theatreId;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.seatCount == null) ? 0 : this.seatCount.hashCode());

    result = prime * result + ((this.theatreId == null) ? 0 : this.theatreId.hashCode());

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
    AuditoriumEto other = (AuditoriumEto) obj;
    if (this.seatCount == null) {
      if (other.seatCount != null) {
        return false;
      }
    } else if (!this.seatCount.equals(other.seatCount)) {
      return false;
    }

    if (this.theatreId == null) {
      if (other.theatreId != null) {
        return false;
      }
    } else if (!this.theatreId.equals(other.theatreId)) {
      return false;
    }

    return true;
  }
}
