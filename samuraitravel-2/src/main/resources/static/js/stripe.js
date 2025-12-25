const stripe = Stripe('pk_test_51SgFvpAZ8ywDGuum5ZRgxKJXYvxAmSiIO6c3I2mshksS2xRSUExcrLjQCxIb60Fdd6IWzROlpApDalTAKiwt6RcW00N2UCMKjV');
const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click', () =>{
	stripe.redirectToCheckout({
		sessionId: sessionId
	})
});