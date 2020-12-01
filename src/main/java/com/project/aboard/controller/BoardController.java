package com.project.aboard.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
public class BoardController {

	@GetMapping({"/", "/board/list"})
	public ModelAndView list() {
		return new ModelAndView("home");
	}
}
