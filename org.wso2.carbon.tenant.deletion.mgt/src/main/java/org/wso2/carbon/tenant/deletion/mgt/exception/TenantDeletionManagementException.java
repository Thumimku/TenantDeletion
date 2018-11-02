package org.wso2.carbon.tenant.deletion.mgt.exception;

/**
 * Exception class for TenantDeletionManager
 */
public class TenantDeletionManagementException extends Exception {

    private String errorCode;

    public TenantDeletionManagementException()

    {

        super();
    }

    public TenantDeletionManagementException(String message, String errorCode) {

        super(message);
        this.errorCode = errorCode;
    }

    public TenantDeletionManagementException(String message, String errorCode, Throwable cause) {

        super(message, cause);
        this.errorCode = errorCode;
    }

    public TenantDeletionManagementException(Throwable cause) {

        super(cause);
    }

    public String getErrorCode() {

        return errorCode;
    }

    public String getMessage() {
        return super.getMessage();
    }

    protected void setErrorCode(String errorCode) {

        this.errorCode = errorCode;
    }

}
