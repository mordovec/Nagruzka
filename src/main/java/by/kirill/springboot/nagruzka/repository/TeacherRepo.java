package by.kirill.springboot.nagruzka.repository;

import by.kirill.springboot.nagruzka.models.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepo extends CrudRepository<Teacher, Long> {
    public Teacher findById(long id);

}
