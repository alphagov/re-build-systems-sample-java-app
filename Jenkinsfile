pipeline {

    agent {
        label 'docker-jnlp-java-agent'
    }

    stages {

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Publish artefact') {
            steps {
                echo "Just checking the artefact has been created. If so, tag it and publish it should be simple."
                sh 'ls $WORKSPACE/target/re-build-systems-sample-java-app-1.0.jar'
            }
        }
    }
}
