package co.edu.icesi.controller;

import co.edu.icesi.dto.ClassDTO;
import co.edu.icesi.dto.ClassResponseDTO;
import co.edu.icesi.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clases")
public class ClassControllerImpl implements ClassController {

    private final ClassService classService;

    @Autowired
    public ClassControllerImpl(ClassService classService) {
        this.classService = classService;
    }

    @Override
    @PostMapping
    public ResponseEntity<Void> scheduleClass(@RequestBody ClassDTO classDTO) {
        boolean wasCreated = classService.scheduleClass(classDTO);
        return wasCreated ? ResponseEntity.status(201).build()
                : ResponseEntity.badRequest().build();
    }

    @Override
    @GetMapping
    public ResponseEntity<List<ClassResponseDTO>> getClasses() {
        List<ClassResponseDTO> classes = classService.getClasses();
        return ResponseEntity.ok(classes);
    }
}