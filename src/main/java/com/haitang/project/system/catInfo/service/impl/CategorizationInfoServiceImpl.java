package com.haitang.project.system.catInfo.service.impl;

import java.util.List;
import com.haitang.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.haitang.project.system.catInfo.mapper.CategorizationInfoMapper;
import com.haitang.project.system.catInfo.domain.CategorizationInfo;
import com.haitang.project.system.catInfo.service.ICategorizationInfoService;
import com.haitang.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author haitang
 * @date 2020-03-19
 */
@Service
public class CategorizationInfoServiceImpl implements ICategorizationInfoService 
{
    @Autowired
    private CategorizationInfoMapper categorizationInfoMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public CategorizationInfo selectCategorizationInfoById(Long id)
    {
        return categorizationInfoMapper.selectCategorizationInfoById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param categorizationInfo 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<CategorizationInfo> selectCategorizationInfoList(CategorizationInfo categorizationInfo)
    {
        return categorizationInfoMapper.selectCategorizationInfoList(categorizationInfo);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param categorizationInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertCategorizationInfo(CategorizationInfo categorizationInfo)
    {
        categorizationInfo.setCreateTime(DateUtils.getNowDate());
        return categorizationInfoMapper.insertCategorizationInfo(categorizationInfo);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param categorizationInfo 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateCategorizationInfo(CategorizationInfo categorizationInfo)
    {
        categorizationInfo.setUpdateTime(DateUtils.getNowDate());
        return categorizationInfoMapper.updateCategorizationInfo(categorizationInfo);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCategorizationInfoByIds(String ids)
    {
        return categorizationInfoMapper.deleteCategorizationInfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteCategorizationInfoById(Long id)
    {
        return categorizationInfoMapper.deleteCategorizationInfoById(id);
    }
}
