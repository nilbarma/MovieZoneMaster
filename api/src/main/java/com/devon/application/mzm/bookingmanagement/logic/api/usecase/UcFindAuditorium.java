package com.devon.application.mzm.bookingmanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.devon.application.mzm.bookingmanagement.logic.api.to.AuditoriumEto;
import com.devon.application.mzm.bookingmanagement.logic.api.to.AuditoriumSearchCriteriaTo;

public interface UcFindAuditorium {

  /**
   * Returns a Auditorium by its id 'id'.
   *
   * @param id The id 'id' of the Auditorium.
   * @return The {@link AuditoriumEto} with id 'id'
   */
  AuditoriumEto findAuditorium(long id);

  /**
   * Returns a paginated list of Auditoriums matching the search criteria.
   *
   * @param criteria the {@link AuditoriumSearchCriteriaTo}.
   * @return the {@link List} of matching {@link AuditoriumEto}s.
   */
  Page<AuditoriumEto> findAuditoriums(AuditoriumSearchCriteriaTo criteria);

}
