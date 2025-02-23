package co.edu.icesi.service;

import co.edu.icesi.dto.ClassDTO;
import co.edu.icesi.dto.ClassResponseDTO;

import java.util.List;

public interface ClassService {
    boolean scheduleClass(ClassDTO classDTO);
    List<ClassResponseDTO> getClasses();
}