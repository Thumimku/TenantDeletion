package org.wso2.carbon.tenant.deletion.mgt;

import org.wso2.carbon.tenant.deletion.mgt.exception.TenantDeletionManagementException;
import org.wso2.carbon.tenant.deletion.mgt.model.TenantData;

/**
 * TenantDeletionManager Service Interface
 */
public interface TenantDeletionManager {

    /**
     * API method is used to tenant deletion
     * @param tenantDomain TenantDomain which has to be deleted
     * @return TenantData
     * @throws TenantDeletionManagementException Tenant Deletion Management Exception
     */
    TenantData DeleteTenant(String tenantDomain) throws TenantDeletionManagementException;

}
