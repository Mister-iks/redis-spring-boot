package sn.afrilins.redis.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import sn.afrilins.redis.entities.Student;

import java.util.List;

/**
 * @author Ibrahima Khalilou Lahi Samb
 * @role JAVA & PHP developer | Junior Ethical Hacker
 * @twitter @Mister__iks
 */
public interface StudentRepository{
    Student findById(int id);
    List<Student> findAll();

}
