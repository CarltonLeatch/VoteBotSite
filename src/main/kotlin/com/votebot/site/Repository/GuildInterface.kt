package com.votebot.site.Repository

import com.votebot.site.Model.Guild
import org.springframework.data.jpa.repository.JpaRepository

public interface GuildInterface :JpaRepository<Guild,Long> {
}