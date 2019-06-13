## Moviez

This application allows users to keep an inventory of movies. It is built with __Scala__ and __Akka__, and it consists of *three* layers:

1. Common -- this layer consists of the classes necessary to store movie information, as well as general utility methods.
2. Data -- this layer uses Akka Persistence to communicate with a PostgreSQL database in order to, among other things, authenticate users and retrieve their saved inventories.
3. Server -- this layer uses Akka HTTP to interact with the world.

### Features

Initially, this application will consist of the following features (in no specific order):

* The ability for a user to register for and login to the application.
* The ability to search for movies by name, by genre, by actor, etc.
* The ability for a user to save a movie (and its associated rating) to his or her inventory.
* The ability for a user to mark a movie in his or her inventory as not yet watched and to prioritize all movies to be watched in the future.
* The ability for a user to view summary statistics of their inventory, as well as all users' inventories.
* Potentially more to come!

### License

Copyright 2019 Brett J. Hartman

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS," WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT, OR OTHERWISE, ARISING FROM, OUT OF, OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
