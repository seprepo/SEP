package com.its.sep.processes.installationprocess.entities;


import java.io.Serializable;
import java.rmi.server.UID;
import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import org.kie.api.definition.type.Label;
import org.kie.api.remote.Remotable;

@Entity
@Remotable
public class JobOrderPackage
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @Id
  @Label("id")
  private String id;
  @Label("name")
  private String name;
  @Label("date")
  private Date date;
  @Label("createdBy")
  private String createdBy;
  @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="jobOrderPackage")
  @Label("Job Orders")
  private Set<JobOrderElement> jobOrders;
  @OneToOne(cascade={javax.persistence.CascadeType.REMOVE}, fetch=FetchType.LAZY)
  @JoinColumn(name="workOrderPackage_id")
  @Label("workOrderPackage")
  private WorkOrderPackage workOrderPackage;
  @Transient
  private String xmlId;
  
  public JobOrderPackage() {}
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public Date getDate()
  {
    return this.date;
  }
  
  public void setDate(Date date)
  {
    this.date = date;
  }
  
  public String getCreatedBy()
  {
    return this.createdBy;
  }
  
  public void setCreatedBy(String createdBy)
  {
    this.createdBy = createdBy;
  }
  
  public Set<JobOrderElement> getJobOrders()
  {
    return this.jobOrders;
  }
  
  public void setJobOrders(Set<JobOrderElement> jobOrders)
  {
    this.jobOrders = jobOrders;
  }
  
  @XmlAttribute
  @XmlIDREF
  public WorkOrderPackage getWorkOrderPackage()
  {
    return this.workOrderPackage;
  }
  
  public void setWorkOrderPackage(WorkOrderPackage workOrderPackage)
  {
    this.workOrderPackage = workOrderPackage;
  }
  
  @XmlAttribute
  @XmlID
  public String getXmlId()
  {
    if (this.id == null) {
      return new UID().toString();
    }
    return String.valueOf(this.id);
  }
  
  public void setXmlId(String xmlId)
  {
    this.xmlId = xmlId;
  }
  
  public String getId()
  {
    return this.id;
  }
  
  public void setId(String id)
  {
    this.id = id;
  }
  
  public JobOrderPackage(String id, String name, Date date, String createdBy, Set<JobOrderElement> jobOrders, WorkOrderPackage workOrderPackage, String xmlId)
  {
    this.id = id;
    this.name = name;
    this.date = date;
    this.createdBy = createdBy;
    this.jobOrders = jobOrders;
    this.workOrderPackage = workOrderPackage;
    this.xmlId = xmlId;
  }
}
