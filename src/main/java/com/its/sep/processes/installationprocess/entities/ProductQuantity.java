package com.its.sep.processes.installationprocess.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import org.kie.api.definition.type.Label;
import org.kie.api.remote.Remotable;

@javax.persistence.Entity
@org.kie.api.remote.Remotable
public class ProductQuantity
      implements Serializable
{
   static final long serialVersionUID = 1L;
   @javax.persistence.GeneratedValue(generator = "PRODUCTQUANTITY_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "PRODUCTQUANTITY_ID_GENERATOR", sequenceName = "PRODUCTQUANTITY_ID_SEQ")
   private Long id;
   @javax.persistence.OneToOne(cascade = { javax.persistence.CascadeType.ALL }, fetch = javax.persistence.FetchType.LAZY)
   @org.kie.api.definition.type.Label("Product")
   private Product product;
   @org.kie.api.definition.type.Label("Quantity")
   private Integer quantity;
   @org.kie.api.definition.type.Label("Unit Price")
   private BigDecimal unitPrice;
   @org.kie.api.definition.type.Label("Total Price")
   private BigDecimal totalPrice;
   @org.kie.api.definition.type.Label("remaining Qty")
   private BigDecimal remainingQty;

   public ProductQuantity()
   {
   }

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

   public BigDecimal getUnitPrice()
   {
      return this.unitPrice;
   }

   public void setUnitPrice(BigDecimal unitPrice)
   {
      this.unitPrice = unitPrice;
   }

   public BigDecimal getTotalPrice()
   {
      return this.totalPrice;
   }

   public void setTotalPrice(BigDecimal totalPrice)
   {
      this.totalPrice = totalPrice;
   }

   public BigDecimal getRemainingQty()
   {
      return this.remainingQty;
   }

   public void setRemainingQty(BigDecimal remainingQty)
   {
      this.remainingQty = remainingQty;
   }

   public java.lang.Integer getQuantity()
   {
      return this.quantity;
   }

   public void setQuantity(java.lang.Integer quantity)
   {
      this.quantity = quantity;
   }

   public ProductQuantity(java.lang.Long id,
         com.its.sep.processes.installationprocess.entities.Product product,
         java.lang.Integer quantity, java.math.BigDecimal unitPrice,
         java.math.BigDecimal totalPrice, java.math.BigDecimal remainingQty)
   {
      this.id = id;
      this.product = product;
      this.quantity = quantity;
      this.unitPrice = unitPrice;
      this.totalPrice = totalPrice;
      this.remainingQty = remainingQty;
   }
}
