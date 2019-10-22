package by.kirill.springboot.nagruzka.repository;

import by.kirill.springboot.nagruzka.models.Capasity;
import org.springframework.data.repository.CrudRepository;

public interface CapasityRepo extends CrudRepository<Capasity, Long> {
    Capasity findById(long id);
}
