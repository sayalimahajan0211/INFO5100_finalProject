/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Voluntary;

import java.util.ArrayList;

/**
 *
 * @author aishwarya
 */
public class CampAdminDirectory {

    private ArrayList<CampAdmin> campadminList;

    public ArrayList<CampAdmin> getCampadminList() {
        return campadminList;
    }

    public CampAdminDirectory() {
        this.campadminList = new ArrayList<CampAdmin>();
    }

    public void setCampadminList(ArrayList<CampAdmin> campadminList) {
        this.campadminList = campadminList;
    }

    public CampAdmin addCampAdmin(CampAdmin campadmin) {
        campadmin.setId(generateID());
        this.campadminList.add(campadmin);
        return campadmin;
    }

    public void removeCampAdmin(CampAdmin campadmin) {
        campadminList.remove(campadmin);
    }

    public CampAdmin getCampAdminByName(String name) {
        for (CampAdmin campadmin : campadminList) {
            if (campadmin.getName().equals(name)) {
                return campadmin;
            }
        }
        return null;
    }

    public CampAdmin getCampAdminByUserName(String uname) {
        for (CampAdmin campadmin : campadminList) {
            if (campadmin.getUserName().equals(uname)) {
                return campadmin;
            }
        }
        return null;
    }

    public String generateID() {
        return "camp"+campadminList.size() + 1;
    }

    public CampAdmin findCampByID(String id) {
        for (CampAdmin ca : campadminList) {
            if (ca.getId().equalsIgnoreCase(id)) {
                return ca;
            }
        }
        return null;
    }
}
