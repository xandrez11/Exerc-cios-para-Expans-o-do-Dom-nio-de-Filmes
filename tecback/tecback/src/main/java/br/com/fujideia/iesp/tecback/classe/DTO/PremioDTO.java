package br.com.fujideia.iesp.tecback.classe.DTO;

import br.com.fujideia.iesp.tecback.classe.Premio;
import br.com.fujideia.iesp.tecback.model.Filme;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class PremioDTO {
    private Long id;

    private String nome;

    private int ano;

    private String categoria;

    private String vencedor;
    PremioDTO(Premio premio) {
        double v = 10.000;
    }
    private int premioDTO;

    private List<premio> premio;
}
