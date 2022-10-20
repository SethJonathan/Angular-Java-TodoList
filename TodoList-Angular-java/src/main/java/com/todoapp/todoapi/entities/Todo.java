package com.todoapp.todoapi.entities;

import lombok.*;

import javax.persistence.*;

@Table(name = "todo")
@Getter
@Setter
@Entity
@RequiredArgsConstructor
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "completed")
    private Boolean completed;

}