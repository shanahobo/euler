
angular.module('webApp', ['ngRoute']).config(function($routeProvider) {
	$routeProvider.when("/", 
			{
				template: "<h1>this is the main page</h1>",
				controller: "webAppController"
			});	
	$routeProvider.when("/Expertise", 
			{
				templateUrl: "partials/expertise.html",
				controller: "js/expertise.js"
			});
	$routeProvider.otherwise({
				templateUrl: "This link does not exist"
			});
	
})

	.controller('webAppController', function() {
			console.log("main page");
	})
	
	.controller('viewController', function() {
		
		this.links = [{"title":"Expertise", "id": "1"},
		              {"title":"Projects", "id": "2"},
		              {"title":"Downloads", "id": "3"},
		              {"title":"About", "id": "4"},
		              {"title":"Contact", "id": "5"}];
    })
  