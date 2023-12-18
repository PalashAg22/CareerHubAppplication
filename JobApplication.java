package entity;

import java.time.LocalDate;

public class JobApplication {
private int ApplicationID;
private int JobID;
private int ApplicantID;
private LocalDate ApplicationDate;
private String CoverLetter;

public JobApplication() {
	
}

public JobApplication(int applicationID, int jobID, int applicantID, LocalDate applicationDate, String coverLetter) {
	
	this.ApplicationID = applicationID;
	this.JobID = jobID;
	this.ApplicantID = applicantID;
	this.ApplicationDate = applicationDate;
	this.CoverLetter = coverLetter;
}

public int getApplicationID() {
	return ApplicationID;
}

public void setApplicationID(int applicationID) {
	ApplicationID = applicationID;
}

public int getJobID() {
	return JobID;
}

public void setJobID(int jobID) {
	JobID = jobID;
}

public int getApplicantID() {
	return ApplicantID;
}

public void setApplicantID(int applicantID) {
	ApplicantID = applicantID;
}

public LocalDate getApplicationDate() {
	return ApplicationDate;
}

public void setApplicationDate(LocalDate applicationDate) {
	ApplicationDate = applicationDate;
}

public String getCoverLetter() {
	return CoverLetter;
}

public void setCoverLetter(String coverLetter) {
	CoverLetter = coverLetter;
}

@Override
public String toString() {
	return "JobApplication [ApplicationID=" + ApplicationID + ", JobID=" + JobID + ", ApplicantID=" + ApplicantID
			+ ", ApplicationDate=" + ApplicationDate + ", CoverLetter=" + CoverLetter + "] \n";
}


}
