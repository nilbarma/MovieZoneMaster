package com.devon.application.mzm.bookingmanagement.logic.api.to;

import java.time.LocalDate;
import java.time.LocalTime;

import com.devon.application.mzm.general.common.api.to.AbstractSearchCriteriaTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.devon.application.mzm.bookingmanagement.common.api.Screening}s.
 */
public class ScreeningSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private Long movieId;

  private Long auditoriumId;

  private LocalDate date;

  private LocalTime startTime;

  private LocalTime endTime;

  private Boolean full;

  private Double price;

  /**
   * getter for movieId attribute
   * 
   * @return movieId
   */

  public Long getMovieId() {

    return movieId;
  }

  /**
   * @param movie setter for movie attribute
   */

  public void setMovieId(Long movieId) {

    this.movieId = movieId;
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

  /**
   * @return dateId
   */

  public LocalDate getDate() {

    return date;
  }

  /**
   * @param date setter for date attribute
   */

  public void setDate(LocalDate date) {

    this.date = date;
  }

  /**
   * @return startTimeId
   */

  public LocalTime getStartTime() {

    return startTime;
  }

  /**
   * @param startTime setter for startTime attribute
   */

  public void setStartTime(LocalTime startTime) {

    this.startTime = startTime;
  }

  /**
   * @return endTimeId
   */

  public LocalTime getEndTime() {

    return endTime;
  }

  /**
   * @param endTime setter for endTime attribute
   */

  public void setEndTime(LocalTime endTime) {

    this.endTime = endTime;
  }

  /**
   * @return fullId
   */

  public Boolean getFull() {

    return full;
  }

  /**
   * @param full setter for full attribute
   */

  public void setFull(Boolean full) {

    this.full = full;
  }

  /**
   * @return priceId
   */

  public Double getPrice() {

    return price;
  }

  /**
   * @param price setter for price attribute
   */

  public void setPrice(Double price) {

    this.price = price;
  }

}
