<#macro mymacro p1 p2>
	�������ǣ�${p1+p2}
</#macro>

<#-- ���ú� ��<@>-->
<@mymacro p1=255 p2=333 />


<#-- ����-->
<#assign str='  hello world   '>
${str?length}

--${str?trim}--

${str?upper_case}
${1.465464?float}

<#list uselist?keys as tmp>
	${tmp}
</#list>