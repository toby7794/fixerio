package com.spartaglobal.fixerio.currentrates;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FixerioDeserialiser {

    public FixerioDTO ratesMappedDTO;

    public FixerioDeserialiser(String JSONString){
        ObjectMapper ratesObject = new ObjectMapper();

        try{
            ratesMappedDTO = ratesObject.readValue(JSONString, FixerioDTO.class);

        }catch(Exception e){
            e.printStackTrace();
        }

    }



}
