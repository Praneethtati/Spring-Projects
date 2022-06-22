package mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DemoController {
    
	@RequestMapping("first")
	public ModelAndView displayid(HttpServletRequest req,HttpServletResponse res) {
		String id=req.getParameter("id");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("id",id);
		return mv;
	}

   @ResponseBody 
   @RequestMapping("second")
   public String displayname(HttpServletRequest req,HttpServletResponse res) {
	   String name=req.getParameter("name");
	   return name;
}
	
}
