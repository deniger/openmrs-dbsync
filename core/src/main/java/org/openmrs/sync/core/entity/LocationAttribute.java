package org.openmrs.sync.core.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.openmrs.sync.core.entity.light.LocationAttributeTypeLight;
import org.openmrs.sync.core.entity.light.LocationLight;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "location_attribute")
@AttributeOverride(name = "id", column = @Column(name = "location_attribute_id"))
public class LocationAttribute extends Attribute<LocationAttributeTypeLight> {

    @NotNull
    @ManyToOne
    @JoinColumn(name = "location_id")
    private LocationLight referencedEntity;
}