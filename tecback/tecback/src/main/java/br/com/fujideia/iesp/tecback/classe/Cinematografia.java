package br.com.fujideia.iesp.tecback.classe;

import java.util.List;
import br.com.fujideia.iesp.tecback.model.Filme;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Data
@NoArgsConstructor
public class Cinematografia{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String diretorDeFotografia;
    private String estilo;

    @ManyToOne
    @JoinColumn(name = "Cinematografia")
    private Filme filme;

    @ElementCollection
    private List<String> premio;
}

