<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/echarts.js"></script>
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript">
$.ajax({
	type : 'post',
	url : 'BuleServlet',
	dataType : 'json',
	success : function(back) {
		var myChart = echarts.init(document.getElementById('main3'));	
		var option = {
	            title: {
	                text: 'ECharts 入门示例'
	            },
	            tooltip: {},
	            legend: {
	                data:['销量']
	            },
	            xAxis: {
	                data: ["衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子"]
	            },
	            yAxis: {},
	            series: [{
	                name: '销量',
	                type: 'bar',
	                data: back
	            }]
	        };
		// 使用刚指定的配置项和数据显示图表。
		myChart.setOption(option);
	}
});
</script>
</head>
<body>
	<div id="main3" style="width: 600px; height: 400px;"></div>
</body>
</html>