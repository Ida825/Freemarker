<html>
<head>
  <title>Welcome!</title>
</head>
<body>
������飺
<#-- listѭ�����  ����򼯺� as ��ʱ����
	��ʱ����_index ��ȡ��ǰ����������0��ʼ��
	break��������˳����
-->
  <#list strs as temp>
  	<#if temp_index=2>
  		<#break>
  	</#if>
  	<#--
  		if ��=ֵ
  	-->
  	<#if (temp_index+1)%2==0> 
  		<font color=green>${temp}--${temp_index+1}</font>
  	<#else>
  		<font color=pink>${temp}--${temp_index+1}</font>
  	</#if>
  </#list>
  
���list
  <#list userList as tmp>
  	${tmp.id}==${tmp.name}
  </#list>
</body>
</html>  