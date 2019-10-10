var app = (()=>{
	return {
			init : (ctx)=>{
				empService.login(ctx);
				empService.join(ctx);
				empService.moveJoin(ctx);
					
			
			}
	}
	
})();

var emp = (()=>{
	var _empno, _ename, _job, _mgr, _hiredate, _sal, _comm, _deptno;
	var setEmpno = (empno)=>{this._empno = empno;}
	var setEname = (ename)=>{this._ename = ename;}
	var getEmpno = ()=>{this._empno = empno;}
	var getEname = ()=>{this._ename = ename;}
	return{
		setEmpno : setEmpno,
		setEname : setEname,
		getEmpno : getEmpno,
		getEname : getEname
	};
})();

var dept = (()=>{
	var  _deptno, _dname, _loc;
	var setDeptno = (deptno)=>{this._deptno = deptno;}
	var getDeptno = ()=>{this._deptno = deptno;}
	
	return{
		setDeptno : setDeptno,
		getDeptno : getDeptno,
		
	};
})();

var empService = (()=>{
	return{
		login: (ctx)=>{
			$('#login_btn').click(()=>{
				if($('#userdept').val()===''||$('#userid').val()===''||$('#userpw').val()===''){
					alert('필수값이 없습니다.')
				}else{
					alert('마이페이지로 이동');
					$('#login_form').attr('action', ctx+'/emp.do');
					$('#login_form').attr('method', 'GET');
					$('#login_form').submit();
				}
			});
			},
			
		join: (ctx)=>{
			$('#join_btn').click(()=>{
				if($('#joinusername').val()===''||$('#joinuserid').val()===''||$('#joinuserpw').val()===''){
					alert('필수값이 없습니다.')
				}else{
					alert();
					$('#join_form').attr('action', ctx+'/emp.do');
					$('#join_form').attr('method', 'GET');
					$('#join_form').submit();
				}
			});
		},
		
		moveJoin: (ctx)=>{
			$('#a_join').click(()=>{
				alert('회원가입 화면으로 이동');
				location.assign(ctx+'/emp.do?action=move&page=join');
			});
		}
		
	};
})();