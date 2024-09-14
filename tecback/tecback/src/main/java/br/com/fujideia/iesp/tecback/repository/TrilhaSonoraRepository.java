package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.classe.TrilhaSonora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrilhaSonoraRepository extends JpaRepository<TrilhaSonora, Long> {

    List<TrilhaSonora> findByCompositor(String compositor);
}
