package co.edu.uniquindio.negocioRepo.repositorios.repos;

import co.edu.uniquindio.negocioRepo.repositorios.modelo.Negocio;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface NegocioRepo extends MongoRepository<Negocio, String> {

}
