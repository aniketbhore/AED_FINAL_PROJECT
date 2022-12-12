/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.ReceptionServices;
import BusinessModel.Student.Student;
import java.util.ArrayList;
/**
 *
 * @author aniketbhore
 */
public class Reception {
     private ArrayList<Student> patientRecord;

    public ArrayList<Student> getPatientRecord() {
        return patientRecord;
    }

    public void setPatientRecord(ArrayList<Student> patientRecord) {
        this.patientRecord = patientRecord;
    }
}
