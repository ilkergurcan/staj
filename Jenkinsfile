pipeline{
    agent any
    stages{
        stage("Build"){
            when {
                expression {
                    BRANCH_NAME == 'staj'
                }
            }
            steps{
                echo "Kodun build edildiği aşama"
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
