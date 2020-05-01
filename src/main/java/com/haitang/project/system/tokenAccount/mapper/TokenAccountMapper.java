package com.haitang.project.system.tokenAccount.mapper;

import com.haitang.project.system.soundPatientBody.domain.SoundPatientBody;
import com.haitang.project.system.soundSelect.domain.SoundSelect;
import com.haitang.project.system.tokenAccount.domain.TokenAccount;

import java.util.List;

/**
 * 身体部位录音Mapper接口
 * 
 * @author haitang
 * @date 2020-03-19
 */
public interface TokenAccountMapper
{

    public TokenAccount select(String token);

    public void insert(TokenAccount tokenAccount);

    public void update(TokenAccount tokenAccount);

    public void delete(String account);



}
