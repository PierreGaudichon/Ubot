Ubot
====

A rewrite of the Robot interface. The goal is to abstract the implementation of the Robot.


Public methods
--------------

### Constructor

    Ubot()

Create the Ubot object.


### moveBlock

    void moveBlock(int from, int to)

Move a block from the `from` column to the `to` position. The border is automaticly detected. `moveBlock(0,4)` is allowed but have an unexpected behaviour.


### read

    int read(int l)

Read the value of the first block in the `l` column. If the column is empty, return -1.


### isEmpty

    boolean isEmpty(int l)

Check if the column `l` is empty.


### play

    void play()

Start the robot.

Usage
-----

Make sure that the Robot.jar is in the same folder as the Ubot.class file.

In your main function : 

    // creation of the Ubot.
    Ubot u = new Ubot();

    // move your blocks here.
    if(!u.isEmpty(1)){
        u.moveBlock(1,2);
    }
    
    // finaly start the Ubot.
    u.play();

