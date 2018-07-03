package com.hr.common.exception.user;

import com.hr.common.exception.base.BaseException;

/**
 * @Author:HuRan
 * @Description:
 * @Date: Created in 10:27 2018/7/3
 * @Modified By:
 */
public class UserException extends BaseException {
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
