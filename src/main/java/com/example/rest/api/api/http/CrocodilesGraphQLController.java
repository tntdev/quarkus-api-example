/* Copyright: (C) Lala AG 2025, all rights reserved */
package com.example.rest.api.api.http;

import static lombok.AccessLevel.PACKAGE;

import com.example.rest.api.domain.CrocodilesService;
import com.example.rest.api.dto.CrocodilesDTO;
import com.example.rest.api.dto.OfficesDTO;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.graphql.Source;

import java.util.List;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@GraphQLApi
@RequiredArgsConstructor(access = PACKAGE)
public class CrocodilesGraphQLController {

    private final CrocodilesService crocodilesService;

    @Query("getPerson")
    public List<CrocodilesDTO> getPerson() {
        return crocodilesService.getAllCrocodiles();
    }

    @Query("getPersonByBadgeCode")
    public CrocodilesDTO getCrocodilesByBadgeCode(@Name("badgeCode") String badgeCode) {
        return crocodilesService.getCrocodilesByBadgeCode(badgeCode);
    }

    @Query("getAllOffices")
    public List<OfficesDTO> getAllOffices() {
        return crocodilesService.getAllOffices();
    }

    @Query
    public OfficesDTO getOfficeAllowedByBadgeCode(@Source CrocodilesDTO crocodilesDTO) {
        return crocodilesService.getOfficeByBadgeCode(crocodilesDTO.getBadgeCode());
    }
}
