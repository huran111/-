package com.hr.project.monitor.logininfor.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hr.common.utils.poi.ExcelUtil;
import com.hr.framework.aspectj.lang.annotation.Log;
import com.hr.framework.aspectj.lang.constant.BusinessType;
import com.hr.framework.web.controller.BaseController;
import com.hr.framework.web.domain.AjaxResult;
import com.hr.framework.web.page.TableDataInfo;
import com.hr.project.monitor.logininfor.domain.Logininfor;
import com.hr.project.monitor.logininfor.service.ILogininforService;

/**
 * 系统访问记录
 * 
 * @author hr
 */
@Controller
@RequestMapping("/monitor/logininfor")
public class LogininforController extends BaseController
{
    private String prefix = "monitor/logininfor";

    @Autowired
    private ILogininforService logininforService;

    @RequiresPermissions("monitor:logininfor:view")
    @GetMapping()
    public String logininfor()
    {
        return prefix + "/logininfor";
    }

    @RequiresPermissions("monitor:logininfor:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Logininfor logininfor)
    {
        startPage();
        List<Logininfor> list = logininforService.selectLogininforList(logininfor);
        return getDataTable(list);
    }

    @Log(title = "登陆日志", action = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Logininfor logininfor) throws Exception
    {
        try
        {
            List<Logininfor> list = logininforService.selectLogininforList(logininfor);
            ExcelUtil<Logininfor> util = new ExcelUtil<Logininfor>(Logininfor.class);
            return util.exportExcel(list, "logininfor");
        }
        catch (Exception e)
        {
            return error("导出Excel失败，请联系网站管理员！");
        }
    }

    @RequiresPermissions("monitor:logininfor:remove")
    @Log(title = "登陆日志", action = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        int rows = logininforService.deleteLogininforByIds(ids);
        if (rows > 0)
        {
            return success();
        }
        return error();
    }
}
