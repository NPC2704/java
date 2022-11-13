<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>

<section class="jumbotron text-center">
	<div class="container">
		<h1 class="jumbotron-heading">E-COMMERCE BOOTSTRAP THEME</h1>
		<p class="lead text-muted mb-0">Simple theme for e-commerce buid
			with Bootstrap 4.0.0. Pages available : home, category, product, cart
			& contact</p>
	</div>
</section>
<div class="container">
	<div class="row">
		<div class="col">
			<div id="carouselExampleIndicators" class="carousel slide"
				data-ride="carousel">
				<ol class="carousel-indicators">
					<li data-target="#carouselExampleIndicators" data-slide-to="0"
						class="active"></li>
					<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
					<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
				</ol>
				<div class="carousel-inner">
					<div class="carousel-item active">
						<img class="d-block w-100"
							src="https://dummyimage.com/855x365/55595c/fff" alt="First slide">
					</div>
					<div class="carousel-item">
						<img class="d-block w-100"
							src="https://dummyimage.com/855x365/a30ca3/fff"
							alt="Second slide">
					</div>
					<div class="carousel-item">
						<img class="d-block w-100"
							src="https://dummyimage.com/855x365/1443ff/fff" alt="Third slide">
					</div>
				</div>
				<a class="carousel-control-prev" href="#carouselExampleIndicators"
					role="button" data-slide="prev"> <span
					class="carousel-control-prev-icon" aria-hidden="true"></span> <span
					class="sr-only">Previous</span>
				</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
					role="button" data-slide="next"> <span
					class="carousel-control-next-icon" aria-hidden="true"></span> <span
					class="sr-only">Next</span>
				</a>
			</div>
		</div>

		<div class="col-12 col-md-3">
			<div class="card">
				<core:forEach items="${toponeProduct}" var="kq">
					<div class="card-header bg-success text-white text-uppercase">
						<i class="fa fa-heart"></i> Top one
					</div>
					<img class="img-fluid border-0"
						src="${kq.image}"
						alt="Card image cap">
					<div class="card-body">
						<h4 class="card-title text-center">
							<a href="product.html" title="View Product">${kq.productName}</a>
						</h4>
						<div class="row">
							<div class="col">
								<p class="btn btn-danger btn-block">${kq.price}$</p>
							</div>
							<div class="col">
								<a href="<core:url value='/ProductDetail?id=${kq.productId} '/>" class="btn btn-success btn-block">View</a>
							</div>
						</div>
					</div>
				</core:forEach>
			</div>
		</div>

	</div>
</div>


<div class="container mt-3">
	<div class="row">
		<div class="col-sm">
			<div class="card">
				<div class="card-header bg-primary text-white text-uppercase">
					<i class="fa fa-star"></i> Last products
				</div>
				<div class="card-body">
					<div class="row">
						<core:forEach items="${lastProduct}" var="kq">
							<div class="col-sm">
								<div class="card">
									<img class="card-img-top"
										src="${kq.image}"
										alt="Card image cap">
									<div class="card-body">
										<h4 class="card-title">
											<a href="<core:url value='/ProductDetail?id=${kq.productId} '/>" title="View Product">${kq.productName}</a>
										</h4>
										<p class="card-text">${kq.description}</p>
										<div class="row">
											<div class="col">
												<p class="btn btn-danger btn-block">${kq.price} $</p>
											</div>
											<div class="col">
												<a href="cart.html" class="btn btn-success btn-block">Add
													to cart</a>
											</div>
										</div>
									</div>
								</div>
							</div>
						</core:forEach>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>


<div class="container mt-3 mb-4">
	<div class="row">
		<div class="col-sm">
			<div class="card">
				<div class="card-header bg-primary text-white text-uppercase">
					<i class="fa fa-trophy"></i> Best products
				</div>
				<div class="card-body">
					<div class="row">
						<core:forEach items="${amountProduct}" var="kq">
							<div class="col-sm">
								<div class="card">
									<img class="card-img-top"
										src="${kq.image}"
										alt="Card image cap">
									<div class="card-body">
										<h4 class="card-title">
											<a href="<core:url value='/ProductDetail?id=${kq.productId} '/>" title="View Product">${kq.productName}</a>
										</h4>
										<p class="card-text">${kq.description}</p>
										<div class="row">
											<div class="col">
												<p class="btn btn-danger btn-block">${kq.price} $</p>
											</div>
											<div class="col">
												<a href="cart.html" class="btn btn-success btn-block">Add
													to cart</a>
											</div>
										</div>
									</div>
								</div>
							</div>
						</core:forEach>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

