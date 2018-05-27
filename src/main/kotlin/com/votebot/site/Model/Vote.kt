package com.votebot.site.Model
import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.annotations.Fetch
import org.hibernate.annotations.FetchMode
import java.io.Serializable
import javax.persistence.*;

@Entity
data class Vote (@Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            val  id : Long? = null,
                @ManyToOne(fetch = FetchType.LAZY)
            @JoinColumn(name = "guild_id")
                 var guild: Guild? = null,
                 var title : String? = null,
                 var voteEnum: VoteEnum? = null,
                 @OneToMany(cascade = arrayOf(CascadeType.ALL), fetch = FetchType.LAZY, mappedBy = "vote", orphanRemoval = true)
            @Fetch(value = FetchMode.SUBSELECT)
                 var arguments : List<Argument>?=null
            ) : Serializable {
    override fun toString(): String {
        return super.toString()
    }
}