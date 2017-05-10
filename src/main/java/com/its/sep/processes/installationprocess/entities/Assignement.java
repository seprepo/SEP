package com.its.sep.processes.installationprocess.entities;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import org.kie.api.definition.type.Label;
import org.kie.api.remote.Remotable;

@Entity
@Remotable
public class Assignement
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @GeneratedValue(strategy=GenerationType.AUTO, generator="ASSIGNEMENT_ID_GENERATOR")
  @Id
  @SequenceGenerator(sequenceName="ASSIGNEMENT_ID_SEQ", name="ASSIGNEMENT_ID_GENERATOR")
  private Long id;
  private String creator;
  @ManyToOne(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.EAGER)
  @Label("relatedTechnician")
  private Technician relatedTechnician;
  @ManyToOne(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.EAGER)
  @Label("jobOrder")
  private JobOrder jobOrder;
  @ManyToOne(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.EAGER)
  @Label("device")
  private Device device;
  @ManyToOne(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.EAGER)
  @Label("simCard")
  private SimCard simCard;
  
  public Assignement() {}
  
  public Long getId()
  {
    return this.id;
  }
  
  public void setId(Long id)
  {
    this.id = id;
  }
  
  public String getCreator()
  {
    return this.creator;
  }
  
  public void setCreator(String creator)
  {
    this.creator = creator;
  }
  
  public Technician getRelatedTechnician()
  {
    return this.relatedTechnician;
  }
  
  public void setRelatedTechnician(Technician relatedTechnician)
  {
    this.relatedTechnician = relatedTechnician;
  }
  
  public JobOrder getJobOrder()
  {
    return this.jobOrder;
  }
  
  public void setJobOrder(JobOrder jobOrder)
  {
    this.jobOrder = jobOrder;
  }
  
  public Device getDevice()
  {
    return this.device;
  }
  
  public void setDevice(Device device)
  {
    this.device = device;
  }
  
  public SimCard getSimCard()
  {
    return this.simCard;
  }
  
  public void setSimCard(SimCard simCard)
  {
    this.simCard = simCard;
  }
  
  public Assignement(Long id, String creator, Technician relatedTechnician, JobOrder jobOrder, Device device, SimCard simCard)
  {
    this.id = id;
    this.creator = creator;
    this.relatedTechnician = relatedTechnician;
    this.jobOrder = jobOrder;
    this.device = device;
    this.simCard = simCard;
  }
}
