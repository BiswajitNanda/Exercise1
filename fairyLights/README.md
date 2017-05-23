Fairy Lights
=========================

# Introduction
This program runs two algorithms one
- sequence algorithm  where each light is turned on for 0.5 seconds then off in turn from first to last.
and then
- colour algorithm where all red lights are turned on for 1 sec
and then the green ones followed by white

# Work pending
Work could not be complete for running both the algorithms for 30 secs. Could be added in the future


### Approach
The test architectural principle implemented is simplicity.

There are 3 classes Light, AllLights and Main
Light class has methods for setting the number of the light, colour and also the turnedon state
AllLights essentially creates an array of lights and assigns colour and number to the lights.
It also has capabilty to switch the state of lights.

It does all the above in both the algorithms.

Main class is responsible for starting the controller which essentially runs both the algorithms.

### Areas of improvement

1. Had there been more time, code duplication could be avoided and greater improvement could have been made w.r.t. code reuse
2. Duplication in colour values could be implemented by mod(%) operation.




