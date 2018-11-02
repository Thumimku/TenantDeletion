package org.wso2.carbon.tenant.deletion.mgt.endpoint;

import org.wso2.carbon.tenant.deletion.mgt.endpoint.*;
import org.wso2.carbon.tenant.deletion.mgt.endpoint.dto.*;

import org.wso2.carbon.tenant.deletion.mgt.endpoint.dto.ErrorDTO;
import org.wso2.carbon.tenant.deletion.mgt.endpoint.dto.DeleteTenantResponseDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import javax.ws.rs.core.Response;

public abstract class DeleteApiService {
    public abstract Response deleteTenant();
}

