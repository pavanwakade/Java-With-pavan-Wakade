package FIRST;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
private int rollno;
private String name;
private String address;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public int getRollno() 
{
	return rollno;
}

public void setRollno(int rollno) 
{
	this.rollno = rollno;
}

public String getName() 
{
	return name;
}

public void setName(String name) 
{
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
}
