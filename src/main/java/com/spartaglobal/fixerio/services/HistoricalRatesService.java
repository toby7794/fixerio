package com.spartaglobal.fixerio.services;

import com.spartaglobal.fixerio.currentrates.FixerioDeserialiser;
import com.spartaglobal.fixerio.httpcall.HTTPManager;

public class HistoricalRatesService {

    private FixerioDeserialiser deserialiser;

    public void getHistoricalRatesService(String date){
        HTTPManager historical = new HTTPManager();
        historical.makeHistoricalRate(date);
        deserialiser = new FixerioDeserialiser(historical.getResponseBody());
    }

    public FixerioDeserialiser getDeserialiser() {
        return deserialiser;
    }
}
