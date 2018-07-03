package com.hr.project.system.dict.domain;

import com.hr.framework.aspectj.lang.annotation.Excel;
import com.hr.framework.web.domain.BaseEntity;

/**
 * 字典类型对象 sys_dict_type
 * 
 * @author ruoyi
 */
public class DictType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 字典主键 */
    @Excel(name = "字典主键", column = "A")
    private Long dictId;

    /** 字典名称 */
    @Excel(name = "字典名称", column = "B")
    private String dictName;

    /** 字典类型 */
    @Excel(name = "字典类型 ", column = "C")
    private String dictType;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", column = "D")
    private String status;

    public Long getDictId()
    {
        return dictId;
    }

    public void setDictId(Long dictId)
    {
        this.dictId = dictId;
    }

    public String getDictName()
    {
        return dictName;
    }

    public void setDictName(String dictName)
    {
        this.dictName = dictName;
    }

    public String getDictType()
    {
        return dictType;
    }

    public void setDictType(String dictType)
    {
        this.dictType = dictType;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "DictType [dictId=" + dictId + ", dictName=" + dictName + ", dictType=" + dictType + ", status=" + status
                + "]";
    }

}