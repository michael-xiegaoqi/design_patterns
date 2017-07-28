package com.henser.structuralPatterns.composite.companyComposite;

/**
 * 财务部（树叶节点）
 * Created by henser on 17-7-24.
 */
public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void display(int depth) {
        System.out.println("第 " + depth + " 层的机构名为： " + name);
    }

    @Override
    public void lineofDuty() {
        System.out.println(name + "   负责公司财务收支管理");
    }

    @Override
    public void remove(Company company) {

    }

}
