package com.its.sep.processes.installationprocess.entities;


import java.io.Serializable;
import javax.persistence.Entity;
import org.kie.api.definition.type.Label;
import org.kie.api.remote.Remotable;

@Entity
@Remotable
public class SimCard
  extends Assets
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @Label("simCardNumber")
  private String simCardNumber;
  @Label("activated")
  private Boolean activated = Boolean.FALSE;
  
  public SimCard() {}
  
  public String getSimCardNumber()
  {
    return this.simCardNumber;
  }
  
  public void setSimCardNumber(String simCardNumber)
  {
    this.simCardNumber = simCardNumber;
  }
  
  public Boolean getActivated()
  {
    return this.activated;
  }
  
  public void setActivated(Boolean activated)
  {
    this.activated = activated;
  }
  
  public SimCard(String simCardNumber, Boolean activated)
  {
    this.simCardNumber = simCardNumber;
    this.activated = activated;
  }
}
