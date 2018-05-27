package com.votebot.site.Model

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
class Argument(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
        @JsonIgnore
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "vote_id")
        val vote: Vote? = null,
        val argument: String? = null,
        val count: Int? = null
) {
    override fun toString(): String {
        return super.toString()
    }
}