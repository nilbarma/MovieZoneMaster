package com.devon.application.mzm.bookingmanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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

/**
 * The service interface for REST calls in order to execute the logic of component {@link Bookingmanagement}.
 */
@Path("/bookingmanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface BookingmanagementRestService {

  /**
   * Delegates to {@link Bookingmanagement#findAuditorium}.
   *
   * @param id the ID of the {@link AuditoriumEto}
   * @return the {@link AuditoriumEto}
   */
  @GET
  @Path("/auditorium/{id}/")
  public AuditoriumEto getAuditorium(@PathParam("id") long id);

  /**
   * Delegates to {@link Bookingmanagement#saveAuditorium}.
   *
   * @param auditorium the {@link AuditoriumEto} to be saved
   * @return the recently created {@link AuditoriumEto}
   */
  @POST
  @Path("/auditorium/")
  public AuditoriumEto saveAuditorium(AuditoriumEto auditorium);

  /**
   * Delegates to {@link Bookingmanagement#deleteAuditorium}.
   *
   * @param id ID of the {@link AuditoriumEto} to be deleted
   */
  @DELETE
  @Path("/auditorium/{id}/")
  public void deleteAuditorium(@PathParam("id") long id);

  /**
   * Delegates to {@link Bookingmanagement#findAuditoriumEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding auditoriums.
   * @return the {@link Page list} of matching {@link AuditoriumEto}s.
   */
  @Path("/auditorium/search")
  @POST
  public Page<AuditoriumEto> findAuditoriums(AuditoriumSearchCriteriaTo searchCriteriaTo);

  /**
   * Delegates to {@link Bookingmanagement#findBooking}.
   *
   * @param id the ID of the {@link BookingEto}
   * @return the {@link BookingEto}
   */
  @GET
  @Path("/booking/{id}/")
  public BookingEto getBooking(@PathParam("id") long id);

  /**
   * Delegates to {@link Bookingmanagement#saveBooking}.
   *
   * @param booking the {@link BookingEto} to be saved
   * @return the recently created {@link BookingEto}
   */
  @POST
  @Path("/booking/")
  public BookingEto saveBooking(BookingEto booking);

  /**
   * Delegates to {@link Bookingmanagement#deleteBooking}.
   *
   * @param id ID of the {@link BookingEto} to be deleted
   */
  @DELETE
  @Path("/booking/{id}/")
  public void deleteBooking(@PathParam("id") long id);

  /**
   * Delegates to {@link Bookingmanagement#findBookingEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding bookings.
   * @return the {@link Page list} of matching {@link BookingEto}s.
   */
  @Path("/booking/search")
  @POST
  public Page<BookingEto> findBookings(BookingSearchCriteriaTo searchCriteriaTo);

  /**
   * Delegates to {@link Bookingmanagement#findMovie}.
   *
   * @param id the ID of the {@link MovieEto}
   * @return the {@link MovieEto}
   */
  @GET
  @Path("/movie/{id}/")
  public MovieEto getMovie(@PathParam("id") long id);

  /**
   * Delegates to {@link Bookingmanagement#saveMovie}.
   *
   * @param movie the {@link MovieEto} to be saved
   * @return the recently created {@link MovieEto}
   */
  @POST
  @Path("/movie/")
  public MovieEto saveMovie(MovieEto movie);

  /**
   * Delegates to {@link Bookingmanagement#deleteMovie}.
   *
   * @param id ID of the {@link MovieEto} to be deleted
   */
  @DELETE
  @Path("/movie/{id}/")
  public void deleteMovie(@PathParam("id") long id);

  /**
   * Delegates to {@link Bookingmanagement#findMovieEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding movies.
   * @return the {@link Page list} of matching {@link MovieEto}s.
   */
  @Path("/movie/search")
  @POST
  public Page<MovieEto> findMovies(MovieSearchCriteriaTo searchCriteriaTo);

  /**
   * Delegates to {@link Bookingmanagement#findScreening}.
   *
   * @param id the ID of the {@link ScreeningEto}
   * @return the {@link ScreeningEto}
   */
  @GET
  @Path("/screening/{id}/")
  public ScreeningEto getScreening(@PathParam("id") long id);

  /**
   * Delegates to {@link Bookingmanagement#saveScreening}.
   *
   * @param screening the {@link ScreeningEto} to be saved
   * @return the recently created {@link ScreeningEto}
   */
  @POST
  @Path("/screening/")
  public ScreeningEto saveScreening(ScreeningEto screening);

  /**
   * Delegates to {@link Bookingmanagement#deleteScreening}.
   *
   * @param id ID of the {@link ScreeningEto} to be deleted
   */
  @DELETE
  @Path("/screening/{id}/")
  public void deleteScreening(@PathParam("id") long id);

  /**
   * Delegates to {@link Bookingmanagement#findScreeningEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding screenings.
   * @return the {@link Page list} of matching {@link ScreeningEto}s.
   */
  @Path("/screening/search")
  @POST
  public Page<ScreeningEto> findScreenings(ScreeningSearchCriteriaTo searchCriteriaTo);

  /**
   * Delegates to {@link Bookingmanagement#findSeatBooked}.
   *
   * @param id the ID of the {@link SeatBookedEto}
   * @return the {@link SeatBookedEto}
   */
  @GET
  @Path("/seatbooked/{id}/")
  public SeatBookedEto getSeatBooked(@PathParam("id") long id);

  /**
   * Delegates to {@link Bookingmanagement#saveSeatBooked}.
   *
   * @param seatbooked the {@link SeatBookedEto} to be saved
   * @return the recently created {@link SeatBookedEto}
   */
  @POST
  @Path("/seatbooked/")
  public SeatBookedEto saveSeatBooked(SeatBookedEto seatbooked);

  /**
   * Delegates to {@link Bookingmanagement#deleteSeatBooked}.
   *
   * @param id ID of the {@link SeatBookedEto} to be deleted
   */
  @DELETE
  @Path("/seatbooked/{id}/")
  public void deleteSeatBooked(@PathParam("id") long id);

  /**
   * Delegates to {@link Bookingmanagement#findSeatBookedEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding seatbookeds.
   * @return the {@link Page list} of matching {@link SeatBookedEto}s.
   */
  @Path("/seatbooked/search")
  @POST
  public Page<SeatBookedEto> findSeatBookeds(SeatBookedSearchCriteriaTo searchCriteriaTo);

  /**
   * Delegates to {@link Bookingmanagement#findSeat}.
   *
   * @param id the ID of the {@link SeatEto}
   * @return the {@link SeatEto}
   */
  @GET
  @Path("/seat/{id}/")
  public SeatEto getSeat(@PathParam("id") long id);

  /**
   * Delegates to {@link Bookingmanagement#saveSeat}.
   *
   * @param seat the {@link SeatEto} to be saved
   * @return the recently created {@link SeatEto}
   */
  @POST
  @Path("/seat/")
  public SeatEto saveSeat(SeatEto seat);

  /**
   * Delegates to {@link Bookingmanagement#deleteSeat}.
   *
   * @param id ID of the {@link SeatEto} to be deleted
   */
  @DELETE
  @Path("/seat/{id}/")
  public void deleteSeat(@PathParam("id") long id);

  /**
   * Delegates to {@link Bookingmanagement#findSeatEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding seats.
   * @return the {@link Page list} of matching {@link SeatEto}s.
   */
  @Path("/seat/search")
  @POST
  public Page<SeatEto> findSeats(SeatSearchCriteriaTo searchCriteriaTo);

  /**
   * Delegates to {@link Bookingmanagement#findTheatre}.
   *
   * @param id the ID of the {@link TheatreEto}
   * @return the {@link TheatreEto}
   */
  @GET
  @Path("/theatre/{id}/")
  public TheatreEto getTheatre(@PathParam("id") long id);

  /**
   * Delegates to {@link Bookingmanagement#saveTheatre}.
   *
   * @param theatre the {@link TheatreEto} to be saved
   * @return the recently created {@link TheatreEto}
   */
  @POST
  @Path("/theatre/")
  public TheatreEto saveTheatre(TheatreEto theatre);

  /**
   * Delegates to {@link Bookingmanagement#deleteTheatre}.
   *
   * @param id ID of the {@link TheatreEto} to be deleted
   */
  @DELETE
  @Path("/theatre/{id}/")
  public void deleteTheatre(@PathParam("id") long id);

  /**
   * Delegates to {@link Bookingmanagement#findTheatreEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding theatres.
   * @return the {@link Page list} of matching {@link TheatreEto}s.
   */
  @Path("/theatre/search")
  @POST
  public Page<TheatreEto> findTheatres(TheatreSearchCriteriaTo searchCriteriaTo);

  /**
   * Delegates to {@link Bookingmanagement#findUser}.
   *
   * @param id the ID of the {@link UserEto}
   * @return the {@link UserEto}
   */
  @GET
  @Path("/user/{id}/")
  public UserEto getUser(@PathParam("id") long id);

  /**
   * Delegates to {@link Bookingmanagement#saveUser}.
   *
   * @param user the {@link UserEto} to be saved
   * @return the recently created {@link UserEto}
   */
  @POST
  @Path("/user/")
  public UserEto saveUser(UserEto user);

  /**
   * Delegates to {@link Bookingmanagement#deleteUser}.
   *
   * @param id ID of the {@link UserEto} to be deleted
   */
  @DELETE
  @Path("/user/{id}/")
  public void deleteUser(@PathParam("id") long id);

  /**
   * Delegates to {@link Bookingmanagement#findUserEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding users.
   * @return the {@link Page list} of matching {@link UserEto}s.
   */
  @Path("/user/search")
  @POST
  public Page<UserEto> findUsers(UserSearchCriteriaTo searchCriteriaTo);

}
