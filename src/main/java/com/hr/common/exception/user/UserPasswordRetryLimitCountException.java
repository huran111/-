package com.hr.common.exception.user;

/**
 * @author:HuRan
 * @Description: 用户错误记数异常类
 * @Date: Created in 10:34 2018/7/3
 * @Modified By:
 */
public class UserPasswordRetryLimitCountException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserPasswordRetryLimitCountException(int retryLimitCount, String password)
    {
        super("user.password.retry.limit.count", new Object[] { retryLimitCount, password });
    }
}
