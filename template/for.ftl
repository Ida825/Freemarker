<html>
<head>
  <title>Welcome!</title>
</head>
<body>
输出数组：
<#-- list循环标记  数组或集合 as 临时变量
	临时变量_index 获取当前的索引（从0开始）
	break标记用于退出标记
-->
  <#list strs as temp>
  	<#if temp_index=2>
  		<#break>
  	</#if>
  	<#--
  		if 键=值
  	-->
  	<#if (temp_index+1)%2==0> 
  		<font color=green>${temp}--${temp_index+1}</font>
  	<#else>
  		<font color=pink>${temp}--${temp_index+1}</font>
  	</#if>
  </#list>
  
输出list
  <#list userList as tmp>
  	${tmp.id}==${tmp.name}
  </#list>
</body>
</html>  