package com.bolt.recruitment.transactions;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    private Long id;

    @Column
    private Long amount;

    @Column
    private String currency;

    @Column
    @Enumerated(value = EnumType.STRING)
    private TransactionType type;

    @ManyToOne
    @JoinColumn(name = "from_fi")
    private FundingInstrument fromInstrument;

    @ManyToOne
    @JoinColumn(name = "to_fi")
    private FundingInstrument toInstrument;

    @Column
    private LocalDateTime timestamp;

    public enum TransactionType {
        capture, refund
    }

}
