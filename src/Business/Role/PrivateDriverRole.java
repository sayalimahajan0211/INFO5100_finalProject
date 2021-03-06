/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Driver.AmbulanceDriver;
import Business.Driver.PrivateDriver;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PrivateDriverOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.PrivateDriverRole.PrivateDriverWorkAreaJPanel;

/**
 *
 * @author sayalimahajan
 */
public class PrivateDriverRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PrivateDriverWorkAreaJPanel(userProcessContainer, account, (PrivateDriverOrganization)organization, enterprise,business,(PrivateDriver)business.getPrivateDriverDirectory().getUserByUserName(account.getUsername()));
    }
    
}
