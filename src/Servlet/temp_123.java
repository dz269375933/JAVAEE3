import java.io.PrintWriter;import java.io.IOException;import javax.servlet.ServletConfig;import javax.servlet.ServletException;import test.Request;import test.Response;import Servlet.ServletInterface;
 public class temp_123 implements ServletInterface{ 
 public void destroy() {}
 @Override 
 public ServletConfig getServletConfig() {return null;}
@Override
	public String getServletInfo() {return null;}
	public void init(ServletConfig arg0) throws ServletException {}
 public void service(Request request, Response response) throws ServletException, IOException { PrintWriter out = response.getWriter();out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\"><html>");String a="test"; out.println("<head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"><title>Hello</title><h1>Hello world! </h1><a value=\"");out.println(a);out.println("\"></head><body></body></html>");}
}