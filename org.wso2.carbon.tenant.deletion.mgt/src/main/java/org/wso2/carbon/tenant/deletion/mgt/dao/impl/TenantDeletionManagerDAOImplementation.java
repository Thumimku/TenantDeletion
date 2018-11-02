package org.wso2.carbon.tenant.deletion.mgt.dao.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.database.utils.jdbc.JdbcTemplate;

import org.wso2.carbon.database.utils.jdbc.exceptions.DataAccessException;
import org.wso2.carbon.tenant.deletion.mgt.dao.TenantDeletionManagerDAO;
import org.wso2.carbon.tenant.deletion.mgt.exception.TenantDeletionDBException;
import org.wso2.carbon.tenant.deletion.mgt.exception.TenantDeletionManagementException;
import org.wso2.carbon.tenant.deletion.mgt.util.JdbcUtils;

import static org.wso2.carbon.tenant.deletion.mgt.constant.SqlConstants.DeleteUM_TENANT;
import static org.wso2.carbon.tenant.deletion.mgt.constant.TenantDeletionConstants.ErrorMessages.ERROR_CODE_DELETE_TEMPLATE_FROM_UM_TENANT;

public class TenantDeletionManagerDAOImplementation implements TenantDeletionManagerDAO {

    private Log log = LogFactory.getLog(TenantDeletionManagerDAOImplementation.class);

    @Override
    public String deleteTenant(int TenantId) throws TenantDeletionManagementException {

        log.info("DAO delete method initiated");

        JdbcTemplate jdbcTemplate = JdbcUtils.getNewTemplate();
        try {
            jdbcTemplate.executeUpdate(DeleteUM_TENANT, preparedStatement ->{
                preparedStatement.setInt(1,TenantId);
            });
        } catch (DataAccessException e) {
            log.error(e);
            throw new TenantDeletionDBException(String.format(ERROR_CODE_DELETE_TEMPLATE_FROM_UM_TENANT.getMessage(),String.valueOf(TenantId)),
                    ERROR_CODE_DELETE_TEMPLATE_FROM_UM_TENANT.getCode(),e);
        }
        return String.valueOf(TenantId);
    }
}
