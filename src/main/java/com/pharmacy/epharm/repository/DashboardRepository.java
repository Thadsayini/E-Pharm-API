package com.pharmacy.epharm.repository;

import com.pharmacy.epharm.entity.Dashboard;
import com.pharmacy.epharm.entity.Drugs;
import org.springframework.data.repository.CrudRepository;

public interface DashboardRepository extends CrudRepository<Dashboard,Integer> {
}
