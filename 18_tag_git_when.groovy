pipeline {
    agent any
    stages {
        stage("Deploy") {
            when {
                tag "release-*"
            }
            steps {
                echo "Deploy to production."
            }
        }
        tage("Deploy") {
            when {
                buildingTag()
            }
            steps {
                echo "Hello World!"
            }
        }
    }
}