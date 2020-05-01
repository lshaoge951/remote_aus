package com.haitang.project.system.parts.service.impl;

import java.util.List;
import com.haitang.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.haitang.project.system.parts.mapper.BodyPartsMapper;
import com.haitang.project.system.parts.domain.BodyParts;
import com.haitang.project.system.parts.service.IBodyPartsService;
import com.haitang.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author haitang
 * @date 2020-03-19
 */
@Service
public class BodyPartsServiceImpl implements IBodyPartsService 
{
    @Autowired
    private BodyPartsMapper bodyPartsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public BodyParts selectBodyPartsById(Long id)
    {
        return bodyPartsMapper.selectBodyPartsById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param bodyParts 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<BodyParts> selectBodyPartsList(BodyParts bodyParts)
    {
        return bodyPartsMapper.selectBodyPartsList(bodyParts);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param bodyParts 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBodyParts(BodyParts bodyParts)
    {
        bodyParts.setCreateTime(DateUtils.getNowDate());
        return bodyPartsMapper.insertBodyParts(bodyParts);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param bodyParts 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBodyParts(BodyParts bodyParts)
    {
        bodyParts.setUpdateTime(DateUtils.getNowDate());
        return bodyPartsMapper.updateBodyParts(bodyParts);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBodyPartsByIds(String ids)
    {
        return bodyPartsMapper.deleteBodyPartsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteBodyPartsById(Long id)
    {
        return bodyPartsMapper.deleteBodyPartsById(id);
    }
}
