package br.com.fujideia.iesp.tecback.service;
import br.com.fujideia.iesp.tecback.classe.TrilhaSonora;
import br.com.fujideia.iesp.tecback.repository.TrilhaSonoraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service

public class TrilhaSonoraService {

    private final TrilhaSonoraRepository trilhaSonoraRepository;

    public List<TrilhaSonora> listarTodos() {
        return trilhaSonoraRepository.findAll();
    }

    public Optional<TrilhaSonora> buscarPorId(Long id) {
        return trilhaSonoraRepository.findById(id);
    }

    public TrilhaSonora criarTrilhaSonora(TrilhaSonora trilhaSonora) {
        return trilhaSonoraRepository.save(trilhaSonora);
    }

    public Optional<TrilhaSonora> atualizarTrilhaSonora(Long id, TrilhaSonora trilhaSonora) {
        return trilhaSonoraRepository.findById(id).map(t -> {
            t.setCompositor(trilhaSonora.getCompositor());
            t.setFilme(trilhaSonora.getFilme());
            t.setFaixas(trilhaSonora.getFaixas());
            t.setDuracaoTotal(trilhaSonora.getDuracaoTotal());
            return trilhaSonoraRepository.save(t);
        });
    }

    public boolean deletarTrilhaSonora(Long id) {
        if (trilhaSonoraRepository.existsById(id)) {
            trilhaSonoraRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
