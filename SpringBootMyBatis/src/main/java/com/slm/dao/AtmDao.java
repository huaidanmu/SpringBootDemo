package com.slm.dao;

import com.slm.domain.Atm;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
//@Repository
public interface AtmDao{
    @Select("select * from atm")
    public List<Atm> findAll();
}
