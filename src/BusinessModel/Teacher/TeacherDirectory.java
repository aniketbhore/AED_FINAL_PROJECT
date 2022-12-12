/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Teacher;
import BusinessModel.Student.Student;
import java.util.ArrayList;
/**
 *
 * @author nehashende
 */
public class TeacherDirectory {
    private ArrayList<Teacher> teachers;
    
    public TeacherDirectory() {
        teachers = new ArrayList<Teacher>();
    }
    
    public Teacher createTeacher(Teacher teacher) {
        Teacher t = new Teacher(teacher.gettUserName());
        teachers.add(teacher);
        return t;
    }

    public void deleteTeacher(Teacher t) {
        teachers.remove(t);
    }

    public Teacher AddStudent(Teacher teacher, Student patient) {
        System.out.println("teacher existing students--"+teacher.getTreatedPatientList());
        teacher.getTreatedPatientList().add(patient);
        return teacher;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }
}
