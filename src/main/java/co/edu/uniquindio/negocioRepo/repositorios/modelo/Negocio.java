package co.edu.uniquindio.negocioRepo.repositorios.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import lombok.*;

@Document("negocios")
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Negocio {
    @Id
    @EqualsAndHashCode.Include
    private String codigo;


}

