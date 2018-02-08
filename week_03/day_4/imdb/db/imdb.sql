DROP TABLE IF EXISTS castings;
DROP TABLE IF EXISTS moviestars;
DROP TABLE IF EXISTS movies;

CREATE TABLE movies (
  id SERIAL PRIMARY KEY,
  title VARCHAR(255),
  genre VARCHAR(255),
  rating int,
  budget int
);

CREATE TABLE moviestars (
  id SERIAL PRIMARY KEY,
  first_name VARCHAR(255),
  last_name VARCHAR(255)
);

CREATE TABLE castings (
  id SERIAL PRIMARY KEY,
  movie_id INT REFERENCES movies(id) ON DELETE CASCADE,
  moviestar_id INT REFERENCES moviestars(id) ON DELETE CASCADE,
  fee INT
);
