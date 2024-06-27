package co.edu.uniquindio.negocioRepo.repositorios.test;

import co.edu.uniquindio.negocioRepo.repositorios.modelo.Cliente;
import co.edu.uniquindio.negocioRepo.repositorios.repos.ClienteRepo;
import org.bson.assertions.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClienteTest {

    @Autowired
    private ClienteRepo clienteRepo;

    @Test
    public void registrarClienteTest(){
//Creamos el cliente con sus propiedades
        Cliente cliente;
        cliente = Cliente.builder()
                .fotoPerfil("foto.jpg")
                .nickName("pepito123")
                .email("pepito@email.com")
                .ciudad("Quindio")
                .build();
//Guardamos el cliente
        Cliente registro = clienteRepo.save( cliente );
//Verificamos que se haya guardado validando que no sea null
        Assertions.assertNotNull(registro);
    }
}

