package com.haitang.project.system.parts.mapper;

import com.haitang.project.system.parts.domain.BodyParts;
import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author haitang
 * @date 2020-03-19
 */
public interface BodyPartsMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public BodyParts selectBodyPartsById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param bodyParts 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<BodyParts> selectBodyPartsList(BodyParts bodyParts);

    /**
     * 新增【请填写功能名称】
     * 
     * @param bodyParts 【请填写功能名称】
     * @return 结果
     */
    public int insertBodyParts(BodyParts bodyParts);

    /**
     * 修改【请填写功能名称】
     * 
     * @param bodyParts 【请填写功能名称】
     * @return 结果
     */
    public int updateBodyParts(BodyParts bodyParts);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteBodyPartsById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteBodyPartsByIds(String[] ids);
}
