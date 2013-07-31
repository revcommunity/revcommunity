function getXMLObject()  //tworzy obiekt XMLHttpRequest
{
           var xmlHttp = false;
           try {
             xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");  // Stare przegladarki
           }
           catch (e) {
             try {
               xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");  // IE
             }
             catch (e2) {
               xmlHttp = false;   // nieznana przegladarka
             }
           }
          
           if (!xmlHttp && typeof XMLHttpRequest != 'undefined') {
             xmlHttp = new XMLHttpRequest();        // Mozilla, Opera 
           }
           return xmlHttp;
}
var xmlhttp=getXMLObject();
var servletPrefix="";
var servletPostfix=".do";
//uruchamia servlet synchronicznie
function exec(nazwa, arg) {
	xmlhttp.open("POST", servletPrefix + nazwa, false);
	xmlhttp.setRequestHeader("charset", "utf-8");// x-www-form-urlencoded
	xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	xmlhttp.send(arg);
	var resp=Ext.JSON.decode(xmlhttp.responseText);
	if(resp.code != 200){
		switch(resp.code)
		{
		case 500:
			Ext.Msg.alert("B³¹d","Wyst¹pi³ nieznany b³¹d");
			location.reload();
		  break;
		case 409:
			Ext.Msg.alert("B³¹d",resp.errMsg);
		  break;
		default:
		  //
		}
	}

	return resp;
}

function execJson(nazwa, arg) {
	xmlhttp.open("POST", servletPrefix + nazwa, false);
	xmlhttp.setRequestHeader("charset", "utf-8");//x-www-form-urlencoded
	xmlhttp.setRequestHeader("Content-type","application/json");
	xmlhttp.send(arg);
	if(xmlhttp.status != 200){
		Ext.Msg.alert("B³¹d",xmlhttp.responseText);
	}

	return xmlhttp;		
}

function log(str){
	console.log(str);
}