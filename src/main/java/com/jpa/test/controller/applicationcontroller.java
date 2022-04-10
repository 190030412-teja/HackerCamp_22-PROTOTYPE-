package com.jpa.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.jpa.test.dao.booking;
import com.jpa.test.dao.userEmergency;
import com.jpa.test.dao.userRepository;
import com.jpa.test.entities.book;
import com.jpa.test.entities.user;
import com.jpa.test.entities.emergency;
import com.jpa.test.services.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class applicationcontroller {
  
  @Autowired
  userservice users;
  @Autowired
  booking book;
  @Autowired
  userEmergency useremp;
  @Autowired
  userRepository repo;
  String username=null;
  String name=null;
  
//   @GetMapping("/")
//   public String login_user() {
//     return "lalog";
//   }

  
  
  /*@GetMapping("/updateUserApp/{empid}")
  public ModelAndView updateemployee(@PathVariable("empid")int empid,Model map)
  {
	  ModelAndView mv=new ModelAndView();
	  mv.setViewName("booking2");
	  map.addAttribute("id", empid);
	  return mv;
  }*/


@GetMapping("/doctor")
public String doctor() {
  return "doctor";
}

@GetMapping("/management")
public String management()
{
  return "lalog1";
}

  
  @GetMapping("/deleteUserApp/{empid}")
  public String deleteUserApp(@PathVariable("empid")int empid)
  {
	  users.deleteemployeerecord(empid);
	  return "redirect:/ViewBooking";
  }
  
  @GetMapping("/deleteApp/{empid}")
  public String deleteemployee(@PathVariable("empid")int empid)
  {
	  users.deleteemployeerecord(empid);
	  return "redirect:/viewAllBooking";
  }
  
  @GetMapping("/viewAllUsers")
  public ModelAndView viewusers()
  {
    List<user> obj=users.getallusers();
    ModelAndView mv=new ModelAndView();
    mv.setViewName("adminUsers");
    mv.addObject("userda",obj);
    return mv;
  }
  
  @GetMapping("/viewAllBooking")
  public ModelAndView viewrecords()
  {
    List<book> records=users.getallrecords();
    ModelAndView mv=new ModelAndView();
    mv.setViewName("admin");
    mv.addObject("records",records);
    return mv;
  }
  
  @RequestMapping("/AcceptApp/{records}")
  public String updateStatus(@PathVariable("records")int records)
  {
	  //ModelAndView mv=new ModelAndView();
	  book.findById2(records,"Accepted");
	  //obj.setStatus("Accepted Booking");
	  //book.save(obj);
	  return "redirect:/viewAllBooking";
  }
  
  @GetMapping("/ViewBooking1")
  public String  ViewBooking1(Model m) 
  {
	System.out.println(name+" in ViewBooking1");
	List<book> list=book.findByBookuser(name);
  	/*for(book k:list)
  	{
  		System.out.println(k.getBookuser());
  	}*/
  	m.addAttribute("emp123", list);
	return "ViewBooking1";
  }
  
  @GetMapping("/ViewBooking")
  public String  ViewBooking(Model m) 
  {
	  
	List<book> list=book.findByBookuser(username);
  	for(book k:list)
  	{
  		System.out.println(k.getBookuser());
  	}
  	m.addAttribute("emp123", list);
	  return "ViewBooking";
  }

  
  @GetMapping("/home")
  public String index() {
	  return "index";
  }
  
  @GetMapping("/booking")
  public String addstudent()
  {
	  
	  return "booking";
  }
  
  @GetMapping("/booking1")
  public String addstudent1()
  {
	  
	  return "booking1";
  }
  
  /*@GetMapping("/booking")
  public String booking() {
    return "booking";
  }*/
  
  @GetMapping("/admin")
  public String admin() {
    return "admindash";
  }
  
  @GetMapping("/guest")
  public String guest() {
    return "guest";
  }
    
    
//    @GetMapping("/lalog")
//     public String home1() {
//       return "lalog";
//     }
       
  @GetMapping("/")
  public ModelAndView addemployee() {
    
    return new ModelAndView("lalog","emp",new user());
  }
    
  /*@PostMapping("/updateUserApp/{empid}")
  public ModelAndView UpdateApp(@ModelAttribute("obj") book obj,@PathVariable("empid")int empid)
  {
	  ModelAndView mv=new ModelAndView();
	  book v=book.findById1(empid);
	 book.saveOrUpdate()
	  mv.setViewName("ViewBooking");
	  return mv;
  }*/
  
  @PostMapping("/saveappEmp")
  public ModelAndView addAppEmp(@ModelAttribute("obj") book obj,@RequestParam("name") String name1,Model m)
  {
	  //System.out.println(name+"save in data");
	  obj.setBookuser(name);
	  obj.setStatus("Accepted");
	  System.out.println(name1+" in postmapping");
	  //users.addAppoint(obj);
	  System.out.println(obj.getBookuser());
	  List<book> list=book.findByBookuser(name);
	  for(book k:list)
	  {
		  System.out.println(k.getBookuser());
	  }
	  m.addAttribute("emp123", list);
	  users.addAppoint(obj);
	  ModelAndView mv=new ModelAndView();
	  mv.setViewName("index");
	  return mv;
  }
  
    @PostMapping("/saveapp")
    public ModelAndView addApp(@ModelAttribute("obj") book obj,@RequestParam("name") String name,Model m)
    
    {
    	
    	obj.setBookuser(username);
    	obj.setStatus("Pending");
    	System.out.println(name);
    	System.out.println(obj.getBookuser());
    	List<book> list=book.findByBookuser(username);
    	for(book k:list)
    	{
    		System.out.println(k.getBookuser());
    	}
    	m.addAttribute("emp123", list);
      users.addAppoint(obj);
      ModelAndView mv=new ModelAndView();
      mv.setViewName("index");
      return mv;
    }
    
    @PostMapping("/adduser")
    public ModelAndView adduser(@ModelAttribute("us") user us)
  {
    users.adduser(us);
    ModelAndView mv = new ModelAndView();
    mv.setViewName("index");
    return mv;
  }
    
    @RequestMapping(value="logout")
    public String logout(HttpSession session) 
    {
      session.invalidate();
      return "lalog";
    }
    
    @PostMapping("/emergency")
    public String emergency(@ModelAttribute("empuser") emergency emp,HttpServletRequest request)
    {
    	
    	System.out.println(emp.getName()+" emergency");
    	name=emp.getName();
    	System.out.println(name+"in controller");
    	HttpSession session=request.getSession(); 
        session.setAttribute("uname", name);
    	useremp.save(emp);
    	return "guest";
    }
    
    @PostMapping("/user")
    public String login(@RequestParam("name") String name,@RequestParam("pass") String pass ,HttpServletRequest request)
    {  
      
       //String name=users.findByName(us.getName());
      System.out.println(name+"Login");
      // String pass = users.findByPass(us.getPass());
       //ModelAndView mv = new ModelAndView();
       if(name!=null && pass!=null) 
       {
    	   username=name;
         HttpSession session=request.getSession(); 
         session.setAttribute("uname", name);
//       mv.setViewName("slg");
//       mv.addObject("uname",us.getName());
       return "index";
       }
//       mv.setViewName("flg");
      return "flg";
    
  }
    @PostMapping("/submitempdata")
  public ModelAndView submitempdata(@ModelAttribute("emp") user emp) {
    
    
      users.adduser(emp);
    
    ModelAndView mv = new ModelAndView();
    mv.setViewName("lalog");
    mv.addObject("name",emp.getName());
    
    return mv;
    
  }
   
}