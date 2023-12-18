package dao;

import java.sql.SQLException;
import java.util.List;

import entity.Applicant;
import entity.Company;
import entity.JobApplication;
import entity.JobListing;
import exception.CompanyIsPresentException;

public interface ICareerHubServices {
	void InsertJobListing(JobListing jobListing);
	void InsertCompany (Company company) throws SQLException, CompanyIsPresentException;
	void InsertApplicant(Applicant applicant);
	void InsertJobApplication(JobApplication jobApplication);
	List<JobListing> GetJobListings();
	List<Company> GetCompanies();
	List<Applicant> GetApplicants();
	List<JobApplication> GetApplicationsForJob (); 
}
