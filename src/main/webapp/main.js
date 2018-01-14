var app = angular.module('demo',["ngRoute"]);

app.config(function($routeProvider){
    $routeProvider.when("/create",{templateUrl:"create.html"})
    .when("/update",{templateUrl:"update.html"})
    .when("/delete",{templateUrl:"delete.html"})
    .when("/display",{templateUrl:"getProfile.html"});
});

app.controller('Mycontroller', function($scope,$http){
    $scope.greeting = "Welcome for email and contact updation";
    $scope.emp_id1 = 0;
    $scope.contact1 = null;
    $scope.email1= null;
   
    $scope.update = function(){

    	 console.log($scope.emp_id1);
         console.log($scope.contact1);
         console.log( $scope.email1);
       $scope.updateobj={"contact":$scope.contact1,"email":$scope.email1}

       $http.put("http://localhost:8080/CRUD_Rest/webapi/Employee/"+$scope.emp_id1,$scope.updateobj).then(function(response){
           console.log(response);
       });
    }
});

app.controller('Mycontroller1', function($scope,$http){
    $scope.greeting = "Welcome for record creation";
    $scope.emp_id1 = 0;
    $scope.name1 = null;
    $scope.contact1 = null;
    $scope.email1= null;
    $scope.age1 = 0;
    $scope.gender1 = null;
    
    $scope.create = function(){

       console.log("creating a record");
       $scope.createobj={"emp_id":$scope.emp_id1,"name":$scope.name1,"contact":$scope.contact1,"email":$scope.email1,"age":$scope.age1,"gender":$scope.gender1}

       $http.post("http://localhost:8080/CRUD_Rest/webapi/Employee/",$scope.createobj).then(function(response){
           console.log(response);
       });
    }
});

app.controller('Mycontroller2', function($scope,$http){
	$scope.greeting = "Welcome";
	$scope.emp_id1 = 0;

	$scope.delete_ = function(){

		console.log("deleting a record");

		$http.delete("http://localhost:8080/CRUD_Rest/webapi/Employee/"+ $scope.emp_id1)
		.then(function(response){
		console.log(response);
		});
	}
});

app.controller('Mycontroller3', function($scope,$http){
	$scope.greeting = "Welcome";
	$scope.emp_id1 = 0;
	$scope.getObject = null;
	$scope.getProfile = function(){

		console.log("getting a record");

		$http.get("http://localhost:8080/CRUD_Rest/webapi/Employee/"+ $scope.emp_id1)
		.then(function(response){
			console.log(response);
			$scope.getObject = response.data;			
			
		
		});
	}
});