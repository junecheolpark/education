/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.78
 * Generated at: 2022-05-20 00:42:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("	integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<title>테스트</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("	<div class=\"row\">\r\n");
      out.write("		<div class=\"col\">\r\n");
      out.write("			<button type=\"button\" id=\"btnLogout\" class=\"btn btn-info\">로그인</button>\r\n");
      out.write("			<button type=\"button\" id=\"toInput\" class=\"btn btn-warning\">요청보내기</button>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<form id=\"testForm\">\r\n");
      out.write("		<input type=\"text\" name=\"id\"> <input type=\"text\"\r\n");
      out.write("			name=\"nickname\">\r\n");
      out.write("		<button type=\"button\" id=\"btnSubmit\" class=\"btn btn-info\">제출</button>\r\n");
      out.write("	</form>\r\n");
      out.write("	<button type=\"button\" id=\"getData\" class=\"btn btn-info\">데이터가져오기</button>\r\n");
      out.write("	<button type=\"button\" id=\"getDTO\" class=\"btn btn-info\">DTO가져오기</button>\r\n");
      out.write("	<button type=\"button\" id=\"getList\" class=\"btn btn-info\">List가져오기</button>\r\n");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("		//list가져오기\r\n");
      out.write("		$(\"#getList\").on(\"click\", function() {\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url : \"/getList.test\",\r\n");
      out.write("				type : \"get\",\r\n");
      out.write("				dataType : \"json\",\r\n");
      out.write("				success : function(data) {\r\n");
      out.write("					console.log(data);\r\n");
      out.write("					console.log(\"title : \" + data[0].title);\r\n");
      out.write("					for(let dto of data){\r\n");
      out.write("						console.log(dto.seq_board + \" : \" \r\n");
      out.write("								+ dto.title  + \" : \"\r\n");
      out.write("								+ dto.content + \" : \"\r\n");
      out.write("								+ dto.writer_nickname + \" : \"\r\n");
      out.write("								+ dto.writer_id + \" : \"\r\n");
      out.write("								+ dto.view_count + \" : \"\r\n");
      out.write("								+ dto.written_date);\r\n");
      out.write("					}\r\n");
      out.write("				},\r\n");
      out.write("				error : function(e) {\r\n");
      out.write("					console.log(e)\r\n");
      out.write("				}\r\n");
      out.write("			})\r\n");
      out.write("		})\r\n");
      out.write("\r\n");
      out.write("		//DTO가져오기\r\n");
      out.write("		$(\"#getDTO\").on(\"click\", function() {\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url : \"/getDTO.test\",\r\n");
      out.write("				type : \"get\",\r\n");
      out.write("				dataType : \"json\",\r\n");
      out.write("				//서버에서 json형식의 데이터를 보내젔을때\r\n");
      out.write("				// sucess 안쪽에서 j	s 객체처럼 다루고 싶으면 dataType: \"json\"으로 잡아줌.\r\n");
      out.write("\r\n");
      out.write("				success : function(data) {\r\n");
      out.write("					console.log(data);\r\n");
      out.write("					console.log(data.title);\r\n");
      out.write("				},\r\n");
      out.write("				error : function(e) {\r\n");
      out.write("					console.log(e);\r\n");
      out.write("				}\r\n");
      out.write("			})\r\n");
      out.write("		})\r\n");
      out.write("\r\n");
      out.write("		//데이터가져오기\r\n");
      out.write("		$(\"#getData\").on(\"click\", function() {\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url : \"/getData.test?msg=goodbye\",\r\n");
      out.write("				type : \"get\",\r\n");
      out.write("				dataType : \"text\"//받아올 데이터의 타입\r\n");
      out.write("				,\r\n");
      out.write("				success : function(data) {\r\n");
      out.write("					console.log(data);\r\n");
      out.write("\r\n");
      out.write("				},\r\n");
      out.write("				error : function(e) {\r\n");
      out.write("					console.log(e);\r\n");
      out.write("				}\r\n");
      out.write("			})\r\n");
      out.write("		})\r\n");
      out.write("\r\n");
      out.write("		//제출\r\n");
      out.write("		$(\"#btnSubmit\").on(\"click\", function() {\r\n");
      out.write("			//post 방식으로 비동기통신 데이터 전송\r\n");
      out.write("			// form태그 안의 데이터를 객체 형식으로 변환시켜주는 함수\r\n");
      out.write("			let data = $(\"#testForm\").serialize();\r\n");
      out.write("			console.log(data);\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url : \"/sendForm.test\",\r\n");
      out.write("				type : \"post\",\r\n");
      out.write("				data : data,\r\n");
      out.write("				success : function() {\r\n");
      out.write("				},\r\n");
      out.write("				error : function(e) {\r\n");
      out.write("					consol.log(e);\r\n");
      out.write("				}\r\n");
      out.write("			})\r\n");
      out.write("		})\r\n");
      out.write("\r\n");
      out.write("		$(\"#toInput\").on(\"click\", function() {\r\n");
      out.write("			/*\r\n");
      out.write("				ajax : 비동기 통신할때 사용하는 라이브러리\r\n");
      out.write("				(전체 페이지의 리로드없이 부분적인 페이지만 서버와 통신하여 리로드 할 수 있는것)\r\n");
      out.write("			 */\r\n");
      out.write("			//1.요청보내기\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				url : \"/sendMsg.test?msg=HelloWorld\",\r\n");
      out.write("				type : \"get\",\r\n");
      out.write("				success : function() { //성공했을때 toInput에 보내줄값\r\n");
      out.write("\r\n");
      out.write("				},\r\n");
      out.write("				error : function(e) { //실패했을때 .. \r\n");
      out.write("\r\n");
      out.write("				}\r\n");
      out.write("			})\r\n");
      out.write("		})\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
