<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<div></div>
<div>
</div>
<div></div>

<div></div>
<div>
		<form id="login_form">
		<table>
			<tr>
				<td>
				부서명: 
				</td>
				<td>
				
				<input id="userdept" type="text" name="deptno" />
				</td>
			</tr>
			<tr>
				<td>
				사용자ID:
				</td>
				<td>
				<input id="userid"  type="text" name="empno" />
				</td>
			</tr>
			<tr>
				<td>
				비밀번호:
				</td>
				<td>
				<input id="userpw"  type="text" name="ename"  />
				</td>
			</tr>
			<tr>
				<td>
				<input id="login_btn" type="button" value="로그인" />
				</td>
				<td>
				
					<h3 id="join_a">
          				  <a id="a_join" href="#">회원가입</a>
   					</h3>
				
				</td>
			</tr>
		</table>
		<input type="hidden" name="action" value="login" />
        <input type="hidden" name="page" value="mypage" />
		</form>
</div>
<div></div>
<div></div>
<div></div>
<div></div>

<script>
app.init('${ctx}');
</script>

