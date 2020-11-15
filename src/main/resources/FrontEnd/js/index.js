

$(document).ready(function(){
    $.ajax({
        type:"GET",
        url:"http://localhost:8080/accountBook/all?page=1&size=25",
    })
})