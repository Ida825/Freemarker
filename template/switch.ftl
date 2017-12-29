<#switch age>
	<#case (age>90)>
		优秀
		<#break>
	<#case (age>70)>
		良好
		<#break>
	<#case (age>60)>
		及格
		<#break>
	<#default>
		成绩不合法
</#switch>