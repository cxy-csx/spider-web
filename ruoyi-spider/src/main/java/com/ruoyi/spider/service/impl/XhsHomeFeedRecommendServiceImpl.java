package com.ruoyi.spider.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.spider.mapper.XhsHomeFeedRecommendMapper;
import com.ruoyi.spider.domain.XhsHomeFeedRecommend;
import com.ruoyi.spider.service.IXhsHomeFeedRecommendService;

/**
 * xhsService业务层处理
 * 
 * @author csx
 * @date 2023-09-11
 */
@Service
public class XhsHomeFeedRecommendServiceImpl implements IXhsHomeFeedRecommendService 
{
    @Autowired
    private XhsHomeFeedRecommendMapper xhsHomeFeedRecommendMapper;

    /**
     * 查询xhs
     * 
     * @param id xhs主键
     * @return xhs
     */
    @Override
    public XhsHomeFeedRecommend selectXhsHomeFeedRecommendById(Long id)
    {
        return xhsHomeFeedRecommendMapper.selectXhsHomeFeedRecommendById(id);
    }

    /**
     * 查询xhs列表
     * 
     * @param xhsHomeFeedRecommend xhs
     * @return xhs
     */
    @Override
    public List<XhsHomeFeedRecommend> selectXhsHomeFeedRecommendList(XhsHomeFeedRecommend xhsHomeFeedRecommend)
    {
        return xhsHomeFeedRecommendMapper.selectXhsHomeFeedRecommendList(xhsHomeFeedRecommend);
    }

    /**
     * 新增xhs
     * 
     * @param xhsHomeFeedRecommend xhs
     * @return 结果
     */
    @Override
    public int insertXhsHomeFeedRecommend(XhsHomeFeedRecommend xhsHomeFeedRecommend)
    {
        return xhsHomeFeedRecommendMapper.insertXhsHomeFeedRecommend(xhsHomeFeedRecommend);
    }

    /**
     * 修改xhs
     * 
     * @param xhsHomeFeedRecommend xhs
     * @return 结果
     */
    @Override
    public int updateXhsHomeFeedRecommend(XhsHomeFeedRecommend xhsHomeFeedRecommend)
    {
        return xhsHomeFeedRecommendMapper.updateXhsHomeFeedRecommend(xhsHomeFeedRecommend);
    }

    /**
     * 批量删除xhs
     * 
     * @param ids 需要删除的xhs主键
     * @return 结果
     */
    @Override
    public int deleteXhsHomeFeedRecommendByIds(Long[] ids)
    {
        return xhsHomeFeedRecommendMapper.deleteXhsHomeFeedRecommendByIds(ids);
    }

    /**
     * 删除xhs信息
     * 
     * @param id xhs主键
     * @return 结果
     */
    @Override
    public int deleteXhsHomeFeedRecommendById(Long id)
    {
        return xhsHomeFeedRecommendMapper.deleteXhsHomeFeedRecommendById(id);
    }
}
