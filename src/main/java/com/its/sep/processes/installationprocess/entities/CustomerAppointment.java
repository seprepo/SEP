package com.its.sep.processes.installationprocess.entities;


import java.io.Serializable;
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
public class CustomerAppointment
  implements Serializable
{
  static final long serialVersionUID = 1L;
  @GeneratedValue(strategy=GenerationType.AUTO, generator="CUSTOMERAPPOINTMENT_ID_GENERATOR")
  @Id
  @SequenceGenerator(name="CUSTOMERAPPOINTMENT_ID_GENERATOR", sequenceName="CUSTOMERAPPOINTMENT_ID_SEQ")
  @Label("id")
  private Long id;
  @ManyToOne(fetch=FetchType.EAGER, cascade={javax.persistence.CascadeType.ALL})
  @Label("customer")
  private Customer customer;
  @Label("appointmentLocation")
  private String appointmentLocation;
  @Label("From Date")
  private Date appointmentFromDate;
  @Label("To Date")
  private Date appointmentToDate;
  @ManyToOne(fetch=FetchType.EAGER, cascade={javax.persistence.CascadeType.ALL})
  private JobOrderElement jobOrderInstance;
  
  public CustomerAppointment() {}
  
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
  
  public String getAppointmentLocation()
  {
    return this.appointmentLocation;
  }
  
  public void setAppointmentLocation(String appointmentLocation)
  {
    this.appointmentLocation = appointmentLocation;
  }
  
  public Date getAppointmentFromDate()
  {
    return this.appointmentFromDate;
  }
  
  public void setAppointmentFromDate(Date appointmentFromDate)
  {
    this.appointmentFromDate = appointmentFromDate;
  }
  
  public Date getAppointmentToDate()
  {
    return this.appointmentToDate;
  }
  
  public void setAppointmentToDate(Date appointmentToDate)
  {
    this.appointmentToDate = appointmentToDate;
  }
  
  public JobOrderElement getJobOrderInstance()
  {
    return this.jobOrderInstance;
  }
  
  public void setJobOrderInstance(JobOrderElement jobOrderInstance)
  {
    this.jobOrderInstance = jobOrderInstance;
  }
  
  public CustomerAppointment(Long id, Customer customer, String appointmentLocation, Date appointmentFromDate, Date appointmentToDate, JobOrderElement jobOrderInstance)
  {
    this.id = id;
    this.customer = customer;
    this.appointmentLocation = appointmentLocation;
    this.appointmentFromDate = appointmentFromDate;
    this.appointmentToDate = appointmentToDate;
    this.jobOrderInstance = jobOrderInstance;
  }
}
