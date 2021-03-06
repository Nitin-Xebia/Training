package com.server;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.apache.cxf.message.Message;
import org.apache.cxf.phase.PhaseInterceptorChain;
import org.apache.cxf.transport.http.AbstractHTTPDestination;

@Consumes("application/json")
@Produces("application/json")
public class StudentUpdateImpl implements StudentUpdate {
	
	//The url http://localhost:8090/CXF-Student-Service/rest?_wadl 
	//indicates WADL description of REST service
	
	public StudentUpdateImpl()
	{
		//name="";
		System.out.println("StudentUpdateImpl constructor is ghere");
	}
	
	private String name;
	

  @POST
  @Path("/updateName")
  public Student changeName(Student obj) {     
   /* name=obj.getName();
    obj.setName(name);*/
    System.out.println("update with Post");
   // Here We get the client session from Message
    Message message = PhaseInterceptorChain.getCurrentMessage();
    HttpServletRequest request = (HttpServletRequest)message.get(AbstractHTTPDestination.HTTP_REQUEST);
    HttpSession  session = request.getSession(true);
    System.out.println("The session is new "+session.isNew());
    session.setAttribute("sName",obj.getName());
    System.out.println("Student data  is  "+session.getAttribute("sName"));
    name = obj.getName();
    System.out.println("The name set in update is "+name);
    return obj;
  }

  @GET
  @Path("/updateName")
  public Student getName() {
    Student student = new Student();    
    //student.setName(name);
    System.out.println("update with GETst");
 // Here We get the client session from Message
    Message message = PhaseInterceptorChain.getCurrentMessage();
    HttpServletRequest request = (HttpServletRequest)message.get(AbstractHTTPDestination.HTTP_REQUEST);
    HttpSession  session = request.getSession(true);
    System.out.println("The session in get is new "+session.isNew());
    String data = (String) session.getAttribute("sName");  
    System.out.println("Session data read is  "+data);
    student.setName(name);
    System.out.println("The name GET in update is "+name);
    return student;
  }
}