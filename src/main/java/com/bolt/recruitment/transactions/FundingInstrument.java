package com.bolt.recruitment.transactions;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "funding_instruments")
public class FundingInstrument {

    @Id
    private Long id;

    @Column
    private String name;

    @ManyToOne
    private User user;

    @Column
    @Enumerated(value = EnumType.STRING)
    private Type type;

    @Column
    @Enumerated(value = EnumType.STRING)
    private Status status;

    @Column
    private LocalDateTime timestamp;

    public enum Type {
        debit_card, bank, credit_card
    }

    public enum Status {
        active, inactive
    }

}
