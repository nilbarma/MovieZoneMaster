package com.devon.application.mzm.bookingmanagement.dataaccess.api;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.devon.application.mzm.bookingmanagement.common.api.Theatre;
import com.devon.application.mzm.general.dataaccess.api.ApplicationPersistenceEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Table(name = "theatre")
public class TheatreEntity extends ApplicationPersistenceEntity implements Theatre {

  private String name;

  @JsonBackReference
  private Set<AuditoriumEntity> auditoriums;

  private static final long serialVersionUID = 1L;

  /**
   * @return name
   */
  @Override
  @Column(name = "name")
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  @Override
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return auditoriums
   */
  @OneToMany(mappedBy = "theatre", cascade = CascadeType.ALL)
  public Set<AuditoriumEntity> getAuditoriums() {

    return this.auditoriums;
  }

  /**
   * @param auditoriums new value of {@link #getauditoriums}.
   */
  public void setAuditoriums(Set<AuditoriumEntity> auditoriums) {

    this.auditoriums = auditoriums;
  }

}
