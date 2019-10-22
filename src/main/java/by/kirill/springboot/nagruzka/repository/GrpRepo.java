package by.kirill.springboot.nagruzka.repository;

import by.kirill.springboot.nagruzka.models.Grp;
import org.springframework.data.repository.CrudRepository;

public interface GrpRepo extends CrudRepository<Grp, Long> {
    Grp findById(long id);

}
