package me.tylermoser.budget.server.entity

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
data class Expense(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Long,
    @ManyToOne var budget: Budget,
    @ManyToOne var owner: User,
    var datetime: LocalDateTime,
    var description: String,
    var amount: Double
) {

}
