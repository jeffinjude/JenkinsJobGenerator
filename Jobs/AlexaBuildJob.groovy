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
				configure { scmNode ->
					scmNode / userRemoteConfigs / hudson.plugins.git.UserRemoteConfig / url(gitUrl)
				}
				configure { scmNode ->
					scmNode / userRemoteConfigs / hudson.plugins.git.UserRemoteConfig / credentialsId(gitCredentials)
				}
				branch(branchName)
				configure { scmNode ->
					scmNode / gitTool(gitExecutable)
				}
			}
	}
	
}