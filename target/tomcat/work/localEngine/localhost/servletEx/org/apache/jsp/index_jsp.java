package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\n");
      out.write("\t<body>\n");
      out.write("\t\t<h2>Ïðàâèëà äæåíòåëüìåíîâ</h2>\n");
      out.write("\t\t<h5>1. Äæåíòëüìåí ïðîâîäèò æåíó íà ïîåçä, åñëè õî÷åò óáåäèòüñÿ â òîì, ÷òî îíà óåõàëà.\n");
      out.write("\t\t\t2. Äæåíòëüìåí âñåãäà ïðîâîäèò äàìó äî äîìó, åñëè ýòî äîì äæåíòëüìåíà.\n");
      out.write("\t\t\t3. Äæåíòëüìåí âñåãäà âûòðåò î ïîëîâèê íîãè, ïðåæäå ÷åì ñòó÷àòü èìè â äâåðü.\n");
      out.write("\t\t\t4. Åñëè äàìó öåëóþò î÷åíü äîëãî, çíà÷èò, îíà î÷åíü áîëòëèâà.\n");
      out.write("\t\t\t5. Äæåíòëüìåí âñåãäà ïðîïóñòèò äàìó âïåðåä, ÷òîáû ïîñìîòðåòü, êàê îíà âûãëÿäèò ñçàäè.\n");
      out.write("\t\t\t6. Îäíî äåëî, åñëè äàìà ïîøëà â ñàëîí êðàñîòû, è ñîâñåì äðóãîå, åñëè åå òóäà ïîñëàë äæåíòëüìåí.\n");
      out.write("\t\t\t7. Äæåíòëüìåí ñíèìàåò ñ äàìû ïàëüòî â äâóõ ñëó÷àÿõ: êîãäà åìó íðàâèòüñÿ äàìà è êîãäà åìó íðàâèòñÿ ïàëüòî.\n");
      out.write("\t\t\t8. ×òîáû âîäèòåëü îñòàíîâèë ìàøèíó, äæåíòëüìåí äîëæåí âûñòàâèòü âïåðåä íå ðóêó, à äàìó.\n");
      out.write("\t\t\t9. Äæåíòëüìåí ëþáèò, êîãäà ó íåãî ïðîñÿò â äîëã áîëüøóþ ñóììó: ÷åì áîëüøå ïðîñÿò, òåì ëåã÷å îòêàçàòü.\n");
      out.write("\t\t\t10. ×òîáû ïîíðàâèòüñÿ äæåíòëüìåíó, äàìà ðàçóêðàøèâàåò ñåáÿ. À ÷òîáû ïîíðàâèòüñÿ äàìå, äæåíòëüìåí ðàçóêðàøèâàåò äðóãîãî äæåíòëüìåíà.\n");
      out.write("\t\t\t11. Åñëè äàìà ïðèøëà íà ñâèäàíèå ðàíüøå âðåìåíè, çíà÷èò, îíà êóäà-òî ñïåøèò.\n");
      out.write("\t\t\t12. Äæåíòëüìåí äîëæåí çíàòü, ÷òî íðàâèòüñÿ åãî äàìå, ÷òîáû íå îêàçàòüñÿ ñ íåé òàì, ãäå ýòî ìîæíî êóïèòü.\n");
      out.write("\t\t\t13. Åñëè ãîñòè ñêó÷àþò, ðàññêàæèòå èì àíåêäîò. À åñëè íå óõîäÿò, ðàññêàæèòå åãî åù¸ íåñêîëüêî ðàç.\n");
      out.write("\t\t\t14. Äæåíòëüìåí íèêîìó íè â ÷åì íå îòêàçûâàåò, åñëè åãî íèêòî íè î ÷åì íå ïðîñèò.\n");
      out.write("\t\t\t15. Åñëè äæåíòëüìåí íàçûâàåò äàìó ëàñêîâûìè ñëîâàìè, çíà÷èò, îí çàáûë, êàê åå çîâóò.\n");
      out.write("\t\t\t16. Ñëîâî \"ñïàñèáî\" ïðèäóìàëè äæåíòëüìåíû, à \"áîëüøîå ñïàñèáî\"- áåäíûå äæåíòëüìåíû.\n");
      out.write("\t\t\t17. Ñ êàæäîé ðàññòåãíóòîé ïóãîâèöåé äàìå äûøèòñÿ ëåã÷å, à äæåíòëüìåíó òÿæåëåé.\n");
      out.write("\t\t\t</h5>\n");
      out.write("\t</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
