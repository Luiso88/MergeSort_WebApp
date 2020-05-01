<%

 	String[] values = request.getParameterValues("values");
      for (int i = 0; i < values.length; ++i) {
%>
        <li><%= values[i] %></li>
<%
      }
%>