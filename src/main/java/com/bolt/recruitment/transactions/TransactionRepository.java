package com.bolt.recruitment.transactions;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    @Query("select t from Transaction t where t.timestamp >= :from and t.timestamp < :to")
    List<Transaction> findTransactionFor(LocalDateTime from, LocalDateTime to);

}
