package com.henser.creationalPatterns.factory.staticFactory;

/**
 * Created by henser on 17-7-3.
 */
public class ExportStandardPdfFile implements ExportFile {

    @Override
    public boolean export(String data) {

        /**
         * 业务逻辑
         */
        System.out.println("导出标准PDF文件");
        return true;
    }

}
