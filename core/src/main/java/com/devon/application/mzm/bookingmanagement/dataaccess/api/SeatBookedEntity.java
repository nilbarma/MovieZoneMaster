package com.devon.application.mzm.bookingmanagement.dataaccess.api;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.devon.application.mzm.bookingmanagement.common.api.SeatBooked;
import com.devon.application.mzm.general.dataaccess.api.ApplicationPersistenceEntity;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "seat_booked")
public class SeatBookedEntity extends ApplicationPersistenceEntity implements SeatBooked {

  @JsonManagedReference
  private SeatEntity seat;

  @JsonManagedReference
  private BookingEntity booking;

  @JsonManagedReference
  private ScreeningEntity screening;

  private static final long serialVersionUID = 1L;

  /**
   * @return seat
   */
  @ManyToOne
  @JoinColumn(name = "seat_id")
  public SeatEntity getSeat() {

    return this.seat;
  }

  /**
   * @param seat new value of {@link #getseat}.
   */
  public void setSeat(SeatEntity seat) {

    this.seat = seat;
  }

  /**
   * @return booking
   */
  @ManyToOne
  @JoinColumn(name = "booking_id")
  public BookingEntity getBooking() {

    return this.booking;
  }

  /**
   * @param booking new value of {@link #getbooking}.
   */
  public void setBooking(BookingEntity booking) {

    this.booking = booking;
  }

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

  @Override
  @Transient
  public Long getSeatId() {

    if (this.seat == null) {
      return null;
    }
    return this.seat.getId();
  }

  @Override
  public void setSeatId(Long seatId) {

    if (seatId == null) {
      this.seat = null;
    } else {
      SeatEntity seatEntity = new SeatEntity();
      seatEntity.setId(seatId);
      this.seat = seatEntity;
    }
  }

  @Override
  @Transient
  public Long getBookingId() {

    if (this.booking == null) {
      return null;
    }
    return this.booking.getId();
  }

  @Override
  public void setBookingId(Long bookingId) {

    if (bookingId == null) {
      this.booking = null;
    } else {
      BookingEntity bookingEntity = new BookingEntity();
      bookingEntity.setId(bookingId);
      this.booking = bookingEntity;
    }
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

}
