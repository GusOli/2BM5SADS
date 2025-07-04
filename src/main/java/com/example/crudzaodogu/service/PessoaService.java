package com.example.crudzaodogu.service;

import com.example.crudzaodogu.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PessoaService implements UserDetailsService {
@Autowired
PessoaRepository pessoaRepository;


@Override
public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
 return pessoaRepository.findByLogin(username);
    }
}