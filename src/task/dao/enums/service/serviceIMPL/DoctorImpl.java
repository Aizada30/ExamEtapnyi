package task.dao.enums.service.serviceIMPL;

import task.dao.enums.DateBase;
import task.dao.enums.Gender;
import task.dao.enums.model.Doctor;
import task.dao.enums.service.DoctorService;

import java.util.List;

public class DoctorImpl implements DoctorService<Doctor> {

    private  DateBase dateBase;

    public DoctorImpl(DateBase dateBase) {
        this.dateBase = dateBase;
    }

    @Override
    public List<Doctor> addDoctor(Doctor doctor) {
        dateBase.getDoctorList().add(doctor);
        return dateBase.getDoctorList();
    }

    @Override
    public Doctor getDoctorById(Long id) {
        dateBase.getDoctorList().stream().filter(doc->doc.getId()==id).toList().forEach(System.out::println);
        return null;
    }

    @Override
    public List<Doctor> filterByGender(String gender) {
        if(gender.equalsIgnoreCase("male")){
            gender = String.valueOf(Gender.MALE);
        } else if (gender.equalsIgnoreCase("female")){
            gender = String.valueOf(Gender.FEMALE);{
            }
        }


        return null;
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return dateBase.getDoctorList();
    }
}
