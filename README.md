
#

#







# CCTZoo

**Group Application development project**















**PREPARED BY:**

**FERNANDO MARINHO**

**JOÃO PEDRO HADDAD**

**LUANA POMPERMAIER, 2016384**

**THIAGO SILVA FARIAS 2016182**





CONTENT

INTRODUCTION        3

PURPOSE OF PROJECT CCTZoo        3

SCOPE        4

OBJECTIVES        4

REQUIREMENT        4

CLASS DIAGRAM        4

FUNCTION OF THE PROGRAM        5

1 - Keeper Menu        6

2 - Animal Menu        7

REASONING BEHIND OUR DESIGN CHOICES        7

SOLID IN OUR PROJECT        10













# INTRODUCTION

## PURPOSE OF PROJECT CCTZoo



The purpose of this project is writing a robust object oriented software for a Zoo management system. Where the staff will be able to see and put on the system what type of animals the zoo has, example:  mammal, reptile, avian, aquatic, insect some combinations among them.

The system should be update with the zoo keepers where each Animal has one that looks after it. Zoo keepers are only allowed to care for animals if they are qualified to do so. A zoo keeper can look after a max of 3 Animal types for a max of 10 animals.

The system must be run on test data before the Zoo will accept it. We have   data set of at least 100 animals and 40 zoo keepers.













# SCOPE

## OBJECTIVES

The system for CCTZoo must allow a **user** to:

- Search for Animals
- Search for Keepers
- Add new animals
- Add new Keepers
- Show a list of all Animals
- Show a list of all Keepers
- Update animals
- Update Keepers















# REQUIREMENT

## CLASS DIAGRAM











# FUNCTION OF THE PROGRAM

When the user first opens the program the system presents a **welcome**

**message** with Main Menu options

|   |
| --- |

- **Option 1 -** Goes to Keeper Menu



- **Option 2 -** Goes to Animal Menu



- **Option 3 -** Exit completely from Application

## 1 - Keeper Menu

- **Option 1 -** Goes to Search Menu in order to find a keeper
- **Option 2 -** List all Keepers registered on the CCTZoo
- **Option 3 -** Goes to Update Menu in order Add a new Qualifications, Assign an Animal or Unassign an Animal for a specific keeper.
- **Option 4 -** Add a new Keeper to CCTZoo
- **Option 9 -** Return to Main Menu
- **Option 0 -** Exit completely from Application

## 2 - Animal Menu

- **Option 1 -** Goes to Search Menu in order to find an Animal
- **Option 2 -** List all Animals registered on the CCTZoo
- **Option 3 -** Goes to Update Menu in order change Arrival date, Birthdate, ** ** Vaccine, Medication or add Offspring
- **Option 9 -** Return to Main Menu
- **Option 0 -** Exit completely from Application











# REASONING BEHIND OUR DESIGN CHOICES

The class called Zoo manager will start the program and call other class called Controller where it control the basics of the system, setup data, updates the view and  exits the system.

The Controller is the main class with 3 methods, the method **public void starts** is for setting up the basic data and calling the initial screen, the method **public void update** is toupdate the view and the method **public boolean exit** will check if a view object has been selected and stored to the &#39;view&#39; variable and if the &#39;view&#39; variable is null it means that the system has been  exited and  return a boolean; true if the system has been exited.

There are eight interfaces in our projects Aquatic, Avian, Insect, Mammal, Mammal Aquatic, Mammal avian, Reptile and Reptile Aquatic, basically the interfaces **in java**  is a blueprint of a class. It has static constants and abstract methods. You can say that interfaces can have methods and variables but the methods declared in interface contain only method signature, not body.

The class called Keeper will show the keeper zoo name, id and number, qualification and quantity of animal they take care. In this class was created the following methods

- **Public String getQualification** willset Qualification which can change any keeper`s qualification or create/set qualification to new keeper in the zoo. It was created three getQualification methods and three setQualification methods because a Keeper can be qualificated at a maximum of three types of animals.
- **Public int getQuantity** returns the total number of animals assigned to every keeper and its direct linked to identification number.
- **public void setName** can create or change any keeper`s name.
- **Public isAvailable** validates data when any keeper is going to be assigned to any new animal, if the keeper is already responsible for 10 animals this method will not allow the keeper to be assigned to a new animal because it has reached its limit of assignments.
- **Public String toString** is responsible for transforming all information into string type when displaying data to the console.

There are 5 classes on the package Utiliy, AnimalModel, AnimalModel , DataSetUp and Data , AnimalFactory.

Animal model class stores animals data and performs searches through it during the system life cycle. For this class was created the following methods.

- **Public void save** search an animal by the name through the arrayList animals.
- **public Animal searchByName** Search an animal by its Exhibition Number arrayList animals.
- **Public Animal searchByExhibitNumber** search an animal by its Exhibition Number arrayList animals.
- **Public Animal searchBySpecie** search an animal by its specie through the animalList.
- **public Animal searchByType**
- **public void update**
- **public void list** for test the class

Data SetUp class –

Epoch class –

In the package view is an abstract class where can created abstract methods and then extend those for any class, it was created 10 abstract classes: AnimalMenu, KeeperMenu, MainMenu, SearchAnimalMenu, ShowAnimal, ShowAnimalList, Show Keeper, ShowKeeperList, UpdateAnimal and View.

# SOLID IN OUR PROJECT

Following the Single-responsibility principal we created an abstract class called View where many others child classes extend it, each class has only one job. Each one display a unique Menu and gets the option entered by the user and following the open close principle the class View can be extended but not modified.

In the packaged animal there are two classes Animal(Abstract) and AnimalModel. AnimalModel has the methods to search and update the Animals. Animal is extended by many different species of animals (such as dog, bear, bat etc..) and those species of animals implement some interfaces making the application following the Open-Close principal and Interface segregation principle

  In the Utility packaged there is the DataSetup that is the database with the animals&#39; names, genders, species and keepers&#39; name, qualification and it is associate with the class AnimalFactory that creates the animals for the CCTZoo. The class Date is responsible to generate the current date and compere the data of birthday and arrival at the CCTZoo.

Liskov substitution principle can be also applied in our View class as any subclass could substitute the parent class.

- D - Dependency Inversion Principle

Entities must depend on abstractions not on concretions. It states that the high level module must not depend on the low level module, but they should depend on abstractions.
