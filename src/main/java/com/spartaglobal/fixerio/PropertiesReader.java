package com.spartaglobal.fixerio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    private static final String PROPAPIKEY = "api_key";
    private static final String BASEURL = "base_url";
    private static final String APIACCESSQUERY = "api_Access_Query";
    private static final String LATESTENDPOINT = "latest_endpoint";

    private static String apiAccessQuery;
    private static String apiKey;
    private static String latest;
    private static String baseURL;

    private PropertiesReader() {
    }

    public static String getApiKey() {
        if (apiKey == null){
            setup();
        }
        return apiKey;
    }

    public static String getLatest() {
        if (latest == null){
            setup();
        }
        return latest;
    }

    public static String getBase_url() {
        if (baseURL == null){
            setup();
        }
        return baseURL;
    }

    public static String getApiAccessUrl() {
        if (apiAccessQuery == null){
            setup();
        }
        return apiAccessQuery;
    }

    public static void setup(){

            java.util.Properties appproperties = new java.util.Properties();
            try {
                appproperties.load(new FileReader("app.properties"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            apiKey = appproperties.getProperty(PROPAPIKEY);
            baseURL = appproperties.getProperty(BASEURL);
            latest = appproperties.getProperty(LATESTENDPOINT);
            apiAccessQuery = appproperties.getProperty(APIACCESSQUERY);


    }


}
