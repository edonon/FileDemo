package com.userweb.demo.service.Imp;

import com.userweb.demo.mapper.SysUserMapper;
import com.userweb.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userImp")
public class UserImp implements UserService {
    private SysUserMapper sysUserMapper;
    @Override
    public List getAll() {
        return sysUserMapper.getAll();
    }
}
