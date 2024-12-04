CREATE TABLE IF NOT EXISTS ingredients (
                                       id SERIAL PRIMARY KEY,
                                       name VARCHAR(255) NOT NULL,
                                       stock numeric(10,2) NOT NULL,
                                       unit VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS recipes (
                                       id SERIAL PRIMARY KEY,
                                       name VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS recipe_ingredients (
                                                  recipe_id INT NOT NULL,
                                                  ingredient_id INT NOT NULL,
                                                  quantity NUMERIC(10,2) NOT NULL,
                                                  PRIMARY KEY (recipe_id, ingredient_id),
                                                  FOREIGN KEY (recipe_id) REFERENCES recipes(id) ON DELETE CASCADE,
                                                  FOREIGN KEY (ingredient_id) REFERENCES ingredients(id) ON DELETE CASCADE
);
