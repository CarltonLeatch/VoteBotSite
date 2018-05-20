package com.votebot.site.Controller

import com.votebot.site.Repository.GuildInterface
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Controller
class VoteController {

    @Autowired
    lateinit var guildRepository: GuildInterface

    @GetMapping("/guild/{guildId}")
    fun getVotes(@PathVariable("guildId") id : Long, model : Model): String{
        model.addAttribute("guilds", guildRepository.findById(id))
        return "guildView"
    }
}