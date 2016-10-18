function validate(){
	name = document.getElementById("a").value;
	Password = document.getElementById("b").value;
	Reenter_Password = document.getElementById("c").value;
	City =  document.getElementById("d").value;
	msg = [];
	msg.push(name+"\n");
	msg.push(Password+"\n");
	alert(msg);
}