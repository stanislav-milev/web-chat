package com.github.stanislav_milev.server.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomRole {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    @NotEmpty(message = "Room Id cannot be null")
    private Long roomId;
    @NotEmpty(message = "User Id cannot be null")
    private Long userId;
    @NotEmpty(message = "Role cannot be null")
    private com.github.stanislav_milev.server.enumeration.Role role; //TODO maybe in keycloak
}
