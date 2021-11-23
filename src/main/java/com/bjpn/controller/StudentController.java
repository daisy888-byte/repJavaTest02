package com.bjpn.controller;

import com.bjpn.domain.Student;
import com.bjpn.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentController {
    @Resource
    private StudentService ss;
    @RequestMapping(value = "find.do")
    @ResponseBody
    public List<Student> searchByName(@RequestParam("firstname") String fn){
//        System.out.println(fn);
        List<Student> list = ss.searchStudents(fn);
        return  list ;
    }
    @RequestMapping("delete.do")
    public ModelAndView deleteById(Integer id){
        ModelAndView mv =new ModelAndView();
        Integer nums = ss.removeStudent( id);

        if(nums>0){
            mv.addObject("res","移除成功");
        }else{
            mv.addObject("res","移除失败");
        }


        mv.setViewName("tips");
        return mv;

    }

}
