
<html>
<head>
<%@ include file="./base.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<title>Welcome Page</title>
<body>
			  <a href="back" class="btn btn-primary">BACK</a>
			 
				<a href="search"class="btn btn-primary float-right">SEARCH</a>
			
				
		<div class="container mt-6">
	
		<div class="row">

		<div class="col-md-12">
			<h1 class="text-center mb-3">[ Welcome To Product App ]</h1>
              
              <table class="table">
			<thead class="thead-dark">

				<th scope="col">SR.No</th>
				<th scope="col">Product Name</th>
				<th scope="col">Description</th>
				<th scope="col">Price</th>
				<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${Product}" var="p">
					<th scope="row">${p.id}</th>
					<td>${p.name}</td>
					<td>${p.description }</td>
					<td class="font-weight-bold">&#x20B9;${p.price}</td>
					
					<td><a href="deleteProduct/${p.id}"><i class="fas fa-trash"></i></a>
					<td><a href="editProduct/${p.id}"><i class="fa-solid fa-pen-to-square"></i></a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
			</table>



		</div>

	</div>



	</div>

</body>
</html>