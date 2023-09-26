def call(){
  sh 'curl -X PUT -u admin -T kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://<EC2IP>:8082/artifactory/example-repo-local/'
}
