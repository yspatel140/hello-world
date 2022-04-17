# Few important commands 

# Create executable JAR 
mvn clean install
# Start embedded tomcat 
java -jar target/hello-world-0.0.1-SNAPSHOT.jar
# Build docker image
docker build -t hello-world:1.0.1 .
# Create config map 
kubectl apply -f config-map.yaml
# Get config map 
kubectl get cm
# Describe config map
kubectl describe cm hello-world-cm
# Delete config map 
kubectl delete cm hello-world-cm
# Create pod 
kubectl apply -f .\pod.yaml
# Get pod
kubectl get pod
# Describe pod 
kubectl describe pod hello-world
# To check pod logs 
kubectl logs hello-world
# Delete pod 
kubectl delete pod hello-world 
# Expose pod 
kubectl expose pod hello-world --type=LoadBalancer --port=8080 --target-port=8080

