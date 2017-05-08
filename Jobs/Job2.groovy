def jobName = 'GeneratedJob2'

pipelineJob(jobName) {
    logRotator{
        numToKeep 30
    }
    definition {
        cps {
            sandbox()
            script("
                node {
                    stage 'Stage 1'
                    echo 'Entering stage 1'
                    stage 'Stage 2'
                    echo 'Entering stage 2'
		    stage 'Stage 3'
                    echo 'Entering stage 3'
                    
                }
            ".stripIndent())
        }
    }
}
