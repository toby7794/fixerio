package com.spartaglobal.fixerio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    private String apiKey;
    private String latest;
    private String base_url;
    private String apiAccessUrl;

    public PropertiesReader() {
        Properties appproperties = new Properties();
        try {
            appproperties.load(new FileReader("app.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        apiKey = appproperties.getProperty("api_key");
        base_url = appproperties.getProperty("base_url");
        latest = appproperties.getProperty("latest_endpoint");
        apiAccessUrl = appproperties.getProperty("api_Access_Url");
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getLatest() {
        return latest;
    }

    public String getBase_url() {
        return base_url;
    }

    public String getApiAccessUrl() {
        return apiAccessUrl;
    }
}
