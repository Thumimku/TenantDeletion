package org.wso2.carbon.tenant.deletion.mgt.endpoint.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.context.PrivilegedCarbonContext;
import org.wso2.carbon.tenant.deletion.mgt.endpoint.*;
import org.wso2.carbon.tenant.deletion.mgt.endpoint.dto.*;


import org.wso2.carbon.tenant.deletion.mgt.endpoint.dto.ErrorDTO;
import org.wso2.carbon.tenant.deletion.mgt.endpoint.dto.DeleteTenantResponseDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.wso2.carbon.tenant.deletion.mgt.endpoint.util.TenantDeletionEndpointUtil;
import org.wso2.carbon.tenant.deletion.mgt.exception.TenantDeletionManagementException;
import org.wso2.carbon.tenant.deletion.mgt.model.TenantData;

import javax.ws.rs.core.Response;

public class DeleteApiServiceImpl extends DeleteApiService {
    private static Log log = LogFactory.getLog(DeleteApiServiceImpl.class);

    @Override
    public Response deleteTenant(){

            // do some magic!

            try {

                TenantData tenantData = TenantDeletionEndpointUtil.getTenantDeletionManager().DeleteTenant(PrivilegedCarbonContext.getThreadLocalCarbonContext().getTenantDomain());
            } catch (TenantDeletionManagementException e) {
                log.error(e.getMessage());
            } catch (Throwable e){
                log.error(e.getMessage());
            }
            return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
        }

}
