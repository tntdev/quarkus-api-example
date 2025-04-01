/* Copyright: (C) Lala AG 2025, all rights reserved */
package com.example.rest.api.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OfficesDTO {

    private String name;
    private String address;
    private String city;
    private Integer number;
    private List<String> badgedAllowed;
}
