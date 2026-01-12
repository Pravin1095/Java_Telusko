package com.teluskoLearning.demo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//This controller annotation makes this a servlet and this class gets called
//once client request starts

//With RequestMapping we say that we need to call home method once we land in homepage

//But still the page doesn't show up but we get our jsp getting downloaded instead.
//We need to convert our JSP to servlet to achieve this so that we can see the page
//To av=chieve it we need to download a dependency tomcat jasper from mvn. Use same
//version as you Tomcat. Our case 11.0.15

//The mapping of requests happens internally with the help of DispatcherServlet

//use session to set the value that you want to show in the screen, In result.jsp
//wrap java variable or code inside <%= session.getAttribute("result")%> or ${result} and get the value with session.getAttribute

@Controller
public class HomeController{

    @RequestMapping("/")
    public String home(){
        System.out.println("Home method  called");
        return "index";
    }

//    @RequestMapping("add")
//    public String result(HttpServletRequest req, HttpSession session){
//        System.out.println("res");
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1 + num2;
//        session.setAttribute("result", result);
//
//        return "result";
//    }

    // Using Request mapping to get the inputs directly as a query rather than req body

    @RequestMapping("add")
    public ModelAndView result(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv){
        System.out.println("res");
        int result = num1 + num2;
        mv.addObject("result", result);
        mv.setViewName("result");  //Setting the view name (jsp file in our case)

        return mv;
    }

    @RequestMapping("addAlien")
    public ModelAndView addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv){
        System.out.println("addAlien");
        Alien alien = new Alien();
        alien.setAid(aid);
        alien.setAname(aname);

        mv.addObject("alien", alien);
        mv.setViewName("result");  //Setting the view name (jsp file in our case)

        return mv;
    }


}