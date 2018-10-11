app.service('brandService',function($http){
    		this.findAll =  function(){
    			return $http.get('../brand/findAll.do');
    		};
    		
    		this.findPage = function(page,rows){
    			return $http.get('../brand/findPage.do?page='+page+'&rows='+rows);
    		};
    		
    		this.save = function(entity){
    			var methodName = 'add';
    			if (entity.id != null) {
    				methodName = 'update'
    			};
    			return $http.post('../brand/'+methodName+'.do', entity);
    		}
    		
    		this.findOne = function(id){
    			return $http.get('../brand/findOne.do?id='+id);
    		}
    		
    		this.update = function(entity){
    			return $http.post('../brand/update.do', entity);
    		}
    		
    		this.dele = function(ids){
    			return $http.get('../brand/delete.do?ids='+ids);
    		}
    		
    		this.selectOptionList = function(){
    			return $http.get('../brand/selectOptionList.do');
    		}
});