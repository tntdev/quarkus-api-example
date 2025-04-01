/* Copyright: (C) Lala AG 2025, all rights reserved */
package com.example.rest.api.dto;

import java.io.Serial;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CrocodilesDTO implements Serializable {

    @Serial private static final long serialVersionUID = 3758301933953040120L;

    private String name;
    private Integer age;
    private String badgeCode;
    private ServiceDTO serviceDTO;
}
