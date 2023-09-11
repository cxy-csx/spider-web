package com.ruoyi.spider.service;

import java.util.List;
import com.ruoyi.spider.domain.XhsHomeFeedRecommend;

/**
 * xhsService接口
 * 
 * @author csx
 * @date 2023-09-11
 */
public interface IXhsHomeFeedRecommendService 
{
    /**
     * 查询xhs
     * 
     * @param id xhs主键
     * @return xhs
     */
    public XhsHomeFeedRecommend selectXhsHomeFeedRecommendById(Long id);

    /**
     * 查询xhs列表
     * 
     * @param xhsHomeFeedRecommend xhs
     * @return xhs集合
     */
    public List<XhsHomeFeedRecommend> selectXhsHomeFeedRecommendList(XhsHomeFeedRecommend xhsHomeFeedRecommend);

    /**
     * 新增xhs
     * 
     * @param xhsHomeFeedRecommend xhs
     * @return 结果
     */
    public int insertXhsHomeFeedRecommend(XhsHomeFeedRecommend xhsHomeFeedRecommend);

    /**
     * 修改xhs
     * 
     * @param xhsHomeFeedRecommend xhs
     * @return 结果
     */
    public int updateXhsHomeFeedRecommend(XhsHomeFeedRecommend xhsHomeFeedRecommend);

    /**
     * 批量删除xhs
     * 
     * @param ids 需要删除的xhs主键集合
     * @return 结果
     */
    public int deleteXhsHomeFeedRecommendByIds(Long[] ids);

    /**
     * 删除xhs信息
     * 
     * @param id xhs主键
     * @return 结果
     */
    public int deleteXhsHomeFeedRecommendById(Long id);
}
