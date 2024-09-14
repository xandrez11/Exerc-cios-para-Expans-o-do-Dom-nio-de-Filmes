package br.com.fujideia.iesp.tecback.model.DTO;

import br.com.fujideia.iesp.tecback.model.Ator;
import br.com.fujideia.iesp.tecback.model.Diretor;
import br.com.fujideia.iesp.tecback.model.Genero;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmeDTO {

    private Long id;
    private String titulo;
    private int anoLancamento;
    private DiretorDTO diretor;
    private List<AtorDTO> atores;
    private List<GeneroDTO> generos;
}
