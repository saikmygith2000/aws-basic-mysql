<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
    background:#f5f5f5;
}

.product-card{
    border:none;
    border-radius:10px;
    transition:0.3s;
}

.product-card:hover{
    transform:translateY(-5px);
    box-shadow:0 4px 20px rgba(0,0,0,0.1);
}

.product-list-item{
    background:white;
    border-radius:10px;
    padding:20px;
    margin-bottom:15px;
}

.view-btns{
    text-align:right;
    margin-bottom:20px;
}

.hidden{
    display:none;
}

</style>

</head>
<body>

<div class="container mt-4">

    <h2 class="mb-4 text-center">Products List</h2>

    <div class="view-btns">
        <button class="btn btn-primary" onclick="showGridView()">
            Grid View
        </button>

        <button class="btn btn-secondary" onclick="showListView()">
            List View
        </button>
    </div>

    <!-- GRID VIEW -->

    <div id="gridView" class="row">

        <c:forEach items="${products}" var="product">

            <div class="col-md-3 mb-4">

                <div class="card product-card h-100">

                    <div class="card-body">

                        <h5 class="card-title">
                            ${product.productName}
                        </h5>

                        <p>
                            <strong>Brand:</strong>
                            ${product.brand}
                        </p>

                        <p>
                            <strong>Price:</strong>
                            ₹${product.price}
                        </p>

                        <p>
                            <strong>Quantity:</strong>
                            ${product.quantity}
                        </p>

                        <p>
                            <strong>Available:</strong>
                            ${product.available}
                        </p>

                        <p>
                            ${product.description}
                        </p>

                    </div>

                </div>

            </div>

        </c:forEach>

    </div>

    <!-- LIST VIEW -->

    <div id="listView" class="hidden">

        <c:forEach items="${products}" var="product">

            <div class="product-list-item">

                <div class="row">

                    <div class="col-md-3">
                        <h4>${product.productName}</h4>
                    </div>

                    <div class="col-md-2">
                        <strong>Brand:</strong>
                        ${product.brand}
                    </div>

                    <div class="col-md-2">
                        <strong>Price:</strong>
                        ₹${product.price}
                    </div>

                    <div class="col-md-2">
                        <strong>Qty:</strong>
                        ${product.quantity}
                    </div>

                    <div class="col-md-3">
                        ${product.description}
                    </div>

                </div>

            </div>

        </c:forEach>

    </div>

</div>

<script>

function showGridView(){
    document.getElementById("gridView").classList.remove("hidden");
    document.getElementById("listView").classList.add("hidden");
}

function showListView(){
    document.getElementById("listView").classList.remove("hidden");
    document.getElementById("gridView").classList.add("hidden");
}

</script>

</body>
</html>