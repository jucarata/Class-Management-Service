package co.edu.icesi.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TrainerDTO {
    private Long id;
    private String name;
}