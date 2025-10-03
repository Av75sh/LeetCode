select id, movie, description, rating
from Cinema
where description != 'boring' AND id%2 != 0
Order by rating DESC
