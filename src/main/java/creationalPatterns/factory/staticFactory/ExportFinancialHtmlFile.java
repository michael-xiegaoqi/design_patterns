package main.java.creationalPatterns.factory.staticFactory;

/**
 * 具体导出角色类
 * 类会有复杂的业务逻辑
 * Created by henser on 17-7-3.
 */
public class ExportFinancialHtmlFile implements ExportFile {

    @Override
    public boolean export(String data) {
        /**
         * 业务逻辑
         */
        System.out.println("导出财务版HTML文件");
        return true;
    }

}
