docker build -t myofbiz .
docker run -d --name myofbiz -p 8080:8080 -p 8443:8443 myofbiz
docker start myofbiz