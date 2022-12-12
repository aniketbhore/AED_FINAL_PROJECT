/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Fellowship;
import BusinessModel.Student.Student;
import java.util.ArrayList;
/**
 *
 * @author nehashende
 */
public class Fellowship {
    private String nameOfFellowship;
    private String address;
    private String number;
    private String emailId;
    private ArrayList<Student> labRecordsList;

    public String getNameOfFellowship() {
        return nameOfFellowship;
    }

    public void setNameOfFellowship(String nameOfFellowship) {
        this.nameOfFellowship = nameOfFellowship;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public ArrayList<Student> getLabRecordsList() {
        return labRecordsList;
    }

    public void setLabRecordsList(ArrayList<Student> labRecordsList) {
        this.labRecordsList = labRecordsList;
    }
    
    
}
