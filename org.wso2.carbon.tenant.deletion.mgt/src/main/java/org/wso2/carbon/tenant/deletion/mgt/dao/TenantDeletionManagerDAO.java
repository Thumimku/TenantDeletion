package org.wso2.carbon.tenant.deletion.mgt.dao;

import org.wso2.carbon.tenant.deletion.mgt.exception.TenantDeletionManagementException;

public interface TenantDeletionManagerDAO {

    String deleteTenant(int TenantId) throws TenantDeletionManagementException;

}
