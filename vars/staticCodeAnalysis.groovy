def call(){

    withSonarQubeEnv(credentialsId: 'TOKEN_SONAR') {
        sh 'mvn clean package sonar:sonar'
    }
}