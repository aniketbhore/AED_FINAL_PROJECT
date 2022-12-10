/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Patient;

import java.util.ArrayList;

/**
 *
 * @author nehashende
 */
public class PatientDirectory {
    //private PatientBills bill;
    private ArrayList<Patient> patients;
    
//     public PatientBills AddBill(Patient patient,String ItemName,String Org,String amount){
//        
//        bill = new PatientBills(ItemName, Org, (float) 800);
//        patient.addbill(bill);
//        return bill;
//    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }
     public void deletePatient(Patient p){
        patients.remove(p);
    }
     public PatientDirectory()
     {
         patients = new ArrayList<>();
     }
     
      public Patient createPatient(Patient patient) {
        patients.add(patient);
        return patient;
    }
//    public float billTotal(Patient patient){
//         float billTotal = patient.totalBill();
//         return billTotal;
//    }
}
