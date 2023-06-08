import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiController {

    @RequestMapping("/omikuji")
    public String showOmikujiForm() {
        return "omikuji-form.jsp";
    }
        @PostMapping("/omikuji")
        public String processOmikujiForm(@RequestParam("name") String name, HttpSession session) {
            session.setAttribute("name", name);
            return "redirect:/omikuji/show";
        }

            @RequestMapping("/omikuji/show")
            public String showFortune(HttpSession session, Model model) {
                String name = (String) session.getAttribute("name");
                // Use the name and any other session data to generate the fortune

                // Add the fortune and any other necessary data to the model
                model.addText("fortune");

                return "fortune.jsp";
            }
        }