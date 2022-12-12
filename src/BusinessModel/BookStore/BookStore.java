/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.BookStore;

import BusinessModel.Student.Student;
import java.util.ArrayList;

/**
 *
 * @author JANVI
 */
public class BookStore {
    private String StoreName;
    private String StoreAddress;
    private String StorePhone;
    private String StoreEmailAddress;
    private ArrayList<Student> bookRequestedStudents;
    ArrayList<BookStoreRecord> bookDetailsList;

    public BookStore() {
        bookRequestedStudents = new ArrayList<>();
        bookRequestedStudents = bookRequestedStudents == null ? new ArrayList<>() : bookRequestedStudents;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String StoreName) {
        this.StoreName = StoreName;
    }

    public String getStoreAddress() {
        return StoreAddress;
    }

    public void setStoreAddress(String StoreAddress) {
        this.StoreAddress = StoreAddress;
    }

    public String getStorePhone() {
        return StorePhone;
    }

    public void setStorePhone(String StorePhone) {
        this.StorePhone = StorePhone;
    }

    public String getStoreEmailAddress() {
        return StoreEmailAddress;
    }

    public void setStoreEmailAddress(String StoreEmailAddress) {
        this.StoreEmailAddress = StoreEmailAddress;
    }

    public ArrayList<Student> getBookRequestedStudents() {
        return bookRequestedStudents;
    }

    public void setBookRequestedStudents(ArrayList<Student> bookRequestedStudents) {
        this.bookRequestedStudents = bookRequestedStudents;
    }

    public ArrayList<BookStoreRecord> getBookDetailsList() {
        return bookDetailsList;
    }

    public void setBookDetailsList(ArrayList<BookStoreRecord> bookDetailsList) {
        this.bookDetailsList = bookDetailsList;
    }
    
    public void AddTreatedPatientList(Student patient)
    {
        bookRequestedStudents.add(patient);
    }
}
