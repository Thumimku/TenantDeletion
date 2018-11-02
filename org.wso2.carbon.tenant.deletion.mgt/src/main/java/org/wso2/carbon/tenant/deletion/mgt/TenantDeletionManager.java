package org.wso2.carbon.tenant.deletion.mgt;

import org.wso2.carbon.tenant.deletion.mgt.exception.TenantDeletionManagementException;
import org.wso2.carbon.tenant.deletion.mgt.model.TenantData;

/**
 * TenantDeletionManager Service Interface
 */
public interface TenantDeletionManager {

    /**
     * API method is used to tenant deletion
     * @param tenantID Tenant ID which has to be deleted
     * @return TenantData
     * @throws TenantDeletionManagementException Tenant Deletion Management Exception
     */
    TenantData DeleteTenant(int tenantID) throws TenantDeletionManagementException;

}
