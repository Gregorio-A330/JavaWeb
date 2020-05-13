package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ConexãoBD.Conexão;
import java.sql.*;

public final class Controle_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"pt-br\" lang=\"pt-br\">\n");
      out.write("    <head>\n");
      out.write("        <title> Controle de fluxo </title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        String sql = null;
        int varId = 0;
        String varTela = request.getParameter("tela");
        if (varTela.equals("incluir") || varTela.equals("alterar") || varTela.equals("excluir") || varTela.equals("consultar") || varTela.equals("telaalterar")) {
            varId = Integer.parseInt(request.getParameter("id"));
        }
        if (varTela.equals("incluir")) {
            String varNome = request.getParameter("nome");
            double varRenda = Double.parseDouble(request.getParameter("renda"));
            sql = "insert into cliente values(" + varId + ",'" + varNome + "'," + varRenda + ")";
        }
        if (varTela.equals("telaalterar")) {
            String varNome = request.getParameter("nome");
            double varRenda = Double.parseDouble(request.getParameter("renda"));
            sql = "update cliente set nome='" + varNome + "', renda=" + varRenda + " where id=" + varId + "";
        }
        if (varTela.equals("excluir")) {
            sql = "delete from cliente where id=" + varId + "";
        }
        Conexão conbd = new Conexão();
        conbd.conectar();
        if (conbd.getRetorno() == 0) {
            out.println("Erro na conexão com o banco de dados");
        } else {
            if (varTela.equals("incluir") || varTela.equals("excluir")|| varTela.equals("telaalterar")) {
                conbd.incAltExc(sql);
                if (conbd.getRetorno() == 0) {
                    out.println("<h2 align='center'>Erro na operação</h2>");
                    out.println("<br /> <br />");
                    out.println("<p align='center'><a href='index.jsp'>Home</a></p>");
                } else {
                    out.println("<h2 align='center'>Operação realizada com sucesso</h2>");
                    out.println("<br /> <br />");
                    out.println("<p align='center'><a href='index.jsp'>Home</a></p>");
                }
            }
            if (varTela.equals("alterar")) {
             response.sendRedirect("Alterar.jsp?id="+ varId +"");
            }                           
            if (varTela.equals("consultar")){
             response.sendRedirect("Exibir.jsp?id="+ varId +"");
            }                           
            if (varTela.equals("listar")){
             response.sendRedirect("Exibir.jsp?id=0");
            }
            conbd.desconectar();
        }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
