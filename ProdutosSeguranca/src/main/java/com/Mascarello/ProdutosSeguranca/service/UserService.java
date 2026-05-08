package com.Mascarello.ProdutosSeguranca.service;

import com.Mascarello.ProdutosSeguranca.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    private UserDetails  loadUserByUsername(String username) throws UsernameNotFoundException {
        return  userRepository.findByLogin(username);
    }

}
