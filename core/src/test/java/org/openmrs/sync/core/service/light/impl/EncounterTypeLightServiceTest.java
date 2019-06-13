package org.openmrs.sync.core.service.light.impl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.openmrs.sync.core.entity.light.EncounterTypeLight;
import org.openmrs.sync.core.repository.OpenMrsRepository;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class EncounterTypeLightServiceTest {

    @Mock
    private OpenMrsRepository<EncounterTypeLight> repository;

    private EncounterTypeLightService service;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);

        service = new EncounterTypeLightService(repository);
    }

    @Test
    public void getShadowEntity() {
        // Given

        // When
        EncounterTypeLight result = service.getShadowEntity("UUID");

        // Then
        assertEquals(getExpectedEncounterType(), result);
    }

    private EncounterTypeLight getExpectedEncounterType() {
        EncounterTypeLight encounterType = new EncounterTypeLight();
        encounterType.setUuid("UUID");
        encounterType.setDateCreated(LocalDateTime.of(1970, Month.JANUARY, 1, 0, 0));
        encounterType.setCreator(1L);
        encounterType.setName("[Default] - UUID");
        return encounterType;
    }
}
