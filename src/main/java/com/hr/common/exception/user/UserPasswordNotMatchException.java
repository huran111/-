package com.hr.common.exception.user;

/**
 * @author:HuRan
 * @Description:用户密码不正确或不符合规范异常类
 * @Date: Created in 10:33 2018/7/3
 * @Modified By:
 */
public class UserPasswordNotMatchException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserPasswordNotMatchException()
    {
        super("user.password.not.match", null);
    }
}
