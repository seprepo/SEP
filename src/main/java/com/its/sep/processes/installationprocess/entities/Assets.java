package com.its.sep.processes.installationprocess.entities;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import org.kie.api.definition.type.Label;
import org.kie.api.remote.Remotable;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="ASSETS_TYPE")
@Remotable
public abstract class Assets
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @GeneratedValue(strategy=GenerationType.AUTO, generator="ASSETS_ID_GENERATOR")
  @Id
  @SequenceGenerator(sequenceName="ASSETS_ID_SEQ", name="ASSETS_ID_GENERATOR")
  protected Long id;
  protected String status;
  @Label("value")
  protected String value;
  @ManyToOne(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.EAGER)
  protected Assignement assignement;
  @Label("description")
  protected String description;
  @Label("booked")
  protected Boolean booked;
  @Label("bookedVerified")
  protected Boolean bookedVerified;
  @ManyToOne(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY)
  protected Product relatedProduct;
  @ManyToOne(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY)
  @Label("wareHouse")
  protected WareHouse wareHouse;
  @Label("checkInDateWarehouse")
  protected Date checkInDateWarehouse;
  @Label("checkoutDateWarehouse")
  protected Date checkoutDateWarehouse;
  @Label("validCheckoutFromWareHouse")
  private Boolean validCheckoutFromWareHouse;
  @Label("internalCode")
  private String internalCode;
  
  public Assets() {}
  
  public Long getId()
  {
    return this.id;
  }
  
  public void setId(Long id)
  {
    this.id = id;
  }
  
  public String getStatus()
  {
    return this.status;
  }
  
  public void setStatus(String status)
  {
    this.status = status;
  }
  
  public String getValue()
  {
    return this.value;
  }
  
  public void setValue(String value)
  {
    this.value = value;
  }
  
  public Assignement getAssignement()
  {
    return this.assignement;
  }
  
  public void setAssignement(Assignement assignement)
  {
    this.assignement = assignement;
  }
  
  public String getDescription()
  {
    return this.description;
  }
  
  public void setDescription(String description)
  {
    this.description = description;
  }
  
  public Boolean getBooked()
  {
    return this.booked;
  }
  
  public void setBooked(Boolean booked)
  {
    this.booked = booked;
  }
  
  public Boolean getBookedVerified()
  {
    return this.bookedVerified;
  }
  
  public void setBookedVerified(Boolean bookedVerified)
  {
    this.bookedVerified = bookedVerified;
  }
  
  public Product getRelatedProduct()
  {
    return this.relatedProduct;
  }
  
  public void setRelatedProduct(Product relatedProduct)
  {
    this.relatedProduct = relatedProduct;
  }
  
  public WareHouse getWareHouse()
  {
    return this.wareHouse;
  }
  
  public void setWareHouse(WareHouse wareHouse)
  {
    this.wareHouse = wareHouse;
  }
  
  public Date getCheckInDateWarehouse()
  {
    return this.checkInDateWarehouse;
  }
  
  public void setCheckInDateWarehouse(Date checkInDateWarehouse)
  {
    this.checkInDateWarehouse = checkInDateWarehouse;
  }
  
  public Date getCheckoutDateWarehouse()
  {
    return this.checkoutDateWarehouse;
  }
  
  public void setCheckoutDateWarehouse(Date checkoutDateWarehouse)
  {
    this.checkoutDateWarehouse = checkoutDateWarehouse;
  }
  
  public Boolean getValidCheckoutFromWareHouse()
  {
    return this.validCheckoutFromWareHouse;
  }
  
  public void setValidCheckoutFromWareHouse(Boolean validCheckoutFromWareHouse)
  {
    this.validCheckoutFromWareHouse = validCheckoutFromWareHouse;
  }
  
  public String getInternalCode()
  {
    return this.internalCode;
  }
  
  public void setInternalCode(String internalCode)
  {
    this.internalCode = internalCode;
  }
  
  public Assets(Long id, String status, String value, Assignement assignement, String description, Boolean booked, Boolean bookedVerified, Product relatedProduct, WareHouse wareHouse, Date checkInDateWarehouse, Date checkoutDateWarehouse, Boolean validCheckoutFromWareHouse, String internalCode)
  {
    this.id = id;
    this.status = status;
    this.value = value;
    this.assignement = assignement;
    this.description = description;
    this.booked = booked;
    this.bookedVerified = bookedVerified;
    this.relatedProduct = relatedProduct;
    this.wareHouse = wareHouse;
    this.checkInDateWarehouse = checkInDateWarehouse;
    this.checkoutDateWarehouse = checkoutDateWarehouse;
    this.validCheckoutFromWareHouse = validCheckoutFromWareHouse;
    this.internalCode = internalCode;
  }
}
