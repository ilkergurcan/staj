pipeline{
    agent any
    environment {
        NEW_VERSION = '1.1.2'   
        SERVER_CREDENTIALS = credentials('Jenkins')
    }
    stages{
        stage("Build"){
            when {
                expression {
                    BRANCH_NAME == 'master'
                }
            }
            steps{
                echo "Kodun build edildiği aşama"
                echo "${NEW_VERSION} versiyonu build ediliyor"
            }
            
        }
        stage("Test"){
            steps{
                echo "Test aşaması"
            }
        }
        stage("QA"){
            steps{
                echo "QA aşaması"
            }
        }
        stage("Deploy"){
            steps {
                echo "Kodun Deploy edildiği aşama"
                echo "Bu credentials ile deploy ediliyor: ${SERVER_CREDENTIALS}"
                sh "${SERVER_CREDENTIALS}"
            }
        }
        stage("Monitor"){
            steps{
                echo "Kodun Monitorlendiği aşama "
            }
        }
    }
    
    post{
        success{
            echo "all things went well"   
        }
    }
}
