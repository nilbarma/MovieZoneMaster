package com.devon.application.mzm.bookingmanagement.logic.api.to;

import com.devon.application.mzm.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

/**
 * {@link SearchCriteriaTo} to find instances of {@link com.devon.application.mzm.bookingmanagement.common.api.User}s.
 */
public class UserSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private String userName;

  private String password;

  private StringSearchConfigTo userNameOption;

  private StringSearchConfigTo passwordOption;

  /**
   * @return userNameId
   */

  public String getUserName() {

    return userName;
  }

  /**
   * @param userName setter for userName attribute
   */

  public void setUserName(String userName) {

    this.userName = userName;
  }

  /**
   * @return passwordId
   */

  public String getPassword() {

    return password;
  }

  /**
   * @param password setter for password attribute
   */

  public void setPassword(String password) {

    this.password = password;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getUserName() userName}.
   */
  public StringSearchConfigTo getUserNameOption() {

    return this.userNameOption;
  }

  /**
   * @param userNameOption new value of {@link #getUserNameOption()}.
   */
  public void setUserNameOption(StringSearchConfigTo userNameOption) {

    this.userNameOption = userNameOption;
  }

  /**
   * @return the {@link StringSearchConfigTo} used to search for {@link #getPassword() password}.
   */
  public StringSearchConfigTo getPasswordOption() {

    return this.passwordOption;
  }

  /**
   * @param passwordOption new value of {@link #getPasswordOption()}.
   */
  public void setPasswordOption(StringSearchConfigTo passwordOption) {

    this.passwordOption = passwordOption;
  }

}
