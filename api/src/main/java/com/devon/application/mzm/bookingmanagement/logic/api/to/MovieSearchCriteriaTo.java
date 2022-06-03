package com.devon.application.mzm.bookingmanagement.logic.api.to;

import com.devon.application.mzm.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of {@link com.devon.application.mzm.bookingmanagement.common.api.Movie}s.
 */
public class MovieSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private String title;

  private String poster;

  private String genre;

  private Integer duration;

  private StringSearchConfigTo titleOption;

  private StringSearchConfigTo posterOption;

  private StringSearchConfigTo genreOption;

  /**
   * @return titleId
   */

  public String getTitle() {

    return title;
  }

  /**
   * @param title setter for title attribute
   */

  public void setTitle(String title) {

    this.title = title;
  }

  /**
   * @return posterId
   */

  public String getPoster() {

    return poster;
  }

  /**
   * @param poster setter for poster attribute
   */

  public void setPoster(String poster) {

    this.poster = poster;
  }

  /**
   * @return genreId
   */

  public String getGenre() {

    return genre;
  }

  /**
   * @param genre setter for genre attribute
   */

  public void setGenre(String genre) {

    this.genre = genre;
  }

  /**
   * @return durationId
   */

  public Integer getDuration() {

    return duration;
  }

  /**
   * @param duration setter for duration attribute
   */

  public void setDuration(Integer duration) {

    this.duration = duration;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getTitle() title}.
   */
  public StringSearchConfigTo getTitleOption() {

    return this.titleOption;
  }

  /**
   * @param titleOption new value of {@link #getTitleOption()}.
   */
  public void setTitleOption(StringSearchConfigTo titleOption) {

    this.titleOption = titleOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getPoster() poster}.
   */
  public StringSearchConfigTo getPosterOption() {

    return this.posterOption;
  }

  /**
   * @param posterOption new value of {@link #getPosterOption()}.
   */
  public void setPosterOption(StringSearchConfigTo posterOption) {

    this.posterOption = posterOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getGenre() genre}.
   */
  public StringSearchConfigTo getGenreOption() {

    return this.genreOption;
  }

  /**
   * @param genreOption new value of {@link #getGenreOption()}.
   */
  public void setGenreOption(StringSearchConfigTo genreOption) {

    this.genreOption = genreOption;
  }

}
