package com.its.sep.processes.installationprocess.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.ElementCollection;
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
public class TechnicianJobOrder
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @GeneratedValue(strategy=GenerationType.AUTO, generator="TECHNICIANJOBORDER_ID_GENERATOR")
  @Id
  @SequenceGenerator(name="TECHNICIANJOBORDER_ID_GENERATOR", sequenceName="TECHNICIANJOBORDER_ID_SEQ")
  private Long id;
  @Label("Date of Installation")
  private Date installationDate;
  @Label("Required Assets")
  @OneToMany(fetch=FetchType.LAZY, cascade={javax.persistence.CascadeType.ALL})
  private Set<InstallationAsset> installationAssets;
  @ManyToOne(fetch=FetchType.LAZY, cascade={javax.persistence.CascadeType.ALL})
  @Label("Technician")
  private Technician technician;
  @ElementCollection(fetch=FetchType.LAZY)
  @Label("delivery Notes")
  private Set<String> deliveryNotes;
  @Label("HQ Remarks")
  private String operationRemarks;
  @ManyToOne(fetch=FetchType.EAGER, cascade={javax.persistence.CascadeType.ALL})
  @Label("Parent Team Job Order")
  private TeamJobOrder teamJobOrder;
  
  public TechnicianJobOrder() {}
  
  public Long getId()
  {
    return this.id;
  }
  
  public void setId(Long id)
  {
    this.id = id;
  }
  
  public Date getInstallationDate()
  {
    return this.installationDate;
  }
  
  public void setInstallationDate(Date installationDate)
  {
    this.installationDate = installationDate;
  }
  
  public Set<InstallationAsset> getInstallationAssets()
  {
    return this.installationAssets;
  }
  
  public void setInstallationAssets(Set<InstallationAsset> installationAssets)
  {
    this.installationAssets = installationAssets;
  }
  
  public Technician getTechnician()
  {
    return this.technician;
  }
  
  public void setTechnician(Technician technician)
  {
    this.technician = technician;
  }
  
  public Set<String> getDeliveryNotes()
  {
    return this.deliveryNotes;
  }
  
  public void setDeliveryNotes(Set<String> deliveryNotes)
  {
    this.deliveryNotes = deliveryNotes;
  }
  
  public String getOperationRemarks()
  {
    return this.operationRemarks;
  }
  
  public void setOperationRemarks(String operationRemarks)
  {
    this.operationRemarks = operationRemarks;
  }
  
  public TeamJobOrder getTeamJobOrder()
  {
    return this.teamJobOrder;
  }
  
  public void setTeamJobOrder(TeamJobOrder teamJobOrder)
  {
    this.teamJobOrder = teamJobOrder;
  }
  
  public TechnicianJobOrder(Long id, Date installationDate, Set<InstallationAsset> installationAssets, Technician technician, Set<String> deliveryNotes, String operationRemarks, TeamJobOrder teamJobOrder)
  {
    this.id = id;
    this.installationDate = installationDate;
    this.installationAssets = installationAssets;
    this.technician = technician;
    this.deliveryNotes = deliveryNotes;
    this.operationRemarks = operationRemarks;
    this.teamJobOrder = teamJobOrder;
  }
}
