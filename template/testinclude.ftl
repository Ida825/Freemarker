<#--
include 只能包含 不能取别名，import可以取别名
<#include "include.ftl">
<#include "include1.ftl">
-->

<#import "include.ftl" as a>
<#import "include1.ftl" as b>


${a.age}---${b.age}