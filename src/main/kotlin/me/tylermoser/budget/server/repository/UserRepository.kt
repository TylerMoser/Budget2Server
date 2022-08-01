package me.tylermoser.budget.server.repository

import me.tylermoser.budget.server.entity.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Long> {

}
