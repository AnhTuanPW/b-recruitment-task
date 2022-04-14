package com.bolt.recruitment.transactions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TransactionFinder {

    private final TransactionRepository transactionRepository;

    public List<Transaction> findForDate(LocalDate date) {
        LocalDateTime startOfDay = date.atStartOfDay();
        LocalDateTime endOfDay = date.atStartOfDay().plusDays(1);
        return transactionRepository.findTransactionFor(startOfDay, endOfDay);
    }
}
