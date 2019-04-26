package com.spartaglobal.fixerio;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HTTPManager {

    private PropertiesReader properties = new PropertiesReader();
    private CloseableHttpResponse fullResponse;

    public HTTPManager() {
        makeAllRatesCall();
    }

    private void makeAllRatesCall(){

        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet getLatestRates = new HttpGet(properties.getBase_url() + properties.getLatest() + properties.getApiAccessUrl() + properties.getApiKey());
            fullResponse = httpClient.execute(getLatestRates);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getResponseBody(){
        String bodyResult = null;
        try{
            bodyResult = EntityUtils.toString(fullResponse.getEntity());
        }catch (IOException e){
            e.printStackTrace();
        }
        return bodyResult;
    }
}
