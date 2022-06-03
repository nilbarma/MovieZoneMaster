package com.devon.application.mzm.bookingmanagement.logic.base.usecase;

import javax.inject.Inject;

import com.devon.application.mzm.bookingmanagement.dataaccess.api.repo.UserRepository;
import com.devon.application.mzm.general.logic.base.AbstractUc;

/**
 * Abstract use case for Users, which provides access to the commonly necessary data access objects.
 */
public abstract class AbstractUserUc extends AbstractUc {

  /** @see #getUserRepository() */
  @Inject
  private UserRepository userRepository;

  /**
   * @return the {@link UserRepository} instance.
   */
  public UserRepository getUserRepository() {

    return this.userRepository;
  }

}
