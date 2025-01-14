package com.github.stanislav_milev.server.model;

import com.github.stanislav_milev.server.enumeration.UserStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    @Column(unique = true)
    @NotEmpty(message = "Name cannot be empty or null")
    private String name;
    @Column(unique = true)
    @NotEmpty(message = "Email cannot be empty or null")
    private String email;
    @NotEmpty(message = "Created on cannot be null")
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    @NotEmpty(message = "Password cannot be null")
    private String password;//TODO use Vault/keycloak
    @NotEmpty(message = "Status cannot be null")
    private UserStatus status;
}
