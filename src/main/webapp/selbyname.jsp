<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.6.0.js"></script>
    <script type="text/javascript">
        $(function (){
            // loadData()
            $("#namebtnid").click(function (){
                loadData()
            })
        })

        function loadData(){
            var textnm = document.getElementById("nametextid").value
            $.ajax({
                data:{"firstname":textnm},
                dataType:"json",
                url:"find.do",
                success:function (data){

                    $("#tbodyid").html("")
                    $.each(data,function (i,n){

                        $("#tbodyid").append("<tr><td>"+n.id+"</td><td>"+n.name+"</td><td>"+n.age+"</td></tr>")

                    })
                }

            })


        }

    </script>
</head>
<body>
<%--<form action="find.do"  method="get">--%>

  <center>
      输入姓：<input type="text" id="nametextid" name="firstname">
      <button id="namebtnid">查询</button>
        <table>
            <thead>
            <tr>
                <td>编号</td>
                <td>姓名</td>
                <td>年龄</td>
                <td><button id="btnid">刷新</button></td>

            </tr>


            </thead>
            <tbody id="tbodyid">

            </tbody>

        </table>
  </center>
</body>
</html>
