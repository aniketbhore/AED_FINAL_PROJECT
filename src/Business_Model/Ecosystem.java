/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business_Model;

import BusinessModel.Doctor.DoctorDirectory;
import BusinessModel.Insurance.InsuranceDirectory;
import BusinessModel.Patient.PatientDirectory;
import java.util.ArrayList;
import javax.management.relation.Role;

/**
 *
 * @author aniketbhore
 */
public class Ecosystem extends Organisation{
    private static Ecosystem business;
    private PatientDirectory patientDirectory;
    private DoctorDirectory doctorDirectory;
    private AmbulanceDirectory ambulanceDirectory;
    private BloodBank bloodBank;
    private Lab lab;
    private Pharmacy pharmacy;
    private InsuranceDirectory insuranceDirectory;
    private PoliceDepartment policeRecords;
    
    public static Ecosystem getInstance()
    {
        if(business==null)
        {
            business=new Ecosystem();
        }
        
        return business;
    }

    public static Ecosystem getBusiness() {
        return business;
    }

    public static void setBusiness(Ecosystem business) {
        Ecosystem.business = business;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory = (patientDirectory == null) ? new PatientDirectory() : patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory = (doctorDirectory == null) ? new DoctorDirectory() : doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public AmbulanceDirectory getAmbulanceDirectory() {
        return ambulanceDirectory = (ambulanceDirectory == null) ? new AmbulanceDirectory() : ambulanceDirectory;
    }

    public void setAmbulanceDirectory(AmbulanceDirectory ambulanceDirectory) {
        this.ambulanceDirectory = ambulanceDirectory;
    }

    public BloodBank getBloodBank() {
        return bloodBank = (bloodBank == null) ? new BloodBank() : bloodBank;
    }

    public void setBloodBank(BloodBank bloodBank) {
        this.bloodBank = bloodBank;
    }

    public Lab getLab() {
        return lab = (lab == null)? new Lab() : lab;
    }

    public void setLab(Lab lab) {
        this.lab = lab;
    }

    public Pharmacy getPharmacy() {
        return pharmacy = (pharmacy == null)? new Pharmacy() : pharmacy;
    }

    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    public InsuranceDirectory getInsuranceDirectory() {
        return insuranceDirectory = (insuranceDirectory == null)? new InsuranceDirectory() : insuranceDirectory;
    }

    public void setInsuranceDirectory(InsuranceDirectory insuranceDirectory) {
        this.insuranceDirectory = insuranceDirectory;
    }

    public PoliceDepartment getPoliceRecords() {
        return policeRecords = (policeRecords == null)? new PoliceDepartment() : policeRecords;
    }

    public void setPoliceRecords(PoliceDepartment policeRecords) {
        this.policeRecords = policeRecords;
    }


    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<>();
        roleList.add(new Administrator());
        return roleList;
    }
    private Ecosystem()
    {
        super(null);
    }

    
    public boolean checkIfUserIsUnique(String userName)
    {
       return false;
    }
}
