def jobName = 'AlexaBuildJob_generated'
def gitUrl = 'https://592675@code.cognizant.com/475383/alexaProject.git'
def branchName = 'master'
def jenkinsExecutionNode = 'ubuntu-slave-node'
def gitExecutable = 'ubuntu-slave-git'
def gitCredentials = 'jeffin-cts-git'

job(jobName) {
	label(jenkinsExecutionNode)
	
	scm {
		git {
			remote {
				url(gitUrl)
				credentials(gitCredentials)
			}
			branch(branchName)
			configure { scmNode ->
				scmNode / gitTool(gitExecutable)}
		}       	
	}
	
	steps {
		maven('clean package')
	}
	
}
