package co.edu.icesi.persistence.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "clase")
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalTime schedule;
    private Integer maxCapacity;

    @Embedded
    private TrainerID trainerID;
}