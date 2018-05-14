package com.votebot.site.Model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.*;
@Entity
data class Moderators(@Id
                      @GeneratedValue(strategy = GenerationType.IDENTITY)
                      val  id : Long? = null,
                      @ManyToOne(fetch = FetchType.LAZY)
                      @JoinColumn(name = "guild_id")
                      val guild: Guild? = null,
                      val userID : String? =null,
                      val username : String? =null,
                      val descriminator : String? =null,
                      val guildOwner : Boolean? =null
                      )