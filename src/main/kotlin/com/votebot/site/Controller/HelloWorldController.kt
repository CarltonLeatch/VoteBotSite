package com.votebot.site.Controller

import org.springframework.beans.factory.annotation.Autowired
import com.votebot.site.Repository.GuildInterface;
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloWorldController{

@Autowired
lateinit var guildRepository: GuildInterface

    @GetMapping("/")
    fun helloWordl() : String {
        return "index"
    }

    @GetMapping("/guilds")
    fun getAllGuilds(model: Model):String{
        model.addAttribute("guilds", guildRepository.findAll())
        System.out.println(guildRepository.findAll().get(1).id)
        return "guilds"
    }


}