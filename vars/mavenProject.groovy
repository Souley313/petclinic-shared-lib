def call() {

	pipeline {
		agent any
		
		stages {
			stage('Hello') {
				steps {
					quiEsTu 'twitter'
				}
			}
		}
	}
}