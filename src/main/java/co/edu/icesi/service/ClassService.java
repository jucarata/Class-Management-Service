package co.edu.icesi.service;

import co.edu.icesi.dto.ClassesDTO;
import co.edu.icesi.dto.ClassesResponseDTO;

import java.util.List;

public interface ClassService {
    boolean scheduleClass(ClassesDTO classDTO);
    List<ClassesResponseDTO> getClasses();
}