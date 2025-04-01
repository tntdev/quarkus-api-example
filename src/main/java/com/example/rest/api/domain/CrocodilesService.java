/* Copyright: (C) Lala AG 2025, all rights reserved */
package com.example.rest.api.domain;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

import com.example.rest.api.dto.CrocodilesDTO;
import com.example.rest.api.dto.OfficesDTO;
import com.example.rest.api.dto.ServiceDTO;

import java.util.Arrays;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CrocodilesService {

    private List<CrocodilesDTO> crocodilesDTOList;
    private List<OfficesDTO> officesDTOList;

    public CrocodilesService() {
        officesDTOList =
                Arrays.asList(
                        OfficesDTO.builder()
                                .name("Aliados")
                                .address("R. Dr. António Luís Gomes 10, 4000-091")
                                .city("Porto")
                                .number(10)
                                .badgedAllowed(List.of("1234", "12342", "12343"))
                                .build(),
                        OfficesDTO.builder()
                                .name("K-Tower")
                                .address("Av. Aquilino Ribeiro Machado 8, 1800-399")
                                .city("Lisbon")
                                .number(8)
                                .badgedAllowed(List.of("12344", "12345", "12346"))
                                .build(),
                        OfficesDTO.builder()
                                .name("Braga office")
                                .address("Av. Dom João II 374, 4715-275 Braga ")
                                .city("Braga")
                                .number(374)
                                .badgedAllowed(List.of("12347", "12348", "12349"))
                                .build());
        crocodilesDTOList =
                Arrays.asList(
                        CrocodilesDTO.builder()
                                .name("Person1")
                                .age(30)
                                .badgeCode("1234")
                                .serviceDTO(
                                        ServiceDTO.builder()
                                                .name("readout-diagnosis-processor")
                                                .domain("Readout")
                                                .migrated(FALSE)
                                                .build())
                                .build(),
                        CrocodilesDTO.builder()
                                .name("Person2")
                                .age(30)
                                .badgeCode("12342")
                                .serviceDTO(
                                        ServiceDTO.builder()
                                                .name("orderdata-processor")
                                                .domain("Orderdata")
                                                .migrated(TRUE)
                                                .build())
                                .build(),
                        CrocodilesDTO.builder()
                                .name("Person3")
                                .age(30)
                                .badgeCode("12343")
                                .serviceDTO(
                                        ServiceDTO.builder()
                                                .name("keydata-query")
                                                .domain("KeyData")
                                                .migrated(TRUE)
                                                .build())
                                .build(),
                        CrocodilesDTO.builder()
                                .name("Person4")
                                .age(30)
                                .badgeCode("12344")
                                .serviceDTO(
                                        ServiceDTO.builder()
                                                .name("keydata-cdh-exporter")
                                                .domain("KeyData")
                                                .migrated(TRUE)
                                                .build())
                                .build(),
                        CrocodilesDTO.builder()
                                .name("Person5")
                                .age(30)
                                .badgeCode("12345")
                                .serviceDTO(
                                        ServiceDTO.builder()
                                                .name("esh-processor")
                                                .domain("eSh")
                                                .migrated(TRUE)
                                                .build())
                                .build(),
                        CrocodilesDTO.builder()
                                .name("Person6")
                                .age(30)
                                .badgeCode("12346")
                                .serviceDTO(
                                        ServiceDTO.builder()
                                                .name("document-indexer")
                                                .domain("Document")
                                                .migrated(TRUE)
                                                .build())
                                .build(),
                        CrocodilesDTO.builder()
                                .name("Person7")
                                .age(30)
                                .badgeCode("12347")
                                .serviceDTO(
                                        ServiceDTO.builder()
                                                .name("document-query")
                                                .domain("Document")
                                                .migrated(FALSE)
                                                .build())
                                .build(),
                        CrocodilesDTO.builder()
                                .name("Person8")
                                .age(30)
                                .badgeCode("12348")
                                .serviceDTO(
                                        ServiceDTO.builder()
                                                .name("readout-query")
                                                .domain("Readout")
                                                .migrated(FALSE)
                                                .build())
                                .build(),
                        CrocodilesDTO.builder()
                                .name("Person9")
                                .age(30)
                                .badgeCode("12349")
                                .serviceDTO(
                                        ServiceDTO.builder()
                                                .name("readout-treatment-processor")
                                                .domain("Readout")
                                                .migrated(FALSE)
                                                .build())
                                .build());
    }

    public List<CrocodilesDTO> getAllCrocodiles() {
        return crocodilesDTOList;
    }

    public CrocodilesDTO getCrocodilesByBadgeCode(String badgeCode) {
        return crocodilesDTOList.stream()
                .filter(x -> x.getBadgeCode().equals(badgeCode))
                .findFirst()
                .orElseThrow();
    }

    public List<OfficesDTO> getAllOffices() {
        return officesDTOList;
    }

    public OfficesDTO getOfficeByBadgeCode(String badgeCode) {
        return officesDTOList.stream()
                .filter(x -> x.getBadgedAllowed().contains(badgeCode))
                .findFirst()
                .orElseThrow();
    }
}
