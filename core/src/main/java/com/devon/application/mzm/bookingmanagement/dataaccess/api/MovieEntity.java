package com.devon.application.mzm.bookingmanagement.dataaccess.api;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.devon.application.mzm.bookingmanagement.common.api.Movie;
import com.devon.application.mzm.general.dataaccess.api.ApplicationPersistenceEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "movie")
public class MovieEntity extends ApplicationPersistenceEntity implements Movie {

  private String title;

  private String poster;

  private String genre;

  private Integer duration;

  @JsonBackReference
  private Set<ScreeningEntity> screenings;

  private static final long serialVersionUID = 1L;

  /**
   * @return title
   */
  @Override
  @Column(name = "title")
  public String getTitle() {

    return this.title;
  }

  /**
   * @param title new value of {@link #gettitle}.
   */
  @Override
  public void setTitle(String title) {

    this.title = title;
  }

  /**
   * @return poster
   */
  @Override
  @Column(name = "poster")
  public String getPoster() {

    return this.poster;
  }

  /**
   * @param poster new value of {@link #getposter}.
   */
  @Override
  public void setPoster(String poster) {

    this.poster = poster;
  }

  /**
   * @return genre
   */
  @Override
  @Column(name = "genre")
  public String getGenre() {

    return this.genre;
  }

  /**
   * @param genre new value of {@link #getgenre}.
   */
  @Override
  public void setGenre(String genre) {

    this.genre = genre;
  }

  /**
   * @return duration
   */
  @Override
  @Column(name = "duration")
  public Integer getDuration() {

    return this.duration;
  }

  /**
   * @param duration new value of {@link #getduration}.
   */
  @Override
  public void setDuration(Integer duration) {

    this.duration = duration;
  }

  /**
   * @return screenings
   */
  @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
  public Set<ScreeningEntity> getScreenings() {

    return this.screenings;
  }

  /**
   * @param screenings new value of {@link #getscreenings}.
   */
  public void setScreenings(Set<ScreeningEntity> screenings) {

    this.screenings = screenings;
  }

}
