pipeline {  
    agent any
    stages {
        stage('Build') {
           steps {
            sh '''
             echo "Shell : Run mvn"
             mvn clean compile
             '''
          }
        }
    }
}	
