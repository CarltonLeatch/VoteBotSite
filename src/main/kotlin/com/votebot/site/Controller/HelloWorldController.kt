package com.votebot.site.Controller

import com.votebot.site.Model.Guild
import org.springframework.beans.factory.annotation.Autowired
import com.votebot.site.Repository.GuildRepository;
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloWorldController{

@Autowired
lateinit var guildRepository: GuildRepository

    @GetMapping("/")
    fun helloWordl() : String {
        return "index"
    }

    @GetMapping("/guilds")
    fun getAllGuilds(model: Model):String{
        model.addAttribute("guilds", guildRepository.findAll())
        return "guilds"
    }


}