def call(){
  
  sh 'curl -X PUT -u admin:Na966620 -T kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://http://54.234.69.16/:8082/artifactory/example-repo-local/'
}
