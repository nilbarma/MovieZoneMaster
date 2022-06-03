package com.devon.application.mzm.bookingmanagement.logic.api.to;

import java.time.LocalDate;
import java.time.LocalTime;

import com.devon.application.mzm.bookingmanagement.common.api.Screening;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of Screening
 */
public class ScreeningEto extends AbstractEto implements Screening {

  private static final long serialVersionUID = 1L;

  private Long movieId;

  private Long auditoriumId;

  private LocalDate date;

  private LocalTime startTime;

  private LocalTime endTime;

  private Boolean full;

  private Double price;

  @Override
  public Long getMovieId() {

    return movieId;
  }

  @Override
  public void setMovieId(Long movieId) {

    this.movieId = movieId;
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
  public LocalDate getDate() {

    return date;
  }

  @Override
  public void setDate(LocalDate date) {

    this.date = date;
  }

  @Override
  public LocalTime getStartTime() {

    return startTime;
  }

  @Override
  public void setStartTime(LocalTime startTime) {

    this.startTime = startTime;
  }

  @Override
  public LocalTime getEndTime() {

    return endTime;
  }

  @Override
  public void setEndTime(LocalTime endTime) {

    this.endTime = endTime;
  }

  @Override
  public Boolean getFull() {

    return full;
  }

  @Override
  public void setFull(Boolean full) {

    this.full = full;
  }

  @Override
  public Double getPrice() {

    return price;
  }

  @Override
  public void setPrice(Double price) {

    this.price = price;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();

    result = prime * result + ((this.movieId == null) ? 0 : this.movieId.hashCode());

    result = prime * result + ((this.auditoriumId == null) ? 0 : this.auditoriumId.hashCode());
    result = prime * result + ((this.date == null) ? 0 : this.date.hashCode());
    result = prime * result + ((this.startTime == null) ? 0 : this.startTime.hashCode());
    result = prime * result + ((this.endTime == null) ? 0 : this.endTime.hashCode());
    result = prime * result + ((this.full == null) ? 0 : this.full.hashCode());
    result = prime * result + ((this.price == null) ? 0 : this.price.hashCode());

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
    ScreeningEto other = (ScreeningEto) obj;

    if (this.movieId == null) {
      if (other.movieId != null) {
        return false;
      }
    } else if (!this.movieId.equals(other.movieId)) {
      return false;
    }

    if (this.auditoriumId == null) {
      if (other.auditoriumId != null) {
        return false;
      }
    } else if (!this.auditoriumId.equals(other.auditoriumId)) {
      return false;
    }
    if (this.date == null) {
      if (other.date != null) {
        return false;
      }
    } else if (!this.date.equals(other.date)) {
      return false;
    }
    if (this.startTime == null) {
      if (other.startTime != null) {
        return false;
      }
    } else if (!this.startTime.equals(other.startTime)) {
      return false;
    }
    if (this.endTime == null) {
      if (other.endTime != null) {
        return false;
      }
    } else if (!this.endTime.equals(other.endTime)) {
      return false;
    }
    if (this.full == null) {
      if (other.full != null) {
        return false;
      }
    } else if (!this.full.equals(other.full)) {
      return false;
    }
    if (this.price == null) {
      if (other.price != null) {
        return false;
      }
    } else if (!this.price.equals(other.price)) {
      return false;
    }

    return true;
  }
}
