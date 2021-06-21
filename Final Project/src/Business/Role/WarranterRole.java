/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SellerOrganization;
import Business.Organization.WarranterOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.BuyerRole.BuyerWorkAreaJPanel2;
import ui.WarranterRole.WarranterWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class WarranterRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new WarranterWorkAreaJPanel(userProcessContainer, account, (WarranterOrganization)organization, enterprise);
    }
    
}
