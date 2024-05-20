pipeline {
    agent any
    stages {
        stage("Deploy") {
            steps {
                input(
                    message: "Ready to continue?",
                    ok: "Yes",
                    submitter: "jeej"
                )
                echo "Deployment stage."
            }
        }
    }
}