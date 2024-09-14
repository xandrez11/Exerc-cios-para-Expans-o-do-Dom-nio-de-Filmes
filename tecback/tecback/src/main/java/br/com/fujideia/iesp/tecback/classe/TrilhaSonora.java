package br.com.fujideia.iesp.tecback.classe;

import br.com.fujideia.iesp.tecback.model.Filme;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class TrilhaSonora {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String compositor;

    @ManyToOne
    @JoinColumn(name = "TrilhaSonora")
    private Filme filme;

    @ElementCollection
    private List<String> faixas;

    private int duracaoTotal;
}