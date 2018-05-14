package com.votebot.site.Model
import org.hibernate.annotations.Fetch
import org.hibernate.annotations.FetchMode
import javax.persistence.*;

@Entity
class Vote (@Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            val  id : Long? = null,
            @ManyToOne(fetch = FetchType.LAZY)
            @JoinColumn(name = "guild_id")
            val guild: Guild? = null,
            val title : String? = null,
            val voteEnum: VoteEnum? = null,
            @OneToMany(cascade = arrayOf(CascadeType.ALL), fetch = FetchType.LAZY, mappedBy = "vote", orphanRemoval = true)
            @Fetch(value = FetchMode.SUBSELECT)
            val arguments : List<Argument>?=null
            )