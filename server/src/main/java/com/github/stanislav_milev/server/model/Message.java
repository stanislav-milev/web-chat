package com.github.stanislav_milev.server.model;

import com.github.stanislav_milev.server.enumeration.MessageStatus;
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
public class Message {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    @NotEmpty(message = "Room Id cannot be null")
    private Long roomId;//send in
    @NotEmpty(message = "User Id cannot be null")
    private Long userId;//send by
    @NotEmpty(message = "Send on cannot be null")
    private LocalDateTime sendOn;
    @NotEmpty(message = "Message cannot be null")
    private String message;
    @NotEmpty(message = "Status cannot be null")
    private MessageStatus status; //sent/deleted ... feature - filtered/censored
}
