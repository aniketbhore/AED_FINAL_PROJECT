/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Inventory;

import BusinessModel.Student.Student;
import java.util.ArrayList;

/**
 *
 * @author JANVI
 */
public class Inventory {
    private String deptName;
    private String email;
    private String address;
    private ArrayList<Item> itemList;
    private ArrayList<Student> inventoryRecordList;
    public void AddpharmaRecordList(Student stud)
    {
        inventoryRecordList.add(stud);
    }
    public Inventory() {
        itemList = new ArrayList<>();
        inventoryRecordList = new ArrayList<>();        
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    public ArrayList<Student> getInventoryRecordList() {
        return inventoryRecordList;
    }

    public void setInventoryRecordList(ArrayList<Student> inventoryRecordList) {
        this.inventoryRecordList = inventoryRecordList;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Item createItem(Item i) {
       
        itemList.add(i);
        return i;
    }
    public void deleteItem(Item i){
        itemList.remove(i);
    }
        public void updateItems(Item i,String name,String username, int password,int q){
       
        i.setItemName(name);
        i.setUsage(username);
        i.setPrice(password);
        i.setQuantity(q);
    }
}
