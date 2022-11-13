<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
    <div class="container">
        <a class="navbar-brand" href="/BTct6/Home">Simple Ecommerce</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse justify-content-end" id="navbarsExampleDefault">
            <ul class="navbar-nav m-auto">
                <li class="nav-item ${headerId == 'Home' ? 'active':''} ">
                    <a class="nav-link" href="/BTct6_war/Home">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item ${headerId == 'Categories' ? 'active':''}">
                    <a class="nav-link" href="/BTct6_war/CategoryList">Categories</a>
                </li>
                <li class="nav-item ${headerId == 'Product' ? 'active':''}">
                    <a class="nav-link" href="/BTct6_war/Products">Product</a>
                </li>
                <li class="nav-item ${headerId == 'Cart' ? 'active':''}">
                    <a class="nav-link" href="/BTct6_war/Products">Cart</a>
                </li>
                <li class="nav-item ${headerId == 'Contact' ? 'active':''}">
                    <a class="nav-link" href="contact.html">Contact</a>
                </li>
            </ul>

            <form action="search" method="post" class="form-inline my-2 my-lg-0">
                <div class="input-group input-group-sm">
                    <input name="txt" type="text" class="form-control" placeholder="Search...">
                    <div class="input-group-append">
                        <button type="submit" class="btn btn-secondary btn-number">
                            <i class="fa fa-search"></i>
                        </button>
                    </div>
                </div>
                <a class="btn btn-success btn-sm ml-3" href="cart.html">
                    <i class="fa fa-shopping-cart"></i> Cart
                    <span class="badge badge-light">3</span>
                </a>
            </form>
        </div>
    </div>
</nav>
