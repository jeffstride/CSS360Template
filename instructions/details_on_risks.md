# Details on Risks Section
Your group will submit:  
* A **list of risks** specific to your product and/or development circumstances. 
* Each risk will have a **metric for success** that is measurable.  
* A detailed description that elaborates on the processes you will use to help manage the risks.  

## General  
While as students you'll be exercising Scrum to deliver you Group Project, your mock company may use any SDLC that is tailored to manage the risks you've identified. Your group won't simply provide an SDLC name, instead you will explain and draw the specifics of your processes. Your process may end of looking a lot like a specific SDLC, or it could end up looking quite unique. You can describe a hybrid model; you are in complete control. 

> **IMPORTANT**: You must thoroughly describe your process, not just name a model. While you can state the names of models, the goal here is to describe the process as if Mr. Stride doesn’t know anything about any specific model. Defend your choices.

Given the specific product your team is developing, along with the success metrics you’ve established, list out the **primary risks**.  Describe the processes your team will follow to manage these risks; describe how your hypothetical development team will operate. The idea is to identify the risks early in the development process and to mitigate them throughout the entire development process. Be creative so that you can clearly and specifically identify the **important** risks to be managed. You should list out between 3-10 risks.  

## Process Diagram
You will create one or more detailed drawings/diagrams of your processes. For example, in the slide deck, [Topic 5: Dive into Money](https://docs.google.com/presentation/d/1Qyehzla9zgnPNE1AYkyeDsHFdhonhphblIl9-V_wA1U/edit?usp=drive_link) there were two diagrams: Roles & Hierarchy, Schedule Overview. In the slide deck, [Topic X: SDLC Details](https://docs.google.com/presentation/d/1kSp-WX9sQt1fdpK4nfK7ouT9UwJqgtfkQHaFTskO4L4/edit?usp=drive_link) there are generic drawings of models that could be updated to be more specific to your process.   

You only need to provide one diagram. It should **not** be a copy/paste of some drawing found on the internet.  

## Risks to Consider
Your group will submit a list of risks specific to your product and/or development circumstances, and you will elaborate on the processes you will use to help manage the risks. Explain how a given process is better than other available processes.  

**Risks to consider are:**  
* inexperienced development team  
* fast-changing market  
* ethical concerns or political sensitivity  
* customer has changing requirements  
* scalability of the platform/architecture  
* immense consequences from bugs (e.g. people die, millions of dollars lost, many services are impacted)  
* security: highly sensitive data  
* short timeframe to develop  
* unproven technology  
* lots of partners and/or dependencies  
* small/large team that may be remotely located geographically  

Each of the above risks have processes that help to mitigate them. You need to identify your risks and explain the mitigating processes   

See [9 Risks in Software Development [And How to Mitigate Them]](https://clockwise.software/blog/software-development-risks/) for some ideas.  
> In this article, it states: *Software development ... is a five-step process: planning, **risk** identification and categorization, **risk** analysis, **risk** response planning, and **risk** monitoring and control.* 

Also consider [this guide](https://rikkeisoft.com/blog/software-development-risks/) to think of other risks and solutions. 

> **IMPORTANT**: When you list a risk, consider why this risk is especially important for your company, product, customer, and/or team.  

Your mitigation strategies may include rigorous documentation and reviews, intensive automated testing, time buffering, (evolutionary) prototyping, staged rollouts, flighting/experimentation, use of third party solutions, physical redundancy, [Chaos Testing](https://en.wikipedia.org/wiki/Chaos_engineering), or [White Hat Hacking](https://en.wikipedia.org/wiki/White_hat_%28computer_security%29). You may create Change Control Boards, have regular stand-up meetings in front of a physical Kanban board, Live Site committees, formal code reviews, and accessibility reviews. There are a lot of things to consider. 

Effectively, you are creating a tailored (and likely hybrid) SDLC that is designed to **manage the risks that matter the most**.

Sommerville has written a section on Risk Management (*Chapter 22.1: Risk Management*) that can be used to help guide your thinking and work in this section. Note that one would look at the risk categories, identify possible risks, analyze the risks to assign probability and effects, and then finally identify processes/steps to manage the risks. The processes you choose need to match your specific product. 

## Example Risks
**Product**: A Day Trader application that allows the user to trade stocks.  

**Important Risks**:  
* **Risk : Availability**: 
    * **Why**: A day trader is heavily reliant on a site that available. Traders will quickly abandon the product if it isn't available.  
    * **Success Metrics**: A Day Trader services should be available 99.999% of the time with downtime lasting no more than 30 minutes.   
    * **Processes**:
        * A seasoned Architect with experience in online services will be hired to design the architecture.  
        * An Architecture Review Board will conduct reviews of anything that impacts the architecture.  
        * Stress Testing will be conducted nightly.  
        * Continuous Integration will be used to identify breaking changes early.
    
* **Risk: Responsiveness (latency)**: 
    * **Why** A day trader cannot be successful if trades take too long to execute. Important opportunities can be lost if the execution of trade takes too long. 
    * **Success Metrics**: Once triggered, trades should take no more than 100 ms to execute.  
    * **Processes**: 
        * Performance Testing will be conducted nightly.  
        * Business Partners that provide services will have an SLA that supports our needs.  
        * Each business partner will have a point of contact and a weekly connect.  

Note the following risks may dictate processes to be created, or non-functional requirements to be documented. (Mr. Stride did not finish.)  
* **Financial Security**: Any access to banking information or finances needs to be tightly locked down. Because of the intense security required, financial activities will be delegated to a 3rd Party that specializes in banking transactions. They must guarantee security with an insurance policy that can handle transactions up to $500,000.  
* **Repudiation**: All activities need to be proveably executed by the customer who can be held legally responsible for actions, and protected from false actions. All logins are dual authenticated, logged, and verified at each transaction.   
* **Data Accuracy** (mispresented or delayed): A trader cannot make good trades if the data is inaccurate or out of date. Security information must be 100% accurate and updated every 10 seconds. Extended delays are clearly noted to the user. 
* **Non-experts on team**: Members on the development team are not financial experts (the are not day traders) and won't know how to use the application as the customer would. A seasoned Day Trader will be hired full-time for continuous consultation.  

