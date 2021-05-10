package com.pharmacy.epharm.repository;

import com.pharmacy.epharm.entity.Roles;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface RolesRepository extends CrudRepository<Roles, Integer> {

}
