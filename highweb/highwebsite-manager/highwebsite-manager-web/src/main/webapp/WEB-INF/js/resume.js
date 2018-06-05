$(document).ready(function(){
	var data1 = window.location.search.substring(1);
	var phone = data1.substring(6);
//------------------------------------展示个人基本信息-----------------------------------------
	$.ajax({
			type:"POST",
			//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
			url:"findUserInformationByPhoneMethod",
			data:data1,
			dataType:"json",//指定服务器返回的数据类型
			success:function(data){
				var obj = data;
				$("#headpic").find("img").attr("src","../images/"+obj.photo+"");
				$("#headpic").find("h3").text(obj.chinese_name);
				$("#headpic").find("p:first").text(obj.gender);
				var born = obj.birthday.substring(0,4);
				var today = new Date();
				var todayyear = today.getFullYear();				
				$("#basicinformation1").find("p:eq(0)").text(parseInt(todayyear)-parseInt(born)+"岁");
				$("#basicinformation1").find("p:eq(1)").text(obj.null2+"工作经验");
				$("#basicinformation1").find("p:eq(2)").text(obj.phone);
				$("#basicinformation1").find("p:eq(3)").text(obj.email);
			},
			error:function(){
				alert("出错了");
			}
		});
	
//------------------------------------目前状况-----------------------------------------
	$.ajax({
		type:"POST",
		//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
		url:"findPresentConditionMethod",
		data:data1,
		dataType:"json",//指定服务器返回的数据类型
		success:function(data){
			var obj = data;
			$("#presentCondition").find("option").each(function(index,element){
				var content = $(this).text();
				if(content==obj.null3){
					$(this).attr("selected","selected");
				}
			});			
		},
		error:function(data){
			alert("出错了ff");
		}		
	});
	$("#presentCondition").find("option").on("click",function(){
		var content = $(this).text();
		$.ajax({
			type:"POST",
			//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
			url:"updatePresentConditionMethod",
			data:"null3="+content,
			dataType:"json",//指定服务器返回的数据类型
			success:function(data){
				var obj = data;			
			},
			error:function(data){
				alert("出错了");
			}		
		});
	});
//------------------------------------工作经历-----------------------------------------
	$("#addWorkExpBut").on("click",function(){
		$("#addWorkExp").slideToggle(1);
		$("#form-company").val("");
		$("#form-company").val("");
		$("#form-position").val("");
		$("#zaizhitime").val("");
		$("#lizhitime").val("");
		$("#form-content").val("");
		$("#tijiao").text("添加");
	});
	//--------------先读取----------------------
	function display(){
		$.ajax({
			type:"POST",
			//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
			url:"findT_CAND_IN_1ByPhoneMethod",
			data:data1,
			dataType:"json",//指定服务器返回的数据类型
			success:function(data){
				var obj = data;
				var parent = $("#workexphead");
				var company1 = obj.previous_company_1;
				var company2 = obj.previous_company_2;
				var content = null;
				if(company1!=null&&company1!=""){
					content= '<div class="col-md-12 jianjie"><div class="row" style="margin-top: 20px;"><div class="col-md-5 col-md-offset-1">';
					content+='<div class="media"><div class="media-body" style="padding-top: 5px;">';
					content+='<h5 class="media-heading">'+company1+'</h5>';
					content+='<font style="color: gray;font-size: 13px;">'+obj.null1+'.'+obj.previous_position_1+'</font>';
					content+='</div></div></div><div class="col-md-5" align="right"><font style="color: gray;cursor: pointer;"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;编辑</font>'
					content+='<p style="color: gray;margin: 10px 0px 0px 0px;">'+obj.hiredate_1.substring(0,7)+'-'+obj.departure_1.substring(0,7)+'</p>';
					content+='</div><div class="col-md-1"></div></div></div>';
				}
				if(content!=null){
					parent.append(content);
					//-----------------编辑----------------------
					parent.find("font:last").on("click",function(){
						$("#addWorkExp").slideToggle(1);
						var company_name = $(this).parent().parent().find("h5").text();
						var t_CAND_IN_1={};
						t_CAND_IN_1.previous_company_1=company_name;
						t_CAND_IN_1.null4=phone;					
							$.ajax({
							type:"POST",
							contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
							url:"findT_CAND_IN_1ByPhoneandCompany1Method",
							data:JSON.stringify(t_CAND_IN_1),
							dataType:"json",//指定服务器返回的数据类型
							success:function(data){
								var obj = data;
								$("#form-company").val(obj.previous_company_1);
								$("#form-position").val(obj.previous_position_1);
								$("#zaizhitime").val(obj.hiredate_1.substring(0,10));
								$("#lizhitime").val(obj.departure_1.substring(0,10));
								$("#form-content").val(obj.null2);
								$("#hidecontent").val("content1");
								$("#tijiao").text("更新");
								
							},
							error:function(data){
								alert("出错了");
							}		
						});	
						
					});
				}
				var content1=null;
				if(company2!=null&&company2!=""){
					content1= '<div class="col-md-12 jianjie"><div class="row" style="margin-top: 20px;"><div class="col-md-5 col-md-offset-1">';
					content1+='<div class="media"><div class="media-body" style="padding-top: 5px;">';
					content1+='<h5 class="media-heading">'+company2+'</h5>';
					content1+='<font style="color: gray;font-size: 13px;">'+obj.null6+'.'+obj.previous_position_2+'</font>';
					content1+='</div></div></div><div class="col-md-5" align="right"><font style="color: gray;cursor: pointer;"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;编辑</font>'
					content1+='<p style="color: gray;margin: 10px 0px 0px 0px;">'+obj.hiredate_2.substring(0,7)+'-'+obj.departure_2.substring(0,7)+'</p>';
					content1+='</div><div class="col-md-1"></div></div></div>';
				}
				if(content1!=null){
					parent.append(content1);
					//-----------------编辑----------------------
					parent.find("font:last").on("click",function(){
						$("#addWorkExp").slideToggle(1);
						var company_name = $(this).parent().parent().find("h5").text();
						var t_CAND_IN_1={};
						t_CAND_IN_1.previous_company_2=company_name;
						t_CAND_IN_1.null4=phone;					
							$.ajax({
							type:"POST",
							contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
							url:"findT_CAND_IN_1ByPhoneandCompany2Method",
							data:JSON.stringify(t_CAND_IN_1),
							dataType:"json",//指定服务器返回的数据类型
							success:function(data){
								var obj = data;
								$("#form-company").val(obj.previous_company_2);
								$("#form-position").val(obj.previous_position_2);
								$("#zaizhitime").val(obj.hiredate_2.substring(0,10));
								$("#lizhitime").val(obj.departure_2.substring(0,10));
								$("#form-content").val(obj.null3);
								$("#hidecontent").val("content2");
								$("#tijiao").text("更新");
								
							},
							error:function(data){
								alert("出错了");
							}		
						});
		
					});
				}
			},
			error:function(data){
				alert("出错了");
			}		
		});
	}
	display();
	$("#addWorkExpBut2").on("click",function(){
		$("#addWorkExp").slideToggle(1);
	});
//-------------------------------------------------添加工作经历--------------------------------------------------------------------	
	$("#tijiao").on("click",function(){
		var content = $(this).text();
		var previous_company = $("#form-company").val();
		var previous_position = $("#form-position").val();
		var hiredate = $("#zaizhitime").val();
		var departure = $("#lizhitime").val();
		var null23 = $("#form-content").val();
		//alert(previous_company+"--"+previous_position+"--"+hiredate+"--"+departure+"--"+null23);
		if(content=='添加'){			
			if(previous_company!=null&&previous_company!=""&&previous_position!=null&&previous_position!=""&&hiredate!=null&&hiredate!=""&&departure!=null&&departure!=""&&null23!=null&&null23!=""){
				$.ajax({
					type:"POST",
					//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
					url:"findT_CAND_IN_1ByPhoneMethod",
					data:data1,
					dataType:"json",//指定服务器返回的数据类型
					success:function(data){
						var obj = data;
						var company1 = obj.previous_company_1;
						var company2 = obj.previous_company_2;						
						if(company1==null||company1==""){
							var t_CAND_IN_1={};
							t_CAND_IN_1.previous_company_1=previous_company;
							t_CAND_IN_1.previous_position_1=previous_position;
							t_CAND_IN_1.hiredate_1=hiredate;
							t_CAND_IN_1.departure_1=departure;
							t_CAND_IN_1.null2=null23;
							t_CAND_IN_1.null4=phone;
							$.ajax({
								type:"POST",
								contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
								url:"updateJobexperience1Method",
								data:JSON.stringify(t_CAND_IN_1),
								dataType:"json",//指定服务器返回的数据类型
								success:function(data){
									var obj = data;	
									$("#basicjob").parent().find(".jianjie").remove();
									display();
									$("#addWorkExp").slideUp(1);
								},
								error:function(data){
									alert("出错了");
								}		
							});
	
						}
						else if(company2==null||company2==""){
							var t_CAND_IN_1={};
							t_CAND_IN_1.previous_company_2=previous_company;
							t_CAND_IN_1.previous_position_2=previous_position;
							t_CAND_IN_1.hiredate_2=hiredate;
							t_CAND_IN_1.departure_2=departure;
							t_CAND_IN_1.null3=null23;
							t_CAND_IN_1.null4=phone;
							$.ajax({
								type:"POST",
								contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
								url:"updateJobexperience2Method",
								data:JSON.stringify(t_CAND_IN_1),
								dataType:"json",//指定服务器返回的数据类型
								success:function(data){
									var obj = data;
									$("#basicjob").parent().find(".jianjie").remove();
									display();
									$("#addWorkExp").slideUp(1);
								},
								error:function(data){
									alert("出错了");
								}		
							});
						}
						else if(company1!=null&&company2!=null){
							alert("工作经历已满两个，不能再添加了")
						}
					},
					error:function(){
						alert("出错了");
					}
				});
			}
			else{
				alert("字段全都不能为空");
			}
		}
					
		else if(content=='更新'){
			if(previous_company!=null&&previous_company!=""&&previous_position!=null&&previous_position!=""&&hiredate!=null&&hiredate!=""&&departure!=null&&departure!=""&&null23!=null&&null23!=""){				
				//alert(previous_company+"--"+previous_position+"--"+hiredate+"--"+departure+"--"+null23);
				$.ajax({
					type:"POST",
					//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
					url:"findCompanysIsNullMethod",
					data:"null4="+phone,
					dataType:"json",//指定服务器返回的数据类型
					success:function(data){
						var obj = data;
						var oneortwo = $("#hidecontent").val();				
						if(oneortwo=="content1"){
							var t_CAND_IN_1={};
							t_CAND_IN_1.previous_company_1=previous_company;
							t_CAND_IN_1.previous_position_1=previous_position;
							t_CAND_IN_1.hiredate_1=hiredate;
							t_CAND_IN_1.departure_1=departure;
							t_CAND_IN_1.null2=null23;
							t_CAND_IN_1.null4=phone;
							$.ajax({
								type:"POST",
								contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
								url:"updateJobexperience1Method",
								data:JSON.stringify(t_CAND_IN_1),
								dataType:"json",//指定服务器返回的数据类型
								success:function(data){
									var obj = data;	
									$("#basicjob").parent().find(".jianjie").remove();
									display();
									$("#addWorkExp").slideUp(1);
								},
								error:function(data){
									alert("出错了");
								}		
							});
						}
						if(oneortwo=="content2"){
							var t_CAND_IN_1={};
							t_CAND_IN_1.previous_company_2=previous_company;
							t_CAND_IN_1.previous_position_2=previous_position;
							t_CAND_IN_1.hiredate_2=hiredate;
							t_CAND_IN_1.departure_2=departure;
							t_CAND_IN_1.null3=null23;
							t_CAND_IN_1.null4=phone;
							$.ajax({
								type:"POST",
								contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
								url:"updateJobexperience2Method",
								data:JSON.stringify(t_CAND_IN_1),
								dataType:"json",//指定服务器返回的数据类型
								success:function(data){
									var obj =  data;
									$("#basicjob").parent().find(".jianjie").remove();
									display();
									$("#addWorkExp").slideUp(1);
								},
								error:function(data){
									alert("出错了");
								}		
							});
						}
					},
					error:function(data){
						alert("出错了");
					}		
				});	
			}
		}
	});
//============================================================教育经历=========================================================
	var xuelioption=null;
	$("#addEducateExpBut").on("click",function(){
		$("#addEducateExp").slideToggle(1);
		$("#form-school").val("");
		$("#form-specialty").val("");		
		
		var optionparent = $("#form-option");
		optionparent.empty();
		var optioncontent='';
		var array = ["大专","本科","硕士","博士","其他"];
		for(var i=0;i<5;i++){
			optioncontent+='<option>'+array[i]+'</option>';
		}
		optionparent.append(optioncontent);
		optionparent.find("option").each(function(index,element){
			$(this).on("click",function(){
				xuelioption = $(this).text();
			});
		});
		if(xuelioption==null||xuelioption==""){
			xuelioption="大专";
		}
		
		$("#graduatetime").val("");
		$("#addEducateExpBut1").text("添加");
	});
	
	
	//-----------------------------展示教育经历------------------
	function educationdisplay(){
		$.ajax({
			type:"POST",
			//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
			url:"findT_CAND_IN_1ByPhoneMethod",
			data:data1,
			dataType:"json",//指定服务器返回的数据类型
			success:function(data){
				var obj = data;
				var parent = $("#educateexphead");
				var school1 = obj.school_1;
				var school2 = obj.school_2;
				var content = null;
				var content1=null;
				if(school1!=null&&school1!=""){
					content= '<div class="col-md-12 edujianjie"><div class="row" style="margin-top: 20px;"><div class="col-md-5 col-md-offset-1">';
					content+='<div class="media">';
					content+='<div class="media-body" style="padding-top: 5px;">';
					content+='<h5 class="media-heading">'+obj.school_1+'</h5>';
					content+='<font style="color: gray;font-size: 13px;">'+obj.null1+'.'+obj.specialty_1+'</font>';
					content+='</div></div></div><div class="col-md-5" align="right">';
					content+='<font style="color: gray;cursor: pointer;"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;编辑</font>';
					content+='<p style="color: gray;margin: 10px 0px 0px 0px;">'+obj.graduation_date_1.substring(0,4)+'年毕业</p>';
					content+='</div><div class="col-md-1"></div></div></div>';
				}
				if(content!=null){
					parent.append(content);
					//-----------------编辑----------------------
					parent.find("font:last").on("click",function(){
						$("#addEducateExp").slideToggle(1);
						var school = $(this).parent().parent().find("h5").text();
						var t_CAND_IN_1={};
						t_CAND_IN_1.school_1=school;
						t_CAND_IN_1.null4=phone;
						$.ajax({
							type:"POST",
							contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
							url:"findT_CAND_IN_1ByPhoneandSchool1Method",
							data:JSON.stringify(t_CAND_IN_1),
							dataType:"json",//指定服务器返回的数据类型
							success:function(data){
								var obj = data;
								$("#form-school").val(obj.school_1);
								$("#form-specialty").val(obj.specialty_1);
								$("#hideeducontent").val("educontent1");
								var optionparent = $("#form-option");
								optionparent.empty();
								var optioncontent='';
								var array = ["大专","本科","硕士","博士","其他"];
								for(var i=0;i<5;i++){
									if(array[i]==obj.null1){
										optioncontent+='<option selected="selected">'+obj.null1+'</option>';
										xuelioption=obj.null1;
									}
									else{
										optioncontent+='<option>'+array[i]+'</option>';
									}
								}
								optionparent.append(optioncontent);
								optionparent.find("option").each(function(index,element){
									$(this).on("click",function(){
										xuelioption = $(this).text();
									});
								});
								
								$("#graduatetime").val(obj.graduation_date_1.substring(0,10));
								$("#addEducateExpBut1").text("更新");
							},
							error:function(data){
								alert("出错了");
							}		
						});
					});	
				}
				
				if(school2!=null&&school2!=""){
					content1= '<div class="col-md-12 edujianjie"><div class="row" style="margin-top: 20px;"><div class="col-md-5 col-md-offset-1">';
					content1+='<div class="media">';
					content1+='<div class="media-body" style="padding-top: 5px;">';
					content1+='<h5 class="media-heading">'+obj.school_2+'</h5>';
					content1+='<font style="color: gray;font-size: 13px;">'+obj.null6+'.'+obj.specialty_2+'</font>';
					content1+='</div></div></div><div class="col-md-5" align="right">';
					content1+='<font style="color: gray;cursor: pointer;"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;编辑</font>';
					content1+='<p style="color: gray;margin: 10px 0px 0px 0px;">'+obj.graduation_date_2.substring(0,4)+'年毕业</p>';
					content1+='</div><div class="col-md-1"></div></div></div>';
				}
				if(content1!=null){
					parent.append(content1);
					//-----------------编辑----------------------
					parent.find("font:last").on("click",function(){						
						$("#addEducateExp").slideToggle(1);
						var school = $(this).parent().parent().find("h5").text();
						//alert(school);
						var t_CAND_IN_1={};
						t_CAND_IN_1.school_2=school;
						t_CAND_IN_1.null4=phone;			
						$.ajax({
							type:"POST",
							contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
							url:"findT_CAND_IN_1ByPhoneandSchool2Method",
							data:JSON.stringify(t_CAND_IN_1),
							dataType:"json",//指定服务器返回的数据类型
							success:function(data){
								var obj = data;
								$("#form-school").val(obj.school_2);
								$("#form-specialty").val(obj.specialty_2);
								$("#hideeducontent").val("educontent2");
								var optionparent = $("#form-option");
								optionparent.empty();
								var optioncontent='';
								var array = ["大专","本科","硕士","博士","其他"];
								for(var i=0;i<5;i++){
									if(array[i]==obj.null6){
										optioncontent+='<option selected="selected">'+obj.null6+'</option>';
										xuelioption=obj.null6
									}
									else{
										optioncontent+='<option>'+array[i]+'</option>';
									}
								}
								optionparent.append(optioncontent);
								optionparent.find("option").each(function(index,element){
									$(this).on("click",function(){
										xuelioption = $(this).text();
									});
								});
								$("#graduatetime").val(obj.graduation_date_2.substring(0,10));
								$("#addEducateExpBut1").text("更新");
							},
							error:function(data){
								alert("出错了");
							}		
						});
					});		
				}
				
			},
			error:function(data){
				alert("出错了");
			}		
		});
	}
	educationdisplay();
	$("#addEducateExpBut2").on("click",function(){
		$("#addEducateExp").slideToggle(1);
	});
//-------------------------------------------------添加教育经历--------------------------------------------------------------------	
	$("#addEducateExpBut1").on("click",function(){
		var content = $(this).text();
		var school = $("#form-school").val();
		var specialty = $("#form-specialty").val();
		var null16 = xuelioption;
		var graduation_date = $("#graduatetime").val();
		if(content=='添加'){
			//alert(school+"-"+specialty+"-"+null16+"-"+graduation_date);
			if(school!=null&&school!=""&&specialty!=null&&specialty!=""&&null16!=null&&null16!=""&&graduation_date!=null&&graduation_date!=""){
				$.ajax({
					type:"POST",
					//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
					url:"findT_CAND_IN_1ByPhoneMethod",
					data:data1,
					dataType:"json",//指定服务器返回的数据类型
					success:function(data){
						var obj = data;
						var school1 = obj.school_1;
						var school2 = obj.school_2;
						if(school1==null||school1==""){
							var t_CAND_IN_1={};
							t_CAND_IN_1.school_1=school;
							t_CAND_IN_1.specialty_1=specialty;
							t_CAND_IN_1.graduation_date_1=graduation_date;
							t_CAND_IN_1.null1=null16;
							t_CAND_IN_1.null4=phone;
							$.ajax({
								type:"POST",
								contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
								url:"updateschool1Method",
								data:JSON.stringify(t_CAND_IN_1),
								dataType:"json",//指定服务器返回的数据类型
								success:function(data){
									var obj = data;
									$("#basiceducation").parent().find(".edujianjie").remove();
									educationdisplay();
									$("#addEducateExp").slideUp(1);
								},
								error:function(data){
									alert("出错了");
								}		
							});
							
						}
						else if(school2==null||school2==""){
							var t_CAND_IN_1={};
							t_CAND_IN_1.school_2=school;
							t_CAND_IN_1.specialty_2=specialty;
							t_CAND_IN_1.graduation_date_2=graduation_date;
							t_CAND_IN_1.null6=null16;
							t_CAND_IN_1.null4=phone;
							$.ajax({
								type:"POST",
								contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
								url:"updateschool2Method",
								data:JSON.stringify(t_CAND_IN_1),
								dataType:"json",//指定服务器返回的数据类型
								success:function(data){
									var obj = data;
									$("#basiceducation").parent().find(".edujianjie").remove();
									educationdisplay();
									$("#addEducateExp").slideUp(1);
								},
								error:function(data){
									alert("出错了");
								}		
							});	
						}
						else if(school1!=null&&school2!=null){
							alert("教育经历已满两个，不能再添加了")
						}
					},
					error:function(){
						alert("出错了");
					}
				});	
			}
			else{
				alert("字段全都不能为空");
			}	
		}
		else if(content=="更新"){			
			//alert(school+"-"+specialty+"-"+null16+"-"+graduation_date);
			if(school!=null&&school!=""&&specialty!=null&&specialty!=""&&null16!=null&&null16!=""&&graduation_date!=null&&graduation_date!=""){
				var oneortwo1 = $("#hideeducontent").val();
				//alert(oneortwo1);
				if(oneortwo1=="educontent1"){
					var t_CAND_IN_1={};
					t_CAND_IN_1.school_1=school;
					t_CAND_IN_1.specialty_1=specialty;
					t_CAND_IN_1.graduation_date_1=graduation_date;
					t_CAND_IN_1.null1=null16;
					t_CAND_IN_1.null4=phone;
					$.ajax({
						type:"POST",
						contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
						url:"updateschool1Method",
						data:JSON.stringify(t_CAND_IN_1),
						dataType:"json",//指定服务器返回的数据类型
						success:function(data){
							var obj = data;
							$("#basiceducation").parent().find(".edujianjie").remove();
							educationdisplay();
							$("#addEducateExp").slideUp(1);
						},
						error:function(data){
							alert("出错了");
						}		
					});
				}
				if(oneortwo1=="educontent2"){
					var t_CAND_IN_1={};
					t_CAND_IN_1.school_2=school;
					t_CAND_IN_1.specialty_2=specialty;
					t_CAND_IN_1.graduation_date_2=graduation_date;
					t_CAND_IN_1.null6=null16;
					t_CAND_IN_1.null4=phone;
					$.ajax({
						type:"POST",
						contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
						url:"updateschool2Method",
						data:JSON.stringify(t_CAND_IN_1),
						dataType:"json",//指定服务器返回的数据类型
						success:function(data){
							var obj = data;
							$("#basiceducation").parent().find(".edujianjie").remove();
							educationdisplay();
							$("#addEducateExp").slideUp(1);
						},
						error:function(data){
							alert("出错了");
						}		
					});
				}
			}	
		}
		
	});
//-------------------------------------------------------------展示项目经历--------------------------------------------------------------
	$("#cancelAddItemsExp1").on("click",function(){
		$("#addItemsExp").slideToggle(1);
		$("#projectName").val("");
		$("#projectNull2").val("");
		$("#projectstarttime").val("");
		$("#projectendtime").val("");
		$("#projectProfile").val("");
		$("#projecttijiao").text("添加");
	});
	//-------------------先读取-------------------------
	function projectdisplay(){
		$.ajax({
			type:"POST",
			//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
			url:"findProjectByPhoneMethod",
			data:data1,
			dataType:"json",//指定服务器返回的数据类型
			success:function(data){
				var obj = data;
				var itemsparent = $("#itemsexphead");
				for(var i=0;i<obj.length;i++){
					if(obj[i].project_name!=null&&obj[i].project_name!=""){
						var content = null;
						content='<div class="col-md-12 projectjianjie"><div class="row" style="margin-top: 20px;"><div class="col-md-5 col-md-offset-1">';
						content+='<div class="media"><div class="media-body" style="padding-top: 5px;">';
						content+='<h5 class="media-heading">'+obj[i].project_name+'</h5>';
						content+='<font style="color: gray;font-size: 13px;">'+obj[i].null2+'</font></div></div></div><div class="col-md-5" align="right">';
						content+='<font style="color: gray;cursor: pointer;"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;编辑</font>';
						content+='<p style="color: gray;margin: 10px 0px 0px 0px;">'+obj[i].start_time.substring(0,10)+'-'+obj[i].end_time.substring(0,10)+'</p></div>';
						content+='<div class="col-md-1"><input type="hidden" value="'+obj[i].id+'"/></div></div></div>';
						itemsparent.append(content);
						//-----------------编辑----------------------
						itemsparent.find("font:last").on("click",function(){
							$("#addItemsExp").slideToggle(1);
							var id = $(this).parent().next().find("input").val();
							//alert(id);
							$.ajax({
								type:"POST",
								//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
								url:"findProjectByIdMethod",
								data:"id="+id,
								dataType:"json",//指定服务器返回的数据类型
								success:function(data){
									var obj = data;
									$("#projectName").val(obj.project_name);
									$("#projectNull2").val(obj.null2);
									$("#projectstarttime").val(obj.start_time.substring(0,10));
									$("#projectendtime").val(obj.end_time.substring(0,10));
									$("#projectProfile").val(obj.project_profile);
									$("#hideprojectcontent").val(id);
									$("#projecttijiao").text("更新");
								},
								error:function(data){
									alert("出错了");
								}		
							});
						});
					}
						
				}	
			},
			error:function(data){
				alert("出错了");
			}		
		});
	}
	projectdisplay();
	$("#cancelAddItemsExp2").on("click",function(){
		$("#addItemsExp").slideToggle(1);
	});
//---------------------------------------------------添加项目经历-----------------------------------------------------------------------
	$("#projecttijiao").on("click",function(){
		var content = $(this).text();
		var t_CAND_IN_3={};
		t_CAND_IN_3.project_name=$("#projectName").val();
		t_CAND_IN_3.null2=$("#projectNull2").val();
		t_CAND_IN_3.start_time=$("#projectstarttime").val();
		t_CAND_IN_3.end_time=$("#projectendtime").val();
		t_CAND_IN_3.project_profile=$("#projectProfile").val();
		t_CAND_IN_3.null1=phone;		
		if(content=='添加'){
			if(t_CAND_IN_3.project_name!=null&&t_CAND_IN_3.project_name!=""
				&&t_CAND_IN_3.null2!=null&&t_CAND_IN_3.null2!=""&&t_CAND_IN_3.start_time!=null
				&&t_CAND_IN_3.start_time!=""&&t_CAND_IN_3.end_time!=null&&t_CAND_IN_3.end_time!=""
				&&t_CAND_IN_3.project_profile!=null&&t_CAND_IN_3.project_profile!=""&&t_CAND_IN_3.null1!=null&&t_CAND_IN_3.null1!=""){
				$.ajax({
					type:"POST",
					contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
					url:"InsertProjectByPhoneMethod",
					data:JSON.stringify(t_CAND_IN_3),
					dataType:"json",//指定服务器返回的数据类型
					success:function(data){
						var obj = data;
						$("#basicproject").parent().find(".projectjianjie").remove();
						projectdisplay();
						$("#addItemsExp").slideUp(1);
					},
					error:function(data){
						alert("出错了");
					}		
				});
			}
		}
		else if(content=='更新'){
			if(t_CAND_IN_3.project_name!=null&&t_CAND_IN_3.project_name!=""
				&&t_CAND_IN_3.null2!=null&&t_CAND_IN_3.null2!=""&&t_CAND_IN_3.start_time!=null
				&&t_CAND_IN_3.start_time!=""&&t_CAND_IN_3.end_time!=null&&t_CAND_IN_3.end_time!=""
				&&t_CAND_IN_3.project_profile!=null&&t_CAND_IN_3.project_profile!=""&&t_CAND_IN_3.null1!=null&&t_CAND_IN_3.null1!=""){
				t_CAND_IN_3.id=$("#hideprojectcontent").val();
				/*alert(t_CAND_IN_3.project_name+"--"+t_CAND_IN_3.null2
						+"--"+t_CAND_IN_3.start_time+"--"+t_CAND_IN_3.end_time
						+"--"+t_CAND_IN_3.project_profile+"--"+t_CAND_IN_3.null1+"--"+t_CAND_IN_3.id);*/
				$.ajax({
					type:"POST",
					contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
					url:"UpdateProjectByIdMethod",
					data:JSON.stringify(t_CAND_IN_3),
					dataType:"json",//指定服务器返回的数据类型
					success:function(data){
						var obj = data;
						$("#basicproject").parent().find(".projectjianjie").remove();
						projectdisplay();
						$("#addItemsExp").slideUp(1);
					},
					error:function(data){
						alert("出错了");
					}		
				});
			}
		}
	});
//---------------------------------------------------作品展示-------------------------------------------------------------------	
	$("#addShowItemsBut").on("click",function(){
		$("#addShowItems").slideToggle(1);
		$("#opushead").val("");
		$("#opusprofile").val("");
		$("#addShowItemsBut1").text("添加");
	});
	
	function opusdisplay(){
		$.ajax({
			type:"POST",
			//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
			url:"findOpusByPhoneMethod",
			data:data1,
			dataType:"json",//指定服务器返回的数据类型
			success:function(data){
				var obj = data;
				var opusparent = $("#showitemshead");
				for(var i=0;i<obj.length;i++){
					if(obj[i].null3!=null&&obj[i].null3!=""){
						var content = null;
						content='<div class="col-md-12 opusjianjie"><div class="row" style="margin-top: 20px;"><div class="col-md-5 col-md-offset-1">';
						content+='<div class="media"><div class="media-body" style="padding-top: 5px;">';
						content+='<h5 class="media-heading">'+obj[i].null3+'</h5>';
						content+='<font style="color: gray;font-size: 13px;">'+obj[i].null4+'</font></div></div></div><div class="col-md-5" align="right">';
						content+='<font style="color: gray;cursor: pointer;"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>&nbsp;编辑</font>';
						content+='</div><div class="col-md-1"><input type="hidden" value="'+obj[i].id+'"/></div></div></div>';
						opusparent.append(content);
						//-----------------编辑----------------------
						opusparent.find("font:last").on("click",function(){
							$("#addShowItems").slideToggle(1);
							var id = $(this).parent().next().find("input").val();
							$.ajax({
								type:"POST",
								//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
								url:"findOpusByIdMethod",
								data:"id="+id,
								dataType:"json",//指定服务器返回的数据类型
								success:function(data){
									var obj = data;
									$("#opushead").val(obj.null3);
									$("#opusprofile").val(obj.null4);
									$("#hideopuscontent").val(id);
									$("#addShowItemsBut1").text("更新");
								},
								error:function(data){
									alert("出错了");
								}		
							});
						});
					}
				}
			},
			error:function(data){
				alert("出错了");
			}		
		});
	}
	opusdisplay();
	$("#addShowItemsBut2").on("click",function(){
		$("#addShowItems").slideToggle(1);
	});
//---------------------------------------------------添加作品---------------------------------------------------------------	
	$("#addShowItemsBut1").on("click",function(){
		var content = $(this).text();
		var t_CAND_IN_3={};
		t_CAND_IN_3.null3=$("#opushead").val();
		t_CAND_IN_3.null4=$("#opusprofile").val();
		t_CAND_IN_3.null1=phone;
		if(content=='添加'){
			if(t_CAND_IN_3.null3!=null&&t_CAND_IN_3.null3!=""&&t_CAND_IN_3.null4!=null&&t_CAND_IN_3.null4!=""
				&&t_CAND_IN_3.null1!=null&&t_CAND_IN_3.null1!=""){
				$.ajax({
					type:"POST",
					contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
					url:"InsertOpusByPhoneMethod",
					data:JSON.stringify(t_CAND_IN_3),
					dataType:"json",//指定服务器返回的数据类型
					success:function(data){
						var obj = data;
						$("#basicopus").parent().find(".opusjianjie").remove();
						opusdisplay();
						$("#addShowItems").slideToggle(1);
					},
					error:function(data){
						alert("出错了");
					}		
				});
			}	
		}
		else if(content=='更新'){
			if(t_CAND_IN_3.null3!=null&&t_CAND_IN_3.null3!=""&&t_CAND_IN_3.null4!=null&&t_CAND_IN_3.null4!=""
				&&t_CAND_IN_3.null1!=null&&t_CAND_IN_3.null1!=""){
				var t_CAND_IN_3={};
				t_CAND_IN_3.null3=$("#opushead").val();
				t_CAND_IN_3.null4=$("#opusprofile").val();
				t_CAND_IN_3.id=$("#hideopuscontent").val();;
				$.ajax({
				type:"POST",
				contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
				url:"UpdateOpusByIdMethod",
				data:JSON.stringify(t_CAND_IN_3),
				dataType:"json",//指定服务器返回的数据类型
				success:function(data){
					var obj = data;
					$("#basicopus").parent().find(".opusjianjie").remove();
					opusdisplay();
					$("#addShowItems").slideToggle(1);					
				},
				error:function(data){
					alert("出错了");
				}		
			});
			}
		}
	});
//------------------------------------------------------自我描述------------------------------------------------------------------
	var scription='';
	function selfdescriptiondisplay(){
		$.ajax({
			type:"POST",
			//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
			url:"findself_descriptionByNull4Method",
			data:data1,
			dataType:"json",//指定服务器返回的数据类型
			success:function(data){
				var obj = data;
				var selfdescription = $("#selfdescriptionhead");
				var content = null;
				content='<div class="col-md-12 selfdescjianjie"><div class="row" style="margin-top: 20px;"><div class="col-md-5 col-md-offset-1">';
				content+='<div class="media"><div class="media-body" style="padding-top: 5px;">';
				content+='<h5 class="media-heading">'+obj.self_description+'</h5>';
				content+='</div></div></div></div></div>';
				selfdescription.append(content);
				scription = obj.self_description;
			},
			error:function(data){
				alert("出错了");
			}		
		});
	}
	selfdescriptiondisplay();
	$("#addSelfDescBut2").on("click",function(){
		$("#addSelfDesc").slideToggle(1);
	});
	
$("#addSelfDescBut").on("click",function(){
	$("#addSelfDesc").slideToggle(1);
	$("#selfdescription").val(scription);
});
$("#addSelfDescBut1").on("click",function(){
	var content = $("#selfdescription").val();
	var t_CAND_IN_1={};
	t_CAND_IN_1.self_description=content;
	t_CAND_IN_1.null4=phone;
	$.ajax({
	type:"POST",
	contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
	url:"updateself_descriptionByNull44Method",
	data:JSON.stringify(t_CAND_IN_1),
	dataType:"json",//指定服务器返回的数据类型
	success:function(data){
		var obj = data;
		$("#selfdescriptionhead").find(".selfdescjianjie").remove();
		selfdescriptiondisplay();
		$("#addSelfDesc").slideUp(1);
	},
	error:function(data){
		alert("出错了");
	}		
});
});
//------------------------------------------------------期望职位----------------------------------------------------------------------------
var positionapplied = '';
var positiontype = '';
var null5 = '';
var expectedsalary = '';
var supplement = '';
function expectjobdisplay(){
		$.ajax({
			ype:"POST",
			//contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
			url:"findexpectedByNull4Method",
			data:data1,
			dataType:"json",//指定服务器返回的数据类型
			success:function(data){
				var obj = data;
				var expectjobparent = $("#expectjobhead");
				var content = null;
				content='<div class="col-md-12 expectjobjianjie"><div class="row" style="margin-top: 20px;"><div class="col-md-5 col-md-offset-1">';
				content+='<div class="media"><div class="media-body" style="padding-top: 5px;">';
				content+='<h5 class="media-heading">'+obj.position_applied+'.'+obj.position_type+'</h5>';
				content+='<font style="color: gray;font-size: 13px;">'+obj.null5+'.'+obj.expected_salary+'</font>';
				content+='<div>'+obj.supplement+'</div>'
				content+='</div></div></div></div></div>';
				expectjobparent.append(content);
				positionapplied=obj.position_applied;
				positiontype=obj.position_type;
				null5=obj.null5;
				expectedsalary=obj.expected_salary;
				supplement=obj.supplement;
			},
			error:function(data){
				alert("出错了");
			}		
		});
	}
	expectjobdisplay();
	$("#addExpecJobBut").on("click",function(){
		$("#addExpecJob").slideToggle(1);
		$("#form-job").val(positionapplied);
		$("#form-type").find("option").each(function(index,element){
			if($(this).text()==positiontype){
				$(this).attr("selected","selected");
			}
			else{
				$(this).removeAttr("selected");
			}
		});
		$("#form-city").find("option").each(function(index,element){
			if($(this).text()==null5){
				$(this).attr("selected","selected");
			}
			else{
				$(this).removeAttr("selected");
			}
		});
		$("#form-salary").find("option").each(function(index,element){
			if($(this).text()==expectedsalary){
				$(this).attr("selected","selected");
			}
			else{
				$(this).removeAttr("selected");
			}
		});
		$("#form-supplement").val(supplement);
		
		
	});
	$("#addExpecJobBut2").on("click",function(){
		$("#addExpecJob").slideUp(1);	
	});
	$("#addExpecJobBut1").on("click",function(){
		//alert($("#form-job").val()+'--'+$("#form-type").val()+'--'+$("#form-city").val()+'--'+$("#form-salary").val()+'--'+$("#form-supplement").val());	
		var t_CAND_IN_1={};
		t_CAND_IN_1.expected_salary=$("#form-salary").val();
		t_CAND_IN_1.position_type=$("#form-type").val();
		t_CAND_IN_1.supplement=$("#form-supplement").val();
		t_CAND_IN_1.null5=$("#form-city").val();
		t_CAND_IN_1.position_applied=$("#form-job").val();
		t_CAND_IN_1.null4=phone;
		$.ajax({
		type:"POST",
		contentType:"application/json; charset=utf-8",//发送给服务器的数据类型
		url:"updateexpectedByNull4Method",
		data:JSON.stringify(t_CAND_IN_1),
		dataType:"json",//指定服务器返回的数据类型
		success:function(data){
			var obj = data;
			$("#basicexpectjob").parent().find(".expectjobjianjie").remove();
			expectjobdisplay();
			$("#addExpecJob").slideUp(1);				
		},
		error:function(data){
			alert("出错了");
		}		
	});
		
	});

//--------------------------------------------------------------------------------------------------------------------------------------------
	
	
	
});