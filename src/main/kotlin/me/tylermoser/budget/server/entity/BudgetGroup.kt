package me.tylermoser.budget.server.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
data class BudgetGroup(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Long,
    @ManyToOne var owner: User,
    var name: String
) {

}
