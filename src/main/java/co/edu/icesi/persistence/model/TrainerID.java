package co.edu.icesi.persistence.model;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TrainerID implements Serializable {
    private Long id;
}