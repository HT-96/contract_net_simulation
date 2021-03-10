<h1>README</h1>
<p>Basic simulation of the contract net auto agent system for keele university CSC-40045.</p>
<br>
<h2>Operation</h2>
<p>The program has pre written parameters for the seller stock and buyers that would be the 
systems input data in a real world implementation, this is also where the buyers and sellers are 
linked to the broker agent and the simulation is started by calling the brokers start() method after 
setup (all pre setup). Running the main method starts the simulation and all outputs are done to 
the command line. System.out for process updates and System.err for final sales.</pr>
<br>
<h2>Structure</h2> 
- Broker gets contract information from buyer
- Broker sends contact request to sellers 
- Sellers respond to broker with offer
- Broker filters offers to select appropriate offer 
- Broker sends selected offer to buyer
- Buyer responds to broker with accept or reject 
- Broker updates sellers 
