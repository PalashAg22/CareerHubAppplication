package entity;

public class Applicant {
private int ApplicantID;
private String FirstName;
private String LastName;
private String Email;
private String Phone;
private String Resume;

public Applicant() {
	
}

public Applicant(int applicantID, String firstName, String lastName, String email, String phone, String resume) {
	
	this.ApplicantID = applicantID;
	this.FirstName = firstName;
	this.LastName = lastName;
	this.Email = email;
	this.Phone = phone;
	this.Resume = resume;
}

public int getApplicantID() {
	return ApplicantID;
}

public void setApplicantID(int applicantID) {
	ApplicantID = applicantID;
}

public String getFirstName() {
	return FirstName;
}

public void setFirstName(String firstName) {
	FirstName = firstName;
}

public String getLastName() {
	return LastName;
}

public void setLastName(String lastName) {
	LastName = lastName;
}

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public String getPhone() {
	return Phone;
}

public void setPhone(String phone) {
	Phone = phone;
}

public String getResume() {
	return Resume;
}

public void setResume(String resume) {
	Resume = resume;
}

@Override
public String toString() {
	return "Applicant [ApplicantID=" + ApplicantID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email="
			+ Email + ", Phone=" + Phone + ", Resume=" + Resume + "] \n";
}

}
