package co.edu.icesi.mappers;

import co.edu.icesi.dto.ClassDTO;
import co.edu.icesi.dto.ClassResponseDTO;
import co.edu.icesi.dto.TrainerDTO;
import co.edu.icesi.persistence.model.Classes;
import co.edu.icesi.persistence.model.TrainerID;
import org.springframework.stereotype.Component;

@Component
public class ClassMapper {
    public Classes toClass(ClassDTO classDTO) {
        return Classes.builder()
                .id(classDTO.getId())
                .name(classDTO.getName())
                .schedule(classDTO.getSchedule())
                .maxCapacity(classDTO.getMaxCapacity())
                .trainerID(new TrainerID(classDTO.getTrainerID()))
                .build();
    }

    public ClassResponseDTO toDTO(Classes classes, TrainerDTO trainerDTO) {
        return ClassResponseDTO.builder()
                .id(classes.getId())
                .name(classes.getName())
                .schedule(classes.getSchedule())
                .maxCapacity(classes.getMaxCapacity())
                .trainerDTO(trainerDTO)
                .build();
    }
}