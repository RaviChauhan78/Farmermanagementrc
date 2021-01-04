	function validate()
	{
		var imobilenumber = document.forms["farmer"]["imobilenumber"].value;
		var emailRegex = /[A-Z0-9._%+-]+@[A-Z0-9.-]+.[A-Z]{2,4}/igm;
		var email = document.forms["farmer"]["iemail"].value;
		var val = document.forms["farmer"]["imobilenumber"].value;
if (/^\d{10}$/.test(val)) 
{
   
} 
else 
{
    alert("Invalid number; must be ten digits")
    document.forms["farmer"]["imobilenumber"].focus()
    return false
}
		if (email == "") {
			alert("Please enter email");
			document.forms["farmer"]["iemail"].focus();
			return false;
		}
		if(!emailRegex.test(email))
		{
			alert("Not valid email");
			document.forms["farmer"]["iemail"].focus();
			return false;
		}
		if (document.forms["farmer"]["itype"].value == "") {
			alert("Please enter item type");
			document.forms["farmer"]["itype"].focus();
			return false;
		}
		if (document.forms["farmer"]["iname"].value == "") {
			alert("Please enter ritem  name");
			document.forms["farmer"]["iname"].focus();
			return false;
		}
		if (document.forms["farmer"]["imobilenumber"].value == "" || document.forms["farmer"]["imobilenumber"].value == 0) {
			alert("Please valid enter imobilenumber ");
			document.forms["farmer"]["imobilenumber"].focus();
			return false;
		}
		if (document.forms["farmer"]["iprice"].value == "") 
		{
			alert("Please enter Item Price");
			document.forms["farmer"]["iprice"].focus();
			return false;
		}
	
	}