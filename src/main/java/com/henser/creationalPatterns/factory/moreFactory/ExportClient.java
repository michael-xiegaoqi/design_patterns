package com.henser.creationalPatterns.factory.moreFactory;

/**
 * Created by henser on 17-7-3.
 */
public class ExportClient {

    public static void main(String[] args) {
        String data = "";
        ExportFactory exportFactory = new ExportHtmlFactory();
        ExportFile ef = exportFactory.factory("financial");
        ef.export(data);
    }

}
