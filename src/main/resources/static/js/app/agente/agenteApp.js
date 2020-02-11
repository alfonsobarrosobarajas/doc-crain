
var app = angular.module('agenteModule', [])
    .controller('agenteController', function($http, $scope, $window){

        // Variable
        $scope.agente = {
            id : null,
            numempleado : null,
            nombre : null,
            telefono : null
        };

        // Arreglo
        $scope.agentes = [];

        function list(){

            $http.get('/agente/list').then((response) => {

                $scope.agentes = response.data;

            });

        }

        $scope.add = (agente) => {

            $http.post('/agente/add', agente).then((response) => {

                $window.alert('Agente agregado')
                list();
            })

        };

        $scope.delete = (agente) => {

            const conf = $window.confirm('Seguro de eliminar el registro ' + agente.nombre);

            if(conf){

                $http.delete('/agente/delete/' + agente.id).then((response) => {
                    $window.alert('Registro eliminado');
                });

            }

        };



    });