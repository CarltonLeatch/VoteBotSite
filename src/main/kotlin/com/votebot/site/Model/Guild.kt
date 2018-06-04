package com.votebot.site.Model

import javax.persistence.Entity
import javax.persistence.*
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
@Entity
data class Guild(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val  id : Long? = null,
        val guildName : String? = null,
        val guildTextName : String? = null,
        @OneToMany(cascade = arrayOf(CascadeType.ALL), fetch = FetchType.EAGER, mappedBy = "guild", orphanRemoval = true)
        @Fetch(value = FetchMode.SUBSELECT)
        val moderators : List<Moderators>?=null,
        @OneToMany(cascade = arrayOf(CascadeType.ALL), fetch = FetchType.EAGER, mappedBy = "guild", orphanRemoval = true)
        @Fetch(value = FetchMode.SUBSELECT)
        val channels : List<Channel>? = null,
        @OneToMany(cascade = arrayOf(CascadeType.ALL), fetch = FetchType.EAGER, mappedBy = "guild", orphanRemoval = true)
        @Fetch(value = FetchMode.SUBSELECT)
        var votes : List<Vote>? = null
        ){
        override fun toString(): String {
                return super.toString()
        }

}