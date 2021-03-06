package com.henser.creationalPatterns.factory.moreFactory;

/**
 * 具体工厂角色类
 * Created by henser on 17-7-3.
 */
public class ExportHtmlFactory implements ExportFactory {

    @Override
    public ExportFile factory(String type) {

        if("standard".equals(type)){

            return new ExportStandardHtmlFile();

        }else if("financial".equals(type)){

            return new ExportFinancialHtmlFile();

        }else{
            throw new RuntimeException("没有找到对象");
        }
    }

}
