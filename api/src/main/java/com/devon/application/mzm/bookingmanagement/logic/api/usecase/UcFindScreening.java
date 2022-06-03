package com.devon.application.mzm.bookingmanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devon.application.mzm.bookingmanagement.logic.api.to.ScreeningEto;
import com.devon.application.mzm.bookingmanagement.logic.api.to.ScreeningSearchCriteriaTo;

public interface UcFindScreening {

  /**
   * Returns a Screening by its id 'id'.
   *
   * @param id The id 'id' of the Screening.
   * @return The {@link ScreeningEto} with id 'id'
   */
  ScreeningEto findScreening(long id);

  /**
   * Returns a paginated list of Screenings matching the search criteria.
   *
   * @param criteria the {@link ScreeningSearchCriteriaTo}.
   * @return the {@link List} of matching {@link ScreeningEto}s.
   */
  Page<ScreeningEto> findScreenings(ScreeningSearchCriteriaTo criteria);

}
