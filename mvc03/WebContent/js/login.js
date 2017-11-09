$(document).on('submit','.header>form',function() {
	var url=$(this).attr('action');
	var param=$(this).serialize();
	$.post(url,param,function(data){
		var result=$(data).find('result').text();
		var name=$(data).find('name').text();
		//alert(result+'\n'+name);
		var msg='<p>'+name+'님 환영합니다';
		msg+=' <a href="logout.do">[logout]</a></p>';
		if(result=='true'){
			$('.header').eq(1).html(msg);
			$('.menu ul li').last().remove();
			$('.menu ul').append('<li><a href="logout.do">LOOUT</a></li>');
		}
	});
	return false;
});