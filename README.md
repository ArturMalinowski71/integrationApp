#Conventions

## 1. Git

### 1.1 Creating new branches

type / initials - brief

### 1.2 Commit message

type : brief

description

### 1.3 Types:

- build: changes related to build system
- ci: changes related to continuous integration and development system
- docs: changes related to documentation
- feat: new backwards-compatible abilities or functionalities
- fix: changes related to backwards-compatible bug fixes
- perf: changes related to backward-compatible performance improvements
- refactor: related to modifying the codebase, which neither adds a feature nor fixes a bug
- style: related to styling the codebase, regardless of the meaning
- test: changes related to tests

##### 1.4 More on types conventions [here](https://nitayneeman.com/posts/understanding-semantic-commit-messages-using-git-and-angular/#build)

##### 1.5 More on naming conventions [here](https://www.conventionalcommits.org/en/v1.0.0/)

## 2 Development conventions

### 2.1 Packages
Main package: **com.envelo.buisnesstrip.**

Other packages:

- .configurations
- .controllers
- .model
    - .dto
    - .entity
    - .enums
    - .mappers
- .populator
- .repositories
- .security
- .services

### 2.2 Entities
Entity should have annotation for table name i.e: @Table(name = "countries")

###### [How to create README (markdown) file](https://www.markdownguide.org/basic-syntax/)