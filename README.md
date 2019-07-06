# Wild-life Tracker
 This is an application that will enable the user in which I had in mind a ranger who will be able to gain the statistics of the Park He/She is working on concerning the Wildlife coverage and how He/She can manouver around.

## BDD

| Behaviour                                              | Input                                         | Output                                       |
|--------------------------------------------------------|-----------------------------------------------|----------------------------------------------|
| A prospective Ranger logs in their details in order to | The prospective ranger keys in their details  | The details of the Ranger are soon displayed |
| register as a ranger.                                  | and submits the form                          | in the page and the get to see the infor     |
| A working ranger in the park can see the sightings     | Clicks on the Sightings tab and views         | The four sightings are displayed             |
| A Ranger may want to view the species in the park      | Clicks on the dropdown to see the different   | They get to see either the endangered and the|
|                                                        | in the park                                   |  non-endangered species                      |
|A Ranger may want to tell us what species they have seen| Clicks on the dropdown and selects form for   | The form will display of the animal they have|
| in the park                                            | filling in and keys in the required fields    |  seen                                        |
                                     


## Technologies

1. IDEA Intellij - This is the text editor that will enable you to write your code and make the necessary changes you need. It contains the terminal and everything you need to set up the whole project.
2. Java -  This was the main language used in scripting of the whole project.
3. Spark -  This was used in the designing of the front-end because it contained the handlebars template and the whole blueprint for the front-end.
4. Html - This was basically the programming code used in the laying out of the blueprint of the code for the handlebars template.
5. Css -  This was basically the programming code used in the laying out the styling of the project.
6. Database - This enabled me store the data of the users of my application both locally and online.

## Installation Requirements
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

Step 1:

Download Intellij from https://www.jetbrains.com/idea/download/#section=linux

Step 2:

Visit my GitHub repository; User name: Desiree-Mmasi and clone the following link: https://github.com/Desiree-Mmasi/Wild-lifeTracker.git You can also download the files into you folder and unzip it to access the files.

Step 3:

Open the project with Intellij.

Step 4:

Type gradle run in order to run the app from your local machine. The port number will be 4567.

Step 5:

Install postgres as shown below:

sudo apt-get update

sudo apt-get install postgresql postgresql-contrib libpq-dev

Once it is done installing run

sudo -u postgres createuser --superuser $USER
to create super user. Enter your desire password when prompted. Navigate to your home directory and enter the following command to create the .psql_history in order to save your history:

touch .psql_history

Type psql on your terminal to connect to the server:

psql

Step 6:

Restore the database schema (tables and columns) by running the following commands:

# CREATE DATABASE your_database_name

$ psql name_of_database < schema.sql

notice that the second command is run in bash and not on psql

## Known Bugs
There are no bugs detected so far in the project but in the instanse of any feel free to reach out to me.


## Support and contact details
Feel free to reach out to me on Github at Desiree-Mmasi, email at mmasidesiree9@gmail.com or Slack at Desiree Mmasi 
### MIT License


Copyright (c) [2019] [Desiree Mmasi]

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.}* Copyright (c) {2019} {Dessy}
