package com.spartaglobal.fixerio;

import com.spartaglobal.fixerio.currentrates.FixerioDeserialiser;
import com.spartaglobal.fixerio.httpcall.HTTPManager;
import com.spartaglobal.fixerio.services.HistoricalRatesService;
import com.spartaglobal.fixerio.services.RatesService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        HTTPManager ratesLatestCall = new HTTPManager();
//        String values = ratesLatestCall.getResponseBody();
//        FixerioDeserialiser parser = new FixerioDeserialiser(values);
//        System.out.println(parser.ratesMappedDTO.getBase());

        HistoricalRatesService service = new HistoricalRatesService();
        service.getHistoricalRatesService("2013-12-24");
        System.out.println(service.getDeserialiser().ratesMappedDTO.getDate());


    }
}
