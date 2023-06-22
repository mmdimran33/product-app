
<html>
<head>
<%@ include file="./base.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<title>Welcome View Page</title>
<body>		
		<div class="container mt-6">
	
		<div class="row">

		<div class="col-md-12">
			<h1 class="text-center mb-3">[ Welcome To Product App ]</h1>
             
             <form action="/done" method="post">
			<tbody>
				<c:forEach items="${Product}" var="p">
					<th scope="row">${p.id}</th>
			
				</c:forEach>
			</tbody>
			</form>



		</div>

	</div>



	</div>

</body>
</html>