package com.cg.dms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.dms.entities.Company;

//extends JpaRepository

@Repository
public interface ICompanyRepository extends JpaRepository<Company, Integer> {

}