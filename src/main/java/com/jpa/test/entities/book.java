package com.jpa.test.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Booking")
public class book 
{
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  int id;
  @Column(name="name")
  String name;
   @Column(name="email")
  String email;
   @Column(name="dob")
  String dob;
   @Column(name="gender")
  String gender;
   @Column(name="bloodgroup")
  String blood;
   @Column(name="phoneno")
  String phno;
   @Column(name="addrs")
  String addrs;
   @Column(name="desease")
  String desease;
   @Column(name="descp")
  String descp;
   String bookuser;
   String status;
   public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getBookuser() {
	return bookuser;
}
public void setBookuser(String bookuser) {
	this.bookuser = bookuser;
}
public int getId() {
      return id;
    }
    public void setId(int id) {
      this.id = id;
    }
    public String getAddrs() {
      return addrs;
    }
    public void setAddrs(String addrs) {
      this.addrs = addrs;
    }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getDob() {
    return dob;
  }
  public void setDob(String dob) {
    this.dob = dob;
  }
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }
  public String getBlood() {
    return blood;
  }
  public void setBlood(String blood) {
    this.blood = blood;
  }
  public String getPhno() {
    return phno;
  }
  public void setPhno(String phno) {
    this.phno = phno;
  }
  public String getAddress() {
    return addrs;
  }
  public void setAddress(String address) {
    this.addrs = address;
  }
  public String getDesease() {
    return desease;
  }
  public void setDesease(String desease) {
    this.desease = desease;
  }
  public String getDescp() {
    return descp;
  }
  public void setDescp(String descp) {
    this.descp = descp;
  }
  
  /*public book(int id, String addrs, String blood, String descp, String desease, String dob, String email, String gender,
      String name, String phno) {
    super();
    this.id = id;
    this.name = name;
    this.email = email;
    this.dob = dob;
    this.gender = gender;
    this.blood = blood;
    this.phno = phno;
    this.addrs = addrs;
    this.desease = desease;
    this.descp = descp;
  }*/
  
}