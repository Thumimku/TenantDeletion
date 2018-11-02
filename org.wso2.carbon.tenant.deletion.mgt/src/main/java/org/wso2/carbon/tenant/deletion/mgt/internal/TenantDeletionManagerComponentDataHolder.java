package org.wso2.carbon.tenant.deletion.mgt.internal;

import javax.sql.DataSource;

public class TenantDeletionManagerComponentDataHolder {
    private static TenantDeletionManagerComponentDataHolder instance;

    private DataSource dataSource;

    public static TenantDeletionManagerComponentDataHolder getInstance() {
        if (instance == null){
            instance = new TenantDeletionManagerComponentDataHolder();
        }
        return instance;
    }

    public DataSource getDataSource() {

        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {

        this.dataSource = dataSource;
    }
}
