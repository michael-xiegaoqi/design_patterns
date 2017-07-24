package main.java.structuralPatterns.composite.companyComposite;

/**
 * 人力资源部（树叶节点）
 * Created by henser on 17-7-24.
 */
public class HRDepartment extends Company {

    public HRDepartment(String name) {
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
        System.out.println(name + "    负责员工招聘管理培训");
    }

    @Override
    public void remove(Company company) {

    }

}
