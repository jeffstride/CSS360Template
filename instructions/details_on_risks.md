# Details on Risks Section
Given the specific product your team is developing along with the success metrics you’ve established, list out the primary risks.  Describe the processes your team will follow to manage these risks; describe how your hypothetical development team will operate. The idea is to identify the risks early in the development process and to mitigate them. Be creative and clearly identify all the **important** risks to be managed. You should list out between 3-10 risks.  

You will create one or more detailed drawings/diagrams of your processes. For example, in the slide deck, “Topic 4: Dive into Money” there were two diagrams: Roles & Hierarchy, Schedule Overview. In the slide deck, “Topic X: SDLC Details” there are generic drawings of models that could be updated to be more specific to your process.   

While the **Requirements will be in the form of User Stories** in a Backlog–-and we understand that User Stores targets Agile development–-you may want to alter some phases and/or processes to manage your risks in ways that are more prescriptive/planned. You can state that another SDLC model should be used, particularly in the non-development phases. State clearly the characteristics of your project and the McConnell Table 7.11 capabilities that you're using to make your model decision. You can describe a hybrid model; you are in complete control. But, you must thoroughly describe your process, not just name a model. While you can state the names of models, the goal here is to describe the process as if Mr. Stride doesn’t know anything about any specific model. Defend your choices. 

Your group will submit a list of risks specific to your product and/or development circumstances, and you will elaborate on the processes you will use to help manage the risks. Explain how a given process is better than other available processes. Risks to consider are: inexperienced development team, fast-changing market, ethical concerns, political sensitivity, customer has changing requirements, immense consequences from bugs (e.g. people die, millions of dollars lost, many services are impacted), highly sensitive data, short timeframe to develop, lots of partners and/or dependencies, and small/large team. See [9 Risks in Software Development [And How to Mitigate Them]](https://clockwise.software/blog/software-development-risks/) for some ideas. Also consider [this guide](https://rikkeisoft.com/blog/software-development-risks/) to think of other risks and solutions. 

> **IMPORTANT**: When you list a risk, consider why this risk is especially important for your company, product, customer, and/or team.  

Your mitigation strategies may include rigorous documentation and reviews, intensive automated testing, time buffering, prototyping, incremental release/rollout (flighting/experimentation), use of third party solutions, redundancy, [Chaos Testing](https://en.wikipedia.org/wiki/Chaos_engineering), or [White Hat Hacking](https://en.wikipedia.org/wiki/White_hat_%28computer_security%29).  

Effectively, you are creating a tailored (and likely hybrid) SDLC that is designed to **manage the risks that matter the most**.

Sommerville has written a section on Risk Management (*Chapter 22.1: Risk Management*) that can be used to help guide your thinking and work in this section. Note that one would look at the risk categories, identify possible risks, analyze the risks to assign probability and effects, and then finally identify processes/steps to manage the risks. The processes you choose need to match your specific product. 

## Example Risks
**Product**: A Day Trader application that allows the user to trade stocks.  

**Important Risks**:  
* **Availability**: A day trader is heavily reliant on a site that available when making a trade is desired.     
* **Responsiveness (latency)**: A day trader cannot be successful if trades take too long to execute. Important opportunities can be lost if the execution of trade takes too long.   
* **Financial Security**: Any access to banking information or finances needs to be tightly locked down.  
* **Repudiation**: All activities need to be proveably executed by the customer who can be held legally responsible for actions, and protected from false actions.  
* **Data Accuracy** (mispresented or delayed): A trader cannot make good trades if the data is inaccurate or out of date.  
* **Non-experts on team**: Members on the development team are not financial experts or day traders and won't know how to use the application as the customer would.  

