package org.openmrs.sync.core.service.light.impl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.openmrs.sync.core.entity.light.FormLight;
import org.openmrs.sync.core.repository.OpenMrsRepository;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class FormLightServiceTest {

    @Mock
    private OpenMrsRepository<FormLight> repository;

    private FormLightService service;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);

        service = new FormLightService(repository);
    }

    @Test
    public void getShadowEntity() {
        // Given

        // When
        FormLight result = service.getShadowEntity("UUID");

        // Then
        assertEquals(getExpectedForm(), result);
    }

    private FormLight getExpectedForm() {
        FormLight form = new FormLight();
        form.setUuid("UUID");
        form.setDateCreated(LocalDateTime.of(1970, Month.JANUARY, 1, 0, 0));
        form.setCreator(1L);
        form.setName("[Default]");
        form.setVersion("[Default]");
        return form;
    }
}
