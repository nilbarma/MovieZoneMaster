package com.devon.application.mzm.bookingmanagement.logic.impl.usecase;

import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.SeatBookedEntity;
import com.devon.application.mzm.bookingmanagement.logic.api.to.SeatBookedEto;
import com.devon.application.mzm.bookingmanagement.logic.api.to.SeatBookedSearchCriteriaTo;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcFindSeatBooked;
import com.devon.application.mzm.bookingmanagement.logic.base.usecase.AbstractSeatBookedUc;

/**
 * Use case implementation for searching, filtering and getting SeatBookeds
 */
@Named
@Validated
@Transactional
public class UcFindSeatBookedImpl extends AbstractSeatBookedUc implements UcFindSeatBooked {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindSeatBookedImpl.class);

  @Override
  public SeatBookedEto findSeatBooked(long id) {

    LOG.debug("Get SeatBooked with id {} from database.", id);
    Optional<SeatBookedEntity> foundEntity = getSeatBookedRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), SeatBookedEto.class);
    else
      return null;
  }

  @Override
  public Page<SeatBookedEto> findSeatBookeds(SeatBookedSearchCriteriaTo criteria) {

    Page<SeatBookedEntity> seatbookeds = getSeatBookedRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(seatbookeds, SeatBookedEto.class);
  }

}
