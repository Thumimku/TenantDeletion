package org.wso2.carbon.tenant.deletion.mgt.endpoint;

import org.wso2.carbon.tenant.deletion.mgt.endpoint.dto.*;
import org.wso2.carbon.tenant.deletion.mgt.endpoint.DeleteApiService;
import org.wso2.carbon.tenant.deletion.mgt.endpoint.factories.DeleteApiServiceFactory;

import io.swagger.annotations.ApiParam;

import org.wso2.carbon.tenant.deletion.mgt.endpoint.dto.ErrorDTO;
import org.wso2.carbon.tenant.deletion.mgt.endpoint.dto.DeleteTenantResponseDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/delete")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(value = "/delete", description = "the delete API")
public class DeleteApi  {

   private final DeleteApiService delegate = DeleteApiServiceFactory.getDeleteApi();

    @DELETE
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a tenant", notes = "This API is used to delete a tenant.\n", response = DeleteTenantResponseDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 202, message = "Tenant deleted"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Not Found"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response deleteTenant()
    {
    return delegate.deleteTenant();
    }
}

