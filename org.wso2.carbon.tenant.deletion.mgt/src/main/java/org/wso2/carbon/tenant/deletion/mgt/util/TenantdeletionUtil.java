package org.wso2.carbon.tenant.deletion.mgt.util;

import org.wso2.carbon.context.PrivilegedCarbonContext;

public class TenantdeletionUtil {
    /**
     * Get the tenant id from carbon context.
     *
     * @return Tenant id.
     */
    public static int getTenantIdFromCarbonContext() {
        return PrivilegedCarbonContext.getThreadLocalCarbonContext().getTenantId();
    }

}
