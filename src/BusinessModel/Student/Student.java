/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Student;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author nehashende
 */
public class Student {
    private String sUserName;
    private String sFirstName;
    private String sLastName;
    private String sGender;
    private String sImageUrl;
    private int sAge;
    private Date sdob;
    private String sAddress;
    private String sEmailAddress;
    private String sPhoneNo;
    private String sFellowshipID;
    private String sBloodType;
    private String sStudentType;
    private Date sDateOfAdmit;
    private String sPickupLocation;
    private String sStatus;
    private String sBooksQuantity;
    private String sFellowshipStatus;
    private String sLabStatus;
    private String sInventoryStatus;
    private String sBookStoreStatus;
    private String sPoliceStatus;
    private boolean sIsConcentFormSigned;
    private ArrayList<StudentBills> sBills;

    public Student() {
    }

    public Student(String sUserName) {
        this.sUserName = sUserName;
    }

    public String getsUserName() {
        return sUserName;
    }

    public void setsUserName(String sUserName) {
        this.sUserName = sUserName;
    }

    public String getsFirstName() {
        return sFirstName;
    }

    public void setsFirstName(String sFirstName) {
        this.sFirstName = sFirstName;
    }

    public String getsLastName() {
        return sLastName;
    }

    public void setsLastName(String sLastName) {
        this.sLastName = sLastName;
    }

    public String getsGender() {
        return sGender;
    }

    public void setsGender(String sGender) {
        this.sGender = sGender;
    }

    public String getsImageUrl() {
        return sImageUrl;
    }

    public void setsImageUrl(String sImageUrl) {
        this.sImageUrl = sImageUrl;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    public Date getsdob() {
        return sdob;
    }

    public void setsdob(Date pdob) {
        this.sdob = pdob;
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getsEmailAddress() {
        return sEmailAddress;
    }

    public void setsEmailAddress(String sEmailAddress) {
        this.sEmailAddress = sEmailAddress;
    }

    public String getsPhoneNo() {
        return sPhoneNo;
    }

    public void setsPhoneNo(String sPhoneNo) {
        this.sPhoneNo = sPhoneNo;
    }

    public String getsFellowshipID() {
        return sFellowshipID;
    }

    public void setsFellowshipID(String sFellowshipID) {
        this.sFellowshipID = sFellowshipID;
    }

    public String getsBloodType() {
        return sBloodType;
    }

    public void setsBloodType(String sBloodType) {
        this.sBloodType = sBloodType;
    }

    public String getsStudentType() {
        return sStudentType;
    }

    public void setsStudentType(String sStudentType) {
        this.sStudentType = sStudentType;
    }

    public Date getsDateOfAdmit() {
        return sDateOfAdmit;
    }

    public void setsDateOfAdmit(Date sDateOfAdmit) {
        this.sDateOfAdmit = sDateOfAdmit;
    }

    public String getsPickupLocation() {
        return sPickupLocation;
    }

    public void setsPickupLocation(String sPickupLocation) {
        this.sPickupLocation = sPickupLocation;
    }

    public String getsStatus() {
        return sStatus;
    }

    public void setsStatus(String sStatus) {
        this.sStatus = sStatus;
    }

    public String getsBooksQuantity() {
        return sBooksQuantity;
    }

    public void setsBooksQuantity(String sBooksQuantity) {
        this.sBooksQuantity = sBooksQuantity;
    }

    public String getsFellowshipStatus() {
        return sFellowshipStatus;
    }

    public void setsFellowshipStatus(String sFellowshipStatus) {
        this.sFellowshipStatus = sFellowshipStatus;
    }

    public String getsLabStatus() {
        return sLabStatus;
    }

    public void setsLabStatus(String sLabStatus) {
        this.sLabStatus = sLabStatus;
    }

    public String getsInventoryStatus() {
        return sInventoryStatus;
    }

    public void setsInventoryStatus(String sInventoryStatus) {
        this.sInventoryStatus = sInventoryStatus;
    }

    public String getsBookStoreStatus() {
        return sBookStoreStatus;
    }

    public void setsBookStoreStatus(String sBookStoreStatus) {
        this.sBookStoreStatus = sBookStoreStatus;
    }

    public String getsPoliceStatus() {
        return sPoliceStatus;
    }

    public void setsPoliceStatus(String sPoliceStatus) {
        this.sPoliceStatus = sPoliceStatus;
    }

    public boolean issIsConcentFormSigned() {
        return sIsConcentFormSigned;
    }

    public void setsIsConcentFormSigned(boolean sIsConcentFormSigned) {
        this.sIsConcentFormSigned = sIsConcentFormSigned;
    }

    public ArrayList<StudentBills> getsBills() {
        return sBills;
    }

    public void setsBills(ArrayList<StudentBills> sBills) {
        this.sBills = sBills;
    }
    public void addbill(StudentBills bill){
        sBills.add(bill);
    } 
     public float totalBill() {
        float total =0;
           for(StudentBills b:sBills){
               total =  total + b.getAmount();
        }
        return total;
    }
    
}
