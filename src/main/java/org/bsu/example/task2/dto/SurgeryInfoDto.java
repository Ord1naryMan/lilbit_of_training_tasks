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
public class SurgeryInfoDto {

    String surgeonId;
    String surgeryType;
    String patientId;
    LocalDateTime surgeryStartTime;
}
