package com.hr.common.exception.user;

/**
 * @author:HuRan
 * @Description: 用户锁定异常类
 * @Date: Created in 10:29 2018/7/3
 * @Modified By:
 */
public class UserBlockedException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserBlockedException(String reason)
    {
        super("user.blocked", new Object[] { reason });
    }
}
