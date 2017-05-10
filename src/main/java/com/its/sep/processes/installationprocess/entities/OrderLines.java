package com.its.sep.processes.installationprocess.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
public class OrderLines
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @GeneratedValue(strategy=GenerationType.AUTO, generator="ORDERLINES_ID_GENERATOR")
  @Id
  @SequenceGenerator(sequenceName="ORDERLINES_ID_SEQ", name="ORDERLINES_ID_GENERATOR")
  @Label("id")
  private Long id;
  @Label("quantity")
  private Integer quantity;
  @Label("unitPrice")
  private BigDecimal unitPrice;
  @Label("totalPrice")
  private BigDecimal totalPrice;
  @Label("description")
  private String description;
  @ManyToOne(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.EAGER)
  private Product product;
  
  public OrderLines() {}
  
  public Long getId()
  {
    return this.id;
  }
  
  public void setId(Long id)
  {
    this.id = id;
  }
  
  public Integer getQuantity()
  {
    return this.quantity;
  }
  
  public void setQuantity(Integer quantity)
  {
    this.quantity = quantity;
  }
  
  public BigDecimal getUnitPrice()
  {
    return this.unitPrice;
  }
  
  public void setUnitPrice(BigDecimal unitPrice)
  {
    this.unitPrice = unitPrice;
  }
  
  public String getDescription()
  {
    return this.description;
  }
  
  public void setDescription(String description)
  {
    this.description = description;
  }
  
  public Product getProduct()
  {
    return this.product;
  }
  
  public void setProduct(Product product)
  {
    this.product = product;
  }
  
  public BigDecimal getTotalPrice()
  {
    return this.totalPrice;
  }
  
  public void setTotalPrice(BigDecimal totalPrice)
  {
    this.totalPrice = totalPrice;
  }
  
  public OrderLines(Long id, Integer quantity, BigDecimal unitPrice, BigDecimal totalPrice, String description, Product product)
  {
    this.id = id;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
    this.totalPrice = totalPrice;
    this.description = description;
    this.product = product;
  }
}
