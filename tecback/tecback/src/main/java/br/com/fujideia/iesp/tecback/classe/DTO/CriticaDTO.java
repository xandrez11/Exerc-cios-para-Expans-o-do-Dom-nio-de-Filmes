package br.com.fujideia.iesp.tecback.classe.DTO;

import br.com.fujideia.iesp.tecback.classe.Critica;
import br.com.fujideia.iesp.tecback.model.DTO.FilmeDTO;
import br.com.fujideia.iesp.tecback.model.Filme;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class CriticaDTO {
    private Long id;

    private String autor;

    private int nota;

    private String comentario;

    private CriticaDTO filme;
    private FilmeDTO filmeDTO;
    private Critica entidade;

}
