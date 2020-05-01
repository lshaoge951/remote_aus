package com.haitang.project.system.log.service.impl;

import java.util.List;
import com.haitang.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.haitang.project.system.log.mapper.OperationLogMapper;
import com.haitang.project.system.log.domain.OperationLog;
import com.haitang.project.system.log.service.IOperationLogService;
import com.haitang.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author haitang
 * @date 2020-03-19
 */
@Service
public class OperationLogServiceImpl implements IOperationLogService 
{
    @Autowired
    private OperationLogMapper operationLogMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public OperationLog selectOperationLogById(Long id)
    {
        return operationLogMapper.selectOperationLogById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param operationLog 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<OperationLog> selectOperationLogList(OperationLog operationLog)
    {
        return operationLogMapper.selectOperationLogList(operationLog);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param operationLog 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertOperationLog(OperationLog operationLog)
    {
        operationLog.setCreateTime(DateUtils.getNowDate());
        return operationLogMapper.insertOperationLog(operationLog);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param operationLog 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateOperationLog(OperationLog operationLog)
    {
        return operationLogMapper.updateOperationLog(operationLog);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteOperationLogByIds(String ids)
    {
        return operationLogMapper.deleteOperationLogByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteOperationLogById(Long id)
    {
        return operationLogMapper.deleteOperationLogById(id);
    }
}
