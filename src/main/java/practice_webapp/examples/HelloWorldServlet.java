/*
* This Java source file was generated by the Gradle 'init' task.
*/

package practice_webapp.examples;

import java.io.IOException;
import java.io.Writer;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * HelloWorld
 *
 */

public class HelloWorldServlet extends HttpServlet {

    /**
     *
     * デフォルト・コンストラクタ
     *
     */

    public HelloWorldServlet() {

        super();

    }

    @Override

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        Writer out = response.getWriter();

        out.write("<!DOCTYPE html>");
        out.write("<html>");
        out.write("<head>");
        out.write("<title>");
        out.write("Hello World !!");
        out.write("</title>");
        out.write("</head>");
        out.write("<body>");
        out.write("<p style=\"color: #f00;\">");
        out.write("Hello World !!");
        out.write("</p>");
        out.write("</body>");
        out.write("</html>");

        out.close();

    }

}
