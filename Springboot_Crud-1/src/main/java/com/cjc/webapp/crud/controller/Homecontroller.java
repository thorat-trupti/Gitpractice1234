package com.cjc.webapp.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.webapp.crud.model.Student;
import com.cjc.webapp.crud.service.Homeservice;

@Controller
public class Homecontroller {
	
	@Autowired Homeservice hs;
	
	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}
	
		
	@RequestMapping("/reg")
	public String RegisterData(@ModelAttribute Student s)
	{
	    hs.saveData(s);
		return "login";
	}
	@RequestMapping("/Register")
	public String preregister()
	{
		return "register";
	}
   
 
    @RequestMapping("/log")
    public String LogCheck(@RequestParam("uname") String un ,@RequestParam("password") String pass,Model m )
    {
    	Student st = hs.Logincheck(un, pass);
    	if(st!=null)
    	{
    		if(un.equals("Admin")&&pass.endsWith("Admin@1"))
    		{
    			
    		}
    		else
    		{
    			
    		}
    	Iterable<Student> list =hs.displayData();
    	m.addAttribute("data", list);
    		return "success";
    	}
    	else
    	{
    		return "login";
    	}
    }
    @RequestMapping("/edit")
    public String EditData(@RequestParam("uid")int uid,Model m)
    {
    Student st	= hs.getData(uid);
    m.addAttribute("data", st);
    	return "edit";
    }
    
    @RequestMapping("/update")
    public String Update(@ModelAttribute Student s , Model m)
    {
    	Iterable<Student> list =hs.displayData();
    	m.addAttribute("data", list);
    	return "success";
    }
      @RequestMapping("/delete")
      public String Delete(@RequestParam ("uid")int id,Model m)
      {
    	 hs.deleteData(id); 
    	 Iterable<Student> list =hs.displayData();
     	m.addAttribute("data", list);

    	return "success";  
      }

}