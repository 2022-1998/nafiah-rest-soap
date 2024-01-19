package com.oracle.soapnafiah.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SampleModelDetailRs {

    @JsonProperty("sampleservicers")
    private SampleModelRs sampleModelRs;
}
