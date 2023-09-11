package com.ruoyi.spider.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * xhs对象 t_xhs_homefeed_recommend
 * 
 * @author csx
 * @date 2023-09-11
 */
public class XhsHomeFeedRecommend extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增主键 */
    private Long id;

    /** 笔记id */
    @Excel(name = "笔记id")
    private String noteId;

    /** 笔记封面 */
    @Excel(name = "笔记封面")
    private String noteCover;

    /** 笔记标题 */
    @Excel(name = "笔记标题")
    private String noteTitle;

    /** 发布用户 */
    @Excel(name = "发布用户")
    private String noteUserId;

    /** 发布用户昵称 */
    @Excel(name = "发布用户昵称")
    private String noteUserNickname;

    /** 发布用户头像 */
    @Excel(name = "发布用户头像")
    private String noteUserAvatar;

    /** 笔记喜欢数 */
    @Excel(name = "笔记喜欢数")
    private String noteLikeCount;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setNoteId(String noteId) 
    {
        this.noteId = noteId;
    }

    public String getNoteId() 
    {
        return noteId;
    }
    public void setNoteCover(String noteCover) 
    {
        this.noteCover = noteCover;
    }

    public String getNoteCover() 
    {
        return noteCover;
    }
    public void setNoteTitle(String noteTitle) 
    {
        this.noteTitle = noteTitle;
    }

    public String getNoteTitle() 
    {
        return noteTitle;
    }
    public void setNoteUserId(String noteUserId) 
    {
        this.noteUserId = noteUserId;
    }

    public String getNoteUserId() 
    {
        return noteUserId;
    }
    public void setNoteUserNickname(String noteUserNickname) 
    {
        this.noteUserNickname = noteUserNickname;
    }

    public String getNoteUserNickname() 
    {
        return noteUserNickname;
    }
    public void setNoteUserAvatar(String noteUserAvatar) 
    {
        this.noteUserAvatar = noteUserAvatar;
    }

    public String getNoteUserAvatar() 
    {
        return noteUserAvatar;
    }
    public void setNoteLikeCount(String noteLikeCount) 
    {
        this.noteLikeCount = noteLikeCount;
    }

    public String getNoteLikeCount() 
    {
        return noteLikeCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("noteId", getNoteId())
            .append("noteCover", getNoteCover())
            .append("noteTitle", getNoteTitle())
            .append("noteUserId", getNoteUserId())
            .append("noteUserNickname", getNoteUserNickname())
            .append("noteUserAvatar", getNoteUserAvatar())
            .append("noteLikeCount", getNoteLikeCount())
            .toString();
    }
}
