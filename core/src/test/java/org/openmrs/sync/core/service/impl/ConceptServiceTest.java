package org.openmrs.sync.core.service.impl;

import org.openmrs.sync.core.entity.light.ConceptLight;
import org.openmrs.sync.core.repository.ConceptRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class ConceptServiceTest {

    @Mock
    private ConceptRepository repository;

    private ConceptService service;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);

        service = new ConceptService(repository);
    }

    @Test
    public void getFakeEntity() {
        assertEquals(getExpectedConcept(), service.getFakeEntity("UUID"));
    }

    private ConceptLight getExpectedConcept() {
        ConceptLight expected = new ConceptLight();
        expected.setUuid("UUID");
        expected.setClassId(1L);
        expected.setDatatypeId(1L);
        expected.setCreator(1L);
        expected.setDateCreated(LocalDateTime.of(1970, Month.JANUARY, 1, 0, 0));
        return expected;
    }
}
