package com.example.springdemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.springdemo.model.LoanApplicationModel;
import com.example.springdemo.service.LoanApplicationService;

@RestController
public class LoanApplicationController {
	
	@Autowired
	LoanApplicationService ls;
	//LoanApplication
	@PostMapping("/loan/save")
	public LoanApplicationModel saveinfo(@RequestBody LoanApplicationModel l)
	{
		return ls.createnew(l);
	}
	@GetMapping("/loan/getall")
	public List<LoanApplicationModel> getloan()
	{
		return ls.getloandetails();
	}
	@GetMapping(value = "/loan/get/{loanId}")
	public Optional<LoanApplicationModel> getDetails(@PathVariable int loanId)
	{
		return ls.getDetails(loanId);
	}
	@PutMapping(value = "/loan/updatedetails/{loanId}")
	public String updateDetailsById(@RequestBody LoanApplicationModel em,@PathVariable("loanId") int loanId)
	{
		return ls.updateDetails(em,loanId);
	}
	@DeleteMapping(value = "/loan/deleteDetails/{loanId}")
	public String deleteDetails(@PathVariable int loanId)
	{
		ls.deleteDetails(loanId);
		return "LoanApplication with ID " + loanId + " is deleted"; 
	}
	@GetMapping(value = "/sort/desc/{column_value}")
	public List<LoanApplicationModel> descendingOrder(@PathVariable(value = "column_value") String column_value){
		return ls.sortDescending(column_value);
	}
	
	@GetMapping(value = "/sort/asc/{columnvalue}")
	public List<LoanApplicationModel> ascendingOrder(@PathVariable(value = "name") String columnvalue){
		return ls.sortAscending(columnvalue);
	}
	
	@GetMapping(value = "/pagination/{offset}/{psize}")
	public List<LoanApplicationModel> pagination(@PathVariable(value = "offset") int offset, @PathVariable(value = "psize") int psize){
		return ls.pagination(offset, psize);
	}
	
	@GetMapping(value = "/pands/{offset}/{psize}/{column_value}")
	public List<LoanApplicationModel> paginationData(@PathVariable(value = "offset") int offset, @PathVariable(value = "psize") int psize, @PathVariable(value = "column_value") String column_value){
		return ls.paginationAndSorting(offset, psize, column_value);
	}
	
}