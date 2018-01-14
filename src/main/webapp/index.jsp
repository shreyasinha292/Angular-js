<!DOCTYPE html>
<html>
    <head>
            <script src = "angular.min.js">
        
              </script>
                
                
              <script src = "main.js">
                
              </script>
              <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.25/angular.min.js"></script>
              <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.25/angular-route.js"></script>
    </head>
    <body>
    	<div ng-app="demo">

                <div ng-controller="Mycontroller">
                   <h1> Select any of the following operations:</h1> <br><br>

                    <a href="#update"><button type="submit" >UPDATE</button></a><br><br>
                    
                    <a href="#create"><button type="submit">CREATE</button></a><br><br>
                   
                    <a href="#delete"><button type="submit">DELETE</button></a><br><br>
                    
                    <a href="#display"><button type="submit">DISPLAY</button></a>
                    
                    <div ng-view></div>
				</div>
        </div>
    </body>
</html>