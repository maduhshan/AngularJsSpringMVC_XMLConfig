'use strict';

var App = angular.module('myApp', ['ui.router']);

App.config(function($stateProvider, $urlRouterProvider) {
    
    $urlRouterProvider.otherwise('/home');
    
    $stateProvider
        
        .state('home', {
            url: '/home',
            templateUrl: '/SampleSpringMVCAngularHibernate/',
        })
        .state('newuser', {
            url: '/newuser',
            templateUrl: '/SampleSpringMVCAngularHibernate/RegisterUser',
        })
        
});