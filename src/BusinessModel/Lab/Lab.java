/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Lab;
import BusinessModel.Student.Student;
import java.util.ArrayList;
/**
 *
 * @author aniketbhore
 */
public class Lab {
    private String lab;
    private String email;
    private ArrayList<Tests> testList;
    private ArrayList<Student> labRecordsList;

    public Lab() {
        testList = new ArrayList<>();
        labRecordsList = new ArrayList<>();
    }
    public void AddTreatedPatientList(Student patient)
    {
      /*  for(Student p:labRecordsList){
        if(!labRecordsList.contains(patient)){
        labRecordsList.add(patient);
        }
        else if(p==patient && p.getPharmaStatus().equals("Delivered")){
        labRecordsList.add(p);
        }
        }*/
        labRecordsList.add(patient);
    }
    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Tests> getTestList() {
        return testList;
    }

    public void setTestList(ArrayList<Tests> testList) {
        this.testList = testList;
    }

    public ArrayList<Student> getLabRecordsList() {
        return labRecordsList;
    }

    public void setLabRecordsList(ArrayList<Student> labRecordsList) {
        this.labRecordsList = labRecordsList;
    }
        public Tests createTest(Tests t) {
        //Tests bloodRecord = new Tests();
        testList.add(t);
        return t;
    }
    public void deleteTests(Tests p){
        testList.remove(p);
    }
    public void updateTests(Tests t,String name,String username, int password){
       
        t.setTestName(name);
        t.setUsage(username);
        t.setPrice(password);
    }
    
}
