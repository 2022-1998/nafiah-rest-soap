package com.oracle.soapnafiah.endpoint;


import com.oracle.external.services.sampleservice.response.v1.Sampleservicerq;
import com.oracle.external.services.sampleservice.response.v1.Sampleservicers;
import com.oracle.soapnafiah.usecase.SampleUsecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class SampleEndpoint {

    private static final String NAMESPACE = "http://www.oracle.com/external/services/sampleservice/response/v1.0";

    @Autowired
    private SampleUsecase sampleUsecase;


    @PayloadRoot(namespace = NAMESPACE, localPart = "sampleservicerq")
    @ResponsePayload
    public Sampleservicers getProcess(@RequestPayload Sampleservicerq sampleservicerq) {
        return sampleUsecase.validateSample(sampleservicerq);
    }
}



        // Buat model request dan response JSON untuk service 2
        // Set request SOAP ke request JSON
        // Kirim request JSON ke service 2 pake Rest Client
        // Set trx id SOAP pake response JSON trx id







