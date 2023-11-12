package org.bsu.example.task2.entity;

import org.bsu.example.task2.dto.PrescribedMedicineDto;

public interface Doctor {

    void prescribeMedicine(String patientId, String medicineType);
}
