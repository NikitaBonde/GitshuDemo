<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
function login(){
	var un=document.getElementById("un").value;
	var ps=document.getElemenetById("ps").value;
	var req=new XMLHttpRequest();
	var url="http://localhost/9093/getcon/get";
	req.open(POST,url,true);
	var Student=uname=un,password=pw;
	var stu=JSON.String(Student);
	req.SetRequestHeader("conten.type","application/json"); 
	
     req.send(stu);
     req.onradyStatachange=function()
     {
    	 if(req.readstate==4&&req.status==200)
    		 {
    		 aleart(req.responestext);
    		 }
     }
}


</script>
</head>
<body>
User name:<input type="text" id="un">
<br>
Password :<input type="text" id="pw">
<br>
<input type="submit" onclick="login()">

</body>
</html>