package com.expense_tracker.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.expense_tracker.repository.ExpenseRepository;
import com.expense_tracker.model.Expense;

@Controller
@RequestMapping("/expense")
public class ExpenseController {

    private final ExpenseRepository expenseRepo;

    public ExpenseController(ExpenseRepository expenseRepo) {
        this.expenseRepo = expenseRepo;
    }

    @GetMapping("/add")
    public String addPage() {
        return "addExpense";
    }

    @PostMapping("/add")
    public String saveExpense(Expense expense) {
        expenseRepo.save(expense);
        return "redirect:/expense/list";
    }

    @GetMapping("/list")
    public String expenseList(Model model) {
        model.addAttribute("expenses", expenseRepo.findAll());
        return "expenseList";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("expense", expenseRepo.findById(id).get());
        return "editExpense";
    }

    @PostMapping("/update")
    public String update(Expense expense) {
        expenseRepo.save(expense);
        return "redirect:/expense/list";
    }
}
