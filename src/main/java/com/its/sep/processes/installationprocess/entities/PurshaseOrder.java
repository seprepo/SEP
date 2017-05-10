package com.its.sep.processes.installationprocess.entities;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;
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
public class PurshaseOrder
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @GeneratedValue(strategy=GenerationType.AUTO, generator="POS_ID_GENERATOR")
  @Id
  @SequenceGenerator(sequenceName="POS_ID_SEQ", name="POS_ID_GENERATOR")
  private Long id;
  @ManyToOne(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.EAGER)
  @Label("customer")
  private Customer customer;
  @Label("poDate")
  private Date poDate;
  @Label("poCreator")
  private String poCreator;
  @Label("validityDate")
  private Date validityDate;
  @Label("totalAmount")
  private BigDecimal totalAmount;
  @Label("discount")
  private BigDecimal discount;
  @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.EAGER)
  @Label("orderLines")
  private Set<OrderLines> orderLines;
  
  public PurshaseOrder() {}
  
  public Long getId()
  {
    return this.id;
  }
  
  public void setId(Long id)
  {
    this.id = id;
  }
  
  public Customer getCustomer()
  {
    return this.customer;
  }
  
  public void setCustomer(Customer customer)
  {
    this.customer = customer;
  }
  
  public Date getPoDate()
  {
    return this.poDate;
  }
  
  public void setPoDate(Date poDate)
  {
    this.poDate = poDate;
  }
  
  public String getPoCreator()
  {
    return this.poCreator;
  }
  
  public void setPoCreator(String poCreator)
  {
    this.poCreator = poCreator;
  }
  
  public Date getValidityDate()
  {
    return this.validityDate;
  }
  
  public void setValidityDate(Date validityDate)
  {
    this.validityDate = validityDate;
  }
  
  public BigDecimal getTotalAmount()
  {
    return this.totalAmount;
  }
  
  public void setTotalAmount(BigDecimal totalAmount)
  {
    this.totalAmount = totalAmount;
  }
  
  public BigDecimal getDiscount()
  {
    return this.discount;
  }
  
  public void setDiscount(BigDecimal discount)
  {
    this.discount = discount;
  }
  
  public Set<OrderLines> getOrderLines()
  {
    return this.orderLines;
  }
  
  public void setOrderLines(Set<OrderLines> orderLines)
  {
    this.orderLines = orderLines;
  }
  
  public PurshaseOrder(Long id, Customer customer, Date poDate, String poCreator, Date validityDate, BigDecimal totalAmount, BigDecimal discount, Set<OrderLines> orderLines)
  {
    this.id = id;
    this.customer = customer;
    this.poDate = poDate;
    this.poCreator = poCreator;
    this.validityDate = validityDate;
    this.totalAmount = totalAmount;
    this.discount = discount;
    this.orderLines = orderLines;
  }
}
