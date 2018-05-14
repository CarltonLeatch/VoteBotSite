package com.votebot.site.Model

import javax.persistence.*

@Entity
class Argument (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val  id : Long? = null,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "vote_id")
        val vote: Vote? = null,
        val argument : String? = null,
        val count : Int? = null
)