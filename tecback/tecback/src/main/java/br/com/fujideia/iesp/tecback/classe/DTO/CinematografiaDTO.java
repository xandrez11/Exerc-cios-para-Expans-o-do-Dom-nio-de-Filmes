package br.com.fujideia.iesp.tecback.classe.DTO;

import br.com.fujideia.iesp.tecback.classe.Cinematografia;
import br.com.fujideia.iesp.tecback.classe.Premio;
import br.com.fujideia.iesp.tecback.model.DTO.FilmeDTO;
import br.com.fujideia.iesp.tecback.model.DTO.GeneroDTO;
import br.com.fujideia.iesp.tecback.model.Filme;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.mapping.List;

@Entity
@Data
@NoArgsConstructor
public class CinematografiaDTO {
    private Long id;

    private String diretorDeFotografia;
    private String estilo;


    private CinematografiaDTO filme;
    private GeneroDTO genero;
    private PremioDTO premio;
    private int quantidade;

    private List<FilmeDTO> premios;
}
