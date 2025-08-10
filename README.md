README.md Addition: Simulation Engine Prototype 
Simulation Engine Prototype
This prototype builds the core event-driven engine for a ride-sharing simulation. It processes events (like rider requests and car arrivals) in chronological order using a priority queue (heapq).

Key features:

Simple brute-force car matching by closest available car.

Travel time estimated using Manhattan distance × speed factor.

Events handled include rider requests and arrivals for pickup/dropoff.

Car and rider statuses and locations update consistently.

Logs show a clear, timestamped event sequence.

How to Run
Run simulation.py with Python 3 to see the simulation progress logged to the console. Customize cars, riders, and request times in the main() function.

