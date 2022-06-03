package com.devon.application.mzm.bookingmanagement.dataaccess.api;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.devon.application.mzm.bookingmanagement.common.api.User;
import com.devon.application.mzm.general.dataaccess.api.ApplicationPersistenceEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity extends ApplicationPersistenceEntity implements User {

  private String userName;

  private String password;

  @JsonBackReference
  private Set<BookingEntity> bookings;

  private static final long serialVersionUID = 1L;

  /**
   * @return userName
   */
  @Override
  @Column(name = "user_name")
  public String getUserName() {

    return this.userName;
  }

  /**
   * @param userName new value of {@link #getuserName}.
   */
  @Override
  public void setUserName(String userName) {

    this.userName = userName;
  }

  /**
   * @return password
   */
  @Override
  @Column(name = "password")
  public String getPassword() {

    return this.password;
  }

  /**
   * @param password new value of {@link #getpassword}.
   */
  @Override
  public void setPassword(String password) {

    this.password = password;
  }

  /**
   * @return bookings
   */
  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  public Set<BookingEntity> getBookings() {

    return this.bookings;
  }

  /**
   * @param bookings new value of {@link #getbookings}.
   */
  public void setBookings(Set<BookingEntity> bookings) {

    this.bookings = bookings;
  }

}
