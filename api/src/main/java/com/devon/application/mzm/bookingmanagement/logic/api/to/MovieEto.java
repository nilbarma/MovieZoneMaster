package com.devon.application.mzm.bookingmanagement.logic.api.to;

import com.devon.application.mzm.bookingmanagement.common.api.Movie;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of Movie
 */
public class MovieEto extends AbstractEto implements Movie {

  private static final long serialVersionUID = 1L;

  private String title;

  private String poster;

  private String genre;

  private Integer duration;

  @Override
  public String getTitle() {

    return title;
  }

  @Override
  public void setTitle(String title) {

    this.title = title;
  }

  @Override
  public String getPoster() {

    return poster;
  }

  @Override
  public void setPoster(String poster) {

    this.poster = poster;
  }

  @Override
  public String getGenre() {

    return genre;
  }

  @Override
  public void setGenre(String genre) {

    this.genre = genre;
  }

  @Override
  public Integer getDuration() {

    return duration;
  }

  @Override
  public void setDuration(Integer duration) {

    this.duration = duration;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
    result = prime * result + ((this.poster == null) ? 0 : this.poster.hashCode());
    result = prime * result + ((this.genre == null) ? 0 : this.genre.hashCode());
    result = prime * result + ((this.duration == null) ? 0 : this.duration.hashCode());

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
    MovieEto other = (MovieEto) obj;
    if (this.title == null) {
      if (other.title != null) {
        return false;
      }
    } else if (!this.title.equals(other.title)) {
      return false;
    }
    if (this.poster == null) {
      if (other.poster != null) {
        return false;
      }
    } else if (!this.poster.equals(other.poster)) {
      return false;
    }
    if (this.genre == null) {
      if (other.genre != null) {
        return false;
      }
    } else if (!this.genre.equals(other.genre)) {
      return false;
    }
    if (this.duration == null) {
      if (other.duration != null) {
        return false;
      }
    } else if (!this.duration.equals(other.duration)) {
      return false;
    }

    return true;
  }
}
