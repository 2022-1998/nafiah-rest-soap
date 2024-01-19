package com.oracle.soapnafiah.usecase;

import com.oracle.external.services.sampleservice.response.v1.Sampleservicerq;
import com.oracle.external.services.sampleservice.response.v1.Sampleservicers;
import com.oracle.soapnafiah.model.SampleModelDetailRq;
import com.oracle.soapnafiah.model.SampleModelDetailRs;
import com.oracle.soapnafiah.model.SampleModelRq;
import com.oracle.soapnafiah.model.SampleModelRs;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Slf4j
@Service
public class SampleUsecase {

    private RestClient restClient;

    private SampleModelRs sampleModelRs;

    public Sampleservicers validateSample(Sampleservicerq sampleservicerq) {

        SampleModelRq sampleModelRq = new SampleModelRq();

        sampleModelRq.setServiceId(sampleModelRq.getServiceId());
        sampleModelRq.setOrderType(sampleModelRq.getOrderType());
        sampleModelRq.setType(sampleModelRq.getType());
        sampleModelRq.setTrxId(sampleModelRq.getTrxId());

        SampleModelDetailRq sampleModelDetailRq = new SampleModelDetailRq();
        sampleModelDetailRq.setSampleModelRq(sampleModelRq);

        SampleModelDetailRs response = restClient.post()
                .uri(  "http://localhost:9090/external/services/rest/sample-service")
                .contentType(APPLICATION_JSON)
                .body(sampleModelDetailRq)
                .retrieve()
                .body(SampleModelDetailRs.class);

        Sampleservicers sampleservicers = new Sampleservicers();
        sampleservicers.setErrorCode("0000");
        sampleservicers.setErrorMsg("Success");
        sampleservicers.setTrxId(sampleModelRs.getTrxId());

        return sampleservicers;
    }

}
