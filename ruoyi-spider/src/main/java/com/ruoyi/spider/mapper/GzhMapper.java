package com.ruoyi.spider.mapper;

import java.util.List;
import com.ruoyi.spider.domain.Gzh;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2023-09-15
 */
public interface GzhMapper
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Gzh selectTGzhById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param tGzh 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Gzh> selectTGzhList(Gzh tGzh);

    /**
     * 新增【请填写功能名称】
     * 
     * @param tGzh 【请填写功能名称】
     * @return 结果
     */
    public int insertTGzh(Gzh tGzh);

    /**
     * 修改【请填写功能名称】
     * 
     * @param tGzh 【请填写功能名称】
     * @return 结果
     */
    public int updateTGzh(Gzh tGzh);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteTGzhById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTGzhByIds(Long[] ids);
}
