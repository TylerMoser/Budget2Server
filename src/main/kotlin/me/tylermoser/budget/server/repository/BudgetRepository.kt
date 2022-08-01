package me.tylermoser.budget.server.repository

import me.tylermoser.budget.server.entity.Budget
import org.springframework.data.repository.CrudRepository

interface BudgetRepository : CrudRepository<Budget, Long> {

}
