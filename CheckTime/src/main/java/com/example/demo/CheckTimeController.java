package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CheckTimeController {

	@Autowired
	private AuthService authService;

	@RequestMapping(value="/")
    public ModelAndView index(ModelAndView mv,Model model) {
		model.addAttribute("AuthForm", new AuthForm());
        mv.setViewName("login");
        return mv;
    }

	@RequestMapping(value="/Certification" ,method=RequestMethod.POST)
	public String Certification(@ModelAttribute AuthForm authForm, Model model) {
		boolean branch = authService.countData(authForm.getUsername(), authForm.getPassword());

		if (branch == true) {
			return "home";
		}
		return "login";

	}

}
