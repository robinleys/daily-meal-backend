# Daily Meal

This project is the backend for a Recipes App, designed to provide users with functionality to search, store, and manage recipes. The backend is built using Java, and it supports CRUD (Create, Read, Update, Delete) operations for managing recipes, ingredients and user authentication.



## API Endpoints


### **Recipes**

- **GET /recipes**  
  Fetches all recipes stored in the database.

- **GET /recipes/{id}**  
  Fetches the recipe with the specified `id`.

- **POST /recipes**   
  Inserts a new recipe into the database. The recipe's `name` should be included in the request payload.

- **PUT /recipes/{id}**  
  Updates the `name` of the recipe with the specified `id`. The updated recipe's data should be provided in the request payload.

- **DELETE /recipes/{id}**  
  Removes the recipe with the specified `id` from the database.

---

### **Recipe Ingredients**

- **GET /recipes/{recipeId}/ingredients**  
  Fetches all ingredients associated with the recipe having the specified `recipeId`.

- **POST /recipes/{recipeId}/ingredients/{ingredientId}/{quantity}**  
  Associates an ingredient with the specified `recipeId`. The request should include `ingredientId` and `quantity`.

- **DELETE /recipes/{recipeId}/ingredients/{ingredientId}**  
  Deletes the association between an ingredient and a recipe identified by `recipeId` and `ingredientId`.  
 

---

### **Ingredients**

- **GET /ingredients**  
  Fetches all ingredients stored in the database.

- **GET /ingredients/{id}**   
  Fetches the ingredient with the specified `id`.

- **POST /ingredients**  
  Inserts a new ingredient into the database. The request should include the ingredient's `name`, `stock`, and `unit`.

- **PUT /ingredients/{id}**   
  Updates the `name`, `stock`, and `unit` of the ingredient with the specified `id`. The updated data should be provided in the request payload.

- **DELETE /ingredients/{id}**  
  Removes the ingredient with the specified `id` from the database.