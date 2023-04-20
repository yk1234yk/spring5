package com.atguigu.spring6.iocxml.diTest;

import java.util.List;

//部门
public class Dept {
    //一个部门有很多员工
    private List<Emp> empList;
    private String dname;

    public void info(){
        System.out.println("部门名称:"+dname);
        for (Emp emp:empList){
            System.out.println(emp.getEname());
        }
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }
}
