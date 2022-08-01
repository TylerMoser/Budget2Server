package me.tylermoser.budget.server.repository

import me.tylermoser.budget.server.entity.BudgetGroup
import org.springframework.data.repository.CrudRepository

interface BudgetGroupRepository : CrudRepository<BudgetGroup, Long> {

}
