package com.its.sep.processes.installationprocess.entities;


import java.io.Serializable;
import javax.persistence.Entity;
import org.kie.api.remote.Remotable;

@Entity
@Remotable
public class Device
  extends Assets
  implements Serializable
{
  static final long serialVersionUID = 1L;
}
