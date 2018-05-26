package com.votebot.site.Controller

import com.votebot.site.Model.Guild
import com.votebot.site.Repository.GuildRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import java.util.*

@Controller
class VoteController {

    @Autowired
    lateinit var guildRepository: GuildRepository

    @GetMapping("/guild/{guildId}")
    fun getVotes(@PathVariable guildId: String, model: Model): String {
        if (guildRepository.findByGuildName(guildId) !== null) {
            model.addAttribute("isNull", false)
            model.addAttribute("guild", guildRepository.findByGuildName(guildId))
        } else
            model.addAttribute("isNull", true)
        return "guildView"
    }
}