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

//    @GetMapping
//    fun helloWordl() : String {
//        return "index"
//    }

        @GetMapping("/getAll")
        fun getAllGuilds(model : Model) : String {
            model.addAttribute("guilds", guildRepository.findAll())
            return "index"
        }
}