package careerhub;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import dao.CareerHubServicesImpl;
import entity.Applicant;
import entity.Company;
import entity.JobApplication;
import entity.JobListing;

public class CareerHubApp {
static CareerHubServicesImpl serviceImpl = new CareerHubServicesImpl();
public static void main(String[] args)throws Exception {
	System.out.println("------------------------------\n");
	System.out.println("Welcome to Career hub App \n");
	System.out.println("-------------------------------\n\n");
	System.out.println("1.Get Job Listing");
	System.out.println("2.Get Companies");
	System.out.println("3.Get Applicants");
	System.out.println("4.Get Job Application");
	System.out.println("5.Insert a Company");
	System.out.println("6.Insert a Job List");
	System.out.println("7.Insert a Applicant");
	System.out.println("8.Insert a Job Application");
	Scanner scn = new Scanner(System.in);
	
	boolean flag = true;
	while(flag) {
		System.out.print("\n\n Please enter your choice -> [1-9] \n\n");
		System.out.println("[1].Get Job Listing");
		System.out.println("[2].Get Companies");
		System.out.println("[3].Get Applicants");
		System.out.println("[4].Get Job Application");
		System.out.println("[5].Insert a Company");
		System.out.println("[6].Insert a Job List");
		System.out.println("[7].Insert a Applicant");
		System.out.println("[8].Insert a Job Application");
		System.out.println("[9]. exit");
		
		int choice = scn.nextInt();
		
		switch(choice) {
		case 1: 
			System.out.println("All the available job listing are mentioned below: ");
			ArrayList<JobListing> joblist =  (ArrayList<JobListing>) serviceImpl.GetJobListings();
			System.out.println(joblist);
			break;
		case 2:
			System.out.println("All the available companies are mentioned below: ");
			ArrayList<Company> comp1 = (ArrayList<Company>) serviceImpl.GetCompanies();
			System.out.println(comp1);
			break;
		case 3:
			System.out.println("All the available Applicants are mentioned below: ");
			ArrayList<Applicant> appl = (ArrayList<Applicant>) serviceImpl.GetApplicants();
			System.out.println(appl);
			break;
		case 4:
			System.out.println("All the available Job applications are mentioned below: ");
			ArrayList<JobApplication> jobappl = (ArrayList<JobApplication>) serviceImpl.GetApplicationsForJob();
			System.out.println(jobappl);
			break;
		case 5:
			
			System.out.println("enter the company details");
			System.out.println("enter company id");
			int cid = scn.nextInt();
			System.out.println("enter company name");
			scn.nextLine();
			String comp2 = scn.nextLine();
			System.out.println("enter company location");
			//scn.nextLine();
			String loc = scn.nextLine();
			Company com = new Company(cid,comp2,loc);
			serviceImpl.InsertCompany(com);
			System.out.println("record inserted");
			break;
		case 6:
			System.out.println("Ener the job listing");
			
			System.out.println("Enter the job id ");
			int jljid = scn.nextInt();
			System.out.println("enter the company id");
			int jlcid = scn.nextInt();
			System.out.println("enter the title");
			scn.nextLine();
			String jltitle = scn.nextLine();
			System.out.println("enter the description");
			
			String jldes = scn.nextLine();
			
			System.out.println("enter the location");
			
			String jlloc = scn.nextLine();
			
			System.out.println("enter the salary");
			int jlsal = scn.nextInt();
			System.out.println("enter the job type");
			scn.nextLine();
			String jlt = scn.nextLine();
			System.out.println("enter the posted date in YYYY-MM-DD");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate napd = LocalDate.parse(scn.next(), formatter);
			JobListing jlist = new JobListing(jljid,jlcid,jltitle,jldes,jlloc,jlsal,jlt,napd);
			serviceImpl.InsertJobListing(jlist);
			System.out.println("record inserted successfully");
			break;
		case 7:
			System.out.println("enter the applicant id");
			int aid = scn.nextInt();
			scn.nextLine();
			System.out.println("enter the first name of applicant");
			//scn.nextLine();
			String afn = scn.nextLine();
			
			System.out.println("enter the last name of applicant");
			String aln = scn.nextLine();
			//scn.nextLine();
			System.out.println("enter the email of the applicant");
			String ae = scn.nextLine();
			//scn.nextLine();
			System.out.println("enter the phone number of the applicant");
			String aph = scn.nextLine();
			//scn.nextLine();
			System.out.println("upload the resume");
			String ar = scn.nextLine();
			//scn.nextLine();
			Applicant ap = new Applicant(aid,afn,aln,ae,aph,ar);
			serviceImpl.InsertApplicant(ap);
			System.out.println("record inserted");
			break;
		case 8:
			System.out.println("enter the job application id");
			int jaaid = scn.nextInt();
			System.out.println("enter the job id");
			int jajid = scn.nextInt();
			System.out.println("enter the applicant id");
			int japlid = scn.nextInt();
			System.out.println("upload the cv");
			scn.nextLine();
			String cv = scn.nextLine();
			
			System.out.println("enter the application date in yyyy-mm-dd");
			DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate napd1 = LocalDate.parse(scn.next(), formatter1);
			scn.nextLine();
			JobApplication jap = new JobApplication(jaaid,jajid,japlid,napd1,cv);
			serviceImpl.InsertJobApplication(jap);
			System.out.println("record inserted successfully");
			break;
		case 9:
			flag = false;
			System.out.println("exiting....");
			
			break;
		default :
			System.out.println("Please enter the values between 1 - 9");
			break;
		}
			
	}
}
}
