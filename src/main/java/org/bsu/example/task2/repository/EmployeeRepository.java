package org.bsu.example.task2.repository;

import org.bsu.example.task2.dto.EmployeeAttendanceDto;

public class EmployeeRepository {

    private static EmployeeRepository employeeRepositoryInstance;

    private EmployeeRepository() {
    }

    public static EmployeeRepository getInstance() {
        if (employeeRepositoryInstance == null) {
            employeeRepositoryInstance = new EmployeeRepository();
        }
        return employeeRepositoryInstance;
    }

    public void addAttendanceRecord(EmployeeAttendanceDto employeeAttendanceDto) {
        //call to database and logging
    }

}
