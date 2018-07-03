package com.hr.common.constant;

/**
 * @author:HuRan
 * @Description:
 * @Date: Created in 10:19 2018/7/3
 * @Modified By:
 */
public class ScheduleConstants {
    /**
     * 任务调度参数key
     */
    public static final String JOB_PARAM_KEY = "JOB_PARAM_KEY";

    public enum Status
    {
        /**
         * 正常
         */
        NORMAL("0"),
        /**
         * 暂停
         */
        PAUSE("1");

        private String value;

        private Status(String value)
        {
            this.value = value;
        }

        public String getValue()
        {
            return value;
        }
    }
}
