1.) Next we want to open up terminal, and type in Òcd Ò. Once we do that we will drag the folder containing forge into terminal, this will copy the path to the folder. It should look like:

cd /User/Username/Desktop/YourName_Modding


This points terminal to the correct folder, the next step will make sure the folder has the proper permissions.

 

2.) This will setup the proper permissions for the folder, just in case.

chmod +x gradlew


 

3.) This command tell gradlew to go ahead and decompile minecraft for modding, this will download and process files and normally takes less than 10 minutes.

./gradlew setupDecompWorkspace --refresh-dependencies


 

4.) Allow Terminal to run through this process

 

5.) When it completes you should see the following. You are looking for a ÒBUILD SUCCESSFULÓ message.

 

6.) Tell Gradlew what IDE () it should prepare files for, in this case we will be using eclipse.

./gradlew eclipse


