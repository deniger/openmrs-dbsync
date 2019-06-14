package org.openmrs.sync.core.repository;

import org.openmrs.sync.core.entity.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface PersonRepository extends SyncEntityRepository<Person> {

    @Override
    @Query("select p from Person p " +
            "where type(p) = 'Person'")
    List<Person> findAll();

    @Override
    @Query("select p from Person p " +
            "where (p.dateChanged is null and p.dateCreated >= :lastSyncDate " +
            "or p.dateChanged >= :lastSyncDate) " +
            "and type(p) = 'Person'")
    List<Person> findModelsChangedAfterDate(@Param("lastSyncDate") LocalDateTime lastSyncDate);
}