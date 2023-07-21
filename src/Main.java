import task.dao.enums.DateBase;
import task.dao.enums.Gender;
import task.dao.enums.model.Doctor;
import task.dao.enums.model.Hospital;
import task.dao.enums.model.Patient;
import task.dao.enums.service.DoctorService;
import task.dao.enums.service.HospitalService;
import task.dao.enums.service.PatientService;
import task.dao.enums.service.serviceIMPL.DoctorImpl;
import task.dao.enums.service.serviceIMPL.HospitalImpl;
import task.dao.enums.service.serviceIMPL.PatientImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isTrue = true;
        Hospital hospital = new Hospital();

        List<Hospital> hospitalList = new ArrayList<>();
        List<Doctor> doctorList = new ArrayList<>();
        List<Patient> patientList = new ArrayList<>(
                List.of(new Patient(1L, "Jiro", "Jirovich", "2525366", Gender.FEMALE, 15),
                        new Patient(2L, "Tina", "Tinovich", "89654+", Gender.MALE, 20),
                        new Patient(3L, "KIlu", "Kilovskiy", "852963741", Gender.MALE, 65),
                        new Patient(4L, "Haba", "Haabrov", "523698", Gender.MALE, 41)
                ));

        HospitalService hospitalService = new HospitalImpl(new DateBase(hospitalList, doctorList, patientList));
        DoctorService<Doctor> doctorService = new DoctorImpl(new DateBase(hospitalList, doctorList, patientList));
        PatientService patientService = new PatientImpl(new DateBase(hospitalList, doctorList, patientList));
        hospitalService.addHospitals(hospitalList);

        Scanner scanner = new Scanner(System.in);
        while (isTrue) {
            System.out.println("""
                    1 . add hospital 
                    2 . add hospitals
                    3 . get all hospitals
                    4 . get hospital by id 
                    5 . update hospital 
                    6 . sort hospital by name
                    7 . add new doctor 
                    8 . find doctor by id 
                    9 . find doctor by gender 
                    10 . get all doctors
                    11 . add new patient 
                    12 . get patient by first name
                    13 . get all patient 
                    14 . grouping by gender 
                    15 . filter by ages
                                        
                    0 . exit 
                    """);
            int num = scanner.nextInt();
            switch (num) {
                case 1 -> hospitalService.addHospital(new Hospital(1L, "Lala", "UoUo"));
                case 2 -> {
                    hospitalService.addHospitals(new ArrayList<>(List.of(
                            new Hospital(1L, "Center hospital", "Sho to tam street",doctorList,patientList)
                            , new Hospital(2L, "Glavnaya hospital", "New street",doctorList,patientList)
                            , new Hospital(3L, "South hospital", "Old street",doctorList,patientList))));
                    break;
                }
                case 3 -> {
                    System.out.println(hospitalService.getAllHospitals());
                }
                case 4 -> System.out.println(hospitalService.getHospitalById(2L));
                case 5 -> hospitalService.updateHospital(3L, new Hospital("NEW HOSPITAL", "NEW ADDRESS"));
                case 6 -> System.out.println(hospitalService.sortHospitalByName(" . "));
                case 7 ->
                        System.out.println(doctorService.addDoctor(new Doctor(1L, "Aman", "Amanov", "aman@gmail.com", Gender.MALE,patientList)));
                case 8 -> System.out.println(doctorService.getDoctorById(1L));
                case 9 -> System.out.println(doctorService.filterByGender("FEMALE"));
                case 10 -> System.out.println(doctorService.getAllDoctors());
                case 11 -> System.out.println(patientService.addPatient(patientList));
                case 12 -> System.out.println(patientService.getPatientByfirstName("Tina"));
                case 13 -> System.out.println(patientService.getAllPatients());
                case 14 -> patientService.groupingByGender();
                case 15 -> System.out.println(patientService.filterByAge());
                case 0 -> isTrue = false;
            }
        }
    }
}