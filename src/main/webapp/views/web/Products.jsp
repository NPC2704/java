<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>

<!-- JS -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
        type="text/javascript"></script>
<script
        src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<%--<script--%>
<%--        src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min--%>
<%--.js" type="text/javascript"></script>--%>


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

            <div id="content" class="row">
                <core:forEach items="${products}" var="kq">
                    <div class="product col-12 col-md-6 col-lg-4">
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
            </div>
            <br/>
            <button id="btn" onclick="loadMore()" class="btn btn-primary">Load
                More
            </button>
            <br/>
        </div>
    </div>
</div>


<%--<script--%>
<%--        src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>--%>
<%--<script src="https://code.jquery.com/jquery-3.6.0.min.js"--%>
<%--        integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ="--%>
<%--        crossorigin="anonymous"></script>--%>

<script>
    // function Hello() {
    //     alert("Hello!!");
    // }
    // $(window).scroll(function() {
    //     if($(window).scrollTop() + $(window).height() >= $(document).height()){
    //         loadMore();
    //     }
    // });
    function loadMore() {
        var amount = document.getElementsByClassName("product").length;
        //alert(amount);
        $.ajax({
            url: "/BTct6_war/load",
            type: "get", //send it through get method
            data: {
                exits: amount
            },
            success: function (data) {
                $("#content").append(data);
                // var row = document.getElementById("content");
                // row.innerHTML += data;
                alert("Thanh Cong!!");
            },
            error: function (xhr) {
                //Do Something to handle error
                alert("Something wrong!!");
                SSSSS
            }
        });
    }
</script>

