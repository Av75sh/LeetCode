select w1.id
from Weather w1
JOIN Weather w2
On DATEDIFF(w1.RecordDate, w2.RecordDate) = 1
WHERE w1.temperature > w2.temperature 