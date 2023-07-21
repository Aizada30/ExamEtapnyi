package task.dao.enums;

import task.dao.enums.model.Doctor;
import task.dao.enums.model.Hospital;
import task.dao.enums.model.Patient;

import java.util.ArrayList;
import java.util.List;

public class DateBase {
    private List<Hospital> hospitalList;

    private List<Doctor>doctorList;
    private List<Patient>patientList;

    public DateBase (){

    }

    public DateBase(List<Hospital> hospitalList, List<Doctor> doctorList, List<Patient> patientList) {
        this.hospitalList = hospitalList;
        this.doctorList = doctorList;
        this.patientList = patientList;
    }

    public List<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(List<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }
//    public void setHospitalList(Hospital hospital) {
//        if (this.hospitalList == null) {
//            this.hospitalList = new ArrayList<>();
//        }
//        this.hospitalList.add(hospital);
//
//    }
    public List<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(List<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }

    @Override
    public String toString() {
        return "DateBase{" +
                "hospitalList=" + hospitalList +
                ", doctorList=" + doctorList +
                ", patientList=" + patientList +
                '}';
    }
}
