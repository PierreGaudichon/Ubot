# Compile Ubot.jar
javac -classpath Robot.jar Ubot.java

# Create Ubot.jar
jar cf Ubot.jar Ubot.class

# Commit the folder
git commit -am "I hate commit message."

# Execute the main (debug)
java Ubot