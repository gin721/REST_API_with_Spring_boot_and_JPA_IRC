package com.example.springdemo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.springdemo.model.LoanApplicationModel;
import com.example.springdemo.repository.LoanApplicationRepository;
@Service
public class LoanApplicationService {
	@Autowired
	LoanApplicationRepository lr;
	public LoanApplicationModel createnew(LoanApplicationModel l)
	{
		return lr.save(l);
	}
    public List<LoanApplicationModel> getloandetails()
    {
    	return lr.findAll();
    }
    public Optional<LoanApplicationModel> getDetails(int loanId)
	{
		return lr.findById(loanId);
	}
    public String updateDetails(LoanApplicationModel i,int loanId)
	{
		  LoanApplicationModel e = lr.findById(loanId).orElse(null);
		  if(e != null){
			  e.setLoanId(i.getLoanId());
		   e.setLoantype(i.getLoantype());
		   e.setApplicantName(i.getApplicantName());
		   e.setApplicantAddress(i.getApplicantAddress());
		   e.setApplicantMobile(i.getApplicantMobile());
		   e.setApplicantEmail(i.getApplicantEmail());
		   e.setApplicantAadhaar(i.getApplicantAadhaar());
		   e.setApplicantPan(i.getApplicantPan());
		   e.setApplicantSalary(i.getApplicantSalary());
		   e.setLoanAmountRequired(i.getLoanAmountRequired());
		   e.setLoanRepaymentMonths(i.getLoanRepaymentMonths());
		   lr.saveAndFlush(e);
		   
		   return "The details of the  LoanID was updated";
		  }
		  else{
		   return "The LoanID is not present in the database to update the value";
		  }
		 }
	public void deleteDetails(int loanId)
	{
		lr.deleteById(loanId);
   }
	public List<LoanApplicationModel> sortDescending(String field){	
		return lr.findAll(Sort.by(Direction.DESC, field));
	}
	public List<LoanApplicationModel> sortAscending(String field){	
		return lr.findAll(Sort.by(Direction.ASC, field));
	}

	public List<LoanApplicationModel> pagination(int pageNumber, int pageSize){
		Page<LoanApplicationModel> i = lr.findAll(PageRequest.of(pageNumber, pageSize));
		return i.getContent();
	}
	
	public List<LoanApplicationModel> paginationAndSorting(int pageNumber, int pageSize, String column_name){
		Page<LoanApplicationModel> i = lr.findAll(PageRequest.of(pageNumber, pageSize, Sort.by(column_name).descending()));
		return i.getContent();
	}

}