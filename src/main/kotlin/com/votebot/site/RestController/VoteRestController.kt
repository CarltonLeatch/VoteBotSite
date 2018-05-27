package com.votebot.site.RestController

import com.votebot.site.Model.Argument
import com.votebot.site.Model.Vote
import com.votebot.site.Repository.ArgumentRepository
import com.votebot.site.Repository.VoteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class VoteRestController{

    @Autowired
    lateinit var voteRepository: VoteRepository
    @Autowired
    lateinit var argumentRepository: ArgumentRepository

    @GetMapping("/rest/vote/{voteId}")
    fun vote(@PathVariable voteId : Long) : List<String>? {
       val argument = argumentRepository.findArgumentByVoteId(voteId)
        val arguments : MutableList<String>? = ArrayList<String>()
        if (argument != null) {
            argument.forEach { argument ->
                if (arguments != null) {
                    arguments.add(argument.argument!!)

                }
            }
        }

        return arguments
    }
}


