node{
    stage('SCM Checkout'){
        git 'https://github.com/fvillagran/intol'
    }
    stage('Compile-Package'){
        sh 'mvn package' 
    }
}
