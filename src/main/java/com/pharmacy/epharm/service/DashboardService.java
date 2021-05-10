package com.pharmacy.epharm.service;

import com.pharmacy.epharm.entity.Dashboard;
import com.pharmacy.epharm.repository.DashboardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService {
    private DashboardRepository dashboardRepository;
    public Dashboard getDashboard() {
        return dashboardRepository.findAll();
    }
}
