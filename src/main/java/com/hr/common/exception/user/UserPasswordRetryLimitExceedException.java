package com.hr.common.exception.user;

/**
 * @author:HuRan
 * @Description: 用户错误最大次数异常类
 * @Date: Created in 10:34 2018/7/3
 * @Modified By:
 */
public class UserPasswordRetryLimitExceedException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserPasswordRetryLimitExceedException(int retryLimitCount)
    {
        super("user.password.retry.limit.exceed", new Object[] { retryLimitCount });
    }
}
