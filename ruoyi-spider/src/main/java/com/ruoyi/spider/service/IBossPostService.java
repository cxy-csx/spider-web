package com.ruoyi.spider.service;

import com.ruoyi.spider.domain.BossPost;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2023-09-12
 */
public interface IBossPostService
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public BossPost selectTBossPostById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tBossPost 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BossPost> selectTBossPostList(BossPost tBossPost);

    /**
     * 新增【请填写功能名称】
     * 
     * @param tBossPost 【请填写功能名称】
     * @return 结果
     */
    public int insertTBossPost(BossPost tBossPost);

    /**
     * 修改【请填写功能名称】
     * 
     * @param tBossPost 【请填写功能名称】
     * @return 结果
     */
    public int updateTBossPost(BossPost tBossPost);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteTBossPostByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteTBossPostById(Long id);
}
