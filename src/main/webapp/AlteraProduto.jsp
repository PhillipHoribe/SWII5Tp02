<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
            <div class="row-fulid">
                <form class="needs-validation" action='Alterar' method='post'>
                    <%
                        try {
                            ProdutoDao dao = new ProdutoDao();
                            int id = Integer.parseInt(request.getParameter("id"));
                            ResultSet rs = dao.select(id);
                            rs.next();
                            out.println("Nome: <input class='form-control' type='text' name='nome' value='" + rs.getString(2) + "' required/><br/>"
                                    + "Unidade: <input class='form-control' type='number' name='unidade' value='" + rs.getString(3) + "' required/><br/>"
                                    + "Descrição: <input class='form-control' type='text' name='desc' value='" + rs.getString(4) + "' required/><br/>"
                                    + "Quantidade Prevista: <input class='form-control' type='number' name='qtd' value='" + rs.getString(5) + "' required/><br/>"
                                    + "Preço Máximo: <input class='form-control' type='number' step='0.01' name='preco' value='" + rs.getString(6) + "' required/><br/>"
                                    + "<input type='hidden' name='id' value='" + rs.getString(1) + "'>");
                        } catch (Exception e) {
                            out.println("<h1>" + e.getMessage() + "</h1>");
                        }
                    %>
                    <input class="btn btn-primary btn-md btn-block" type="submit" value="Enviar"/>
                </form>
            </div>
        </div>
</body>
</html>