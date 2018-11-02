package org.wso2.carbon.tenant.deletion.mgt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.context.PrivilegedCarbonContext;
import org.wso2.carbon.tenant.deletion.mgt.dao.TenantDeletionManagerDAO;
import org.wso2.carbon.tenant.deletion.mgt.dao.impl.TenantDeletionManagerDAOImplementation;
import org.wso2.carbon.tenant.deletion.mgt.exception.TenantDeletionManagementException;
import org.wso2.carbon.tenant.deletion.mgt.model.TenantData;

/**
 * Tenant deletion manager service implementation.
 */
public class TenantDeletionManagerImplementation implements TenantDeletionManager {

    private static Log log = LogFactory.getLog(TenantDeletionManagerImplementation.class);

    @Override
    public TenantData DeleteTenant(int tenantid) throws TenantDeletionManagementException {

        log.info("Tenant deletion manager service implementation method initiated");
        TenantDeletionManagerDAO tenantDeletionManagerDAO = new TenantDeletionManagerDAOImplementation();
        String tenantId = tenantDeletionManagerDAO.deleteTenant(tenantid);
        TenantData tenantData = new TenantData(tenantId,"Tenant Domain");
        return tenantData;
    }

    /**
     * Get the tenant id from carbon context.
     *
     * @return Tenant id.
     */
    public static int getTenantIdFromCarbonContext() {

        return PrivilegedCarbonContext.getThreadLocalCarbonContext().getTenantId();
    }
}
