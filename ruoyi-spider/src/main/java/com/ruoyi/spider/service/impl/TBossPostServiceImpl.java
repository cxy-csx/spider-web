package com.ruoyi.spider.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.spider.service.IBossPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.spider.mapper.BossPostMapper;
import com.ruoyi.spider.domain.BossPost;
import com.ruoyi.spider.service.IBossPostService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-09-12
 */
@Service
public class TBossPostServiceImpl implements IBossPostService
{
    @Autowired
    private BossPostMapper bossPostMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public BossPost selectTBossPostById(Long id)
    {
        return bossPostMapper.selectTBossPostById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tBossPost 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BossPost> selectTBossPostList(BossPost tBossPost)
    {
        return bossPostMapper.selectTBossPostList(tBossPost);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param tBossPost 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTBossPost(BossPost tBossPost)
    {
        tBossPost.setCreateTime(DateUtils.getNowDate());
        return bossPostMapper.insertTBossPost(tBossPost);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param tBossPost 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTBossPost(BossPost tBossPost)
    {
        return bossPostMapper.updateTBossPost(tBossPost);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTBossPostByIds(Long[] ids)
    {
        return bossPostMapper.deleteTBossPostByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTBossPostById(Long id)
    {
        return bossPostMapper.deleteTBossPostById(id);
    }
}
