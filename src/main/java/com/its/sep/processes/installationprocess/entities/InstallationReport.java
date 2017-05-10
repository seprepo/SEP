package com.its.sep.processes.installationprocess.entities;


import java.io.Serializable;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import org.kie.api.definition.type.Label;

@Entity
public class InstallationReport
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @GeneratedValue(strategy=GenerationType.AUTO, generator="INSTALLATIONREPORT_ID_GENERATOR")
  @Id
  @SequenceGenerator(sequenceName="INSTALLATIONREPORT_ID_SEQ", name="INSTALLATIONREPORT_ID_GENERATOR")
  private Long id;
  @ElementCollection(fetch=FetchType.LAZY)
  @Label("remarks")
  private List<String> remarks;
  @Label("validatorName")
  private String validatorName;
  @Label("assignement")
  @ManyToOne(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.LAZY)
  private Assignement assignement;
  @ElementCollection(fetch=FetchType.LAZY)
  @Label("issueFounds")
  private List<String> issueFounds;
  @Label("status")
  private String status = "Started";
  
  public InstallationReport() {}
  
  public Long getId()
  {
    return this.id;
  }
  
  public void setId(Long id)
  {
    this.id = id;
  }
  
  public List<String> getRemarks()
  {
    return this.remarks;
  }
  
  public void setRemarks(List<String> remarks)
  {
    this.remarks = remarks;
  }
  
  public String getValidatorName()
  {
    return this.validatorName;
  }
  
  public void setValidatorName(String validatorName)
  {
    this.validatorName = validatorName;
  }
  
  public Assignement getAssignement()
  {
    return this.assignement;
  }
  
  public void setAssignement(Assignement assignement)
  {
    this.assignement = assignement;
  }
  
  public List<String> getIssueFounds()
  {
    return this.issueFounds;
  }
  
  public void setIssueFounds(List<String> issueFounds)
  {
    this.issueFounds = issueFounds;
  }
  
  public String getStatus()
  {
    return this.status;
  }
  
  public void setStatus(String status)
  {
    this.status = status;
  }
  
  public InstallationReport(Long id, List<String> remarks, String validatorName, Assignement assignement, List<String> issueFounds, String status)
  {
    this.id = id;
    this.remarks = remarks;
    this.validatorName = validatorName;
    this.assignement = assignement;
    this.issueFounds = issueFounds;
    this.status = status;
  }
}
