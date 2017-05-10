package com.its.sep.processes.installationprocess.entities;


import java.io.Serializable;
import java.rmi.server.UID;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import org.kie.api.definition.type.Label;
import org.kie.api.remote.Remotable;

@Entity
@Remotable
public class WorkOrderPackage
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @Id
  @Label("id")
  private String id;
  @OneToOne(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY)
  @Label("purshaseOrder")
  private PurshaseOrder purshaseOrder;
  @Label("quantity")
  private Integer quantity;
  @Label("remainingQuantity")
  private Integer remainingQuantity;
  @Transient
  @Label("status")
  private String status;
  @Label("closingDate")
  private Date closingDate;
  @OneToOne(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="workOrderPackage")
  @Label("jobOrderPackage")
  private JobOrderPackage jobOrderPackage;
  @Label("name")
  private String name;
  @Transient
  private String xmlId;
  
  public WorkOrderPackage() {}
  
  public PurshaseOrder getPurshaseOrder()
  {
    return this.purshaseOrder;
  }
  
  public void setPurshaseOrder(PurshaseOrder purshaseOrder)
  {
    this.purshaseOrder = purshaseOrder;
  }
  
  public String getStatus()
  {
    if (this.remainingQuantity.intValue() == 0) {
      return "CLOSED";
    }
    return "IN_PROGRESS";
  }
  
  public void setStatus(String status)
  {
    this.status = status;
  }
  
  public Date getClosingDate()
  {
    return this.closingDate;
  }
  
  public void setClosingDate(Date closingDate)
  {
    this.closingDate = closingDate;
  }
  
  public JobOrderPackage getJobOrderPackage()
  {
    return this.jobOrderPackage;
  }
  
  public void setJobOrderPackage(JobOrderPackage jobOrderPackage)
  {
    this.jobOrderPackage = jobOrderPackage;
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
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
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
  
  public WorkOrderPackage(String id, PurshaseOrder purshaseOrder, Integer quantity, Integer remainingQuantity, String status, Date closingDate, JobOrderPackage jobOrderPackage, String name, String xmlId)
  {
    this.id = id;
    this.purshaseOrder = purshaseOrder;
    this.quantity = quantity;
    this.remainingQuantity = remainingQuantity;
    this.status = status;
    this.closingDate = closingDate;
    this.jobOrderPackage = jobOrderPackage;
    this.name = name;
    this.xmlId = xmlId;
  }
}