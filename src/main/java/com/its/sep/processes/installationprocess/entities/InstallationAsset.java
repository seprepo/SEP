package com.its.sep.processes.installationprocess.entities;


import java.io.Serializable;
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
public class InstallationAsset
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @GeneratedValue(strategy=GenerationType.AUTO, generator="INSTALLATIONASSET_ID_GENERATOR")
  @Id
  @SequenceGenerator(name="INSTALLATIONASSET_ID_GENERATOR", sequenceName="INSTALLATIONASSET_ID_SEQ")
  private Long id;
  @Label("Device IMEI")
  private String deviceIMEI;
  @Label("SIM Number ")
  private String simNumber;
  @Label("Attachment Serial")
  private String attachmentSerial;
  @Label("Asset Name")
  private String assetName;
  @Label("Service Status")
  private String serviceStatus;
  @ManyToOne(fetch=FetchType.LAZY, cascade={javax.persistence.CascadeType.ALL})
  @Label("Parent Technician Job Order")
  private TechnicianJobOrder technicianJobOrder;
  
  public InstallationAsset() {}
  
  public Long getId()
  {
    return this.id;
  }
  
  public void setId(Long id)
  {
    this.id = id;
  }
  
  public String getDeviceIMEI()
  {
    return this.deviceIMEI;
  }
  
  public void setDeviceIMEI(String deviceIMEI)
  {
    this.deviceIMEI = deviceIMEI;
  }
  
  public String getSimNumber()
  {
    return this.simNumber;
  }
  
  public void setSimNumber(String simNumber)
  {
    this.simNumber = simNumber;
  }
  
  public String getAttachmentSerial()
  {
    return this.attachmentSerial;
  }
  
  public void setAttachmentSerial(String attachmentSerial)
  {
    this.attachmentSerial = attachmentSerial;
  }
  
  public String getAssetName()
  {
    return this.assetName;
  }
  
  public void setAssetName(String assetName)
  {
    this.assetName = assetName;
  }
  
  public String getServiceStatus()
  {
    return this.serviceStatus;
  }
  
  public void setServiceStatus(String serviceStatus)
  {
    this.serviceStatus = serviceStatus;
  }
  
  public TechnicianJobOrder getTechnicianJobOrder()
  {
    return this.technicianJobOrder;
  }
  
  public void setTechnicianJobOrder(TechnicianJobOrder technicianJobOrder)
  {
    this.technicianJobOrder = technicianJobOrder;
  }
  
  public InstallationAsset(Long id, String deviceIMEI, String simNumber, String attachmentSerial, String assetName, String serviceStatus, TechnicianJobOrder technicianJobOrder)
  {
    this.id = id;
    this.deviceIMEI = deviceIMEI;
    this.simNumber = simNumber;
    this.attachmentSerial = attachmentSerial;
    this.assetName = assetName;
    this.serviceStatus = serviceStatus;
    this.technicianJobOrder = technicianJobOrder;
  }
}
