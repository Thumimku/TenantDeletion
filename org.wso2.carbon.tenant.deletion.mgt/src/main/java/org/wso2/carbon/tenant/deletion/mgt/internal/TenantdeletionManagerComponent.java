package org.wso2.carbon.tenant.deletion.mgt.internal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.wso2.carbon.identity.core.util.IdentityCoreInitializedEvent;
import org.wso2.carbon.identity.core.util.IdentityDatabaseUtil;
import org.wso2.carbon.tenant.deletion.mgt.TenantDeletionManager;
import org.wso2.carbon.tenant.deletion.mgt.TenantDeletionManagerImplementation;
import org.wso2.carbon.user.core.util.DatabaseUtil;

import javax.sql.DataSource;

@Component(
        name = "carbon.tenant.deletion.mgt.component",
        immediate = true
)
public class TenantdeletionManagerComponent {

    private static Log log = LogFactory.getLog(TenantdeletionManagerComponent.class);
    /**
     * Register Template Manager as an OSGi service.
     *
     * @param componentContext OSGi service component context.
     */
    @Activate
    protected void activate(ComponentContext componentContext) {
        try {
            BundleContext bundleContext = componentContext.getBundleContext();
            DataSource dataSource = IdentityDatabaseUtil.getDataSource();
            DatabaseUtil.getDBConnection(dataSource);
            setDataSourceToDataHolder(dataSource);

            bundleContext.registerService(TenantDeletionManager.class, new TenantDeletionManagerImplementation(),null);
            log.info("Tenant deletion bundle is activated");

            if (log.isDebugEnabled()) {
                log.debug("Tenant deletion bundle is activated");
            }
        } catch (Throwable e) {
            log.error("Error", e);
        }
    }

    private void setDataSourceToDataHolder(DataSource dataSource) {

        TenantDeletionManagerComponentDataHolder.getInstance().setDataSource(dataSource);
        if (log.isDebugEnabled()) {
            log.debug("Data Source is set to the Template Management Service.");
        }
    }


    @Reference(
            name = "identityCoreInitializedEventService",
            service = IdentityCoreInitializedEvent.class,
            cardinality = ReferenceCardinality.MANDATORY,
            policy = ReferencePolicy.DYNAMIC,
            unbind = "unsetIdentityCoreInitializedEventService"
    )
    protected void setIdentityCoreInitializedEventService(IdentityCoreInitializedEvent identityCoreInitializedEvent) {
        /* reference IdentityCoreInitializedEvent service to guarantee that this component will wait until identity core
         is started */
    }

    protected void unsetIdentityCoreInitializedEventService(IdentityCoreInitializedEvent identityCoreInitializedEvent) {
        /* reference IdentityCoreInitializedEvent service to guarantee that this component will wait until identity core
         is started */
    }

}
