package com.devon.application.mzm.bookingmanagement.dataaccess.api;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.devon.application.mzm.bookingmanagement.common.api.Auditorium;
import com.devon.application.mzm.general.dataaccess.api.ApplicationPersistenceEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "auditorium")
public class AuditoriumEntity extends ApplicationPersistenceEntity implements Auditorium {

  private Integer seatCount;

  @JsonManagedReference
  private TheatreEntity theatre;

  @JsonBackReference
  private Set<SeatEntity> seats;

  @JsonBackReference
  private Set<ScreeningEntity> screenings;

  private static final long serialVersionUID = 1L;

  /**
   * @return seatCount
   */
  @Override
  @Column(name = "seat_count")
  public Integer getSeatCount() {

    return this.seatCount;
  }

  /**
   * @param seatCount new value of {@link #getseatCount}.
   */
  @Override
  public void setSeatCount(Integer seatCount) {

    this.seatCount = seatCount;
  }

  /**
   * @return theatre
   */
  @ManyToOne
  @JoinColumn(name = "theatre_id")
  public TheatreEntity getTheatre() {

    return this.theatre;
  }

  /**
   * @param theatre new value of {@link #gettheatre}.
   */
  public void setTheatre(TheatreEntity theatre) {

    this.theatre = theatre;
  }

  /**
   * @return seats
   */
  @OneToMany(mappedBy = "auditorium", cascade = CascadeType.ALL)
  public Set<SeatEntity> getSeats() {

    return this.seats;
  }

  /**
   * @param seats new value of {@link #getseats}.
   */
  public void setSeats(Set<SeatEntity> seats) {

    this.seats = seats;
  }

  /**
   * @return screenings
   */
  @OneToMany(mappedBy = "auditorium", cascade = CascadeType.ALL)
  public Set<ScreeningEntity> getScreenings() {

    return this.screenings;
  }

  /**
   * @param screenings new value of {@link #getscreenings}.
   */
  public void setScreenings(Set<ScreeningEntity> screenings) {

    this.screenings = screenings;
  }

  @Override
  @Transient
  public Long getTheatreId() {

    if (this.theatre == null) {
      return null;
    }
    return this.theatre.getId();
  }

  @Override
  public void setTheatreId(Long theatreId) {

    if (theatreId == null) {
      this.theatre = null;
    } else {
      TheatreEntity theatreEntity = new TheatreEntity();
      theatreEntity.setId(theatreId);
      this.theatre = theatreEntity;
    }
  }

}
