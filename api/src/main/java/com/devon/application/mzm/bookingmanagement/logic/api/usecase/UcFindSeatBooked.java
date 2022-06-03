package com.devon.application.mzm.bookingmanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devon.application.mzm.bookingmanagement.logic.api.to.SeatBookedEto;
import com.devon.application.mzm.bookingmanagement.logic.api.to.SeatBookedSearchCriteriaTo;

public interface UcFindSeatBooked {

  /**
   * Returns a SeatBooked by its id 'id'.
   *
   * @param id The id 'id' of the SeatBooked.
   * @return The {@link SeatBookedEto} with id 'id'
   */
  SeatBookedEto findSeatBooked(long id);

  /**
   * Returns a paginated list of SeatBookeds matching the search criteria.
   *
   * @param criteria the {@link SeatBookedSearchCriteriaTo}.
   * @return the {@link List} of matching {@link SeatBookedEto}s.
   */
  Page<SeatBookedEto> findSeatBookeds(SeatBookedSearchCriteriaTo criteria);

}
