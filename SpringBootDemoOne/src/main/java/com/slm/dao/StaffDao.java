package com.slm.dao;

import com.slm.domain.Staff;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository("dao")
public class StaffDao {
    //存放数据
    //模仿数据库表
    private static List<Staff> list = new ArrayList<Staff>();
    //进行静态初始化
    //模仿数据库表中已有的数据
    static{
        list.add(new Staff("刘阿毛","销售"));
        list.add(new Staff("刘黑猪","收破烂"));
        list.add(new Staff("张三","经理"));
        list.add(new Staff("李四","主管"));
        list.add(new Staff("王五","销售"));
    }
    public List<Staff> selectAll(){
        return list;
    }
    public void addStaff(Staff staff){
        list.add(staff);
    }
    //查询一个
    public Staff selectOne(String name){
        return getStaff(name);
    }
    public Staff getStaff(String name){
        for(Staff staff : list){
            if(staff.getName().equals(name)){
                return staff;
            }
        }
        return new Staff("","");
    }
    //更新
    public void update(Staff staff){
        Staff oldStaff = getStaff(staff.getName());
        oldStaff.setRole(staff.getRole());
    }
    public void delete(String name){
        Staff staff = getStaff(name);
        list.remove(staff);
    }
}
