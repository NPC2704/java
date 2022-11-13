<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<section class="jumbotron text-center">
	<div class="container">
		<h1 class="jumbotron-heading">E-COMMERCE CATEGORY</h1>
		<p class="lead text-muted mb-0">Le Lorem Ipsum est simplement du
			faux texte employé dans la composition et la mise en page avant
			impression. Le Lorem Ipsum est le faux texte standard de l'imprimerie
			depuis les années 1500, quand un peintre anonyme assembla ensemble
			des morceaux de texte pour réaliser un livre spécimen de polices de
			texte...</p>
	</div>
</section>
<div class="container">
	<div class="row">
		<div class="col">
			<nav aria-label="breadcrumb">
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="index.html">Home</a></li>
					<li class="breadcrumb-item"><a href="category.html">Category</a></li>
					<li class="breadcrumb-item active" aria-current="page">Sub-category</li>
				</ol>
			</nav>
		</div>
	</div>
</div>
<div class="container">
	<div class="row">

		<div class="col-12 col-sm-3">

			<div class="card bg-light mb-3">
				<div class="card-header bg-primary text-white text-uppercase">
					<i class="fa fa-list"></i> Categories
				</div>
				<ul class="list-group category_block">
					<core:forEach items="${listCategory}" var="kq">
						<li
							class="list-group-item text-white   ${Scid == kq.cateId ? 'active' : '' }"><a
							href="CategoryList?cid=${kq.cateId}">${kq.cateName}</a></li>
					</core:forEach>
				</ul>
			</div>

			<div class="card bg-light mb-3">
				<div class="card-header bg-success text-white text-uppercase">Last
					product</div>
				<div class="card-body">
					<img class="img-fluid" src="${toponeProduct.image}" />
					<h5 class="card-title">${toponeProduct.productName}</h5>
					<p class="card-text">${toponeProduct.description}</p>
					<p class="bloc_left_price">${toponeProduct.price}$</p>
				</div>
			</div>
		</div>

		<div class="col">
			<div class="row">
				<core:forEach items="${products}" var="kq">
					<div class="col-12 col-md-6 col-lg-4">
						<div class="card">
							<img class="card-img-top" src="${kq.image}" alt="Card image cap">
							<div class="card-body">
								<h4 class="card-title">
									<a
										href="<core:url value='/ProductDetail?id=${kq.productId} '/>"
										title="View Product">${kq.productName}</a>
								</h4>
								<p class="card-text">${kq.description}</p>
								<div class="row">
									<div class="col">
										<p class="btn btn-danger btn-block">${kq.price}$</p>
									</div>
									<div class="col">
										<a href="#" class="btn btn-success btn-block">Add to cart</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</core:forEach>
				<div class="col-12">
					<nav aria-label="...">
						<ul class="pagination">
							<core:if test="${indexPage>1}">
								<core:if test="${Scid == null}">
									<li class="page-item"><a class="page-link"
										href="/BTct6_war/CategoryList?index=${indexPage-1}">Previous</a></li>
								</core:if>
								<core:if test="${Scid != null}">
									<li class="page-item"><a class="page-link"
										href="/BTct6_war/CategoryList?cid=${Scid }&index=${indexPage-1}">Previous</a></li>
								</core:if>
							</core:if>


							<core:forEach begin="1" end="${endPage}" var="i">
								<core:if test="${Scid == null}">
									<li class="page-item  ${indexPage == i  ? 'active' : '' }"><a
										class="page-link"
										href="/BTct6_war/CategoryList?index=${i}"> ${i}</a></li>
								</core:if>
								<core:if test="${Scid != null}">
									<li class="page-item  ${indexPage == i  ? 'active' : '' }"><a
										class="page-link"
										href="/BTct6_war/CategoryList?cid=${Scid }&index=${i}"> ${i}</a></li>
								</core:if>

							</core:forEach>


							<core:if test="${indexPage<endPage}">
								<core:if test="${Scid == null}">
									<li class="page-item"><a class="page-link"
										href="/BTct6_war/CategoryList?index=${indexPage+1}">Next</a></li>
								</core:if>
								<core:if test="${Scid != null}">
									<li class="page-item ${indexPage == 'i' ? 'active' : '' }"><a
										class="page-link"
										href="/BTct6_war/CategoryList?cid=${Scid }&index=${indexPage+1}">Next</a></li>
								</core:if>

							</core:if>

						</ul>
					</nav>
				</div>
			</div>
		</div>

	</div>
</div>
