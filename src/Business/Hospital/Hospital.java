/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Driver.AmbulanceDriver;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Yash
 */
public class Hospital {
   
    
    private String name;
    private String phonenumber;
    private String streetaddress;
    private String city;
    private String zipcode;
    private String email;
    private String username;
    private String password;
    private int bedcount;
    private List<Patient> Patient;
    private String hospitalID;
    private int requestcount=0;


 
    public Hospital(){
        this.Patient = new ArrayList<Patient>();
    }

    public Patient addPatient(Patient patient){
      
        Patient.add(patient);
        return patient;
    }
    
    public void removePatient(Patient patient){
        Patient.remove(patient);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }


     public String getStreetaddress() {
        return streetaddress;
    }

    public void setStreetaddress(String streetaddress) {
        this.streetaddress = streetaddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getBedcount() {
        return bedcount;
    }

    public void setBedcount(int bedcount) {
        this.bedcount = bedcount;
    }

    public List<Patient> getPatientlist() {
        return Patient;
    }

    public void setPatientlist(List<Patient> Patient) {
        this.Patient = Patient;
    }


    public List<Patient> getPatient() {
        return Patient;
    }

    public void setPatient(List<Patient> Patient) {
        this.Patient = Patient;
    }

    public int getRequestcount() {
        return requestcount;
    }

    public void setRequestcount(int requestcount) {
        this.requestcount = requestcount;
    }

    public String getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(String hospitalID) {
        this.hospitalID = hospitalID;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + Objects.hashCode(this.username);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hospital other = (Hospital) obj;
        return true;
    }

  
    
    
    
}
