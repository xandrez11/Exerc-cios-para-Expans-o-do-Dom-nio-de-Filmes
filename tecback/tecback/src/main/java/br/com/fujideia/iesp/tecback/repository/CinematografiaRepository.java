package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.classe.Cinematografia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinematografiaRepository  extends JpaRepository<Cinematografia, Long> {
}
