$(function() {
	$( document ).tooltip();
});

/*
 * Function redirects user to new specified page.
 * 
 * @param cqTarget String with redirection target
 */
function goTo(cqTarget) {
	var target = cqTarget + ".html";
	window.location=target;
}