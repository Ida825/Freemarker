<html>
<head>
  <title>Welcome!</title>
</head>
<body>
  <h1>Welcome ${user}!</h1>
  <p>Our latest product:
  <a href="${latestProduct.url}">${latestProduct.name}</a>!
  <#--注释-->
  <#if sex=1>
	男 
  <#else>
	女
  </#if>
  
  <#--特殊字符的显示需要\转译-->
  ${"this is \"quoted\" and this is a backslash:\\"}
  <#--raw字符串，纯文本-->
  ${r"${sex}"}
  ${r"c:\foo\bar"}
  ${sex}
</body>
</html>  