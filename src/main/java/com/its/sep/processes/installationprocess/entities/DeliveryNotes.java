package com.its.sep.processes.installationprocess.entities;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import org.kie.api.definition.type.Label;
import org.kie.api.remote.Remotable;

@Entity
@Remotable
public class DeliveryNotes
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @GeneratedValue(strategy=GenerationType.AUTO, generator="DELIVERYNOTES_ID_GENERATOR")
  @Id
  @SequenceGenerator(sequenceName="DELIVERYNOTES_ID_SEQ", name="DELIVERYNOTES_ID_GENERATOR")
  private Long id;
  @Label("date")
  private Date date;
  @Label("scannedImage")
  private Byte scannedImage;
  @Label("signedBy")
  private String signedBy;
  
  public DeliveryNotes() {}
  
  public Long getId()
  {
    return this.id;
  }
  
  public void setId(Long id)
  {
    this.id = id;
  }
  
  public Date getDate()
  {
    return this.date;
  }
  
  public void setDate(Date date)
  {
    this.date = date;
  }
  
  public Byte getScannedImage()
  {
    return this.scannedImage;
  }
  
  public void setScannedImage(Byte scannedImage)
  {
    this.scannedImage = scannedImage;
  }
  
  public String getSignedBy()
  {
    return this.signedBy;
  }
  
  public void setSignedBy(String signedBy)
  {
    this.signedBy = signedBy;
  }
  
  public DeliveryNotes(Long id, Date date, Byte scannedImage, String signedBy)
  {
    this.id = id;
    this.date = date;
    this.scannedImage = scannedImage;
    this.signedBy = signedBy;
  }
}
