def call(){
  
//  sh 'curl -X PUT -u admin:Na966620 -T target/kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://34.203.38.217:8082/artifactory/example-repo-local/'
         sh 'python3 /var/lib/jenkins/workspace/jfrog/jfrog.py'
}
