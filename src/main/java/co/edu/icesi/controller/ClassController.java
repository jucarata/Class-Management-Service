package co.edu.icesi.controller;

import co.edu.icesi.dto.ClassDTO;
import co.edu.icesi.dto.ClassResponseDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ClassController {
    ResponseEntity<Void> scheduleClass(ClassDTO classDTO);
    ResponseEntity<List<ClassResponseDTO>> getClasses();
}