package com.devon.application.mzm.bookingmanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devon.application.mzm.bookingmanagement.logic.api.to.SeatEto;
import com.devon.application.mzm.bookingmanagement.logic.api.to.SeatSearchCriteriaTo;

public interface UcFindSeat {

  /**
   * Returns a Seat by its id 'id'.
   *
   * @param id The id 'id' of the Seat.
   * @return The {@link SeatEto} with id 'id'
   */
  SeatEto findSeat(long id);

  /**
   * Returns a paginated list of Seats matching the search criteria.
   *
   * @param criteria the {@link SeatSearchCriteriaTo}.
   * @return the {@link List} of matching {@link SeatEto}s.
   */
  Page<SeatEto> findSeats(SeatSearchCriteriaTo criteria);

}
