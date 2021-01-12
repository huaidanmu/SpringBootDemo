package com.slm;

import com.slm.domain.Atm;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class TestAtm {
    public static void main(String[] args){
        //获得validator对象
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Validator validatorFactory = Validation.byDefaultProvider().configure().
                addProperty("hibernate.validator.fail_fast","true").
                buildValidatorFactory().getValidator();
        //创建要检查的domain对象
        Atm atm = new Atm("","",null);
        //检查
        Set<ConstraintViolation<Atm>> set = validator.validate(atm);
        for(ConstraintViolation c : set){
            System.out.println(c.getMessage()+"----"+c.getPropertyPath());
        }
        System.out.println("==============================");
        Set<ConstraintViolation<Atm>> set1 = validatorFactory.validate(atm);
        for(ConstraintViolation c : set1){
            System.out.println(c.getMessage()+"----"+c.getPropertyPath());
        }
    }
}
