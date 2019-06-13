package org.openmrs.sync.core.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
public class VisitModel extends BaseModel {

    private String patientUuid;

    private String visitTypeUuid;

    private LocalDateTime dateStarted;

    private LocalDateTime dateStopped;

    private String indicationConceptUuid;

    private String indicationConceptClassUuid;

    private String indicationConceptDatatypeUuid;

    private String locationUuid;
}
