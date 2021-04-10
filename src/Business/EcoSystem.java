/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Authorization.DriverAuthorizationAdmin;
import Business.Authorization.PatientAuthorizationAdmin;
import Business.Driver.AmbulanceDriverDirectory;
import Business.Driver.PrivateDriverDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.EnterpriseDirectory;
import Business.Hospital.HospitalDirectory;
import Business.Hospital.PatientCareStaffDirectory;
import Business.Hospital.PatientDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Voluntary.CampAdminDirectory;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private ArrayList<Network> networkList;
    private static EcoSystem business;
    private EnterpriseDirectory enterpriseDirectory;
    private OrganizationDirectory organizationDirectory;
    private DriverAuthorizationAdmin driverAuthorizationAdmin;
    private PatientAuthorizationAdmin patientAuthorizationAdmin;
    private HospitalDirectory hospitalDirectory;
    private AmbulanceDriverDirectory ambulanceDriverDirectory;
    private PrivateDriverDirectory privateDriverDirectory;
    private PatientDirectory patientDirectory;
    private CampAdminDirectory campAdminDirectory;
    private PatientCareStaffDirectory patientCareStaffDirectory;
            
    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public DriverAuthorizationAdmin getDriverAuthorizationAdmin() {
        return driverAuthorizationAdmin;
    }

    public void setDriverAuthorizationAdmin(DriverAuthorizationAdmin driverAuthorizationAdmin) {
        this.driverAuthorizationAdmin = driverAuthorizationAdmin;
    }

    public PatientAuthorizationAdmin getPatientAuthorizationAdmin() {
        return patientAuthorizationAdmin;
    }

    public void setPatientAuthorizationAdmin(PatientAuthorizationAdmin patientAuthorizationAdmin) {
        this.patientAuthorizationAdmin = patientAuthorizationAdmin;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public AmbulanceDriverDirectory getAmbulanceDriverDirectory() {
        return ambulanceDriverDirectory;
    }

    public void setAmbulanceDriverDirectory(AmbulanceDriverDirectory ambulanceDriverDirectory) {
        this.ambulanceDriverDirectory = ambulanceDriverDirectory;
    }

    public PrivateDriverDirectory getPrivateDriverDirectory() {
        return privateDriverDirectory;
    }

    public void setPrivateDriverDirectory(PrivateDriverDirectory privateDriverDirectory) {
        this.privateDriverDirectory = privateDriverDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    

    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
     public static void setInstance(EcoSystem system) {
        business = system;
    }

    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
        enterpriseDirectory=new EnterpriseDirectory();
        organizationDirectory=new OrganizationDirectory();
        driverAuthorizationAdmin=new DriverAuthorizationAdmin();
        patientAuthorizationAdmin=new PatientAuthorizationAdmin();
        hospitalDirectory=new HospitalDirectory();
        ambulanceDriverDirectory=new AmbulanceDriverDirectory();
        privateDriverDirectory=new PrivateDriverDirectory();
        patientDirectory=new PatientDirectory();
        campAdminDirectory=new CampAdminDirectory();
        patientCareStaffDirectory=new PatientCareStaffDirectory();
        
    }

    public CampAdminDirectory getCampAdminDirectory() {
        return campAdminDirectory;
    }

    public void setCampAdminDirectory(CampAdminDirectory campAdminDirectory) {
        this.campAdminDirectory = campAdminDirectory;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
    
    
     public static boolean isNameValid(String text) {
        String regex = "^[a-zA-Z].*[\\s\\.]*$";
        return text.matches(regex);
    }

    /**
     *
     * @param text
     * @return Valid between 3-30 characters, only alphabets
     */
    public static boolean isUserNameValid(String text) {
        String regex = "^[A-Za-z]\\w{2,29}$";
        return text.matches(regex);
    }

    /**
     *
     * @param text
     * @return Valid between 3-20 characters. Lower case, upper case, digit and
     * a special character should occur once.
     */
    public static boolean isPasswordValid(String text) {
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{2,20}$";
        return text.matches(regex);
    }

    public static boolean isEmailAddressValid(String text) {
        Pattern regex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        return regex.matcher(text).matches();
    }

    /**
     *
     * @param text
     * @return Valid formats: 1) 12345 2) 12345-6789 3) 12345 6789
     */
    public static boolean isZipCodeValid(String text) {
        String regex = "^\\d{5}(?:[-\\s]\\d{4})?$";
        return text.matches(regex);
    }

    /**
     *
     * @param text
     * @return valid format 123-456-7890 OR 123.456.7890 OR 123 456 7890
     */
    public static boolean isPhoneNumberValid(String text) {
        Pattern regex = Pattern.compile("^(\\d{3}[- .]?){2}\\d{4}$");
        return regex.matcher(text).matches();
    }
}
