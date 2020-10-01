pipeline{
    agent any
    stages{
        stage('Preparation'){
            steps{
                git 'https://github.com/arkham02/simpleTestNG.git'
            }
        }
        stage('Build'){
            steps{
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test'){
            steps{
                sh 'mvn test'
            }
        }
    }
}