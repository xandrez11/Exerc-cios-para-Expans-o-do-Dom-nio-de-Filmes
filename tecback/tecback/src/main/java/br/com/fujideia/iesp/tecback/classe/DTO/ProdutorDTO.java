package br.com.fujideia.iesp.tecback.classe.DTO;

import br.com.fujideia.iesp.tecback.model.DTO.FilmeDTO;
import br.com.fujideia.iesp.tecback.model.DTO.GeneroDTO;
import br.com.fujideia.iesp.tecback.model.Filme;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class ProdutorDTO {
    private Long id;

    private String nome;

    private int idade;

    private String nacionalidade;
    private GeneroDTO genero;
    private FilmeDTO filme;
    private ProdutorDTO produtor;
    public ProdutorDTO(ProdutorDTO produtor) {
        this.id = produtor.getId();
        this.nome = produtor.getNome();
        this.idade = produtor.getIdade();
        this.nacionalidade = produtor.getNacionalidade();
        this.genero = produtor.getGenero();
        this.filme = produtor.getFilme();
        this.produtor = produtor;
    }
}
