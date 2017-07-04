package com.epi.j2ee.web;

import com.epi.j2ee.domain.User;
import com.epi.j2ee.metier.IGenericService;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Autowired
    private IGenericService<User> metier;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String loginAction() {
        return "redirect:/admin/dashboard";
    }

    @RequestMapping(value = "/admin/dashboard", method = RequestMethod.GET)
    public String homeAction(Model model, HttpServletRequest request) {
        getUserLooged(request);
        HttpSession sess = request.getSession();
        User user = (User) sess.getAttribute("user");
        model.addAttribute("user", user);
        model.addAttribute("role", sess.getAttribute("role"));
        model.addAttribute("menuActive", "dashboard-content");
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(HttpServletRequest request) {
        return "login";
    }
    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String accessDenied403() {

        return "login";
    }

    @RequestMapping(value = "/404", method = RequestMethod.GET)
    public String notFoundAction(Model model) {
        return "redirect:/admin/dashboard";
    }

    private void getUserLooged(HttpServletRequest httpServletRequest) {
        HashMap<String, Object> row = new HashMap<String, Object>();
        HttpSession session = httpServletRequest.getSession();
        if (session != null) {
            SecurityContext securityContext = (SecurityContext) session.getAttribute("SPRING_SECURITY_CONTEXT");
            User user = metier.find(User.class, securityContext.getAuthentication().getName());
            session.setAttribute("user", user);
        }
    }
}
