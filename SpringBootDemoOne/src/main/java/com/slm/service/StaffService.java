package com.slm.service;

import com.slm.dao.StaffDao;
import com.slm.domain.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("service")
public class StaffService {
    @Autowired
    private StaffDao dao;
    public List<Staff> findAll(){
        return dao.selectAll();
    }
    public void add(Staff staff){
        dao.addStaff(staff);
    }
    public Staff findOne(String name){
        return dao.selectOne(name);
    }
    public void update(Staff staff){
        dao.update(staff);
    }
    public void delete(String name){
        dao.delete(name);
    }
}
