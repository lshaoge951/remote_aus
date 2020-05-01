package com.haitang.project.system.log.service;

import com.haitang.project.system.log.domain.OperationLog;
import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author haitang
 * @date 2020-03-19
 */
public interface IOperationLogService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public OperationLog selectOperationLogById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param operationLog 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<OperationLog> selectOperationLogList(OperationLog operationLog);

    /**
     * 新增【请填写功能名称】
     * 
     * @param operationLog 【请填写功能名称】
     * @return 结果
     */
    public int insertOperationLog(OperationLog operationLog);

    /**
     * 修改【请填写功能名称】
     * 
     * @param operationLog 【请填写功能名称】
     * @return 结果
     */
    public int updateOperationLog(OperationLog operationLog);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteOperationLogByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteOperationLogById(Long id);
}
