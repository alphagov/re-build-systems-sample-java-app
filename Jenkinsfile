pipeline {

    agent {
        label 'sample-docker-jnlp-java-agent'
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
                echo "For this demo, just checking the artefact has been created. You should then upload to a store."
                sh 'ls $WORKSPACE/target/re-build-systems-sample-java-app-1.0.jar'
            }
        }
    }
}
