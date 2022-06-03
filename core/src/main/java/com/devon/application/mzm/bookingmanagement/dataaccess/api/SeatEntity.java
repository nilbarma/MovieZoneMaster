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

import com.devon.application.mzm.bookingmanagement.common.api.Seat;
import com.devon.application.mzm.general.dataaccess.api.ApplicationPersistenceEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "seat")
public class SeatEntity extends ApplicationPersistenceEntity implements Seat {

  private Integer seatNumber;

  @JsonManagedReference
  private AuditoriumEntity auditorium;

  @JsonBackReference
  private Set<SeatBookedEntity> bookedSeats;

  private static final long serialVersionUID = 1L;

  /**
   * @return seatNumber
   */
  @Override
  @Column(name = "seat_number")
  public Integer getSeatNumber() {

    return this.seatNumber;
  }

  /**
   * @param seatNumber new value of {@link #getseatNumber}.
   */
  @Override
  public void setSeatNumber(Integer seatNumber) {

    this.seatNumber = seatNumber;
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
   * @return bookedSeats
   */
  @OneToMany(mappedBy = "seat", cascade = CascadeType.ALL)
  public Set<SeatBookedEntity> getBookedSeats() {

    return this.bookedSeats;
  }

  /**
   * @param bookedSeats new value of {@link #getbookedSeats}.
   */
  public void setBookedSeats(Set<SeatBookedEntity> bookedSeats) {

    this.bookedSeats = bookedSeats;
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
