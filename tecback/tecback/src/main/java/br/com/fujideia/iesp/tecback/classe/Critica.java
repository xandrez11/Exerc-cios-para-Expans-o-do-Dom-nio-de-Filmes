package br.com.fujideia.iesp.tecback.classe;

import br.com.fujideia.iesp.tecback.model.Filme;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Critica {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String autor;
    private int nota;
    private String comentario;

    @ManyToOne
    @JoinColumn(name = "Critica")
    private Filme filme;
}