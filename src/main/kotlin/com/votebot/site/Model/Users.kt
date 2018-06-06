package com.votebot.site.Model

import org.hibernate.annotations.Fetch
import org.hibernate.annotations.FetchMode
import javax.persistence.*

@Entity
@Table(name = "Users")
data class Users(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val  id : Long? = null,
        @Column(unique = true)
        val username : String? = null,
        var password : String? = null
){
    override fun toString(): String {
        return super.toString()
    }

}