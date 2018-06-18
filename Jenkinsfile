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
                echo "Publishing artefact..."
            }
        }
    }
}
