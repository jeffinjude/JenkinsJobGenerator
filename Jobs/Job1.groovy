def jobName = 'GeneratedJob1'
def gitUrl = 'https://github.com/jeffinjude/ObjectsRepo.git'
def branchName = 'master'
job(jobName) {
    scm {
            git(gitUrl, branchName)
    }
	
	steps {
        shell('echo "Hello, world!"')
    }
}
