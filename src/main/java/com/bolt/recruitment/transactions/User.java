package com.bolt.recruitment.transactions;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "users")
public class User {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private LocalDateTime timestamp;

}
