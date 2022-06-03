package com.devon.application.mzm.bookingmanagement.logic.impl.usecase;

import java.util.Optional;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.UserEntity;
import com.devon.application.mzm.bookingmanagement.logic.api.to.UserEto;
import com.devon.application.mzm.bookingmanagement.logic.api.to.UserSearchCriteriaTo;
import com.devon.application.mzm.bookingmanagement.logic.api.usecase.UcFindUser;
import com.devon.application.mzm.bookingmanagement.logic.base.usecase.AbstractUserUc;

/**
 * Use case implementation for searching, filtering and getting Users
 */
@Named
@Validated
@Transactional
public class UcFindUserImpl extends AbstractUserUc implements UcFindUser {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindUserImpl.class);

  @Override
  public UserEto findUser(long id) {

    LOG.debug("Get User with id {} from database.", id);
    Optional<UserEntity> foundEntity = getUserRepository().findById(id);
    if (foundEntity.isPresent())
      return getBeanMapper().map(foundEntity.get(), UserEto.class);
    else
      return null;
  }

  @Override
  public Page<UserEto> findUsers(UserSearchCriteriaTo criteria) {

    Page<UserEntity> users = getUserRepository().findByCriteria(criteria);
    return mapPaginatedEntityList(users, UserEto.class);
  }

}
