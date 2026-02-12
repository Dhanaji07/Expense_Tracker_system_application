package com.expense_tracker.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double amount;
    private LocalDate date;
    private String description;

    // getters and setters
}
