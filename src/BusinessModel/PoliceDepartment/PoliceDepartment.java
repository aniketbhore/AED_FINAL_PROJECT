/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.PoliceDepartment;
import BusinessModel.Student.Student;
import java.util.ArrayList;
/**
 *
 * @author aniketbhore
 */
public class PoliceDepartment {
    private String departmentName;
    private String userName;
    private String address;
    private ArrayList<Student> policeRecordsList;

    public PoliceDepartment() {
        policeRecordsList = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Student> getPoliceRecordsList() {
        return policeRecordsList;
    }

    public void setPoliceRecordsList(ArrayList<Student> policeRecordsList) {
        this.policeRecordsList = policeRecordsList;
    }
    public void addtoRecord(Student patient)
    {
      /*  for(Student p:labRecordsList){
        if(!labRecordsList.contains(patient)){
        labRecordsList.add(patient);
        }
        else if(p==patient && p.getPharmaStatus().equals("Delivered")){
        labRecordsList.add(p);
        }
        }*/
        policeRecordsList.add(patient);
    }
}
