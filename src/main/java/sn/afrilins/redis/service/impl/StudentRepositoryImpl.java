package sn.afrilins.redis.service.impl;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import sn.afrilins.redis.entities.Student;
import sn.afrilins.redis.service.StudentRepository;

import java.util.Arrays;
import java.util.List;

/**
 * @author Ibrahima Khalilou Lahi Samb
 * @role JAVA & PHP developer | Junior Ethical Hacker
 * @twitter @Mister__iks
 */
@Service
@CacheConfig(cacheNames = {"Student"})
public class StudentRepositoryImpl implements StudentRepository {
    Student[] students = {
            new Student(1, "Modou", "Diop"),
            new Student(2, "Cherif", "Ndiaye"),
            new Student(3, "Palaye", "Samba"),
            new Student(4, "Aly", "Dieng"),
            new Student(5, "Dame", "Thiam"),
            new Student(6, "Siré", "Kane")
    };

    @Override
    @Cacheable(key = "#id")
    public Student findById(int id) {
        for (Student student : students) { if (student.getId() == id) return student; }
        return null;
    }

    @Override
    @Cacheable
    public List<Student> findAll() {
        return List.of(students);
    }

}
