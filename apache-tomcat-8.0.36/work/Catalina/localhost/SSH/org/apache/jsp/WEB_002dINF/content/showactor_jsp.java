/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2016-09-01 09:20:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class showactor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>actors</title>\r\n");
      out.write("<script src=\"./js/jquery-1.12.3.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/jquery.bootgrid.min.css\">\r\n");
      out.write("<script src=\"//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"./js/jquery.bootgrid.min.js\"></script>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("  \t<div class=\"row\">\r\n");
      out.write("  \t\t<div class=\"col-md-12\">\r\n");
      out.write("  \t\t<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\" aria-expanded=\"false\">\r\n");
      out.write("        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">Mysql sakila database</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("      <ul class=\"nav navbar-nav\">\r\n");
      out.write("        <li class=\"dropdown\">\r\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">单表查询<span class=\"caret\"></span></a>\r\n");
      out.write("          <ul class=\"dropdown-menu\">\r\n");
      out.write("            <li><a href=\"showactor\">actor</a></li>\r\n");
      out.write("            <li><a href=\"showrental\">rental</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"dropdown\">\r\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">跨表查询<span class=\"caret\"></span></a>\r\n");
      out.write("          <ul class=\"dropdown-menu\">\r\n");
      out.write("            <li><a href=\"country_city\">country和city</a></li>\r\n");
      out.write("            <li><a href=\"staff_store\">staff和store</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li><a href=\"fileupload\">fileupload</a></li>\r\n");
      out.write("        <li><a href=\"logout\">logout</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div><!-- /.navbar-collapse -->\r\n");
      out.write("  </div><!-- /.container-fluid -->\r\n");
      out.write("</nav>\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("  \t</div>\r\n");
      out.write("  \t<div class=\"row\">\r\n");
      out.write("  \t\t<div class=\"col-md-12\">\r\n");
      out.write("  \t\t<h2>actor表的信息</h2>\r\n");
      out.write("  \t\t<a class=\"btn btn-primary\" href=\"exportactor\">导出数据为excel</a>\r\n");
      out.write("  \t\t    <table id=\"grid-data\" class=\"table table-condensed table-hover table-striped\">\r\n");
      out.write("        <thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th data-column-id=\"id\"  data-identifier=\"true\" data-type=\"numeric\">ID</th>\r\n");
      out.write("                <th data-column-id=\"first_name\">first_name</th>\r\n");
      out.write("                <th data-column-id=\"last_name\">last_name</th>\r\n");
      out.write("                <th data-column-id=\"last_update\" data-order=\"desc\">last_update</th>\r\n");
      out.write("                <th data-column-id=\"commands\" data-formatter=\"commands\" data-sortable=\"false\">modify</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("    </table>\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("  \t</div>\r\n");
      out.write("  </div>\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("    var grid =$(\"#grid-data\").bootgrid({\r\n");
      out.write("    ajax:true,\r\n");
      out.write("    url:\"actorlist\",\r\n");
      out.write("        formatters: {\r\n");
      out.write("        \"commands\": function(column, row)\r\n");
      out.write("        {\r\n");
      out.write("            return \"<button type=\\\"button\\\" class=\\\"btn btn-xs btn-default command-edit\\\" data-row-id=\\\"\" + row.id + \"\\\">编辑<span class=\\\"glyphicon glyphicon-pencil\\\"></span></button> \"; \r\n");
      out.write("                //\"<button type=\\\"button\\\" class=\\\"btn btn-xs btn-default command-delete\\\" data-row-id=\\\"\" + row.id + \"\\\"><span class=\\\"glyphicon glyphicon-trash\\\"></span></button>\";\r\n");
      out.write("        }\r\n");
      out.write("    \t}\r\n");
      out.write("    }).on(\"loaded.rs.jquery.bootgrid\", function()\r\n");
      out.write("\t{\r\n");
      out.write("    /* Executes after data is loaded and rendered */\r\n");
      out.write("\t    grid.find(\".command-edit\").on(\"click\", function(e)\r\n");
      out.write("\t    {\r\n");
      out.write("\t        $(\".actormodal\").modal();\r\n");
      out.write("\t        $.post(\"getActorInfo\",{id:$(this).data(\"row-id\")},function(data){\r\n");
      out.write("\t        \t$(\"#fname\").val(data.actor.first_name);\r\n");
      out.write("\t        \t$(\"#lname\").val(data.actor.last_name);\r\n");
      out.write("\t        \t$(\"#lupdate\").val(data.actor.last_update);\r\n");
      out.write("\t        \t$(\"#actorid\").val(data.actor.id);\r\n");
      out.write("\t        });\r\n");
      out.write("\t    });\r\n");
      out.write("  \t});\r\n");
      out.write("  });\r\n");
      out.write("  </script>\r\n");
      out.write("  <div class=\"modal fade actormodal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"mySmallModalLabel\">\r\n");
      out.write("  <div class=\"modal-dialog modal-sm\">\r\n");
      out.write("    <div class=\"modal-content\">\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\r\n");
      out.write("        <h4 class=\"modal-title\">update actor</h4>\r\n");
      out.write("      </div>\r\n");
      out.write("      <form action=\"updateactor\" method=\"post\">\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("    \t\t<label for=\"fname\">first name</label>\r\n");
      out.write("    \t\t<input type=\"text\" name=\"actor.first_name\" class=\"form-control\" id=\"fname\">\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("    \t\t<label for=\"lname\">last name</label>\r\n");
      out.write("    \t\t<input type=\"text\" name=\"actor.last_name\" class=\"form-control\" id=\"lname\">\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("  \t\t<div class=\"form-group\">\r\n");
      out.write("    \t\t<label for=\"lupdate\">last update</label>\r\n");
      out.write("    \t\t<input type=\"text\" name=\"actor.last_update\" class=\"form-control\" id=\"lupdate\">\r\n");
      out.write("    \t\t<input type=\"hidden\" id=\"actorid\" name=\"actor.id\" />\r\n");
      out.write("  \t\t</div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary\">Save changes</button>\r\n");
      out.write("      </div>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
