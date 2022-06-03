package com.devon.application.mzm.bookingmanagement.common.api;

import java.time.LocalDate;
import java.time.LocalTime;

import com.devon.application.mzm.general.common.api.ApplicationEntity;

public interface Screening extends ApplicationEntity {

  /**
   * getter for movieId attribute
   * 
   * @return movieId
   */

  public Long getMovieId();

  /**
   * @param movie setter for movie attribute
   */

  public void setMovieId(Long movieId);

  /**
   * getter for auditoriumId attribute
   * 
   * @return auditoriumId
   */

  public Long getAuditoriumId();

  /**
   * @param auditorium setter for auditorium attribute
   */

  public void setAuditoriumId(Long auditoriumId);

  /**
   * @return dateId
   */

  public LocalDate getDate();

  /**
   * @param date setter for date attribute
   */

  public void setDate(LocalDate date);

  /**
   * @return startTimeId
   */

  public LocalTime getStartTime();

  /**
   * @param startTime setter for startTime attribute
   */

  public void setStartTime(LocalTime startTime);

  /**
   * @return endTimeId
   */

  public LocalTime getEndTime();

  /**
   * @param endTime setter for endTime attribute
   */

  public void setEndTime(LocalTime endTime);

  /**
   * @return fullId
   */

  public Boolean getFull();

  /**
   * @param full setter for full attribute
   */

  public void setFull(Boolean full);

  /**
   * @return priceId
   */

  public Double getPrice();

  /**
   * @param price setter for price attribute
   */

  public void setPrice(Double price);

}
