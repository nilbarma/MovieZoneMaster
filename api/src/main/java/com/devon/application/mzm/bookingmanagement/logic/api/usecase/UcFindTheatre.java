package com.devon.application.mzm.bookingmanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devon.application.mzm.bookingmanagement.logic.api.to.TheatreEto;
import com.devon.application.mzm.bookingmanagement.logic.api.to.TheatreSearchCriteriaTo;

public interface UcFindTheatre {

  /**
   * Returns a Theatre by its id 'id'.
   *
   * @param id The id 'id' of the Theatre.
   * @return The {@link TheatreEto} with id 'id'
   */
  TheatreEto findTheatre(long id);

  /**
   * Returns a paginated list of Theatres matching the search criteria.
   *
   * @param criteria the {@link TheatreSearchCriteriaTo}.
   * @return the {@link List} of matching {@link TheatreEto}s.
   */
  Page<TheatreEto> findTheatres(TheatreSearchCriteriaTo criteria);

}
