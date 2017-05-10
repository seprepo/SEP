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
public class WareHouse
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @GeneratedValue(strategy=GenerationType.AUTO, generator="WAREHOUSE_ID_GENERATOR")
  @Id
  @SequenceGenerator(sequenceName="WAREHOUSE_ID_SEQ", name="WAREHOUSE_ID_GENERATOR")
  private Long id;
  @Label("location")
  private String location;
  @Label("wareHouseManager")
  private String wareHouseManager;
  
  public WareHouse() {}
  
  public Long getId()
  {
    return this.id;
  }
  
  public void setId(Long id)
  {
    this.id = id;
  }
  
  public String getLocation()
  {
    return this.location;
  }
  
  public void setLocation(String location)
  {
    this.location = location;
  }
  
  public String getWareHouseManager()
  {
    return this.wareHouseManager;
  }
  
  public void setWareHouseManager(String wareHouseManager)
  {
    this.wareHouseManager = wareHouseManager;
  }
  
  public WareHouse(Long id, String location, String wareHouseManager)
  {
    this.id = id;
    this.location = location;
    this.wareHouseManager = wareHouseManager;
  }
}
