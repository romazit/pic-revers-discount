angular.module("myapp", [])
        .controller("MyController", function ($scope, $http) {

            $scope.myData = {};
            $scope.myData.doClick = function (item, event) {

                $scope.bbb = $scope.priceBeforeDiscountModel;
                $scope.ccc = $scope.priceAfterDiscountModel;

                //var responsePromise = $http.get("http://localhost:8080/pic-revers-discount/resources/picreversdiscountrest/111.00/11.00");
                var responsePromise = $http.get("http://localhost:8080/pic-revers-discount/resources/picreversdiscountrest/" + $scope.priceBeforeDiscountModel + "/"+$scope.priceAfterDiscountModel);

                responsePromise.success(function (data, status, headers, config) {
                    //$scope.myData.fromServer = data.title;
                    $scope.result1 = data.result1;
                    $scope.result2 = data.result2;
                    $scope.result3 = data.result3;
                    //alert(data);
                });
                responsePromise.error(function (data, status, headers, config) {
                    //alert("AJAX failed!");
                });
            }


        });

