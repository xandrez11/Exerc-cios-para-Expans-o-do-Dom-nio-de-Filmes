package br.com.fujideia.iesp.tecback.model.DTO;

import br.com.fujideia.iesp.tecback.model.Filme;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeneroDTO {

    private long id;
    private String nome;


}
