package com.devon.application.mzm.bookingmanagement.dataaccess.api;

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

import com.devon.application.mzm.bookingmanagement.common.api.Booking;
import com.devon.application.mzm.general.dataaccess.api.ApplicationPersistenceEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "booking")
public class BookingEntity extends ApplicationPersistenceEntity implements Booking {

  @JsonManagedReference
  private ScreeningEntity screening;

  @JsonManagedReference
  private UserEntity user;

  private LocalTime bookingTime;

  private boolean booked;

  private boolean active;

  @JsonBackReference
  private Set<SeatBookedEntity> bookedSeats;

  private static final long serialVersionUID = 1L;

  /**
   * @return screening
   */
  @ManyToOne
  @JoinColumn(name = "screening_id")
  public ScreeningEntity getScreening() {

    return this.screening;
  }

  /**
   * @param screening new value of {@link #getscreening}.
   */
  public void setScreening(ScreeningEntity screening) {

    this.screening = screening;
  }

  /**
   * @return user
   */
  @ManyToOne
  @JoinColumn(name = "user_id")
  public UserEntity getUser() {

    return this.user;
  }

  /**
   * @param user new value of {@link #getuser}.
   */
  public void setUser(UserEntity user) {

    this.user = user;
  }

  /**
   * @return bookingTime
   */
  @Override
  @Column(name = "booking_time")
  public LocalTime getBookingTime() {

    return this.bookingTime;
  }

  /**
   * @param bookingTime new value of {@link #getbookingTime}.
   */
  @Override
  public void setBookingTime(LocalTime bookingTime) {

    this.bookingTime = bookingTime;
  }

  /**
   * @return booked
   */
  @Override
  @Column(name = "is_booked")
  public boolean isBooked() {

    return this.booked;
  }

  /**
   * @param booked new value of {@link #getbooked}.
   */
  @Override
  public void setBooked(boolean booked) {

    this.booked = booked;
  }

  /**
   * @return active
   */
  @Override
  @Column(name = "is_active")
  public boolean isActive() {

    return this.active;
  }

  /**
   * @param active new value of {@link #getactive}.
   */
  @Override
  public void setActive(boolean active) {

    this.active = active;
  }

  /**
   * @return bookedSeats
   */
  @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
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
  public Long getScreeningId() {

    if (this.screening == null) {
      return null;
    }
    return this.screening.getId();
  }

  @Override
  public void setScreeningId(Long screeningId) {

    if (screeningId == null) {
      this.screening = null;
    } else {
      ScreeningEntity screeningEntity = new ScreeningEntity();
      screeningEntity.setId(screeningId);
      this.screening = screeningEntity;
    }
  }

  @Override
  @Transient
  public Long getUserId() {

    if (this.user == null) {
      return null;
    }
    return this.user.getId();
  }

  @Override
  public void setUserId(Long userId) {

    if (userId == null) {
      this.user = null;
    } else {
      UserEntity userEntity = new UserEntity();
      userEntity.setId(userId);
      this.user = userEntity;
    }
  }

}
