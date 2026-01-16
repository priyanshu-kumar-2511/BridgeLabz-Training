package hospitalqueue;

import java.util.*;
public class HospitalQueue {
	private List<Patient> patients = new ArrayList<>();
	
	public void addPatient(String patientName, int patientCriticality) {
		patients.add(new Patient(patientName, patientCriticality));
		System.out.println("Patient added");
	}
	
	public void sortByCriticality() {
		int numberOfPatients = patients.size();

        for(int i=0; i<numberOfPatients-1; i++) {
        	boolean swapped = false;
        	for(int j=0; j<numberOfPatients-1; j++) {
        		if(patients.get(j).patientCriticality < patients.get(j+1).patientCriticality) {
        			Patient temp = patients.get(j);
        			patients.set(j,  patients.get(j+1));
        			patients.set(j + 1, temp);
                    swapped = true;
        		}
        	}
        	
        	if(!swapped)
        		break;
        }
        
        System.out.println("Patients sorted by criticality");
    }
        	
    public void showQueue() {
        if(patients.isEmpty()) {
        	System.out.println("No Patients in ER");
        	return;
        }
        System.out.println("\nER Patient Queue (High → Low):");
        for (Patient p : patients) {
            System.out.println(p.patientName + " | Criticality: " + p.patientCriticality);
        }
	}
}
