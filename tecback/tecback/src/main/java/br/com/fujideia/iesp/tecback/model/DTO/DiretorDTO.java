package br.com.fujideia.iesp.tecback.model.DTO;

import br.com.fujideia.iesp.tecback.model.Filme;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiretorDTO {
    @Id
    @GeneratedValue

    private Long id;
    private String nome;

}
