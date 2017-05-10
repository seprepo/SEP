package com.its.sep.processes.installationprocess.entities;


import java.io.Serializable;
import java.rmi.server.UID;
import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import org.kie.api.definition.type.Label;

@Entity
public class JobOrderElement
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @Id
  private String id;
  @Label("Region")
  private String region;
  @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY)
  @Label("Product Quantity")
  private Set<ProductQuantity> productQuantity;
  @Label("Creation Date")
  private Date creationDate;
  @ManyToOne(cascade={javax.persistence.CascadeType.REMOVE, javax.persistence.CascadeType.PERSIST, javax.persistence.CascadeType.REFRESH, javax.persistence.CascadeType.DETACH}, fetch=FetchType.LAZY)
  @JoinColumn(name="jobOrderPackage_id")
  @Label("Parent Job Order")
  private JobOrderPackage jobOrderPackage;
  @Transient
  private String xmlId;
  
  public JobOrderElement() {}
  
  public String getRegion()
  {
    return this.region;
  }
  
  public void setRegion(String region)
  {
    this.region = region;
  }
  
  public Set<ProductQuantity> getProductQuantity()
  {
    return this.productQuantity;
  }
  
  public void setProductQuantity(Set<ProductQuantity> productQuantity)
  {
    this.productQuantity = productQuantity;
  }
  
  public Date getCreationDate()
  {
    return this.creationDate;
  }
  
  public void setCreationDate(Date creationDate)
  {
    this.creationDate = creationDate;
  }
  
  @XmlAttribute
  @XmlIDREF
  public JobOrderPackage getJobOrderPackage()
  {
    return this.jobOrderPackage;
  }
  
  public void setJobOrderPackage(JobOrderPackage jobOrderPackage)
  {
    this.jobOrderPackage = jobOrderPackage;
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
  
  public JobOrderElement(String id, String region, Set<ProductQuantity> productQuantity, Date creationDate, JobOrderPackage jobOrderPackage, String xmlId)
  {
    this.id = id;
    this.region = region;
    this.productQuantity = productQuantity;
    this.creationDate = creationDate;
    this.jobOrderPackage = jobOrderPackage;
    this.xmlId = xmlId;
  }
}
