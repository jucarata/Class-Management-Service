package co.edu.icesi.controller;

import co.edu.icesi.dto.ClassesDTO;
import co.edu.icesi.dto.ClassesResponseDTO;
import co.edu.icesi.exceptions.NoTrainerFoundException;
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
    public ResponseEntity<String> scheduleClass(@RequestBody ClassesDTO classDTO) {
        boolean wasCreated = false;
        try {
            wasCreated = classService.scheduleClass(classDTO);
        } catch (NoTrainerFoundException e) {
            return ResponseEntity.badRequest().body("No hay ningun entrenador que coincida con el id asociado");
        }
        return wasCreated ? ResponseEntity.status(201).build()
                : ResponseEntity.badRequest().body("No se pudo programar la nueva clase, verifique que los datos sean correctos");
    }

    @Override
    @GetMapping
    public ResponseEntity<List<ClassesResponseDTO>> getClasses() {
        List<ClassesResponseDTO> classes = classService.getClasses();
        return ResponseEntity.ok(classes);
    }
}