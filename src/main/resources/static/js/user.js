'use strict';

let index = {
    init: function() {
        $("#btn-save").on("click", () => { //this를 바인딩하기 위해 화샬표 함수 사용
            this.save();
        });

         $("#btn-udpate").on("click", () => {
            let form = document.querySelector("#needs-validateion");
            if (form.checkValidity() == false) {
                console.log("회원정보 업데이트 실패!!");
            } else {
                this.update();
            }

        });

    },

    save: function () {
        let data = {
            username: $("#username").val(),
            password: $("#password").val(),
            email: $("#email").val(),
            nickname: $("#nickname").val()
        }

        $.ajax({
            type: "POST",               //Http method
            url: "/auth/api/v1/user",   //API 주소
            data: JSON.stringify(data), //JSON으로 변환
            contentType: "application/json; charset=utf-8", //MIME 타입
            dataType: "json"            //응답 데이터
        }).done(function(res) {
            alert("회원가입이 완료되었습니다.");
            location.href = "/";
        }).fail(function(err) {
            alert(JSON.stringify(err));
        });
    },

   update: function () {
        let data = {
           id: $("#id").val(),
           password: $("#password").val(),
           nickname: $("#nickname").val()
       }

       $.ajax({
           type: "PUT",
           url: "/api/v1/user",
           data: JSON.stringify(data),
           contentType: "application/json; charset=utf-8",
           dataType: "json"
       }).done(function (res) {
           alert("회원수정이 완료되었습니다.");
           location.href = "/";
       }).fail(function (err) {
           alert(JSON.stringify(err));
       });

   }


}
index.init();