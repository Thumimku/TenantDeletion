package org.wso2.carbon.tenant.deletion.mgt.constant;

public class TenantDeletionConstants {


    public static final String MY_SQL = "MySQL";
    public static final String POSTGRE_SQL = "PostgreSQL";
    public static final String DB2 = "DB2";
    public static final String H2 = "H2";
    public static final String MICROSOFT = "Microsoft";
    public static final String S_MICROSOFT = "microsoft";
    public static final String INFORMIX = "Informix";

    public enum ErrorMessages{

        ERROR_CODE_DELETE_TEMPLATE_FROM_UM_TENANT("TD_00001", "Error occurred while deleting tenant from UM_TENANT for tenant ID: %s.");


        private final String code;
        private final String message;
        ErrorMessages(String code, String message) {
            this.code = code;
            this.message = message;
        }
        public String getCode() {

            return code;
        }

        public String getMessage() {

            return message;
        }

        @Override
        public String toString() {

            return code + " : " + message;
        }
    }

}
