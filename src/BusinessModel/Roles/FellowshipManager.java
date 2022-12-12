/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Roles;
import Business_Model.Ecosystem;
import javax.swing.JPanel;
import BusinessModel.UserAccount.User;
import MainUserInterface.FellowshipAuthority.FellowshipWorkAreaJPanel;
/**
 *
 * @author aniketbhore
 */
public class FellowshipManager extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User user, Ecosystem business)
    {
        return new FellowshipWorkAreaJPanel(userProcessContainer, user, business);
    }
}
