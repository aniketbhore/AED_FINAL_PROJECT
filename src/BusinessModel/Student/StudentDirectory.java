/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Student;

import java.util.ArrayList;

/**
 *
 * @author nehashende
 */
public class StudentDirectory {
    private StudentBills bill;
    private ArrayList<Student> students;
    
     public StudentBills AddBill(Student student,String ItemName,String Org,String amount){
        
        bill = new StudentBills(ItemName, Org, (float) 800);
        student.addbill(bill);
        return bill;
    }
    public ArrayList<Student> getStudentList() {
        return students;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.students = studentList;
    }
    public void deleteStudent(Student s){
        students.remove(s);
    }
     public StudentDirectory()
     {
         students = new ArrayList<>();
     }
     
      public Student createStudent(Student student) {
        students.add(student);
        return student;
    }
    public float billTotal(Student student){
         float billTotal = student.totalBill();
         return billTotal;
    }
}
