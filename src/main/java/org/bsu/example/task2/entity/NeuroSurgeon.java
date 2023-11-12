package org.bsu.example.task2.entity;

import org.bsu.example.task2.dto.AttendanceType;
import org.bsu.example.task2.dto.EmployeeAttendanceDto;
import org.bsu.example.task2.dto.PrescribedMedicineDto;
import org.bsu.example.task2.dto.SurgeryInfoDto;
import org.bsu.example.task2.repository.DoctorRepository;
import org.bsu.example.task2.repository.EmployeeRepository;
import org.bsu.example.task2.repository.SurgeonRepository;

import java.time.LocalDateTime;

public class NeuroSurgeon extends Surgeon {

    EmployeeRepository employeeRepository = EmployeeRepository.getInstance();
    DoctorRepository doctorRepository = DoctorRepository.getInstance();
    SurgeonRepository surgeonRepository = SurgeonRepository.getInstance();

    public NeuroSurgeon() {
        super();
    }

    public NeuroSurgeon(String id, String fullName) {
        super(id, fullName);
    }

    @Override
    public void startWorkingDay() {
        employeeRepository.addAttendanceRecord(
            EmployeeAttendanceDto.builder()
                .employeeId(getId())
                .attendanceType(AttendanceType.ARRIVE)
                .time(LocalDateTime.now())
                .build()
        );
    }

    @Override
    public void endWorkingDay() {
        employeeRepository.addAttendanceRecord(
            EmployeeAttendanceDto.builder()
                .employeeId(getId())
                .attendanceType(AttendanceType.LEAVE)
                .time(LocalDateTime.now())
                .build()
        );

    }

    @Override
    public void prescribeMedicine(String patientId, String medicineType) {
        doctorRepository.addPrescribedMedicineRecord(
            PrescribedMedicineDto.builder()
                .surgeonId(getId())
                .patientId(patientId)
                .medicineType(medicineType)
                .build()
        );
    }

    @Override
    public void doSurgery(String patientId, String surgeryType) {
        surgeonRepository.addSurgeryRecord(
            SurgeryInfoDto.builder()
                .surgeonId(getId())
                .patientId(patientId)
                .surgeryType(surgeryType)
                .surgeryStartTime(LocalDateTime.now())
                .build()
        );
    }
}
