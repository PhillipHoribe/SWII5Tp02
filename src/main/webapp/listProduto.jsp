<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<div class="container">
            <div class="row-fulid">
 <%
                    try {
                        ProdutoDao dao = new ProdutoDao();
                        ResultSet rs = dao.select();
                        if (rs != null) {
                            out.println("<h1>Produtos</h1>"
                                      + "<table>"
                                      + "   <thead>"
                                      + "       <tr align='center'>"
                                      + "           <th scope='col'>ID</th>"
                                      + "           <th scope='col'>Nome</th>"
                                      + "           <th scope='col'>Unidade</th>"
                                      + "           <th scope='col'>Descrição</th>"
                                      + "           <th scope='col'>Quantidade</th>"
                                      + "           <th scope='col'>Preço Máximo</th>"
                                      + "       </tr>"
                                      + "   </thead>"
                                      + "   <tbody>");
                            while (rs.next()) {
                                out.println("<tr align='center'>"
                                          + "   <th scope='row'>" + rs.getString(1) + "</th>"
                                          + "   <td>" + rs.getString(2) + "</td>"
                                          + "   <td>" + rs.getString(3) + "</td>"
                                          + "   <td>" + rs.getString(4) + "</td>"
                                          + "   <td>" + rs.getString(5) + "</td>"
                                          + "   <td>" + rs.getString(6) + "</td>"
                                          + "   <td><a href='AlterarProduto.jsp?id=" + rs.getString(1) + "'>Alterar</a></td>"
                                          + "   <td><a href='Deletar?id=" + rs.getString(1) + "'>Deletar</a></td>"
                                          + "</tr>");
                            }
                            dao.close();
                            out.println("   </tbody>"
                                    + "</table>");
                        } else {
                            out.println("<h1>Nenhum Produto Cadastrado</h1>");
                        }
                    } catch (Exception e) {
                        out.println("<h1>" + e.getMessage() + "</h1>");
                    }
                %>
                </div>
        </div>
</body>
</html>