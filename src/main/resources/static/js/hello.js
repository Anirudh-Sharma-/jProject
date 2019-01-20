angular.module('hello', ['ngRoute'])
  .controller('home', function($http) {
	  var self = this;
	  self.greeting = [];
  $http.get('/resource').then(function(resp){
	  console.log("ALL");
	  console.log(resp.data);
	  self.greeting = resp.data;
  }, function(errResp){
	  //dd
  });
});