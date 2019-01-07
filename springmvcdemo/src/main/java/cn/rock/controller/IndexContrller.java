package cn.rock.controller;

import cn.rock.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexContrller {

    /**
     * 跳转到首页
     * @return
     */
//    @RequestMapping("/index")
//    public ModelAndView index(){
//        return new ModelAndView("index");
//    }

    @RequestMapping("/test")
    @ResponseBody
    public Object test(){
        Student s = new Student();
        s.setAge(5);
        s.setName("rock");
        return new ModelAndView("index");
    }

    @RequestMapping("/get1")
    @ResponseBody
    public Object ff(String sss){
//        Student s = new Student();
//        s.setAge(5);
//        s.setName("rock");
        return sss;
    }
}
