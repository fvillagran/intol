node{
    stage('SCM Checkout'){
        git 'https://github.com/fvillagran/intol'
    }
    stage('Compile-Package'){
        def mvnHome = tool name: 'Maven-3.5.4', type: 'maven'
        "${mvnHome}/bin/mvn clean compile" 
    }    
    stage('Compile-Package'){
        def mvnHome = tool name: 'Maven-3.5.4', type: 'maven'
        "${mvnHome}/bin/mvn package" 
    }
}
