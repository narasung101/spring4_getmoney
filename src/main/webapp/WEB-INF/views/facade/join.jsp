<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
  <div></div>
  <div>
  <h2>회원가입</h2>
  </div>
  <div></div>
  <div></div>
  <div>
<form id="join_form">
<table>
  	<tr>
  		<td>EMPNO</td>
  		<td>
  		<input id="joinuserid" type="text" name="empno"/>
  		 </td>
  	</tr>
  	<tr>
  		<td>ENAME</td>
  		<td><input id="joinuserpw" type="text" name="ename"/></td>
  	</tr>
  	<tr>
  		<td>JOB</td>
  		<td><input type="text" name="job"/></td>
  	</tr>
  	<tr>
  		<td>MGR</td>
  		<td><input type="text" name="mgr"/></td>
  	</tr>
  	<tr>
  		<td>HIREDATE</td>
  		<td><input type="text" name="hiredate"/></td>
  	</tr>
  	<tr>
  		<td>SAL</td>
  		<td><input type="text" name="sal"/></td>
  	</tr>
  	<tr>
  		<td>COMM</td>
  		<td><input type="text" name="comm"/></td>
  	</tr>
  	<tr>
  		<td>DEPTNO</td>
  		<td><input id="joinusername" type="text" name="deptno"/></td>
  	</tr>
  </table>
  <input type="hidden" name="action" value="create"/>
  <input type="hidden" name="page" value="login" />
  <input id="join_btn" type="button" value="회원가입"/>
 </form>
  </div>
  <div></div>
  <div></div><div>
  <h3> <a id="a_backs" href="#">뒤로가기</a> </h3>
  </div><div></div>
  
  
  <script>
  app.init('${ctx}');
  </script>
  
  