package com.its.sep.processes.installationprocess.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
public class TeamJobOrder
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @GeneratedValue(strategy=GenerationType.AUTO, generator="TEAMJOBORDER_ID_GENERATOR")
  @Id
  @SequenceGenerator(name="TEAMJOBORDER_ID_GENERATOR", sequenceName="TEAMJOBORDER_ID_SEQ")
  private Long id;
  @ManyToOne(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY)
  @Label("Product")
  private Product product;
  @Label("Quantity")
  private BigDecimal quantity;
  @Label("Date")
  private Date installationDate;
  @Label("Team")
  private String teamId;
  @ManyToOne(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.EAGER)
  @Label("Parent Job Order Element")
  private JobOrderElement jobOrderElement;
  @Label("remaining Qty")
  private BigDecimal remainingQty;
  
  public TeamJobOrder() {}
  
  public Long getId()
  {
    return this.id;
  }
  
  public void setId(Long id)
  {
    this.id = id;
  }
  
  public Product getProduct()
  {
    return this.product;
  }
  
  public void setProduct(Product product)
  {
    this.product = product;
  }
  
  public BigDecimal getQuantity()
  {
    return this.quantity;
  }
  
  public void setQuantity(BigDecimal quantity)
  {
    this.quantity = quantity;
  }
  
  public Date getInstallationDate()
  {
    return this.installationDate;
  }
  
  public void setInstallationDate(Date installationDate)
  {
    this.installationDate = installationDate;
  }
  
  public String getTeamId()
  {
    return this.teamId;
  }
  
  public void setTeamId(String teamId)
  {
    this.teamId = teamId;
  }
  
  public JobOrderElement getJobOrderElement()
  {
    return this.jobOrderElement;
  }
  
  public void setJobOrderElement(JobOrderElement jobOrderElement)
  {
    this.jobOrderElement = jobOrderElement;
  }
  
  public BigDecimal getRemainingQty()
  {
    return this.remainingQty;
  }
  
  public void setRemainingQty(BigDecimal remainingQty)
  {
    this.remainingQty = remainingQty;
  }
  
  public TeamJobOrder(Long id, Product product, BigDecimal quantity, Date installationDate, String teamId, JobOrderElement jobOrderElement, BigDecimal remainingQty)
  {
    this.id = id;
    this.product = product;
    this.quantity = quantity;
    this.installationDate = installationDate;
    this.teamId = teamId;
    this.jobOrderElement = jobOrderElement;
    this.remainingQty = remainingQty;
  }
}
