/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Roles;
import Business_Model.Ecosystem;
import BusinessModel.UserAccount.User;
import MainUserInterface.Ambulance.DisplayAmbulancePatientJPanel;
import javax.swing.JPanel;
/**
 *
 * @author aniketbhore
 */
public class AmbulanceDriver extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User user, Ecosystem business) {
        return new DisplayAmbulancePatientJPanel(userProcessContainer, user, business);
    }
}
