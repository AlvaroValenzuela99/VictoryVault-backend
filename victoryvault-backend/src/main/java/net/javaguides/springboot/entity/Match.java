package net.javaguides.springboot.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User player1;
    @ManyToOne
    private User player2;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
