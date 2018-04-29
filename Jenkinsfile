pipeline {

    agent none

    stages {

        stage('Build Java artifact') {
            agent {
                dockerfile {
                  filename 'Dockerfile.build'
                }
            }
            steps {
                echo "Building Java artifact"
                sh 'mvn clean package'
            }
        }

        stage('Build container image') {
            agent {
                dockerfile {
                  filename 'Dockerfile'
                }
            }
            steps {
                echo "Building Docker image"
            }
        }

        stage('Tests') {
            steps {
                echo 'Running e2e tests...'
            }
        }


    }
}
