Sample Groovy DSL script that creates jenkins job.
Steps:
1) Ensure that Job DSL jenkins plugin is installed. <br>
2) Create a freestyle seed job and point to the git repository having the dsl scripts. <br>
3) In build step select option 'Process Job DSLs'. <br>
4) Select 'Look on Filesystem' option and provide DSL Scripts path as 'Jobs/*.groovy'. <br>
5) Run the seed job to generate the jobs. <br>
