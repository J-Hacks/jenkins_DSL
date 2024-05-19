pipeline {
    agent any
    stages {
        stage("not") {
            when {
                not {
                    branch "master"
                }
            }
            steps {
                echo "Test stage."
            }
        }
   stage("allof") {
            when {
                allOf {
                    branch "master"
                    environment(name: "ENV", value: "production")
                    tag "release-*"
                }
            }
            steps {
                echo "Deploy to production."
            }
        }
        stage("anyof") {
            when {
                anyOf {
                    branch "feature"
                    changelog ".*new feature.*"
                }
            }
            steps {
                echo "Test new feature."
            }
        }
    }

}