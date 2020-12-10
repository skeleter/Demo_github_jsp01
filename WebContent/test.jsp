<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<script src="js/jquery-1.12.4.js" type="text/javascript"></script>
<script src="js/vue.js" type="text/javascript"></script>
</head>
<body>
	<div id="app">
		<label v-for="items in pro" v-cloak v-on:click="">{{items.pid}}</label>
	</div>
</body>
<script>
	var vm=new Vue({
		el:'#app',
		data:{
			pro:[{pid:1,pname:'xxx'},{pid:2,pname:'xxx'},{pid:3,pname:'xxx'}]
		},
		methods:{
			
		},
		created:function(){
			axios.get('test',{
				params:{
					name:'小明'
				}
			}).then(function(ret){
					alert(ret.data);
				});
		}
	});
</script>
<script>
	axios.get('test',{
		params:{
			name:'小明'
		}
	}).then(function(ret){
			alert(ret.data);
		});
</script>
</html>