package task.dao.enums.service.serviceIMPL;

import task.dao.enums.DateBase;
import task.dao.enums.model.Doctor;
import task.dao.enums.model.Hospital;
import task.dao.enums.model.Patient;
import task.dao.enums.service.HospitalService;
import task.dao.enums.service.MyError;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class HospitalImpl implements HospitalService {

 private DateBase dateBase;
 private long id;

    public HospitalImpl(DateBase dateBase) {
        this.dateBase = dateBase;
    }


    @Override
    public List<Hospital> addHospital(Hospital hospital) {
        dateBase.getHospitalList().add(hospital);
        return dateBase.getHospitalList();
    }

    @Override
    public List<Hospital> addHospitals(List<Hospital> hospitals) {
        dateBase.getHospitalList().addAll(hospitals);
        return dateBase.getHospitalList();
    }

    @Override
    public Hospital getHospitalById(Long id) {
        for (int i = 0; i <dateBase.getHospitalList().size(); i++) {
            if(dateBase.getHospitalList().get(i).getId()==(id)){
                System.out.println(dateBase.getHospitalList().get(i));
            }
        }
        return null;
    }

    @Override
    public List<Hospital> getAllHospitals() {
        return dateBase.getHospitalList();
    }

    @Override
    public void updateHospital(Long id, Hospital hospital) {
        for (int i = 0; i <dateBase.getHospitalList().size(); i++) {
            if(dateBase.getHospitalList().get(i).getId()==id){
                dateBase.getHospitalList().get(i).setName(hospital.getName());
                dateBase.getHospitalList().get(i).setAddress(hospital.getAddress());
            }
        }
    }

    @Override
    public List<Hospital> sortHospitalByName(String sort) {
        dateBase.getHospitalList().sort(sortName);
        return dateBase.getHospitalList();
    }
    Comparator<Hospital>sortName = new Comparator<Hospital>() {
        @Override
        public int compare(Hospital o1, Hospital o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
}
