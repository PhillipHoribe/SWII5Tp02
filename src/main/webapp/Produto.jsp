<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
		<li class="nav-item"><a class="nav-link active" href="/CrudProdutos">Home</a>
		</li>
		<li class="nav-item"><a class="nav-link active"
			href="Produto.jsp">Novo Produto</a></li>
		<li class="nav-item"><a class="nav-link active"
			href="listProduto.jsp">Lista Produtos</a></li>
		<li class="nav-item"><a class="nav-link active"
			href="Creditos.html">Créditos</a></li>
	</ul>
<form class="needs-validation" action='Inserir' method='post'>
                Nome: <input class="form-control" type="text" name="nome" required/><br/>
                Unidade: <input class="form-control" type="number" name="unidadeCompra" required/><br/>
                Descrição: <input class="form-control" type="text" name="descricao" required/><br/>
                Quantidade Previsto Mes: <input class="form-control" type="number" name="qtdPrevistoMes" required/><br/>
                Preço Máximo Comprado: <input class="form-control" type="number" name="precoMaxComprado" required/><br/>
                <input class="btn btn-primary btn-md btn-block" type="submit" value="Enviar"/>
            </form>
</body>
</html>