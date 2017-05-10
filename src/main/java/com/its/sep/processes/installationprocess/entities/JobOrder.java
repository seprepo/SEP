package com.its.sep.processes.installationprocess.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import org.kie.api.definition.type.Label;
import org.kie.api.remote.Remotable;

@Entity
@Remotable
public class JobOrder
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @GeneratedValue(strategy=GenerationType.AUTO, generator="JOBORDER_ID_GENERATOR")
  @Id
  @SequenceGenerator(sequenceName="JOBORDER_ID_SEQ", name="JOBORDER_ID_GENERATOR")
  private Long id;
  @Label("jobOrderDate")
  private Date jobOrderDate;
  @Label("name")
  private String name;
  @Label("quantity")
  private Integer quantity;
  @Label("remainingQuantity")
  private Integer remainingQuantity;
  @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY)
  private List<JobOrderPackage> relatedJobOrderPackage;
  @Label("assignedTechnician")
  @ManyToOne(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY)
  private Technician assignedTechnician;
  
  public JobOrder() {}
  
  public Long getId()
  {
    return this.id;
  }
  
  public void setId(Long id)
  {
    this.id = id;
  }
  
  public Date getJobOrderDate()
  {
    return this.jobOrderDate;
  }
  
  public void setJobOrderDate(Date jobOrderDate)
  {
    this.jobOrderDate = jobOrderDate;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public Integer getQuantity()
  {
    return this.quantity;
  }
  
  public void setQuantity(Integer quantity)
  {
    this.quantity = quantity;
  }
  
  public Integer getRemainingQuantity()
  {
    return this.remainingQuantity;
  }
  
  public void setRemainingQuantity(Integer remainingQuantity)
  {
    this.remainingQuantity = remainingQuantity;
  }
  
  public List<JobOrderPackage> getRelatedJobOrderPackage()
  {
    return this.relatedJobOrderPackage;
  }
  
  public void setRelatedJobOrderPackage(List<JobOrderPackage> relatedJobOrderPackage)
  {
    this.relatedJobOrderPackage = relatedJobOrderPackage;
  }
  
  public Technician getAssignedTechnician()
  {
    return this.assignedTechnician;
  }
  
  public void setAssignedTechnician(Technician assignedTechnician)
  {
    this.assignedTechnician = assignedTechnician;
  }
  
  public JobOrder(Long id, Date jobOrderDate, String name, Integer quantity, Integer remainingQuantity, List<JobOrderPackage> relatedJobOrderPackage, Technician assignedTechnician)
  {
    this.id = id;
    this.jobOrderDate = jobOrderDate;
    this.name = name;
    this.quantity = quantity;
    this.remainingQuantity = remainingQuantity;
    this.relatedJobOrderPackage = relatedJobOrderPackage;
    this.assignedTechnician = assignedTechnician;
  }
}
