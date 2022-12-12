/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Teacher;

import BusinessModel.Student.Student;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nehashende
 */
public class Teacher {
    private String tUserName;
    private String tPassword;
    private String tFirstName;
    private String tLastName;
    private String tGender;
    private int tAge;
    private Date tDOB;
    private String tPhoneNumber;
    private String tEmail;
    private String tAddress;
    private String tWorkID;
    private String tSpecialization;
    private String tExperience;
    private String tImageUrl;
    private ArrayList<Student> treatedPatientList;
    
    public Teacher() {
    
    }
     
    public Teacher(String dUserName) {
        this.tUserName = dUserName;
        this.treatedPatientList = new ArrayList<Student>();
    }
    public ArrayList<Student> getTreatedPatientList() {
        return treatedPatientList;
    }

    public String gettUserName() {
        return tUserName;
    }

    public void settUserName(String tUserName) {
        this.tUserName = tUserName;
    }

    public String gettPassword() {
        return tPassword;
    }

    public void settPassword(String tPassword) {
        this.tPassword = tPassword;
    }

    public String gettFirstName() {
        return tFirstName;
    }

    public void settFirstName(String tFirstName) {
        this.tFirstName = tFirstName;
    }

    public String gettLastName() {
        return tLastName;
    }

    public void settLastName(String tLastName) {
        this.tLastName = tLastName;
    }

    public String gettGender() {
        return tGender;
    }

    public void settGender(String tGender) {
        this.tGender = tGender;
    }

    public int gettAge() {
        return tAge;
    }

    public void settAge(int tAge) {
        this.tAge = tAge;
    }

    public Date gettDOB() {
        return tDOB;
    }

    public void settDOB(Date tDOB) {
        this.tDOB = tDOB;
    }

    public String gettPhoneNumber() {
        return tPhoneNumber;
    }

    public void settPhoneNumber(String tPhoneNumber) {
        this.tPhoneNumber = tPhoneNumber;
    }

    public String gettEmail() {
        return tEmail;
    }

    public void settEmail(String tEmail) {
        this.tEmail = tEmail;
    }

    public String gettAddress() {
        return tAddress;
    }

    public void settAddress(String tAddress) {
        this.tAddress = tAddress;
    }

    public String gettWorkID() {
        return tWorkID;
    }

    public void settWorkID(String tWorkID) {
        this.tWorkID = tWorkID;
    }

    public String gettSpecialization() {
        return tSpecialization;
    }

    public void settSpecialization(String tSpecialization) {
        this.tSpecialization = tSpecialization;
    }

    public String gettExperience() {
        return tExperience;
    }

    public void settExperience(String tExperience) {
        this.tExperience = tExperience;
    }

    public String gettImageUrl() {
        return tImageUrl;
    }

    public void settImageUrl(String tImageUrl) {
        this.tImageUrl = tImageUrl;
    }

   
    
    @Override
    public String toString() {
        return tFirstName;
    }
}
