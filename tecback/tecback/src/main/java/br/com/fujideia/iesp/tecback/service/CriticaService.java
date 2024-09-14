package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.classe.Critica;
import br.com.fujideia.iesp.tecback.repository.CriticaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CriticaService {
    private final CriticaRepository criticaRepository;

    public List<Critica> listarTodos() {
        return criticaRepository.findAll();
    }

    public Optional<Critica> buscarPorId(Long id) {
        return criticaRepository.findById(id);
    }

    public Critica criarCritica(Critica critica) {
        return criticaRepository.save(critica);
    }

    public Optional<Critica> atualizarCritica(Long id, Critica critica) {
        return criticaRepository.findById(id).map(c -> {
            c.setAutor(critica.getAutor());
            c.setFilme(critica.getFilme());
            c.setNota(critica.getNota());
            c.setComentario(critica.getComentario());
            return criticaRepository.save(c);
        });
    }

    public boolean deletarCritica(Long id) {
        if (criticaRepository.existsById(id)) {
            criticaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
