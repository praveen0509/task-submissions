
	function loadDoc() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
      document.getElementById("demo").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "https://www.google.com/url?q=https://jsonplaceholder.typicode.com/users&sa=D&source=hangouts&ust=1549437858774000&usg=AFQjCNE7AknlzhUGm6sfplc-Ln_h1jYQaw", true);
  xhttp.send();
}
				
		


















