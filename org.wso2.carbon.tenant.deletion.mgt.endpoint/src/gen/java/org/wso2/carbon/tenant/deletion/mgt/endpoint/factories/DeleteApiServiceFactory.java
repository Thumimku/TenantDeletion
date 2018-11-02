package org.wso2.carbon.tenant.deletion.mgt.endpoint.factories;

import org.wso2.carbon.tenant.deletion.mgt.endpoint.DeleteApiService;
import org.wso2.carbon.tenant.deletion.mgt.endpoint.impl.DeleteApiServiceImpl;

public class DeleteApiServiceFactory {

   private final static DeleteApiService service = new DeleteApiServiceImpl();

   public static DeleteApiService getDeleteApi()
   {
      return service;
   }
}
