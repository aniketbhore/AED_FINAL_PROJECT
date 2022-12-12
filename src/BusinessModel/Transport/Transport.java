/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Transport;
import BusinessModel.Student.Student;
import java.util.ArrayList;
/**
 *
 * @author aniketbhore
 */
public class Transport {
    private String driverFirstName;
    private String driverLastName;
    private String vehicleNo;
    private String driverPhoneNo;
    private String Status;
    private int driverAge;
    private String pickupLocation;
    private ArrayList<Student> transportStudentsList;
    
    public Transport()
    {
         this.transportStudentsList = new ArrayList<Student>();
    }

    public String getDriverFirstName() {
        return driverFirstName;
    }

    public void setDriverFirstName(String driverFirstName) {
        this.driverFirstName = driverFirstName;
    }

    public String getDriverLastName() {
        return driverLastName;
    }

    public void setDriverLastName(String driverLastName) {
        this.driverLastName = driverLastName;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getDriverPhoneNo() {
        return driverPhoneNo;
    }

    public void setDriverPhoneNo(String driverPhoneNo) {
        this.driverPhoneNo = driverPhoneNo;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(int driverAge) {
        this.driverAge = driverAge;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public ArrayList<Student> getBusStudentsList() {
        return transportStudentsList;
    }

    public void setBusStudentsList(ArrayList<Student> busStudentsList) {
        this.transportStudentsList = busStudentsList;
    }
    
    
    
    @Override
    public String toString() {
        return driverFirstName;
    }
}
