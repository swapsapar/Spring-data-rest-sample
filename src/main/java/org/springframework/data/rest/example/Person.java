package org.springframework.data.rest.example;

import java.util.List;
import java.util.Map;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

/**
 * @author Jon Brisbin <jon@jbrisbin.com>
 */
@Entity
public class Person {

  @Id @GeneratedValue private Long id;
  private String name;
  @Version
  private Long version;


  public Person() {
  }

  public Person(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public Person(String name) {
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

}
