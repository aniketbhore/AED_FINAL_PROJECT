/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Roles;

import BusinessModel.UserAccount.User;
import Business_Model.Ecosystem;
import MainUserInterface.Police.PoliceWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author aniketbhore
 */
public class Police extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User user, Ecosystem business) {
        return new PoliceWorkAreaJPanel(userProcessContainer, user, business);
    }
}
