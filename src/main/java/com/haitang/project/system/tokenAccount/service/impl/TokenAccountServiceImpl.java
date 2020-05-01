package com.haitang.project.system.tokenAccount.service.impl;

import com.haitang.project.system.soundSelect.domain.SoundSelect;
import com.haitang.project.system.soundSelect.mapper.SoundSelectMapper;
import com.haitang.project.system.soundSelect.service.ISoundSelectService;
import com.haitang.project.system.tokenAccount.domain.TokenAccount;
import com.haitang.project.system.tokenAccount.service.ITokenAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TokenAccountServiceImpl implements ITokenAccountService {
    @Autowired
    private SoundSelectMapper soundSelectMapper;


    @Override
    public TokenAccount select(String token) {
        return null;
    }

    @Override
    public TokenAccount insert(TokenAccount tokenAccount) {
        return null;
    }

    @Override
    public TokenAccount update(TokenAccount tokenAccount) {
        return null;
    }

    @Override
    public TokenAccount delete(String account) {
        return null;
    }
}
