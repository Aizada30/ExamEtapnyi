package task.dao.enums.service.serviceIMPL;

import task.dao.enums.DateBase;
import task.dao.enums.Gender;
import task.dao.enums.model.Patient;
import task.dao.enums.service.PatientService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PatientImpl implements PatientService {

    private DateBase dateBase;

    public PatientImpl(DateBase dateBase) {
        this.dateBase = dateBase;
    }

    @Override
    public List<Patient> addPatient(List<Patient> patients) {
          dateBase.getPatientList().addAll(patients);
        return dateBase.getPatientList();
    }

    @Override
    public Patient getPatientByfirstName(String name) {
        dateBase.getPatientList().stream().filter(pat->pat.getFirstName().equalsIgnoreCase(name)).toList().forEach(System.out::println);
        return null;
    }

    @Override
    public List<Patient> getAllPatients() {
        return dateBase.getPatientList();
    }

    @Override
    public void groupingByGender() {
        Map<Gender, List<Patient>> collect = dateBase.getPatientList().stream().collect(Collectors.groupingBy(Patient::getGender));

    }

    @Override
    public List<Patient> filterByAge() {
        dateBase.getPatientList().stream().filter(patient -> patient.getAge()>30).toList().forEach(System.out::println);
        return dateBase.getPatientList();
    }

}
