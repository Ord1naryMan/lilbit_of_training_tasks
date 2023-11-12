package org.bsu.example.task2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeAttendanceDto {

    String employeeId;
    AttendanceType attendanceType;
    LocalDateTime time;
}
