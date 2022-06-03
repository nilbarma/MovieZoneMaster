package com.devon.application.mzm.bookingmanagement.logic.impl.usecase;

import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.SeatEntity;
import com.devon.application.mzm.bookingmanagement.logic.api.to.SeatEto;
import com.devon.application.mzm.bookingmanagement.logic.api.to.SeatSearchCriteriaTo;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcFindSeat;
import com.devon.application.mzm.bookingmanagement.logic.base.usecase.AbstractSeatUc;

/**
 * Use case implementation for searching, filtering and getting Seats
 */
@Named
@Validated
@Transactional
public class UcFindSeatImpl extends AbstractSeatUc implements UcFindSeat {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindSeatImpl.class);

  @Override
  public SeatEto findSeat(long id) {

    LOG.debug("Get Seat with id {} from database.", id);
    Optional<SeatEntity> foundEntity = getSeatRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), SeatEto.class);
    else
      return null;
  }

  @Override
  public Page<SeatEto> findSeats(SeatSearchCriteriaTo criteria) {

    Page<SeatEntity> seats = getSeatRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(seats, SeatEto.class);
  }

}
