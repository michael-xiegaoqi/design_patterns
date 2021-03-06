package com.henser.creationalPatterns.factory.staticFactory;

/**
 * Created by henser on 17-7-3.
 */
public class ExportPdfFactory {


    public static ExportFile factory(String type) {

        if("standard".equals(type)){

            return new ExportStandardPdfFile();

        }else if("financial".equals(type)){

            return new ExportFinancialPdfFile();

        }else{
            throw new RuntimeException("没有找到对象");
        }
    }


}
