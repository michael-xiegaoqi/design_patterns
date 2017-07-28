package com.henser.creationalPatterns.factory.staticFactory;

/**
 * Created by henser on 17-7-3.
 */
public class ExportStaticClient {

    public static void main(String[] args) {
        String data = "";
        ExportFile ef = ExportHtmlFactory.factory("financial");
        ef.export(data);
    }

}
