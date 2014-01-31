# Compile Ubot.jar
javac -classpath Robot.jar Ubot.java

# Create Ubot.jar
jar cf Ubot.jar Ubot.class

# Execute the main (debug)
echo "Main : "
java Ubot