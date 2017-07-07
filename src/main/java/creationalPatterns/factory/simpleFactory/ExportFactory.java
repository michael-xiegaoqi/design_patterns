package main.java.creationalPatterns.factory.simpleFactory;

/**
 *
 * 简单工厂角色
 * Created by henser on 17-7-3.
 */
public class ExportFactory {

    /**
     *
     * 参数type表示导出的格式是哪一种结构，如：导出HTML格式有两种结构，一种是标准结构，一种是财务需要的结构
     * @param type
     * @return
     */
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
