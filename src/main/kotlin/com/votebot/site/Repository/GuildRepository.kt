package com.votebot.site.Repository

import com.votebot.site.Model.Guild
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface GuildRepository :CrudRepository<Guild,Long>{
    fun findByGuildName(guildName:String) : Guild? = null
}


