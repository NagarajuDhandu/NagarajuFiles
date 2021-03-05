function validateTittle() {
	
	var letters = /^[A-Za-z]+$/
	var msg=document.bookInfo.bookName.value
	
	if(msg.match(letters))
	{
		document.getElementById("result").innerHTML="Password length : Week"
	}

}