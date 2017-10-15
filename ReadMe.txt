This project contains implementations of the following algorithms:
- Breath First Search
- Depth First Search
- Uniform Cost Search

The description of the proposed task is in another file in this repository. You also may find files named "problem(number).txt" which contains the problem that the algorithm must solve. For example: in file problem0.txt, you can see "Em(Arad) Em(Bucharest)", which represent the problem to travel from Arad to Bucharest in the Romania's Map problem.

In order to execute this program you must to import the project properly, click in Run -> Run Configurations -> Choose the tab 'Arguments' and type the parameters in the following format:

ucs problem1.txt

And the click in the Apply button, and Run the project.


In order to run the experiments and see the time consumed by every algorithm, you should run the .jar file as the following comand:

time java -jar Search.jar ucs Search/problema0.txt > /dev/null

