def jobName = 'GeneratedJob1'
def gitUrl = 'https://github.com/jeffinjude/ObjectsRepo.git'
def branchName = 'master'
job(jobName) {
	label('ubuntu-slave-node')
	
	parameters {
		stringParam('MESSAGE', 'Hello world!') 
	}
	scm {
        	git {
			remote {
				github('jeffinjude/ObjectsRepo')
			}
			configure { scmNode ->
				scmNode / gitTool('ubuntu-slave-git')
			}
		}
	}
	
	steps {
		shell('echo ${MESSAGE}')
	}
}
