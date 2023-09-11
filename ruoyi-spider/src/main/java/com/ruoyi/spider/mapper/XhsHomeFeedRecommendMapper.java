package com.ruoyi.spider.mapper;

import java.util.List;
import com.ruoyi.spider.domain.XhsHomeFeedRecommend;

/**
 * xhsMapper接口
 * 
 * @author csx
 * @date 2023-09-11
 */
public interface XhsHomeFeedRecommendMapper 
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
     * 删除xhs
     * 
     * @param id xhs主键
     * @return 结果
     */
    public int deleteXhsHomeFeedRecommendById(Long id);

    /**
     * 批量删除xhs
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXhsHomeFeedRecommendByIds(Long[] ids);
}
