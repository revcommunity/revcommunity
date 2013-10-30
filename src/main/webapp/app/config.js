//Parametry
var loggingEnabled = true;

// Konfiguracja
var log = function() {
};
if (loggingEnabled == true) {
	log = console.log;
}