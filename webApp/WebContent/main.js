
var app = angular.module('webApp', ['ngRoute']).config(function($routeProvider) {
	$routeProvider.when("/", 
			{
				template: "<h1>this is the main page</h1>",
				controller: "webAppController"
			});	
	$routeProvider.when("/Expertise", 
			{
				templateUrl: "partials/expertise.html",
				controller: "expertiseController"
			});
	$routeProvider.otherwise({
				templateUrl: "This link does not exist"
			});
	

	
})

	app.controller('webAppController', function($scope) {
			console.log("main page");
			
			$scope.logMouseEvent = function() {
		        switch (event.type) {
		          case "mouseenter":
		            console.log("Hey Mouse Entered");
		            break;

		          case "mouseleave":
		            console.log("Mouse Gone");
		            break;

		          default:
		            console.log(event.type);
		            break;
		        }
			}
			
			$scope.displayMenu = function(){
				alert("menu clicked");
			}
	})
	
	app.controller('viewController', function() {
		
		this.links = [{"title":"Expertise", "id": "1"},
		              {"title":"Projects", "id": "2"},
		              {"title":"Downloads", "id": "3"},
		              {"title":"About", "id": "4"},
		              {"title":"Contact", "id": "5"}];
    })
    
    app.controller('expertiseController', function() {
		
		this.expertise = [{"title":"Technical Skills", "id": "1"},
		              {"title":"Tools I work with", "id": "2"},
		              {"title":"Other Skills", "id": "3"}];
  })
  