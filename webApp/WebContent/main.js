
angular.module('webApp', [/**"contact", "about", **/"webApp.expertise" /**, "projects", "downloads" **/])


	.controller('webAppController', function() {

	})
	
	.controller('viewController', function() {
		
		this.links = [{"title":"Expertise", "id": "1"},
		              {"title":"Projects", "id": "2"},
		              {"title":"Downloads", "id": "3"},
		              {"title":"About", "id": "4"},
		              {"title":"Contact", "id": "5"}];
		
        this.tab = 1;
        this.setView = function(id) {
            this.view = id;
        };
        this.isSet = function(id) {
            return (this.view === id);
        };
    })
  