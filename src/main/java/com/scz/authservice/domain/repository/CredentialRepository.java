package com.scz.authservice.domain.repository;

import com.scz.authservice.domain.model.Credential;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredentialRepository extends JpaRepository<Credential, String> {

}
