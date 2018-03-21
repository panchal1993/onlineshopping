<div class="container">
	<div class="row">

		<!-- Column to display sidebar -->
		<div class="col-md-3">
		<%@include file="./sharedsection/Sidebar.jsp"%>
		</div>
		
		<!-- Column to display the actual products -->
		<div class="col-md-9">

			<!-- Breadcrumb navigation -->
			<div class="row">
				<div class="col-lg-12">

					<!-- When user click all products -->
					<c:if test="${userClickAllProducts == true}">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All Products</li>
						</ol>
					</c:if>

					<!-- When user clicks Category products -->
					<c:if test="${userClickCategoryProducts == true}">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
							<li class="active breadcrumb-item">Category</li>
							<li class="active breadcrumb-item">${category.name}</li>
							
						</ol>
					</c:if>
				</div>
			</div>

		</div>

	</div>
</div>