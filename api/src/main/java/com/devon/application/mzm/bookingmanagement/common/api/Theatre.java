package com.devon.application.mzm.bookingmanagement.common.api;

import com.devon.application.mzm.general.common.api.ApplicationEntity;

public interface Theatre extends ApplicationEntity {

  /**
   * @return nameId
   */

  public String getName();

  /**
   * @param name setter for name attribute
   */

  public void setName(String name);

}
