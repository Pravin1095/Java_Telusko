import org.springframework.stereotype.Controller;

//This controller annotation makes this a servlet and this class gets called
//once client request starts
@Controller
public class HomeController{

    public String home(){
        System.out.println("Home method  called");
        return "index.jsp";
    }
}