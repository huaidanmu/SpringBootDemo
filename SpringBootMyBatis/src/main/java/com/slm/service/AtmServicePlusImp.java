package com.slm.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.slm.dao.AtmDaoPlus;
import com.slm.domain.Atm;
import org.springframework.stereotype.Service;

@Service
public class AtmServicePlusImp extends ServiceImpl<AtmDaoPlus, Atm> implements AtmServicePlus {
}
