<#macro mymacro p1 p2>
	运算结果是：${p1+p2}
</#macro>

<#-- 调用宏 用<@>-->
<@mymacro p1=255 p2=333 />


<#-- 函数-->
<#assign str='  hello world   '>
${str?length}

--${str?trim}--

${str?upper_case}
${1.465464?float}

<#list uselist?keys as tmp>
	${tmp}
</#list>