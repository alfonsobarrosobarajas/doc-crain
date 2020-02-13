
var app = angular.module('agenteModule', [])
    .controller('agenteController', function($http, $scope, $window){

        // Variable
        $scope.agente = {};

        // Arreglo
        $scope.agentes = [];

        function list(){

            $http.get('/agente/list').then((response) => {

                $scope.agentes = response.data;

            });

        }

        $scope.add = (agente) => {

            $http.post('/agente/add', agente).then((response) => {
                $scope.agente = {};
                list();
            })

        };

        $scope.selectEdit = (agente) => {

            $scope.agente = agente;

        };

        $scope.edit = (agente) => {

            $http.put('/agente/update/' + agente.id, agente).then((response) => {
                list();
            });

        };


        $scope.delete = (agente) => {

            $http.delete('/agente/delete/' + agente.id).then((response) => {
                list();
            });

        };

        list();

    });