package com.spartaglobal.fixerio;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HTTPManager ratesLatestCall = new HTTPManager();
        String values = ratesLatestCall.getResponseBody();
        FixerioParser parser = new FixerioParser(values);
        System.out.println(parser.ratesMappedDTO.getRates());
    }
}
