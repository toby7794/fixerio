package com.spartaglobal.fixerio.httpcall;

import com.spartaglobal.fixerio.PropertiesReader;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HTTPManager {

    private CloseableHttpResponse fullResponse;

    public HTTPManager() {
        makeAllRatesCall();
    }

    public void makeAllRatesCall(){

        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet getLatestRates = new HttpGet(PropertiesReader.getBase_url() + PropertiesReader.getLatest() + PropertiesReader.getApiAccessUrl() + PropertiesReader.getApiKey());
            fullResponse = httpClient.execute(getLatestRates);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void makeHistoricalRate(String date){

        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet getLatestRates = new HttpGet(PropertiesReader.getBase_url() + date + PropertiesReader.getApiAccessUrl() + PropertiesReader.getApiKey());
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
