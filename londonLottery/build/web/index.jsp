<%-- 
    Document   : index
    Created on : Oct 13, 2016, 4:48:56 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            p {
                border-radius: 50%;
                behavior: url(PIE.htc);

                width: 36px;
                height: 36px;
                padding: 3px;

                background: #fff;
                border: 6px solid #666;
                color: red;
                text-align: center;
                margin-left: 30px;
                margin-right: 25px;
                font: 32px oblique, sans-serif;
                
                display: inline-block;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UK LOTTERY NUMBERS</title>
    </head>
    <body>
        <h1 align="center" style="color:red">This week's lottery numbers</h1>
        <p> ${port1} </p>
        <p> ${port2} </p>
        <p> ${port3} </p>
        <p> ${port4} </p>
        <p> ${port5} </p>
        <p> ${port6} </p>
    </body>
</html>
