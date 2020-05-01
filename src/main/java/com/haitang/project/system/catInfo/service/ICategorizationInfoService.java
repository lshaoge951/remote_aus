package com.haitang.project.system.catInfo.service;

import com.haitang.project.system.catInfo.domain.CategorizationInfo;
import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author haitang
 * @date 2020-03-19
 */
public interface ICategorizationInfoService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public CategorizationInfo selectCategorizationInfoById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param categorizationInfo 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<CategorizationInfo> selectCategorizationInfoList(CategorizationInfo categorizationInfo);

    /**
     * 新增【请填写功能名称】
     * 
     * @param categorizationInfo 【请填写功能名称】
     * @return 结果
     */
    public int insertCategorizationInfo(CategorizationInfo categorizationInfo);

    /**
     * 修改【请填写功能名称】
     * 
     * @param categorizationInfo 【请填写功能名称】
     * @return 结果
     */
    public int updateCategorizationInfo(CategorizationInfo categorizationInfo);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCategorizationInfoByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteCategorizationInfoById(Long id);
}
