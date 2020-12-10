<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<script src="js/jquery-1.12.4.js" type="text/javascript"></script>
<script src="js/vue.js" type="text/javascript"></script>
<script src="js/axios.min.js" type="text/javascript"></script>
<body>
	<div style="width:700px;align:center;" id="clone">
		<select id="province" @change="citys">
			<option value=-1>请选择省份....</option>
			<option v-for="items in province" v-bind:value="items.pid" >{{items.pname}}</option>
		</select>
		<select id="city" @change="quxians">
			<option value=-1>请选择城市....</option>
			<option v-for="items in city" v-bind:value="items.cid" >{{items.cname}}</option>
		</select>
		<select id="quxian">
			<option value="0">请选择县区....</option>
			<option v-for="items in quxian" v-bind:value="items.qid" >{{items.qname}}</option>
		</select>
		<br/>
		<label>pid:</label>
		<input type="text" id="pid" size="7" v-model="addp.pid"/>
		<label>pname:</label>
		<input type="text" id="pname" size="7" v-model="addp.pname"/>
		<label>cid:</label>
		<input type="text" id="cid" size="7" v-model="addc.cid"/>
		<label>cname:</label>
		<input type="text" id="cname" size="7" v-model="addc.cname"/> 
		<label>qid:</label>
		<input type="text" id="qid" size="7" v-model="addq.qid"/>
		<label>qname:</label>
		<input type="text" id="qname" size="7" v-model="addq.qname"/>
		<input type="button" value="提交"  @click="add" />
		<br />
		<label>删除pid:</label>
		<input type="text" id="dpid" size="7" v-model="del.pid"/>
		<label>删除cid:</label>
		<input type="text" id="dcid" size="7" v-model="del.cid"/>
		<label>删除qid:</label>
		<input type="text" id="dqid" size="7" v-model="del.qid"/>
		<input type="button" value="提交"  @click="ddd" />
	</div>
</body>
<script>
var vm=new Vue({
	el:'#clone',
	data:{
		province:[],
		city:[],
		quxian:[],
		addp:{pid:'',pname:''},
		addc:{cid:'',cname:''},
		addq:{qid:'',qname:''},
		del:{pid:'',cid:'',qid:''}
	},
	mounted() {
        this.provinces();
    },
	methods:{
		handle:function(){
			
		},
		provinces:function(){
			axios
			.get('province')
			.then((res) => {
				this.province=res.data;
				});
		},
		citys:function(){
			var cpid=$("#province").val();
			//alert(cpid);
			axios
			.get('city',{
				params:{
					"pid":cpid
				}
			})
			.then((res) => {
				this.city=res.data;
			});
			
		},
		quxians:function(){
			var qcid=$("#city").val();
			//alert(qcid);
			axios
			.get('quxian',{
				params:{
					"cid":qcid
				}
			})
			.then((res) => {
				this.quxian=res.data;
			});
		},
		add:function(){
			//alert(this.addp.pid);
			axios
			.get('add',{
				params:{
					"pid":this.addp.pid,"pname":this.addp.pname,
					"cid":this.addc.cid,"cname":this.addc.cname,
					"qid":this.addq.qid,"qname":this.addq.qname
				}
			})
			.then((ret) => {
				alert(ret.data);
			});
		},
		ddd:function(){
			alert("aaa");
			axios
			.get('del',{
				params:{
					"pid":this.del.pid,
					"cid":this.del.cid,
					"qid":this.del.qid
				}
			})
			.then((ret) => {
				alert(ret.data);
			});
		}
	}
});
</script>
</html>