DROP TABLE IF EXISTS pizza_orders;
DROP TABLE IF EXISTS customer;

CREATE TABLE customers (
  id SERIAL PRIMARY KEY,
  name VARCHAR(255)
);

CREATE TABLE pizza_orders (
  id SERIAL4 PRIMARY KEY,
  topping VARCHAR(255),
  quantity INT2,
  customer_id INT REFERENCES customers(id)
);
