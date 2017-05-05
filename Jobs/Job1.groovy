def jobName = 'GeneratedJob1'
def gitUrl = 'https://github.com/jeffinjude/ObjectsRepo.git'
def branchName = 'master'
job(jobName) {
	parameters {
		stringParam('MESSAGE', 'Hello world!') 
	}
	scm {
        	git(gitUrl, branchName)
	}
	
	steps {
		shell('echo ${MESSAGE}')
	}
}
