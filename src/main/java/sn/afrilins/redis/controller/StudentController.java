package sn.afrilins.redis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.afrilins.redis.entities.Student;
import sn.afrilins.redis.service.impl.StudentRepositoryImpl;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Ibrahima Khalilou Lahi Samb
 * @role JAVA & PHP developer | Junior Ethical Hacker
 * @twitter @Mister__iks
 */
@RestController
@RequestMapping("/students")
public class StudentController {
    @Resource
    StudentRepositoryImpl studentRepository;

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id) {
        return studentRepository.findById(id);
    }


    @GetMapping("/all")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
