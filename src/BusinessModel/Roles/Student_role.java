/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Roles;
import Business_Model.Ecosystem;
import BusinessModel.UserAccount.User;
import MainUserInterface.Student.StudentWorkAreaJPanel;
import javax.swing.JPanel;
/**
 *
 * @author aniketbhore
 */
public class Student_role extends Role{
    @Override
     public JPanel createWorkArea(JPanel userProcessContainer, User user, Ecosystem business) {
        return new StudentWorkAreaJPanel(userProcessContainer, user, business);
    }  
}
