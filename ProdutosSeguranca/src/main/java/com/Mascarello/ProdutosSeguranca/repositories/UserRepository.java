package com.Mascarello.ProdutosSeguranca.repositories;

import com.Mascarello.ProdutosSeguranca.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    UserDetails findByLogin(String role);
}
