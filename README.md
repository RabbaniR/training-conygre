**image is currently not working**

What is JessRaisa?

JessRaisa is a comprehensive web application that shows you a list of the bridges and cities in the world. 

### How to use the image

#### Downloading the image

To download JessRaisa image, run this command:

docker pull docker.conygre.com:5000/jessraisa

Downloading the image in a separate step is not strictly necessary; however, performing this before you create your Docker container ensures your local image is up to date.

After it is downloaded run the below command to show that the image is working:

docker images  

#### Starting a jessraisa instance

Start a new Docker container for the jessRaisa image with this command:

docker run -p8080:80 docker.conygre.com:5000/jessraisa

Go to your local browser and type in the ip that you are currently running it on with port 8080

For example:
18.218.73.147:8080

When you access this site, you will see a list of bridges and a list of cities. 

Enjoy! 
