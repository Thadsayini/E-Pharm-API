package com.pharmacy.epharm.controller;

import com.pharmacy.epharm.entity.Drugs;
import com.pharmacy.epharm.service.DrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class DrugsController {
    @Autowired
    private DrugsService drugsService;

    @RequestMapping(value = "/drugs")
    public List<Drugs> getBooks(@RequestParam(value = "Name", required = false) Set<String> name,
                                @RequestParam(value = "Type",required =false) String type){
        return drugsService.getDrug(name,type);
    }

    @RequestMapping(value = "/drugs", method = RequestMethod.POST)
    public Drugs createBook(@RequestBody Drugs drugs){
        return drugsService.createDrug(drugs);
    }

    @RequestMapping(value = "/drugs/{id}")
    public Drugs getDrugById(@PathVariable("id") Integer drugId){
        return drugsService.getDrugById(drugId);
    }

    @RequestMapping(value = "/drugs",method = RequestMethod.PUT)
    public Drugs updateDrug(@RequestBody Drugs drugs){
        return drugsService.updateDrug(drugs);
    }

    @RequestMapping(value = "/drugs/{drugId}" ,method = RequestMethod.DELETE)
    public String deleteById(@PathVariable Integer drugId){
        return drugsService.deleteById(drugId);
    }
}
