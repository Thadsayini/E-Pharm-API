package com.pharmacy.epharm.service;

import com.pharmacy.epharm.entity.Drugs;
import com.pharmacy.epharm.repository.DrugsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class DrugsService {

    //static  List<Drugs> drugList = Arrays.asList(
            //new Drugs(1, "states"),
           // new Drugs(1,"states"),
           // new Drugs(1,"states")
    //);

    @Autowired
    private DrugsRepository drugsRepository;

        public List<Drugs> getDrug(Set<String> name, String type){
        List<Drugs> drugsList = new ArrayList<>();
        if(name==null) {
            drugsRepository.findAll().forEach(drugsList::add);
        }else {
            return drugsRepository.findAllByNameInAndType(name,type);
        }
        return drugsList;
    }

    public Drugs createDrug(Drugs drugs){
        return drugsRepository.save(drugs);
    }

    public Drugs getDrugById(Integer drugId) {
        return drugsRepository.findOne(drugId);
    }

    public Drugs updateDrug(Drugs drugs) {
        return drugsRepository.save(drugs);
    }

    public String deleteById(Integer drugId) {
        drugsRepository.delete(drugId);
        return "Delete Successfully";
    }
}
