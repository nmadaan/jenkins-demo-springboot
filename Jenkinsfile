pipeline {  
    agent any
    stages {
    	  stage('Clean Workspace Before Build'){
			    steps {
				    step([$class: 'WsCleanup'])
			    }
		    }
        stage('Checkout_Code') {
          steps {
            echo 'Checkout code..'
            checkout([$class: 'GitSCM', branches: [[name: 'master']], doGenerateSubmoduleConfigurations: false, submoduleCfg: [], userRemoteConfigs: [[url: 'https://github-dev.spe.sony.com/mp/EES-Demo-Devops.git']]])
          }
        }
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
