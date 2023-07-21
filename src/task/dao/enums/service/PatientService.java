package task.dao.enums.service;

import task.dao.enums.model.Patient;

import java.util.List;

public interface PatientService {

    List<Patient> addPatient(List<Patient> patients);

    Patient getPatientByfirstName(String name);//stream

    List<Patient> getAllPatients();

    void groupingByGender();//Stream

    List<Patient> filterByAge();//30 dan oido pasientter chyksyn
}
