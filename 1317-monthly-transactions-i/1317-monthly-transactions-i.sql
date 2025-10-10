select 
    DATE_FORMAT(trans_date, "%Y-%m") as month,
    country, 
    COUNT(id) as trans_count,
    SUM(state = 'approved') As approved_count,
    SUM(amount) As trans_total_amount,
    SUM(IF(state = 'approved', amount, 0)) as approved_total_amount
from Transactions
group by month, country