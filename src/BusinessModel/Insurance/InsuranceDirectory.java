/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Insurance;
import BusinessModel.Patient.Patient;
import java.util.ArrayList;
/**
 *
 * @author nehashende
 */
public class InsuranceDirectory {
    public InsuranceDirectory() {
        insuranceRecord = new ArrayList<>();
    }
    
    private ArrayList<Patient> insuranceRecord; 

    public ArrayList<Patient> getInsuranceRecord() {
        return insuranceRecord;
    }

    public void setInsuranceRecord(ArrayList<Patient> insuranceRecord) {
        this.insuranceRecord = insuranceRecord;
    }
public void addServedCustomers(Patient patient)
    {
        insuranceRecord.add(patient);
    }
}
