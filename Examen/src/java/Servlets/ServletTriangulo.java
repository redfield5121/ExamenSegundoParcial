package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTriangulo extends HttpServlet {

    double resultado;
    double base;
    double altura;
    double lado2;
    double lado3;
    String opcion;

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        opcion = request.getParameter("Opcion");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet ServletRectangulo</title>");
        out.println("</head>");
        out.println("<body style='background-color: red ; color : white'>");
        out.println("<center>");
        out.println("<br><br><br><br>");
        out.println("<font size='10'>Triangulo" + "</font>");
        out.println("<font size='10'>");
        out.println("<br><br>");
        if (opcion.equals("Area")) {
            altura = Double.parseDouble(request.getParameter("Altura"));
            base = Double.parseDouble(request.getParameter("Base"));
            resultado = (base/2)*altura;
            out.println("El area es : " + resultado);
        } else if (opcion.equals("Perimetro")) {
            base = Double.parseDouble(request.getParameter("Base"));
            lado2 = Double.parseDouble(request.getParameter("Lado2"));
            lado3 = Double.parseDouble(request.getParameter("Lado3"));
            resultado = lado2 + lado3 + base;
            out.println("El perimetro es : " + resultado);

        }
        out.println("</font>");
        out.println("</center>");
        out.println("</body>");
        out.println("</html>");
    }
}
