package com.ruoyi.spider.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 t_boss_post
 * 
 * @author ruoyi
 * @date 2023-09-12
 */
public class BossPost extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增主键 */
    private Long id;

    /** 岗位名称 */
    @Excel(name = "岗位名称")
    private String name;

    /** 薪资范围 */
    @Excel(name = "薪资范围")
    private String salary;

    /** 工作经验 */
    @Excel(name = "工作经验")
    private String experience;

    /** 专业技能 */
    @Excel(name = "专业技能")
    private String skill;

    /** 学历 */
    @Excel(name = "学历")
    private String degree;

    /** 城市 */
    @Excel(name = "城市")
    private String city;

    /** 地区 */
    @Excel(name = "地区")
    private String area;

    /** 公司 */
    @Excel(name = "公司")
    private String company;

    /** 公司logo */
    @Excel(name = "公司logo")
    private String logo;

    /** 行业 */
    @Excel(name = "行业")
    private String industry;

    /** 公司规模 */
    @Excel(name = "公司规模")
    private String scale;

    /** 岗位标识 */
    @Excel(name = "岗位标识")
    private String jobId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setSalary(String salary) 
    {
        this.salary = salary;
    }

    public String getSalary() 
    {
        return salary;
    }
    public void setExperience(String experience) 
    {
        this.experience = experience;
    }

    public String getExperience() 
    {
        return experience;
    }
    public void setSkill(String skill) 
    {
        this.skill = skill;
    }

    public String getSkill() 
    {
        return skill;
    }
    public void setDegree(String degree) 
    {
        this.degree = degree;
    }

    public String getDegree() 
    {
        return degree;
    }
    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCity() 
    {
        return city;
    }
    public void setArea(String area) 
    {
        this.area = area;
    }

    public String getArea() 
    {
        return area;
    }
    public void setCompany(String company) 
    {
        this.company = company;
    }

    public String getCompany() 
    {
        return company;
    }
    public void setLogo(String logo) 
    {
        this.logo = logo;
    }

    public String getLogo() 
    {
        return logo;
    }
    public void setIndustry(String industry) 
    {
        this.industry = industry;
    }

    public String getIndustry() 
    {
        return industry;
    }
    public void setScale(String scale) 
    {
        this.scale = scale;
    }

    public String getScale() 
    {
        return scale;
    }
    public void setJobId(String jobId) 
    {
        this.jobId = jobId;
    }

    public String getJobId() 
    {
        return jobId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("salary", getSalary())
            .append("experience", getExperience())
            .append("skill", getSkill())
            .append("degree", getDegree())
            .append("city", getCity())
            .append("area", getArea())
            .append("company", getCompany())
            .append("logo", getLogo())
            .append("industry", getIndustry())
            .append("scale", getScale())
            .append("jobId", getJobId())
            .append("createTime", getCreateTime())
            .toString();
    }
}
