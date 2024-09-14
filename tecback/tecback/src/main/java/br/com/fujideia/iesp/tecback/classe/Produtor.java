package br.com.fujideia.iesp.tecback.classe;

import br.com.fujideia.iesp.tecback.model.Filme;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Produtor{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int idade;
    private String nacionalidade;

    @ManyToMany(mappedBy = "produtores")
    private List<Filme> filmes;
}