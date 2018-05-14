package com.votebot.site.Model

import javax.persistence.Entity
import javax.persistence.*;

@Entity
data class Channel(@Id
                   @GeneratedValue(strategy = GenerationType.IDENTITY)
                   val id: Long? = null,

                   @ManyToOne(fetch = FetchType.LAZY)
                   @JoinColumn(name = "guild_id")
                   val guild: Guild? = null,
                   val channelId : String? = null,
                   val type : ChannelEnum? = null
                   )