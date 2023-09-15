package com.ruoyi.spider.service.impl;

import java.util.List;

import com.ruoyi.spider.domain.Gzh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.spider.mapper.GzhMapper;
import com.ruoyi.spider.service.IGzhService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-09-15
 */
@Service
public class GzhServiceImpl implements IGzhService
{
    @Autowired
    private GzhMapper gzhMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Gzh selectTGzhById(Long id)
    {
        return gzhMapper.selectTGzhById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tGzh 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Gzh> selectTGzhList(Gzh tGzh)
    {
        return gzhMapper.selectTGzhList(tGzh);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param tGzh 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTGzh(Gzh tGzh)
    {
        return gzhMapper.insertTGzh(tGzh);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param tGzh 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTGzh(Gzh tGzh)
    {
        return gzhMapper.updateTGzh(tGzh);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTGzhByIds(Long[] ids)
    {
        return gzhMapper.deleteTGzhByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTGzhById(Long id)
    {
        return gzhMapper.deleteTGzhById(id);
    }
}
