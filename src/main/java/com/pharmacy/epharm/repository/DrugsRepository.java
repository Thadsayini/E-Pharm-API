package com.pharmacy.epharm.repository;

import com.pharmacy.epharm.entity.Drugs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface DrugsRepository extends CrudRepository<Drugs,Integer> {

    //List<Drugs> findAllByYearOfPublicationInAndBookType(Set<Integer> yop , String bookType);
    List<Drugs> findAllByNameInAndType(Set<String> name, String type);
}
