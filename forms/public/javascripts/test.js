//Define an angular module for our app
var sampleApp = angular.module('coursematch', []);
 
//Define Routing for app
//Uri /AddNewOrder -> template add_order.html and Controller AddOrderController
//Uri /ShowOrders -> template show_orders.html and Controller AddOrderController
sampleApp.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/signIn', {
        templateUrl: '/templates/signIn.html'
    }).
      otherwise({
        redirectTo: '/templates/signIn.html'
      });
}]);



app.config(['$stateProvider',function($stateProvider){
	 var add_new_config = {
		url: '/signIn',
		templateUrl: 'assets/templates/signIn.html'
	 };
	 
	 $stateProvider.state('signIn',add_new_config);
}])