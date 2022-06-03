package com.devon.application.mzm.bookingmanagement.logic.impl;

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
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcFindAuditorium;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcFindBooking;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcFindMovie;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcFindScreening;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcFindSeat;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcFindSeatBooked;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcFindTheatre;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcFindUser;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcManageAuditorium;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcManageBooking;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcManageMovie;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcManageScreening;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcManageSeat;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcManageSeatBooked;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcManageTheatre;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcManageUser;
import com.devon.application.mzm.general.logic.base.AbstractComponentFacade;

/**
 * Implementation of component interface of bookingmanagement
 */
@Named
public class BookingmanagementImpl extends AbstractComponentFacade implements Bookingmanagement {

  @Inject
  private UcFindAuditorium ucFindAuditorium;

  @Inject
  private UcManageAuditorium ucManageAuditorium;

  @Inject
  private UcFindBooking ucFindBooking;

  @Inject
  private UcManageBooking ucManageBooking;

  @Inject
  private UcFindMovie ucFindMovie;

  @Inject
  private UcManageMovie ucManageMovie;

  @Inject
  private UcFindScreening ucFindScreening;

  @Inject
  private UcManageScreening ucManageScreening;

  @Inject
  private UcFindSeatBooked ucFindSeatBooked;

  @Inject
  private UcManageSeatBooked ucManageSeatBooked;

  @Inject
  private UcFindSeat ucFindSeat;

  @Inject
  private UcManageSeat ucManageSeat;

  @Inject
  private UcFindTheatre ucFindTheatre;

  @Inject
  private UcManageTheatre ucManageTheatre;

  @Inject
  private UcFindUser ucFindUser;

  @Inject
  private UcManageUser ucManageUser;

  @Override
  public AuditoriumEto findAuditorium(long id) {

    return this.ucFindAuditorium.findAuditorium(id);
  }

  @Override
  public Page<AuditoriumEto> findAuditoriums(AuditoriumSearchCriteriaTo criteria) {

    return this.ucFindAuditorium.findAuditoriums(criteria);
  }

  @Override
  public AuditoriumEto saveAuditorium(AuditoriumEto auditorium) {

    return this.ucManageAuditorium.saveAuditorium(auditorium);
  }

  @Override
  public boolean deleteAuditorium(long id) {

    return this.ucManageAuditorium.deleteAuditorium(id);
  }

  @Override
  public BookingEto findBooking(long id) {

    return this.ucFindBooking.findBooking(id);
  }

  @Override
  public Page<BookingEto> findBookings(BookingSearchCriteriaTo criteria) {

    return this.ucFindBooking.findBookings(criteria);
  }

  @Override
  public BookingEto saveBooking(BookingEto booking) {

    return this.ucManageBooking.saveBooking(booking);
  }

  @Override
  public boolean deleteBooking(long id) {

    return this.ucManageBooking.deleteBooking(id);
  }

  @Override
  public MovieEto findMovie(long id) {

    return this.ucFindMovie.findMovie(id);
  }

  @Override
  public Page<MovieEto> findMovies(MovieSearchCriteriaTo criteria) {

    return this.ucFindMovie.findMovies(criteria);
  }

  @Override
  public MovieEto saveMovie(MovieEto movie) {

    return this.ucManageMovie.saveMovie(movie);
  }

  @Override
  public boolean deleteMovie(long id) {

    return this.ucManageMovie.deleteMovie(id);
  }

  @Override
  public ScreeningEto findScreening(long id) {

    return this.ucFindScreening.findScreening(id);
  }

  @Override
  public Page<ScreeningEto> findScreenings(ScreeningSearchCriteriaTo criteria) {

    return this.ucFindScreening.findScreenings(criteria);
  }

  @Override
  public ScreeningEto saveScreening(ScreeningEto screening) {

    return this.ucManageScreening.saveScreening(screening);
  }

  @Override
  public boolean deleteScreening(long id) {

    return this.ucManageScreening.deleteScreening(id);
  }

  @Override
  public SeatBookedEto findSeatBooked(long id) {

    return this.ucFindSeatBooked.findSeatBooked(id);
  }

  @Override
  public Page<SeatBookedEto> findSeatBookeds(SeatBookedSearchCriteriaTo criteria) {

    return this.ucFindSeatBooked.findSeatBookeds(criteria);
  }

  @Override
  public SeatBookedEto saveSeatBooked(SeatBookedEto seatbooked) {

    return this.ucManageSeatBooked.saveSeatBooked(seatbooked);
  }

  @Override
  public boolean deleteSeatBooked(long id) {

    return this.ucManageSeatBooked.deleteSeatBooked(id);
  }

  @Override
  public SeatEto findSeat(long id) {

    return this.ucFindSeat.findSeat(id);
  }

  @Override
  public Page<SeatEto> findSeats(SeatSearchCriteriaTo criteria) {

    return this.ucFindSeat.findSeats(criteria);
  }

  @Override
  public SeatEto saveSeat(SeatEto seat) {

    return this.ucManageSeat.saveSeat(seat);
  }

  @Override
  public boolean deleteSeat(long id) {

    return this.ucManageSeat.deleteSeat(id);
  }

  @Override
  public TheatreEto findTheatre(long id) {

    return this.ucFindTheatre.findTheatre(id);
  }

  @Override
  public Page<TheatreEto> findTheatres(TheatreSearchCriteriaTo criteria) {

    return this.ucFindTheatre.findTheatres(criteria);
  }

  @Override
  public TheatreEto saveTheatre(TheatreEto theatre) {

    return this.ucManageTheatre.saveTheatre(theatre);
  }

  @Override
  public boolean deleteTheatre(long id) {

    return this.ucManageTheatre.deleteTheatre(id);
  }

  @Override
  public UserEto findUser(long id) {

    return this.ucFindUser.findUser(id);
  }

  @Override
  public Page<UserEto> findUsers(UserSearchCriteriaTo criteria) {

    return this.ucFindUser.findUsers(criteria);
  }

  @Override
  public UserEto saveUser(UserEto user) {

    return this.ucManageUser.saveUser(user);
  }

  @Override
  public boolean deleteUser(long id) {

    return this.ucManageUser.deleteUser(id);
  }

}
