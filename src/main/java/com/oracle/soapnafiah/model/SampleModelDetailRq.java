package com.oracle.soapnafiah.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SampleModelDetailRq {

    @JsonProperty("sampleservicerq")
    private SampleModelRq sampleModelRq;
}
