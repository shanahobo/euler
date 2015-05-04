
angular.module('webApp', [/**"contact", "about", **/"webApp.expertise" /**, "projects", "downloads" **/])


	.controller('webAppController', function() {

	})
	
	.controller('viewController', function() {
        this.tab = 1;
        this.setView = function(id) {
            this.view = id;
        };
        this.isSet = function(id) {
            return (this.view === id);
        };
    })