<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="for" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Feed Back Page</title>

    <script type="text/javascript">

      function validateUserName() {

        var userName = document.getElementById("yn").value;

        if (userName.length < 2) {

          alert("your name should have at least one char")
          return false;

        } else {
          return true;
        }
      }

    </script>

    <style type="text/css">
        .error {
            color: red;
            text-align: left;
            position: fixed;
            margin-left: 30px;

        }
    </style>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
          crossorigin="anonymous">
</head>
<body>
<div align="center">
    <br>
    <br>
    <h1> Feed Back </h1>
    <br>
    <hr>

    <div class="container">

        <div class="card">
            <div class="card-body">

                <%--@elvariable id="feedback" type="com.mami.lc.api.FeedbackDTO"--%>
                <form:form action="process-feedback" method="get" modelAttribute="feedback"
                           onsubmit="return true">

                    <div class="form-group row">
                        <label for="yn" class="col-sm-2 col-form-label"> Your Name </label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control"
                                   aria-describedby="validationServer01Feedback"
                                   id="name" name="name"
                                   placeholder="Enter your name" required>
                            <div id="validationServer01Feedback" class="error">
                                <for:errors path="name"/>
                            </div>
                        </div>
                        <br>
                        <br>
                        <br>
                    </div>

                    <div class="form-group row">
                        <label for="email" class="col-sm-2 col-form-label"> Email </label>
                        <div class="col-sm-7">
                            <input type="text" class="form-control"
                                   aria-describedby="validationServer02Feedback"
                                   id="email" name="email"
                                   placeholder="Enter a valid email" required>
                            <div id="validationServer02Feedback" class=error>
                                <for:errors path="email"/>
                            </div>

                        </div>
                        <br>
                        <br>
                        <br>

                    </div>

                    <div class="form-group row">
                        <label for="feedback" class="col-sm-2 col-form-label">Feedback</label>

                        <div class="col-sm-7">

                    <textarea class="form-control"
                              aria-describedby="validationServer03Feedback" id="feedback"
                              name="feedBackContent"
                              rows="5" > </textarea>
                            <div id="validationServer03Feedback" class=error>
                                <for:errors path="feedBackContent"/>
                            </div>
                        </div>

                    </div>

                    <div class="form-group row">
                        <label for="email" class="col-sm-2 col-form-label">
                            <button class="btn btn-primary" type="submit">Submit</button>
                        </label>
                    </div>

                </form:form>
            </div>
        </div>
    </div>


</div>


<nav class="navbar fixed-bottom navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="${pageContext.request.contextPath}/">Back To LCApp</a>
    </div>
</nav>



</body>
</html>
