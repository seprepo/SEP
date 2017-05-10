package com.its.sep.processes.installationprocess.entities;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import org.kie.api.definition.type.Label;
import org.kie.api.remote.Remotable;

@Entity
@Remotable
public class Product
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @GeneratedValue(strategy=GenerationType.AUTO, generator="PRODUCT_ID_GENERATOR")
  @Id
  @SequenceGenerator(sequenceName="PRODUCT_ID_SEQ", name="PRODUCT_ID_GENERATOR")
  private Long id;
  @Label("price")
  private BigDecimal price;
  @Label("description")
  private String description;
  @OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY)
  @Label("assets")
  private Set<Assets> assets;
  @Label("status")
  private String status;
  
  public Product() {}
  
  public Long getId()
  {
    return this.id;
  }
  
  public void setId(Long id)
  {
    this.id = id;
  }
  
  public BigDecimal getPrice()
  {
    return this.price;
  }
  
  public void setPrice(BigDecimal price)
  {
    this.price = price;
  }
  
  public String getDescription()
  {
    return this.description;
  }
  
  public void setDescription(String description)
  {
    this.description = description;
  }
  
  public Set<Assets> getAssets()
  {
    return this.assets;
  }
  
  public void setAssets(Set<Assets> assets)
  {
    this.assets = assets;
  }
  
  public String getStatus()
  {
    return this.status;
  }
  
  public void setStatus(String status)
  {
    this.status = status;
  }
  
  public Product(Long id, BigDecimal price, String description, HashSet<Assets> assets, String status)
  {
    this.id = id;
    this.price = price;
    this.description = description;
    this.assets = assets;
    this.status = status;
  }
}