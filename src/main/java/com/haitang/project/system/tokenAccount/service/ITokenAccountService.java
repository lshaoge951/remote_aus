package com.haitang.project.system.tokenAccount.service;

import com.haitang.project.system.soundPatientBody.domain.SoundPatientBody;
import com.haitang.project.system.soundSelect.domain.SoundSelect;
import com.haitang.project.system.tokenAccount.domain.TokenAccount;

import java.util.List;

public interface ITokenAccountService {

    /**
     * 查询身体部位录音
     *
     * @param id 身体部位录音ID
     * @return 身体部位录音
     */
    public TokenAccount select(String token);

    public TokenAccount insert(TokenAccount tokenAccount);

    public TokenAccount update(TokenAccount tokenAccount);

    public TokenAccount delete(String account);

}
