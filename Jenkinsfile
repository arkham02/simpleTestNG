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
                bat 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test'){
            steps{
                bat 'mvn test'
            }
        }
    }
}