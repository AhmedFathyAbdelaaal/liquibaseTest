package io.ahmed.liquidbasedemo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;
import org.springframework.stereotype.Repository;


//This is our repository interface and it is specified as such
@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

    // A query to select the table.
    @Query("SELECT name FROM Person p WHERE p.name LIKE %:personName%")
    String findByName(String personName);
}
