package me.tylermoser.budget.server.repository

import me.tylermoser.budget.server.entity.Expense
import org.springframework.data.repository.CrudRepository

interface ExpenseRepository : CrudRepository<Expense, Long> {

}
