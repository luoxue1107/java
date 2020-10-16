$(function() {
    // 登录按钮点击事件
    $("#loginBtn").click(function(e) {
        // 获取帐号的元素
        let $mobile = $("#mobile");
        // 获取密码的元素
        let $password = $("#password");
        let person = {
            // 获取帐号的值
            mobile: $mobile.val(),
            // 获取密码的值
            password: $password.val(),
        };
        $.ajax({
            // 提交方式
            type: "post",
            // 请求地址
            url: "/login.action",
            // 发送参数
            data: person,
            dataType: "dataType",
            success: function(response) {

            }
        });
    });
});