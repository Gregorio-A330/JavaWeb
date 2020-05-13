package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TelaConsultar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"pt-br\" lang=\"pt-br\">\n");
      out.write("    <head>\n");
      out.write("        <title> Menu Principal </title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" />\n");
      out.write("        <script type=\"text/JavaScript\">\n");
      out.write("            function valida()\n");
      out.write("            {\n");
      out.write("                with (document.formulario)\n");
      out.write("                {\n");
      out.write("                    if (id.value == \"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Por favor, digite o ID a consultar \");\n");
      out.write("                        nome.focus();\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function Excluir() {\n");
      out.write("                document.formulario.tela.value = \"excluir\";\n");
      out.write("                var v = valida();\n");
      out.write("                if(v!=false){\n");
      out.write("                    document.formulario.submit();\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function Consultar() {\n");
      out.write("                document.formulario.tela.value = \"consultar\";\n");
      out.write("                var v = valida();\n");
      out.write("                if(v!=false){\n");
      out.write("                    document.formulario.submit();\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function Alterar() {\n");
      out.write("                document.formulario.tela.value = \"alterar\";\n");
      out.write("                var v = valida();\n");
      out.write("                if(v!=false){\n");
      out.write("                    document.formulario.submit();\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"formulario\" method=\"post\" action=\"Controle.jsp\">\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                        <h2>Controle de Clientes</h2>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><label>ID:</label></td>\n");
      out.write("                    <td><input name=\"id\" type=\"text\" size=\"10\" /> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\">\n");
      out.write("                        <input type=\"hidden\" name=\"tela\" value=\"\" />\n");
      out.write("                        <input type=\"button\" value=\"Consultar\" onclick=\"Consultar()\" />\n");
      out.write("                        <input type=\"button\" value=\"Excluir\" onclick=\"Excluir()\" />\n");
      out.write("                        <input type=\"button\" value=\"Alterar\" onclick=\"Alterar()\" />\n");
      out.write("                        <input type=\"reset\" value=\"Limpar\" />\n");
      out.write("                        <input type=\"button\" value=\"Voltar\" onclick=\"history.go(-1)\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
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
