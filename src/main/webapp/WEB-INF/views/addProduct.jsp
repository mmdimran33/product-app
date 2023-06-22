<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>


	<div class="container mt-3">
		<div class="row">
			<div class="Col-md-6 offset-md-3">
				<h1 class="text-center mb-3">[Fill Product Details]</h1>


				<form action="addproduct" method="post">
					<div class="form-group">
						<label for="name">Product Name</label> <input type="text"
							class="form-control" id="name" aria-describedby="emailHelp"
							name="name" placeholder="Enter the Product name">
					</div>


					
			
						
							<div class="form-group">
						<label for="name">Product Description</label> <input type="text"
							class="form-control" id="description" aria-describedby="emailHelp"
							name="description" placeholder="Enter the Product description">
					</div>
				

					<div class="form-group">
						<label for="price">Product Price</label> <input type="text"
							placeholder="Enter product price" name="price">
					</div>

					<div class="container text-center">
						<a href="viewemp"class="btn btn-primary">Show List</a>
						<button type="submit" class="btn btn-primary">Add</button>
						<!-- <button type="submit" class="btn btn-primary">Product List</button> -->
					</div>


				</form>

			</div>

		</div>
	</div>



</body>
</html>