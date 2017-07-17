/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.PatientRole.PatientWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Pamnani
 */
public class PatientRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
    return new PatientWorkAreaJPanel(userProcessContainer,account,(PatientOrganization)organization,enterprise);    
    }
    
}