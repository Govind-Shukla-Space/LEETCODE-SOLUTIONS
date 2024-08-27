SELECT DISTINCT curr.num AS ConsecutiveNums 
FROM Logs curr
JOIN Logs nxt ON curr.id + 1 = nxt.id
JOIN Logs n_nxt ON nxt.id + 1 = n_nxt.id
WHERE curr.num = nxt.num AND nxt.num = n_nxt.num;
