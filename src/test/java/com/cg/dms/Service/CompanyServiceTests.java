//package com.cg.dms.Service;
//
//import java.util.Optional;
//
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import com.cg.dms.entities.Company;
//import com.cg.dms.repository.ICompanyRepository;
//import com.cg.dms.service.CompanyService;
//
//public class CompanyServiceTests {
//	@Autowired
//	private CompanyService companyService;
//	
//	@MockBean
//	private ICompanyRepository iCompanyRepository;
//	@Test
//	public void deleteCompany(int companyId) {
//		Company company = iCompanyRepository.getById(1);
//		iCompanyRepository.delete(company);
//		Optional<Company> comapnyOpt = Optional.empty();
//		if (comapnyOpt.isPresent()) {
//			company = comapnyOpt.get();
//		}
//		Assertions.assertThat(company).isNull();
//	}
//	
//}
