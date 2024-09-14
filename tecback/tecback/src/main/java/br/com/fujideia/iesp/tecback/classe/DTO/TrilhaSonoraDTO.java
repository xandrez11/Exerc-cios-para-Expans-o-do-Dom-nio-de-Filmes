package br.com.fujideia.iesp.tecback.classe.DTO;

import br.com.fujideia.iesp.tecback.model.Filme;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class TrilhaSonoraDTO {

    private Long id;

    private String compositor;
    private Filme filme;
    private int duracaoTotal;
    private int duracaoMinuto;
    private int duracaoMax;
    private int duracaoTotalMinuto;
    private int duracaoTotalMax;
}
