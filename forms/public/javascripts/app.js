(function() {
	var routerApp = angular.module('course_match', ['ui.router']);

	routerApp.config(function($stateProvider, $urlRouterProvider) {
	    
	    $urlRouterProvider.otherwise('/');
	    
	    $stateProvider
	        
	        // HOME STATES AND NESTED VIEWS ========================================
	        .state('signIn', {
	            url: '/signIn',
	            templateUrl: 'assets/templates/signIn.html'
	        })
	       
	        
	});

}) 