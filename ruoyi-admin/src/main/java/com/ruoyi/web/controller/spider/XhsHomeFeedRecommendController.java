package com.ruoyi.web.controller.spider;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.spider.domain.XhsHomeFeedRecommend;
import com.ruoyi.spider.service.IXhsHomeFeedRecommendService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * xhsController
 * 
 * @author csx
 * @date 2023-09-11
 */
@RestController
@RequestMapping("/spider/recommend")
public class XhsHomeFeedRecommendController extends BaseController
{
    @Autowired
    private IXhsHomeFeedRecommendService xhsHomeFeedRecommendService;

    /**
     * 查询xhs列表
     */
    @PreAuthorize("@ss.hasPermi('spider:recommend:list')")
    @GetMapping("/list")
    public TableDataInfo list(XhsHomeFeedRecommend xhsHomeFeedRecommend)
    {
        startPage();
        List<XhsHomeFeedRecommend> list = xhsHomeFeedRecommendService.selectXhsHomeFeedRecommendList(xhsHomeFeedRecommend);
        return getDataTable(list);
    }

    /**
     * 导出xhs列表
     */
    @PreAuthorize("@ss.hasPermi('spider:recommend:export')")
    @Log(title = "xhs", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XhsHomeFeedRecommend xhsHomeFeedRecommend)
    {
        List<XhsHomeFeedRecommend> list = xhsHomeFeedRecommendService.selectXhsHomeFeedRecommendList(xhsHomeFeedRecommend);
        ExcelUtil<XhsHomeFeedRecommend> util = new ExcelUtil<XhsHomeFeedRecommend>(XhsHomeFeedRecommend.class);
        util.exportExcel(response, list, "xhs数据");
    }

    /**
     * 获取xhs详细信息
     */
    @PreAuthorize("@ss.hasPermi('spider:recommend:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(xhsHomeFeedRecommendService.selectXhsHomeFeedRecommendById(id));
    }

    /**
     * 新增xhs
     */
    @PreAuthorize("@ss.hasPermi('spider:recommend:add')")
    @Log(title = "xhs", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XhsHomeFeedRecommend xhsHomeFeedRecommend)
    {
        return toAjax(xhsHomeFeedRecommendService.insertXhsHomeFeedRecommend(xhsHomeFeedRecommend));
    }

    /**
     * 修改xhs
     */
    @PreAuthorize("@ss.hasPermi('spider:recommend:edit')")
    @Log(title = "xhs", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XhsHomeFeedRecommend xhsHomeFeedRecommend)
    {
        return toAjax(xhsHomeFeedRecommendService.updateXhsHomeFeedRecommend(xhsHomeFeedRecommend));
    }

    /**
     * 删除xhs
     */
    @PreAuthorize("@ss.hasPermi('spider:recommend:remove')")
    @Log(title = "xhs", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xhsHomeFeedRecommendService.deleteXhsHomeFeedRecommendByIds(ids));
    }
}
