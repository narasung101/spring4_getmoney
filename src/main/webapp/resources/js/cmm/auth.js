"use strict";
var auth = auth || {};
auth = (()=>{
		const WHEN_ERR = '호출하는 JS 파일을 찾지 못했습니다.'

	let _, js, auth_vue_js
	let init =()=>{
		_ = $.ctx()
		js =$.js()
		auth_vue_js = js+'/vue/auth_vue.js'
	}
	let onCreate =()=>{
		init()
		$.getScript(auth_vue_js).done(()=>{
			setContentView()
			$('#a_go_join').click(e=>{
				e.preventDefault()
				join()
			})
		}).fail(()=>{alert(WHEN_ERR)})
		}
	
		let setContentView =()=>{
			
		}
		let join =()=>{
			
			$.getScript(auth_vue_js)
			$('head')
			.html(auth_vue.join_head())
			$('body')
			.html(auth_vue.join_body())                 
			$('<button>',{
				text: 'continue to checkout',
				href: '#',
				click : e=>{
					e.preventDefault();
					let data = {mid: $('#customerid').val(), mpw : $('#password').val()}
					alert('전송아이디'+data.mid)
					$.ajax({
						url : _+'/customer/join', 
						type : 'POST',   
						dataType : 'json',
						data : JSON.stringify(data),
						contentType : 'application/json',
						success : d => {
							alert('AJAX 성공아이디 '+ d.mid+', 성공비번' + d.mpw)
							login()
						},
						error : e => {
							alert('AJAX 실패');
						}
					})
				}
			
		})
		
		.addClass("btn btn-lg btn-primary btn-block")
		.appendTo('#btn_login')
		}
			
		let login =()=>{
			let x = {css: $.css(), img: $.img()}
				$('head')
			.html(auth_vue.login_head(x))
			$('body')
			.addClass('text-center')
			.html(auth_vue.login_body(x))
			
			$('<button>',{
				type : "submit",
				text : "Sign in",
				click : e => {
					e.preventDefault()
				}
			})
			.addClass("btn btn-lg btn-primary btn-block")
			.appendTo('#btn_login')
		}
			
	return {onCreate, join, login}
		})();
