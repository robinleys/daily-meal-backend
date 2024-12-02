# Daily Meal - Java Backend

This project is the backend for a Recipes App, designed to provide users with functionality to search, store, and manage recipes. The backend is built using Java, and it supports CRUD (Create, Read, Update, Delete) operations for managing recipes, ingredients and user authentication.

## API Endpoints
User Authentication

    POST /auth/register - Register a new user
    POST /auth/login - Log in and receive a JWT token

Recipe Management

    GET /recipes - Get a list of all recipes
    GET /recipes/{id} - Get details of a specific recipe
    POST /recipes - Create a new recipe
    PUT /recipes/{id} - Update an existing recipe
    DELETE /recipes/{id} - Delete a recipe

