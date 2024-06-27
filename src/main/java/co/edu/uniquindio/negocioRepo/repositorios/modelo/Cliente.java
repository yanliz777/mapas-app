package co.edu.uniquindio.negocioRepo.repositorios.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import lombok.*;
import lombok.Builder;

@Document("clientes")
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Cliente implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private String codigo;

    private String fotoPerfil;
    private String nickName;
    private String email;
    private String ciudad;

    @Builder
    public Cliente(String fotoPerfil, String nickName, String email, String ciudad) {
        this.fotoPerfil = fotoPerfil;
        this.nickName = nickName;
        this.email = email;
        this.ciudad = ciudad;
    }
}

