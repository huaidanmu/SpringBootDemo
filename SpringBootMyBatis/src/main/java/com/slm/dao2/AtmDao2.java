package com.slm.dao2;

import com.slm.domain.Atm;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface AtmDao2 {
    @Select("select * from atm")
    public List<Atm> findAll();
}
