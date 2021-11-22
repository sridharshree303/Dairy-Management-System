package com.cg.dms.service;

import com.cg.dms.entities.Company;
import com.cg.dms.repository.ICompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ICompanyService {

    @Autowired
    private ICompanyRepository iCompanyRepository;

    public void insertCompany(Company company){
        iCompanyRepository.save(company);
    }

    public void deleteCompanyById(int id) {
        iCompanyRepository.deleteById(id);
    }

    public Company findById(int id) {
        Optional<Company> result = iCompanyRepository.findById(id);

        Company company = null;

        if (result.isPresent()) {
            company = result.get();
        }
        else {
            // we didn't find the company
            throw new RuntimeException("Did not find company id - " + id);
        }

        return company;
    }

}