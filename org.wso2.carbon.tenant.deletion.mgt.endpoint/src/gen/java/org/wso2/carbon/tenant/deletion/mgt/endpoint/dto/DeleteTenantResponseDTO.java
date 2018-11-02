package org.wso2.carbon.tenant.deletion.mgt.endpoint.dto;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;





@ApiModel(description = "")
public class DeleteTenantResponseDTO  {
  
  
  
  private String tenantName = null;
  
  
  private String deletedBy = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("tenantName")
  public String getTenantName() {
    return tenantName;
  }
  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("deletedBy")
  public String getDeletedBy() {
    return deletedBy;
  }
  public void setDeletedBy(String deletedBy) {
    this.deletedBy = deletedBy;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteTenantResponseDTO {\n");
    
    sb.append("  tenantName: ").append(tenantName).append("\n");
    sb.append("  deletedBy: ").append(deletedBy).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
