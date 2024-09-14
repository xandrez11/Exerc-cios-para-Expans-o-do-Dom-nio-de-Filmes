package br.com.fujideia.iesp.tecback.repository;


import br.com.fujideia.iesp.tecback.classe.Critica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  CriticaRepository extends JpaRepository<Critica, Long> {
}
