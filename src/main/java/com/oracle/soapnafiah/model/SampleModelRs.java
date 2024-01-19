package com.oracle.soapnafiah.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SampleModelRs {

    @JsonProperty("error_code")
    private String errorCode;
    @JsonProperty("error_msg")
    private String errorMsg;
    @JsonProperty("trx_id")
    private String trxId;

}

