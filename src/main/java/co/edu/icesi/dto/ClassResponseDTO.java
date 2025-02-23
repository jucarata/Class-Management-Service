package co.edu.icesi.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalTime;

@Builder
@Data
public class ClassResponseDTO {
    private Long id;
    private String name;
    private LocalTime schedule;
    private Integer maxCapacity;
    private TrainerDTO trainerDTO;
}