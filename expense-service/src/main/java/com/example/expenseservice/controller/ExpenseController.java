package com.example.expenseservice.controller;

import com.example.expenseservice.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/expense")
public class ExpenseController {

    private final ExpenseService expenseService;

}
