package org.openmrs.sync.component.entity.light;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "icrc_work_order")
@AttributeOverride(name = "id", column = @Column(name = "work_order_id"))
public class ErpWorkOrderLight extends VoidableLightEntity {

    @NotNull
    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderLight order;

    @NotNull
    @Column(name = "wo_seq_number")
    private Integer sequenceNumber;

}