package co.edu.uniquindio.negocioRepo.repositorios.repos;

import co.edu.uniquindio.negocioRepo.repositorios.modelo.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepo extends MongoRepository<Cliente, String> {
}


