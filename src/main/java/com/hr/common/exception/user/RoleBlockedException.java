package com.hr.common.exception.user;

/**
 * @author:HuRan
 * @Description:角色锁定类异常
 * @Date: Created in 10:29 2018/7/3
 * @Modified By:
 */
public class RoleBlockedException extends UserException {
    private static final long serialVersionUID = 1L;

    public RoleBlockedException(String reason) {
        super("role.blocked", new Object[]{reason});
    }
}
