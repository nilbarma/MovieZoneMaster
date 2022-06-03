package com.devon.application.mzm.bookingmanagement.dataaccess.api;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.devon.application.mzm.bookingmanagement.common.api.Screening;
import com.devon.application.mzm.general.dataaccess.api.ApplicationPersistenceEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "screening")
public class ScreeningEntity extends ApplicationPersistenceEntity implements Screening {

  @JsonManagedReference
  private MovieEntity movie;

  @JsonManagedReference
  private AuditoriumEntity auditorium;

  private LocalDate date;

  private LocalTime startTime;

  private LocalTime endTime;

  @Column(name = "is_full")
  private Boolean full;

  private Double price;

  @JsonBackReference
  private Set<SeatBookedEntity> bookedSeats;

  @JsonBackReference
  private Set<BookingEntity> bookings;

  private static final long serialVersionUID = 1L;

  /**
   * @return movie
   */
  @ManyToOne
  @JoinColumn(name = "movie_id")
  public MovieEntity getMovie() {

    return this.movie;
  }

  /**
   * @param movie new value of {@link #getmovie}.
   */
  public void setMovie(MovieEntity movie) {

    this.movie = movie;
  }

  /**
   * @return auditorium
   */
  @ManyToOne
  @JoinColumn(name = "auditorium_id")
  public AuditoriumEntity getAuditorium() {

    return this.auditorium;
  }

  /**
   * @param auditorium new value of {@link #getauditorium}.
   */
  public void setAuditorium(AuditoriumEntity auditorium) {

    this.auditorium = auditorium;
  }

  /**
   * @return date
   */
  @Override
  @Column(name = "date")
  public LocalDate getDate() {

    return this.date;
  }

  /**
   * @param date new value of {@link #getdate}.
   */
  @Override
  public void setDate(LocalDate date) {

    this.date = date;
  }

  /**
   * @return startTime
   */
  @Override
  @Column(name = "start_time")
  public LocalTime getStartTime() {

    return this.startTime;
  }

  /**
   * @param startTime new value of {@link #getstartTime}.
   */
  @Override
  public void setStartTime(LocalTime startTime) {

    this.startTime = startTime;
  }

  /**
   * @return endTime
   */
  @Override
  @Column(name = "end_time")
  public LocalTime getEndTime() {

    return this.endTime;
  }

  /**
   * @param endTime new value of {@link #getendTime}.
   */
  @Override
  public void setEndTime(LocalTime endTime) {

    this.endTime = endTime;
  }

  /**
   * @return full
   */
  @Override
  @Column(name = "is_full")
  public Boolean getFull() {

    return this.full;
  }

  /**
   * @param full new value of {@link #getfull}.
   */
  @Override
  public void setFull(Boolean full) {

    this.full = full;
  }

  /**
   * @return price
   */
  @Override
  @Column(name = "price")
  public Double getPrice() {

    return this.price;
  }

  /**
   * @param price new value of {@link #getprice}.
   */
  @Override
  public void setPrice(Double price) {

    this.price = price;
  }

  /**
   * @return bookedSeats
   */
  @OneToMany(mappedBy = "screening", cascade = CascadeType.ALL)
  public Set<SeatBookedEntity> getBookedSeats() {

    return this.bookedSeats;
  }

  /**
   * @param bookedSeats new value of {@link #getbookedSeats}.
   */
  public void setBookedSeats(Set<SeatBookedEntity> bookedSeats) {

    this.bookedSeats = bookedSeats;
  }

  /**
   * @return bookings
   */
  @OneToMany(mappedBy = "screening", cascade = CascadeType.ALL)
  public Set<BookingEntity> getBookings() {

    return this.bookings;
  }

  /**
   * @param bookings new value of {@link #getbookings}.
   */
  public void setBookings(Set<BookingEntity> bookings) {

    this.bookings = bookings;
  }

  @Override
  @Transient
  public Long getMovieId() {

    if (this.movie == null) {
      return null;
    }
    return this.movie.getId();
  }

  @Override
  public void setMovieId(Long movieId) {

    if (movieId == null) {
      this.movie = null;
    } else {
      MovieEntity movieEntity = new MovieEntity();
      movieEntity.setId(movieId);
      this.movie = movieEntity;
    }
  }

  @Override
  @Transient
  public Long getAuditoriumId() {

    if (this.auditorium == null) {
      return null;
    }
    return this.auditorium.getId();
  }

  @Override
  public void setAuditoriumId(Long auditoriumId) {

    if (auditoriumId == null) {
      this.auditorium = null;
    } else {
      AuditoriumEntity auditoriumEntity = new AuditoriumEntity();
      auditoriumEntity.setId(auditoriumId);
      this.auditorium = auditoriumEntity;
    }
  }

}
