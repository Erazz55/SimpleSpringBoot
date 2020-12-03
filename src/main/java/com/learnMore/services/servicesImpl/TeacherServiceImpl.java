package com.learnMore.services.servicesImpl;

import com.learnMore.dto.TeacherDTO;
import com.learnMore.entity.Teacher;
import com.learnMore.repository.TeacherRepository;
import com.learnMore.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public void signUpTeacher(TeacherDTO dto) {
        Teacher teacher = new Teacher();
        teacher.setHandle(dto.getHandle());
        teacher.setName(dto.getName());
        teacher.setEducation(dto.getEducation());
        teacher.setSubject(dto.getSubject());
        teacher.setRating(dto.getRating());

        teacherRepository.save(teacher);
    }

    @Override
    public List<TeacherDTO> getTeachers(String subject) {
        List<Teacher> list = teacherRepository.getTeacherBySubject(subject);

        return list.stream()
                   .map(c -> new TeacherDTO(c.getHandle(), c.getName(), c.getEducation(), c.getRating()))
                    .collect(Collectors.toList());
    }
}
