package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.classe.Premio;
import br.com.fujideia.iesp.tecback.repository.PremioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PremioService {
    private final PremioRepository premioRepository;

    public List<Premio> listarTodos() {
        return premioRepository.findAll();
    }

    public Optional<Premio> buscarPorId(Long id) {
        return premioRepository.findById(id);
    }

    public Premio criarPremio(Premio premio) {
        return premioRepository.save(premio);
    }

    public Optional<Premio> atualizarPremio(Long id, Premio premio) {
        return premioRepository.findById(id).map(p -> {
            p.setNome(premio.getNome());
            p.setAno(premio.getAno());
            p.setCategoria(premio.getCategoria());
            p.setVencedor(premio.getVencedor());
            return premioRepository.save(p);
        });
    }

    public boolean deletarPremio(Long id) {
        if (premioRepository.existsById(id)) {
            premioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
