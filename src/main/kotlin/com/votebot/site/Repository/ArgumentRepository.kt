package com.votebot.site.Repository

import com.votebot.site.Model.Argument
import org.springframework.data.jpa.repository.JpaRepository

interface ArgumentRepository : JpaRepository<Argument, Long> {
    fun findArgumentByVoteId(voteId: Long) : List<Argument>?
}