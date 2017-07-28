package com.henser.creationalPatterns.factory.simpleFactory;

/**
 * Created by henser on 17-7-3.
 */
public class ExportSimpleClient {

    public static void main(String[] args) {
        String data = "";
        ExportFactory exportFactory = new ExportFactory();
        ExportFile ef = exportFactory.factory("financial");
        ef.export(data);
    }

}
