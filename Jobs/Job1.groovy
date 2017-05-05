def jobName = 'GeneratedJob1'
def gitOwner_RepoName= 'jeffinjude/ObjectsRepo' /*Provide this in the format: owner/repositoryname */
def branchName = 'master'
def jenkinsExecutionNode = 'ubuntu-slave-node'
def gitExecutable = 'ubuntu-slave-git'

job(jobName) {
	label(jenkinsExecutionNode)
	
	parameters {
		stringParam('MESSAGE', 'Hello world!') 
	}
	
	scm {
        	git {
			remote {
				github(gitOwner_RepoName)
			}
			branch(branchName)
			configure { scmNode ->
				scmNode / gitTool(gitExecutable)
			}
		}
	}
	
	steps {
		shell('echo ${MESSAGE}')
	}
}
