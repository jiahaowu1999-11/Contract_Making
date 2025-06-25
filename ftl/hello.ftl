<!DOCTYPE html>
<html>
<head>
    <title>FreeMarker 示例</title>
</head>
<body>
    <h1>你好，${user}！</h1>

    <#if books?has_content>
        <h2>图书列表</h2>
        <ul>
            <#list books as book>
                <li>${book.name} (${book.author})</li>
            </#list>
        </ul>
    <#else>
        <p>暂无图书信息。</p>
    </#if>

    <p>当前日期: ${.now?date}</p>
</body>
</html>