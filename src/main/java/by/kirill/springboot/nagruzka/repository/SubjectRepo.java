package by.kirill.springboot.nagruzka.repository;

import by.kirill.springboot.nagruzka.models.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepo extends CrudRepository<Subject, Long> {
    public Subject findById(long id);
}
