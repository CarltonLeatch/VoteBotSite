package com.votebot.site.Controller

import com.votebot.site.Model.Guild
import com.votebot.site.Model.Users
import com.votebot.site.Model.Vote
import com.votebot.site.Repository.GuildRepository
import com.votebot.site.Repository.UserRepository
import com.votebot.site.Repository.VoteRepository
import com.votebot.site.Service.PasswordEncrypter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpSession


@Controller
@RequestMapping("/panel")
class LoginController {

    @Autowired
    lateinit var userRepository: UserRepository
    @Autowired
    lateinit var passwordEncrypter: PasswordEncrypter

    @GetMapping("/admin")
    fun adminPanel(model: Model): String {
        model.addAttribute("user", Users())
        return "admin"
    }

    @PostMapping("/admin")
    fun login(@ModelAttribute users: Users, model: Model, session: HttpSession): String {

        if(userRepository.findByUsername(users.username!!) ===null) {
            println(users.username)
            println(users.password)
            println("null")
        }
        else {
            println(users.username)
            println(users.password)
            val user: Users = userRepository.findByUsername(users.username!!)!!
            if (passwordEncrypter.passowrdEncoder().matches(users.password,user.password)) {
                session.setAttribute("logged", true)
                println("ładzionka")
            }
            else session.setAttribute("logged", false)

        }
        return "index"
    }

    @PostMapping("/admin/register")
    fun register(@ModelAttribute user : Users) : String{
        user.password = passwordEncrypter.passowrdEncoder().encode(user.password)
        userRepository.save(user)
        return "index"
    }
}