package org.bsu.example.task2.repository;

import org.bsu.example.task2.dto.PrescribedMedicineDto;

public class DoctorRepository {

    private static DoctorRepository doctorRepositoryInstance;

    private DoctorRepository() {
    }

    public static DoctorRepository getInstance() {
        if (doctorRepositoryInstance == null) {
            doctorRepositoryInstance = new DoctorRepository();
        }
        return doctorRepositoryInstance;
    }


    public void addPrescribedMedicineRecord(PrescribedMedicineDto prescribedMedicineDto) {
        //database call and logging
    }
}
