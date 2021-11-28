<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}"/>

<form layout:fragment="content" method="post" class="write_form">
    <div>
        <input name="m_seq" placeholder="m_seq"/>
        <input name="m_author" placeholder="m_author"/>
        <input name="m_date" placeholder="m_date"/>
        <input name="m_time" placeholder="m_time"/>
        <input name="m_memo" placeholder="m_memo"/>
        <input name="m_image" placeholder="m_image"/>
    </div>
    <div class="btn_box">
        <button class="btn_save">저장</button>
        <button class="btn_rewrite">새로작성</button>
        <button class="btn_list">리스트보기</button>
    </div>
</form>
<script>

</script>