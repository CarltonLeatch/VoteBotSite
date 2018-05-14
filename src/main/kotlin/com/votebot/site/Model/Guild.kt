package com.votebot.site.Model

import javax.persistence.Entity
import javax.persistence.*

@Entity
data class Guild(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val  id : Long? = null,
        val guildName : String? = null
        )