package co.edu.icesi.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Builder
@Getter
@Setter
public class ClassesResponseDTO {
    private Long id;
    private String name;
    private LocalTime schedule;
    private Integer maxCapacity;
    private TrainerDTO trainerDTO;
}