# Farmer_Task using REST API
Creating Restapi for farmer to get price of crops using springboot and postgresql database
# Adding crop in database
POST : localhost:8080/rate/addcrop
# Display all crops data
GET : localhost:8080/rate/getallcrops
# Display price of Crop by its Name
GET : localhost:8080/rate/getCropByname/{name}
# Display Crop by its price
GET : localhost:8080/rate/getCropbyPrice/{price}
# Display Price of crop by Id
GET : localhost:8080/rate/getcropbyid/{id}
# Delete crop by its Id
DELETE : localhost:8080/rate/deletebyid/{id}
# Delete crop by its Name
DELETE : localhost:8080/rate/deletebyname/{name}
# Update crop by its Id
PUT : localhost:8080/rate/updateCropbyId/{id}
