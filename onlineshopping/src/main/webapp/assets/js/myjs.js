$(function() {
	// Active menu problem, using seperate js file to handle that only
	switch (menu) {
	default:
	case 'Home':
		$('#home').addClass('active');
		break;
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Contact':
		$('#contact').addClass('active');
		break;
	}
});