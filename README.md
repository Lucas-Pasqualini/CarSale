# CarSale

<h1 align="center">Welcome to TP of Concessionary 👋</h1>

## Class

```
# Brand
(id,name)

# Car
(id,name)

# Customer
(id,name)

# Adress
(id,adress)

# Concessionary
(id,name)
```

## Api  
For each class you can retrieve all the objects of this type in the database, add, delete or modify them.
```
# add
/add

# delete
delete/{id}

# update
/update/{id}
```

## Use Api  
Launch the application and start your internet browser.
```
# url
localhost:8080

# If you want to get all the objects of a class. Add the class at the end of the URL.
For example : localhost:8080/car
This query get all cars in base.  

# If you want to make changes to the database.
For example : localhost:8080/car/delete/1
This query delete the car who have the id 1.
```

## Author

👤 **Lucas Pasqualini <lucas.pasqualini@lacatholille.fr>**
