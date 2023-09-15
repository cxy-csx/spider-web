package com.ruoyi.spider.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 t_gzh
 * 
 * @author ruoyi
 * @date 2023-09-15
 */
public class Gzh extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增主键 */
    private Long id;

    /** 文章标题 */
    @Excel(name = "文章标题")
    private String title;

    /** 发布时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发布时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date publicTime;

    /** 文章链接 */
    @Excel(name = "文章链接")
    private String link;

    /** 阅读数 */
    @Excel(name = "阅读数")
    private String readCount;

    /** 点赞数 */
    @Excel(name = "点赞数")
    private String likeCount;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setPublicTime(Date publicTime) 
    {
        this.publicTime = publicTime;
    }

    public Date getPublicTime() 
    {
        return publicTime;
    }
    public void setLink(String link) 
    {
        this.link = link;
    }

    public String getLink() 
    {
        return link;
    }
    public void setReadCount(String readCount) 
    {
        this.readCount = readCount;
    }

    public String getReadCount() 
    {
        return readCount;
    }
    public void setLikeCount(String likeCount) 
    {
        this.likeCount = likeCount;
    }

    public String getLikeCount() 
    {
        return likeCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("title", getTitle())
            .append("publicTime", getPublicTime())
            .append("link", getLink())
            .append("readCount", getReadCount())
            .append("likeCount", getLikeCount())
            .toString();
    }
}
