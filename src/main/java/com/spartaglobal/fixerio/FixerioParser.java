package com.spartaglobal.fixerio;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class FixerioParser {

    public FixerioDTO ratesMappedDTO;

    public FixerioParser(String JSONString){
        ObjectMapper ratesObject = new ObjectMapper();

        try{
            ratesMappedDTO = ratesObject.readValue(JSONString, FixerioDTO.class);

        }catch(Exception e){
            e.printStackTrace();
        }

    }



}
