<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html >
<head>
    <meta charset="UTF-8">
    <title>Angular.js Star Rating Directive</title>

    <link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css'>
    <link rel='stylesheet prefetch' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css'>

    <style>
        /* NOTE: The styles were added inline because Prefixfree needs access to your styles and they must be inlined if they are on local disk! */
        .star-rating {
            margin: 0;
            padding: 0;
            display: inline-block;
        }
        .star-rating .star {
            padding: 1px;
            color: #ddd;
            font-size: 20px;
            text-shadow: .05em .05em #aaa;
            list-style-type: none;
            display: inline-block;
            cursor: pointer;
        }
        .star-rating .star.filled {
            color: #fd0;
        }
        .star-rating.readonly .star.filled {
            color: #666;
        }

    </style>

    <script src="resources/assets/js/prefixfree.min.js"></script>

</head>

<body>

<div ng-app="app" ng-controller="RatingController as rating" class="container">
    <%--<h1>Angular Star Rating Directive</h1>--%>
    <div star-rating ng-model="rating.rating1" max="10" on-rating-select="rating.rateFunction(rating)"></div>
    <%--<star-rating ng-model="rating.rating2" readonly="rating.isReadonly"></star-rating>--%>
    <%--<label>--%>
        <%--<input type="checkbox" ng-model="rating.isReadonly"/>--%>
        <%--Is Readonly--%>
    <%--</label>--%>

    <div><strong>Rating 1:</strong> {{rating.rating1}}</div>
    <%--<div><strong>Rating 2:</strong> {{rating.rating2}}</div>--%>
</div>
<script src='http://ajax.googleapis.com/ajax/libs/angularjs/1.3.2/angular.min.js'></script>

<script src="resources/assets/js/index.js"></script>

</body>
</html>