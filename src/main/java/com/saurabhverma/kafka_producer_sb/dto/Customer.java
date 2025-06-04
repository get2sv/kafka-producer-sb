package com.saurabhverma.kafka_producer_sb.dto;


import lombok.Data;

@Data
public class Customer {

    private int id;
    private String name;
    private String email;
    private String contactNo;

}
