package com.pharmacy.epharm.controller;

import com.pharmacy.epharm.entity.Dashboard;
import com.pharmacy.epharm.repository.DashboardRepository;
import com.pharmacy.epharm.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DashboardController {
    @Autowired
    private DashboardService dashboardService;

    @RequestMapping(value = "dashboard")
    public List<Dashboard> getDashboard(){
        return dashboardService.getDashboard();
    }
}
