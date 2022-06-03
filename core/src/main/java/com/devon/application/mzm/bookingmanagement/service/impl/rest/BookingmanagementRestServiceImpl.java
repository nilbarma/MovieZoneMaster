package com.devon.application.mzm.bookingmanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.devon.application.mzm.bookingmanagement.logic.api.Bookingmanagement;
import com.devon.application.mzm.bookingmanagement.logic.api.to.AuditoriumEto;
import com.devon.application.mzm.bookingmanagement.logic.api.to.AuditoriumSearchCriteriaTo;
import com.devon.application.mzm.bookingmanagement.logic.api.to.BookingEto;
import com.devon.application.mzm.bookingmanagement.logic.api.to.BookingSearchCriteriaTo;
import com.devon.application.mzm.bookingmanagement.logic.api.to.MovieEto;
import com.devon.application.mzm.bookingmanagement.logic.api.to.MovieSearchCriteriaTo;
import com.devon.application.mzm.bookingmanagement.logic.api.to.ScreeningEto;
import com.devon.application.mzm.bookingmanagement.logic.api.to.ScreeningSearchCriteriaTo;
import com.devon.application.mzm.bookingmanagement.logic.api.to.SeatBookedEto;
import com.devon.application.mzm.bookingmanagement.logic.api.to.SeatBookedSearchCriteriaTo;
import com.devon.application.mzm.bookingmanagement.logic.api.to.SeatEto;
import com.devon.application.mzm.bookingmanagement.logic.api.to.SeatSearchCriteriaTo;
import com.devon.application.mzm.bookingmanagement.logic.api.to.TheatreEto;
import com.devon.application.mzm.bookingmanagement.logic.api.to.TheatreSearchCriteriaTo;
import com.devon.application.mzm.bookingmanagement.logic.api.to.UserEto;
import com.devon.application.mzm.bookingmanagement.logic.api.to.UserSearchCriteriaTo;
import com.devon.application.mzm.bookingmanagement.service.api.rest.BookingmanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of component {@link Bookingmanagement}.
 */
@Named("BookingmanagementRestService")
public class BookingmanagementRestServiceImpl implements BookingmanagementRestService {

  @Inject
  private Bookingmanagement bookingmanagement;

  @Override
  public AuditoriumEto getAuditorium(long id) {

    return this.bookingmanagement.findAuditorium(id);
  }

  @Override
  public AuditoriumEto saveAuditorium(AuditoriumEto auditorium) {

    return this.bookingmanagement.saveAuditorium(auditorium);
  }

  @Override
  public void deleteAuditorium(long id) {

    this.bookingmanagement.deleteAuditorium(id);
  }

  @Override
  public Page<AuditoriumEto> findAuditoriums(AuditoriumSearchCriteriaTo searchCriteriaTo) {

    return this.bookingmanagement.findAuditoriums(searchCriteriaTo);
  }

  @Override
  public BookingEto getBooking(long id) {

    return this.bookingmanagement.findBooking(id);
  }

  @Override
  public BookingEto saveBooking(BookingEto booking) {

    return this.bookingmanagement.saveBooking(booking);
  }

  @Override
  public void deleteBooking(long id) {

    this.bookingmanagement.deleteBooking(id);
  }

  @Override
  public Page<BookingEto> findBookings(BookingSearchCriteriaTo searchCriteriaTo) {

    return this.bookingmanagement.findBookings(searchCriteriaTo);
  }

  @Override
  public MovieEto getMovie(long id) {

    return this.bookingmanagement.findMovie(id);
  }

  @Override
  public MovieEto saveMovie(MovieEto movie) {

    return this.bookingmanagement.saveMovie(movie);
  }

  @Override
  public void deleteMovie(long id) {

    this.bookingmanagement.deleteMovie(id);
  }

  @Override
  public Page<MovieEto> findMovies(MovieSearchCriteriaTo searchCriteriaTo) {

    return this.bookingmanagement.findMovies(searchCriteriaTo);
  }

  @Override
  public ScreeningEto getScreening(long id) {

    return this.bookingmanagement.findScreening(id);
  }

  @Override
  public ScreeningEto saveScreening(ScreeningEto screening) {

    return this.bookingmanagement.saveScreening(screening);
  }

  @Override
  public void deleteScreening(long id) {

    this.bookingmanagement.deleteScreening(id);
  }

  @Override
  public Page<ScreeningEto> findScreenings(ScreeningSearchCriteriaTo searchCriteriaTo) {

    return this.bookingmanagement.findScreenings(searchCriteriaTo);
  }

  @Override
  public SeatBookedEto getSeatBooked(long id) {

    return this.bookingmanagement.findSeatBooked(id);
  }

  @Override
  public SeatBookedEto saveSeatBooked(SeatBookedEto seatbooked) {

    return this.bookingmanagement.saveSeatBooked(seatbooked);
  }

  @Override
  public void deleteSeatBooked(long id) {

    this.bookingmanagement.deleteSeatBooked(id);
  }

  @Override
  public Page<SeatBookedEto> findSeatBookeds(SeatBookedSearchCriteriaTo searchCriteriaTo) {

    return this.bookingmanagement.findSeatBookeds(searchCriteriaTo);
  }

  @Override
  public SeatEto getSeat(long id) {

    return this.bookingmanagement.findSeat(id);
  }

  @Override
  public SeatEto saveSeat(SeatEto seat) {

    return this.bookingmanagement.saveSeat(seat);
  }

  @Override
  public void deleteSeat(long id) {

    this.bookingmanagement.deleteSeat(id);
  }

  @Override
  public Page<SeatEto> findSeats(SeatSearchCriteriaTo searchCriteriaTo) {

    return this.bookingmanagement.findSeats(searchCriteriaTo);
  }

  @Override
  public TheatreEto getTheatre(long id) {

    return this.bookingmanagement.findTheatre(id);
  }

  @Override
  public TheatreEto saveTheatre(TheatreEto theatre) {

    return this.bookingmanagement.saveTheatre(theatre);
  }

  @Override
  public void deleteTheatre(long id) {

    this.bookingmanagement.deleteTheatre(id);
  }

  @Override
  public Page<TheatreEto> findTheatres(TheatreSearchCriteriaTo searchCriteriaTo) {

    return this.bookingmanagement.findTheatres(searchCriteriaTo);
  }

  @Override
  public UserEto getUser(long id) {

    return this.bookingmanagement.findUser(id);
  }

  @Override
  public UserEto saveUser(UserEto user) {

    return this.bookingmanagement.saveUser(user);
  }

  @Override
  public void deleteUser(long id) {

    this.bookingmanagement.deleteUser(id);
  }

  @Override
  public Page<UserEto> findUsers(UserSearchCriteriaTo searchCriteriaTo) {

    return this.bookingmanagement.findUsers(searchCriteriaTo);
  }

}
