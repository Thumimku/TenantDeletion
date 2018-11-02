package org.wso2.carbon.tenant.deletion.mgt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.tenant.deletion.mgt.exception.TenantDeletionManagementException;
import org.wso2.carbon.tenant.deletion.mgt.model.TenantData;

/**
 * Tenant deletion manager service implementation.
 */
public class TenantDeletionManagerImplementation implements TenantDeletionManager {
    private static Log log = LogFactory.getLog(TenantDeletionManagerImplementation.class);

    @Override
    public TenantData DeleteTenant(String tenantDomain) throws TenantDeletionManagementException {
        log.info("Tenant deletion manager service implementation method initiated");
        TenantData tenantData = new TenantData(tenantDomain);
        return tenantData;
    }
}
