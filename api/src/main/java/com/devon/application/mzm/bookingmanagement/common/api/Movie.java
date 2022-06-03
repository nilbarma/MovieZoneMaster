package com.devon.application.mzm.bookingmanagement.common.api;

import com.devon.application.mzm.general.common.api.ApplicationEntity;

public interface Movie extends ApplicationEntity {

  /**
   * @return titleId
   */

  public String getTitle();

  /**
   * @param title setter for title attribute
   */

  public void setTitle(String title);

  /**
   * @return posterId
   */

  public String getPoster();

  /**
   * @param poster setter for poster attribute
   */

  public void setPoster(String poster);

  /**
   * @return genreId
   */

  public String getGenre();

  /**
   * @param genre setter for genre attribute
   */

  public void setGenre(String genre);

  /**
   * @return durationId
   */

  public Integer getDuration();

  /**
   * @param duration setter for duration attribute
   */

  public void setDuration(Integer duration);

}
