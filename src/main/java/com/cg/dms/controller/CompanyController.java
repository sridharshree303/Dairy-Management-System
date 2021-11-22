package com.cg.dms.controller;

import com.cg.dms.entities.Company;
import com.cg.dms.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompanyController {

    @Autowired
    private ICompanyService iCompanyService;

    @PostMapping("/company")
    public Company insertCompany(@RequestBody Company company){

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update
        company.setId(0);
        iCompanyService.insertCompany(company);
        return company;
    }

    @PutMapping("/company")
    public Company updateCompany(@RequestBody Company company) {

        iCompanyService.insertCompany(company);

        return company;
    }

    @DeleteMapping("/company/{companyId}")
    public String deleteCompany(@PathVariable int companyId) {

        Company company = iCompanyService.findById(companyId);

        // throw exception if null

        if (company == null) {
            throw new RuntimeException("Employee id not found - " + companyId);
        }

        iCompanyService.deleteCompanyById(companyId);

        return "Deleted employee id - " + companyId;
    }

}
