$(document).ready(function() {
	$("#addUserLink").click(function(e) {
	$("#addUserForm").show();
	});
	$("#addUserBtn").click(function() {
	$("#addUserForm").hide();
	var userName = $("#name").val();
	var userAge = $("#age").val();
	var userEmail = $("#email").val();
	var userPassword = $("#password").val();
	var userMobile = $("#mobile").val();
	var user = {
	"name" : userName,
	"age" : userAge,
	"emailId" : userEmail,
	"password" : userPassword,
	"mobile" : userMobile
	};
	$.ajax({
	url : 'rest/blogapp/user',
	type : 'post',
	dataType : 'json',
	contentType: "application/json; charset=utf-8",
	success : function(data) {
	$("#addUserResult").show();
	},
	data : JSON.stringify(user)
	});
	});

});