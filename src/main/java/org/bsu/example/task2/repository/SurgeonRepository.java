package org.bsu.example.task2.repository;

import org.bsu.example.task2.dto.EmployeeAttendanceDto;
import org.bsu.example.task2.dto.SurgeryInfoDto;

public class SurgeonRepository {

    private static SurgeonRepository surgeonRepositoryInstance;

    private SurgeonRepository() {
    }

    public static SurgeonRepository getInstance() {
        if (surgeonRepositoryInstance == null) {
            surgeonRepositoryInstance = new SurgeonRepository();
        }
        return surgeonRepositoryInstance;
    }

    public void addSurgeryRecord(SurgeryInfoDto surgeryInfoDto) {
        //database call and logging
    }

}
