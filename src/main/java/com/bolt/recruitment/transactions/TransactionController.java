package com.bolt.recruitment.transactions;

import java.time.LocalDate;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionFinder transactionFinder;

    @GetMapping
    public List<Transaction> findTransactions() {
        LocalDate todayDate = LocalDate.parse("2019-10-16");
        return transactionFinder.findForDate(todayDate);
    }
}
