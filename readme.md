# Step 1: run the below command inside the project folder:

mvn clean install
It will generate a target folder with application jar in it

# Step 2: Run the below command to tag and build the docker image

docker build -t <your_dockerhub_id>/<app_name> .

e.g. 
docker build -t dummyuser/blogging-app .

Don't miss the dot in the end of above mentioned command.

# Step 3: To run the app on your local docker instance execute below command

docker run -p 8080:8080 dummyuser/blogging-app

# Step 4: Now you can access the app on your browser or rest client on localhost:8080. Sample endpoint is 

GET: localhost:8080/posts
