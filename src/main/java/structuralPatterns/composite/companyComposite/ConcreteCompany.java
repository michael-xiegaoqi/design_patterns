package main.java.structuralPatterns.composite.companyComposite;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体公司类（树枝节点）
 * Created by henser on 17-7-24.
 */
public class ConcreteCompany extends Company{

    private List<Company> childrenCompany = new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        childrenCompany.add(company);
    }

    @Override
    public void display(int depth) {
        System.out.println("第 " + depth + " 层的机构名为： " + name);
        for (Company c : childrenCompany) {
            c.display(depth + 1);
        }
    }

    @Override
    public void lineofDuty() {
        for (Company c : childrenCompany) {
            c.lineofDuty();
        }
    }

    @Override
    public void remove(Company company) {
        childrenCompany.remove(company);
    }

}
