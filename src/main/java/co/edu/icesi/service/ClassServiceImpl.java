package co.edu.icesi.service;

import co.edu.icesi.dto.ClassDTO;
import co.edu.icesi.dto.ClassResponseDTO;
import co.edu.icesi.mappers.ClassMapper;
import co.edu.icesi.persistence.model.Classes;
import co.edu.icesi.persistence.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private final ClassRepository classRepository;

    private final ClassMapper classMapper;

    public ClassServiceImpl(ClassRepository classRepository, ClassMapper classMapper) {
        this.classRepository = classRepository;
        this.classMapper = classMapper;
    }

    @Override
    public boolean scheduleClass(ClassDTO classDTO) {
        Classes classes = classMapper.toClass(classDTO);
        Classes savedClass = classRepository.save(classes);
        return savedClass.getId() != null;
    }

    @Override
    public List<ClassResponseDTO> getClasses() {
        List<Classes> allClasses = classRepository.findAll();


        return ;
    }
}