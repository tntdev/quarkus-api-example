/* Copyright: (C) Lala AG 2025, all rights reserved */
package com.example.api.dto;

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
public class ServiceDTO implements Serializable {

    @Serial private static final long serialVersionUID = 500680210413955012L;

    private String name;
    private String domain;
    private Boolean migrated;
}
