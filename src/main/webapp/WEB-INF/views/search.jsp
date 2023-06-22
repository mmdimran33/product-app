<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
<title>Data Search Page</title>
</head>
<body>
	<div class="container mt-6">

		<div class="row">

			<div class="col-md-12">

				<h1 class="text-center mb-3">[Search Product Details]</h1>


				<form action="${pageContext.request.contextPath}/searchbyid"
					method="Get">
					<div class="form-group">
						<label for="name">Search by Id</label> <input type="text"
							class="form-control" id="id" aria-describedby="emailHelp"
							name="id" placeholder="Enter the Product id">
						<!--  <button type="submit" class="btn btn-primary">Done</button> -->
						<input type="submit" value="Search" class="btn btn-primary">
					</div>
				</form>


				<table class="table">
					<thead class="thead-dark">

						<th scope="col">Id</th>
						<th scope="col">Product Name</th>
						<th scope="col">Description</th>
						<th scope="col">Price</th>

						</tr>
					</thead>
					<tbody>

						<td>${searchbyid.id}</td>
						<td>${searchbyid.name}</td>
						<td>${searchbyid.description}</td>
						<td>${searchbyid.price}</td>
						
						</td>
						</tr>
					</tbody>
				</table>
				
				<a href="viewemp"class="btn btn-primary ">HOME</a>
			</div>
		</div>
	</div>

	</div>
	</div>
	</div>

</body>
</html>