<html>
<head>
  <title>Welcome!</title>
</head>
<body>
  <h1>Welcome ${user}!</h1>
  <p>Our latest product:
  <a href="${latestProduct.url}">${latestProduct.name}</a>!
  <#--ע��-->
  <#if sex=1>
	�� 
  <#else>
	Ů
  </#if>
  
  <#--�����ַ�����ʾ��Ҫ\ת��-->
  ${"this is \"quoted\" and this is a backslash:\\"}
  <#--raw�ַ��������ı�-->
  ${r"${sex}"}
  ${r"c:\foo\bar"}
  ${sex}
</body>
</html>  