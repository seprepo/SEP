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
public class Customer
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @GeneratedValue(generator="CUSTOMER_ID_GENERATOR", strategy=GenerationType.AUTO)
  @Id
  @SequenceGenerator(name="CUSTOMER_ID_GENERATOR", sequenceName="CUSTOMER_ID_SEQ")
  private Long id;
  @Label("name")
  private String name;
  @Label("address")
  private String address;
  @Label("mobile")
  private String mobile;
  private String externalId;
  
  public Customer() {}
  
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
  
  public String getAddress()
  {
    return this.address;
  }
  
  public void setAddress(String address)
  {
    this.address = address;
  }
  
  public String getMobile()
  {
    return this.mobile;
  }
  
  public void setMobile(String mobile)
  {
    this.mobile = mobile;
  }
  
  public String getExternalId()
  {
    return this.externalId;
  }
  
  public void setExternalId(String externalId)
  {
    this.externalId = externalId;
  }
  
  public Customer(Long id, String name, String address, String mobile, String externalId)
  {
    this.id = id;
    this.name = name;
    this.address = address;
    this.mobile = mobile;
    this.externalId = externalId;
  }
}
