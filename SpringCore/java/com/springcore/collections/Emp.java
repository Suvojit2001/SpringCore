package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
  private String employeeName;
  private List<String> phn;
  private Set<String> address;
  private Map<String, String> course;
  private Properties props;
public Properties getProps() {
	return props;
}
public void setProps(Properties props) {
	this.props = props;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public List<String> getPhn() {
	return phn;
}
public void setPhn(List<String> phn) {
	this.phn = phn;
}
public Set<String> getAddress() {
	return address;
}
public void setAddress(Set<String> address) {
	this.address = address;
}
public Map<String, String> getCourse() {
	return course;
}
public void setCourse(Map<String, String> course) {
	this.course = course;
}

@Override
public String toString() {
	return "Emp [employeeName=" + employeeName + ", phn=" + phn + ", address=" + address + ", course=" + course
			+ ", props=" + props + "]";
}
public Emp(String employeeName, List<String> phn, Set<String> address, Map<String, String> course, Properties props) {
	super();
	this.employeeName = employeeName;
	this.phn = phn;
	this.address = address;
	this.course = course;
	this.props = props;
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

}
