/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business_Model;

import BusinessModel.Transport.TransportDirectory;
import BusinessModel.BookStore.BookStore;
import BusinessModel.Teacher.TeacherDirectory;
import BusinessModel.Fellowship.FellowshipDirectory;
import BusinessModel.Lab.Lab;
import BusinessModel.Student.StudentDirectory;
import BusinessModel.Inventory.Inventory;
import BusinessModel.PoliceDepartment.PoliceDepartment;
import BusinessModel.Roles.Role;
import BusinessModel.Roles.Administrator;
//import com.twilio.Twilio;
//import com.twilio.rest.api.v2010.account.Message;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author aniketbhore
 */
public class Ecosystem extends Organisation{
    private static Ecosystem business;
    private StudentDirectory studentDirectory;
    private TeacherDirectory teacherDirectory;
    private TransportDirectory transportDirectory;
    private BookStore bookStore;
    private Lab lab;
    private Inventory inventory;
    private FellowshipDirectory fellowshipDirectory;
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

    public StudentDirectory getStudentDirectory() {
        return studentDirectory = (studentDirectory == null) ? new StudentDirectory() : studentDirectory;
    }

    public void setPatientDirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

    

    public TeacherDirectory getTeacherDirectory() {
        return teacherDirectory = (teacherDirectory == null) ? new TeacherDirectory() : teacherDirectory;
    }

    public void setTeacherDirectory(TeacherDirectory teacherDirectory) {
        this.teacherDirectory = teacherDirectory;
    }

    public TransportDirectory getTransportDirectory() {
        return transportDirectory = (transportDirectory == null) ? new TransportDirectory() : transportDirectory;
    }

    public void setTransportDirectory(TransportDirectory transportDirectory) {
        this.transportDirectory = transportDirectory;
    }


    public BookStore getBookStore() {
        return bookStore = (bookStore == null) ? new BookStore() : bookStore;
    }

    public void setBookStore(BookStore bookStore) {
        this.bookStore = bookStore;
    }

    public Inventory getInventory() {
        return inventory = (inventory == null)? new Inventory() : inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Lab getLab() {
        return lab = (lab == null)? new Lab() : lab;
    }

    public void setLab(Lab lab) {
        this.lab = lab;
    }

    public FellowshipDirectory getFellowshipDirectory() {
        return fellowshipDirectory = (fellowshipDirectory == null)? new FellowshipDirectory() : fellowshipDirectory;
    }

    public void setFellowshipDirectory(FellowshipDirectory fellowshipDirectory) {
        this.fellowshipDirectory = fellowshipDirectory;
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
