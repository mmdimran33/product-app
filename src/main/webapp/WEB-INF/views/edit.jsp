<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
 <div class="container mt-3">
		<div class="row">
		
			<div class="Col-md-6 offset-md-3">
				<h1 class="text-center mb-3">Edit Product Details</h1>
				
				<form action="${pageContext.request.contextPath}/updateProduct" method="get">
				<div class="form-group">
						<label for="name">Product Id</label> <input type="text"
							class="form-control" id="name" aria-describedby="emailHelp"
							name="id" value="${listbyid.id}" placeholder="Enter the Product Id">
					</div>
				
			
				
					<div class="form-group">
						<label for="name">Product Name</label> <input type="text"
							class="form-control" id="name" aria-describedby="emailHelp"
							name="name" value="${listbyid.name}" placeholder="Enter the Product name">
					</div>
						
							<div class="form-group">
						<label for="name">Product Description</label> <input type="text"
							class="form-control" id="description" aria-describedby="emailHelp"
							name="description" value="${listbyid.description}" placeholder="Enter the Product description">
					</div>
				

					<div class="form-group">
						<label for="price">Product Price</label> <input type="text"
							placeholder="Enter product price" name="price" value="${listbyid.price}">
					</div>

				      <button type="submit" class="btn btn-primary">Update</button>
 

				</form>

			</div>

		</div>
	</div>



</body>
</html>