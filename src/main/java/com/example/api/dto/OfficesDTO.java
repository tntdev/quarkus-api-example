/* Copyright: (C) Lala AG 2025, all rights reserved */
package com.example.api.dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OfficesDTO implements Serializable {

    @Serial private static final long serialVersionUID = 5554562751908551823L;

    private String name;
    private String address;
    private String city;
    private Integer number;
    private List<String> badgedAllowed;
}
