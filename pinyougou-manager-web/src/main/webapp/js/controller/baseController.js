app.controller("baseController",function($scope){
	$scope.reloadList =  function(){
	    	$scope.findPage($scope.paginationConf.currentPage, $scope.paginationConf.itemsPerPage);
	};
	
	$scope.paginationConf = {
			 currentPage: 1,
			 totalItems: 10,
			 itemsPerPage: 10,
			 perPageOptions: [10, 20, 30, 40, 50],
			 onChange: function(){
			    $scope.reloadList();//重新加载
			}
	};
	
	$scope.selectIds=[];
	$scope.updateSelection = function($event,id){
		if($event.target.checked){
			$scope.selectIds.push(id);
		}else {
			$scope.delArrDate($scope.selectIds,id);
		}
	};
	
	$scope.delArrDate = function delArrDate(arr,id){
		var index =	arr.indexOf(id);
		arr.splice(index,1);
	}
})