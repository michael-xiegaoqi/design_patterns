package com.henser.creationalPatterns.factory.moreFactory;

/**
 *
 * 抽象工厂角色
 * Created by henser on 17-7-3.
 */
public interface ExportFactory {

    /**
     * 声明了一个工厂方法，要求所有的具体工厂角色都实现这个工厂方法
     * 参数type表示导出的格式是哪一种结构，如：导出HTML格式有两种结构，一种是标准结构，一种是财务需要的结构
     * @param type
     * @return
     */
    public ExportFile factory(String type);

}
