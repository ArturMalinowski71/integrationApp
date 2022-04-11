#Definition of Done

1. user story of task is done
2. application compiles and runs without errors
3. unit tests for task are created
4. all tests pass
5. created merge request
6. code review by at least two people
7. code review should check if points 1-3 are done

### Test naming

Test should be named as follows:
- MethodName_ExpectedBehavior_StateUnderTest

More [here](https://dzone.com/articles/7-popular-unit-test-naming), 2nd point 

# Conventions

## 1. Git

### 1.1 Creating new branches

taskNumber/type/initials/brief

brief should be short description (i.e. AE201/feat/AS/applicationFormService) 

### 1.2 Commit message

type: brief

description

### 1.3 Merge Requests

If you want to introduce your changes to develop branch you should push your changes to your working branch. 
Next you have to create pull request that has to be approved by at least one person. 
When merging branch to develop you should squash commits.

Merge request title should look like:

taskNumber - brief

In description, it should have link to task in jira

### 1.4 Types:

- build: changes related to build system
- ci: changes related to continuous integration and development system
- docs: changes related to documentation
- feat: new backwards-compatible abilities or functionalities
- fix: changes related to backwards-compatible bug fixes
- perf: changes related to backward-compatible performance improvements
- refactor: related to modifying the codebase, which neither adds a feature nor fixes a bug
- style: related to styling the codebase, regardless of the meaning
- test: changes related to tests



##### 1.5 More on types conventions [here](https://nitayneeman.com/posts/understanding-semantic-commit-messages-using-git-and-angular/#build)

##### 1.6 More on naming conventions [here](https://www.conventionalcommits.org/en/v1.0.0/)

## 2 Development conventions

### 2.1 Packages

Main package: **com.envelo.buisnesstrip.**

Other packages:

- .annotations
- .configurations
- .controllers
- .exceptions
- .model
    - .dtos
    - .entities
    - .enums
    - .mappers
- .populator
- .repositories
- .security
- .services
- .utils

### 2.2 Entities

Entity should have annotation for table name written with lower case <br/>
If name has multiple parts they should be separated with '_' <br/>
i.e: @Table(name = "application_forms")

### 2.3 Good practices

1. Before committing you should use these commands to format your code:
   1. ctrl+alt+l - reformatting code 
   2. ctrl+alt+o - organizing imports

###### [How to create README (markdown) file](https://www.markdownguide.org/basic-syntax/)