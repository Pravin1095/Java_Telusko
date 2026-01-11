import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//This controller annotation makes this a servlet and this class gets called
//once client request starts

//With RequestMapping we say that we need to call home method once we land in homepage

//But still the page doesn't show up but we get our jsp getting downloaded instead.
//We need to convert our JSP to servlet to achieve this so that we can see the page
//To av=chieve it we need to download a dependency tomcat jasper from mvn. Use same
//version as you Tomcat. Our case 11.0.15

@Controller
public class HomeController{

    @RequestMapping("/")
    public String home(){
        System.out.println("Home method  called");
        return "index.jsp";
    }
}