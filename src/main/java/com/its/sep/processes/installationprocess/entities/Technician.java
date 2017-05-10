package com.its.sep.processes.installationprocess.entities;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import org.kie.api.definition.type.Label;
import org.kie.api.remote.Remotable;

@Entity
@Remotable
public class Technician
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @GeneratedValue(strategy=GenerationType.AUTO, generator="TECHNICIAN_ID_GENERATOR")
  @Id
  @SequenceGenerator(sequenceName="TECHNICIAN_ID_SEQ", name="TECHNICIAN_ID_GENERATOR")
  private Long id;
  private String name;
  @Label("nationality")
  private String nationality;
  
  public Technician() {}
  
  public Long getId()
  {
    return this.id;
  }
  
  public void setId(Long id)
  {
    this.id = id;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public String getNationality()
  {
    return this.nationality;
  }
  
  public void setNationality(String nationality)
  {
    this.nationality = nationality;
  }
  
  public Technician(Long id, String name, String nationality)
  {
    this.id = id;
    this.name = name;
    this.nationality = nationality;
  }
}
