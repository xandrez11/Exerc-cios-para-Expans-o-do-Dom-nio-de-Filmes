package br.com.fujideia.iesp.tecback.service;
import br.com.fujideia.iesp.tecback.classe.Cinematografia;
import br.com.fujideia.iesp.tecback.repository.CinematografiaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CinematografiaService {
    private final CinematografiaRepository cinematografiaRepository;

    public List<Cinematografia> listarTodos() {
        return cinematografiaRepository.findAll();
    }

    public Optional<Cinematografia> buscarPorId(Long id) {
        return cinematografiaRepository.findById(id);
    }

    public Cinematografia criarCinematografia(Cinematografia cinematografia) {
        return cinematografiaRepository.save(cinematografia);
    }

    public Optional<Cinematografia> atualizarCinematografia(Long id, Cinematografia cinematografia) {
        return cinematografiaRepository.findById(id).map(c -> {
            c.setDiretorDeFotografia(cinematografia.getDiretorDeFotografia());
            c.setFilme(cinematografia.getFilme());
            c.setEstilo(cinematografia.getEstilo());
            c.setPremios(cinematografia.getPremios());
            return cinematografiaRepository.save(c);
        });
    }

    public boolean deletarCinematografia(Long id) {
        if (cinematografiaRepository.existsById(id)) {
            cinematografiaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
