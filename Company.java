package entity;

public class Company {
private int CompanyID;
private String CompanyName;
private String Location;
public Company() {
	
}
public Company(int companyID, String companyName, String location) {
	
	this.CompanyID = companyID;
	this.CompanyName = companyName;
	this.Location = location;
}
public int getCompanyID() {
	return CompanyID;
}
public void setCompanyID(int companyID) {
	CompanyID = companyID;
}
public String getCompanyName() {
	return CompanyName;
}
public void setCompanyName(String companyName) {
	CompanyName = companyName;
}
public String getLocation() {
	return Location;
}
public void setLocation(String location) {
	Location = location;
}
@Override
public String toString() {
	return "Company [CompanyID=" + CompanyID + ", CompanyName=" + CompanyName + ", Location=" + Location + "] \n";
}

}
