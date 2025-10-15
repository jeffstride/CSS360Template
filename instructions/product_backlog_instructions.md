# Producty Backlog Instructions

Here is a [Template Spreadsheet](https://docs.google.com/spreadsheets/d/1AOnkX9tFI0mSteHnLHNwgjxecTxDATzlqwkb0YSQjhU/edit?gid=0#gid=0) for your backlog.  

While there are many ways to document requirements, this project will have its functionality defined as User Stories in a **Product Backlog**. Your Backlog will initially be primed with **Epics** that are broken down into **Features** that are broken down into **User Stories**.    

The row in the spreadsheet will dictate which Features belong to an Epic and which Stories belong to a Feature.  

Each member of your team ought to contribute about 10 user stories. With about 5 members per team, the product backlog should have about 50 user stories total. This could mean that your entire product (release) is not fully described, and that's okay.  

Each member of your team will select one **Story** (not Epic, not Feature) and provide one of the following:  
* a complete set of associated **Acceptance Test Scenarios**, OR  
* Tasks: A list of non-user stories for the developer that detail how the User Story will be implemented. Ideally, each task would take 1-6 hours to complete.  

Each row will have a User Story to describe the work. The User Story will detail **WHAT** is to be done, not *how* it is to be done. 

You will submit the backlog to Canvas as a spreadsheet (xlsx). Use the template sheet.  

You will include Functional and Non-Functional requirements. Each **Product Backlog Item** (PBI) must be clearly identified as one or the other. 

## Hierarchy
A Product Backlog has a hierarchy of User Stories. See [this](https://www.atlassian.com/agile/project-management/epics-stories-themes) article for more details. 

While there can be many levels in this hierarchy, we will keep it relatively shallow with just 3 levels: Epic, Feature, Story.

Each **Epic** user story will have many **Feature** user stories. Each **Feature** user story will have many **Story** user stories that belong to it.   

Your spreadsheet will leveage the row order to show how stories relate. Directly underneath a Feature will be all the Stories that belong to it. Once all stories are listed, then next row would be the next Feature that belongs to the Epic above. Industry ools will often have a relational database to help organize this relationship, and this makes maintenance much easier.  

Teams may want to add color to the rows (under an Epic or Feature) to help provide a visual cue to the reader.  

## Column Summary
See the very nice example backlog posted in Canvas. **BUT** note that the example backlog isn't perfect. Fore example, it lacks color and the *Order* column doesn't have unique values.  

|Column|Description|
|:-----|-----------|
|Order|Unique numbers from 1 to ~20. Only the first *sprint* or iteration would need to be numbered. The order dictates the order that work will be done, accounting for priority and dependencies. Again, if you have 70 User Stories, you don't need to number all 70.|
|Priority|Must/Should/Could/Wont<br>Or, 0-3|
|Status|Not Started, In Progress, Blocked, Completed|
|Type|The type of User Story: Epic, Feature, Story|
|T-Shirt Cost|From XS to XXL|
|Requirement Type|Functional, Non-Functional<br>Optionally: type of non-functional|
|Title|The User Story|
|Details|Each team member must detail out one User Story. See below for more|

**The Details Column** 
As noted above, each member of your team will select one **Story** (not Epic, not Feature) and provide one of the following in the *Details* column:  
* a complete set of associated **Acceptance Test Scenarios**, OR  
* **Tasks**: A list of non-user stories for the developer that detail how the User Story will be implemented.Ideally, each task would take 1-6 hours to complete.  

While the User Story is intended to provide good clarity, often it isn't enough detail for the developer to properly implement, test, and verify "done-ness". In a complete backlog, each Story will have details that are fleshed out just before or duing the **Kick-off** (when doing Scrum). Tests are an excellent way to describe when a User Story is fully implemented (Done!). A test will include a variety of actions and the expected result so that when all the tests pass we know that the implementation is complete. It is the **Definition of Done**. 


## User Story Template
As a \_\_\_, I want \_\_\_, so that \_\_\_.  

It can seem that the "so that" part is obvious, but sometimes it is not. At times people can be compelled to repeat the "I want" part in the "so that" part. Do not. The "so that" part is the *defense* or *argument* to do the work. In the minority of cases, the reason for doing something truly cannot be clarified, in which case, it can be omitted.  