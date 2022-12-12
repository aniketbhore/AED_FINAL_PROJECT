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
public class FellowshipDirectory {
    public FellowshipDirectory() {
        fellowshipRecord = new ArrayList<>();
    }
    
    private ArrayList<Student> fellowshipRecord; 

    public ArrayList<Student> getFellowshipRecord() {
        return fellowshipRecord;
    }

    public void setFellowshipRecord(ArrayList<Student> fellowshipRecord) {
        this.fellowshipRecord = fellowshipRecord;
    }

public void addServedCustomers(Student stud)
    {
        fellowshipRecord.add(stud);
    }
}
