package com.example.crudzaodogu.repository;

import com.example.crudzaodogu.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    UserDetails findByLogin(String role);
}
