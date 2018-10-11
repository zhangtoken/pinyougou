app.controller("brandController",function($scope,$controller,brandService){
    		
			$controller('baseController',{$scope:$scope});
    		$scope.findAll = function(){
    			brandService.findAll().success(
    	    			function(response){
    	    				$scope.list = response;
    	    			}		
    	    	);
    		}
    		
    		$scope.findPage =function(page,rows){
    			brandService.findPage(page,rows).success(
    	    			function(response){
    	    				$scope.list = response.rows;
    	    				$scope.paginationConf.totalItems = response.total;
    	    			}		
    	    	);
    		} 
    		
    		$scope.save = function(){
    			brandService.save($scope.entity).success(
    	    			function(response){
    	    				console.log(response);
    	    				if(response.success){
    	    					$scope.reloadList();
    	    				}else{
    	    					alert(response.message);
    	    				}
    	    			}		
    	    	);
    		}	 
    		
    		$scope.findOne = function(id){
    			brandService.findOne(id).success(
    					function(response){
    	    				$scope.entity = response
    	    			}			
    			);
    		} 
    		
    		$scope.update = function(){
    			brandService.update($scope.entity).success(
    	    			function(response){
    	    				console.log(response);
    	    				if(response.success){
    	    					$scope.reloadList();
    	    				}else{
    	    					alert(response.message);
    	    				}
    	    			}		
    	    	);
    		} 
    		
    		$scope.dele =function(ids){
    			brandService.dele(ids).success(
    					function(response){
    						if(response.success){
    							$scope.reloadList();
    							$.each(ids,function(i,row){
    								$scope.delArrDate($scope.selectIds,row);
    							})
    						}else{
    							alert(response.message);
    						}
    	    			}			
    			);
    		} 
    		
})