package org.wso2.carbon.tenant.deletion.mgt.endpoint.util;

import org.wso2.carbon.context.PrivilegedCarbonContext;
import org.wso2.carbon.tenant.deletion.mgt.TenantDeletionManager;

public class TenantDeletionEndpointUtil {

    public static TenantDeletionManager getTenantDeletionManager() {
        return (TenantDeletionManager) PrivilegedCarbonContext.getThreadLocalCarbonContext().getOSGiService(TenantDeletionManager.class,null);

    }

}
