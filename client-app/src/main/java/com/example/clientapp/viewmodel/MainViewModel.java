package com.example.clientapp.viewmodel;

import com.example.clientapp.model.DataModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.fluent.Request;

public class MainViewModel {

    public DataModel fetchData() {
        try {
            String json = Request.get("http://localhost:9090/api/micro/data")
                    .execute().returnContent().asString();

            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(json, DataModel.class);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
