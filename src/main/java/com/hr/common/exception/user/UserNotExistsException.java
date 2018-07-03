package com.hr.common.exception.user;

/**
 * @author:HuRan
 * @Description:用户不存在异常类
 * @Date: Created in 10:32 2018/7/3
 * @Modified By:
 */
public class UserNotExistsException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserNotExistsException()
    {
        super("user.not.exists", null);
    }
}
