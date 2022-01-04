package com.darknamer.apidemo.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.view.RedirectView

@Controller
class HomeController {
    @GetMapping
    fun index(): RedirectView {
        return RedirectView("/swagger-ui/index.html");
    }
}