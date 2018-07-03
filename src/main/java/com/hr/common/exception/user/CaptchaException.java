package com.hr.common.exception.user;

/**
 * @Author:HuRan
 * @Description:
 * @Date: Created in 10:28 2018/7/3
 * @Modified By:
 */
public class CaptchaException extends UserException {
    private static final long serialVersionUID = 1L;

    public CaptchaException()
    {
        super("user.jcaptcha.error", null);
    }
}
