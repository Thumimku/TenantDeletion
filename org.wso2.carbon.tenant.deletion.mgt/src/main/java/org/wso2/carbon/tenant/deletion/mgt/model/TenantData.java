package org.wso2.carbon.tenant.deletion.mgt.model;

public class TenantData {

    private String TenantDomain;

    private String TenantId;

    public TenantData(String tenantId, String tenantDomain) {

        TenantId = tenantId;
        TenantDomain = tenantDomain;
    }

    public String getTenantDomain() {

        return TenantDomain;
    }

    public void setTenantDomain(String tenantDomain) {

        TenantDomain = tenantDomain;
    }

    public String getTenantId() {

        return TenantId;
    }

    public void setTenantId(String tenantId) {

        TenantId = tenantId;
    }
}
