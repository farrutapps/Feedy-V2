DROP TABLE IF EXISTS surveys CASCADE;

CREATE TABLE surveys (
survey_id SERIAL PRIMARY KEY,
surveytype_id INTEGER REFERENCES surveytypes ON UPDATE CASCADE ON DELETE CASCADE,
name TEXT,
place TEXT,
surveydate Text,
style_id INTEGER

);