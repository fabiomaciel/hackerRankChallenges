CREATE TABLE donor (
    did int NOT NULL,
    name varchar(20) NOT NULL,
    gender char(1) NOT NULL,
    city varchar(20) NOT NULL,
    bg varchar(3) NOT NULL,
    amount int NOT NULL
    );

INSERT INTO donor (did, name, gender, city, bg, amount) VALUES
    (2, 'maria', 'f', 'warne', 'ab+', 7),
    (3, 'maria', 'f', 'xxx', 'ab+', 3),
    (4, 'maria', 'm', 'xxx', 'a-', 6),
    (5, 'maria', 'f', 'xxx', 'ab+', 9),
    (1, 'maria', 'm', 'xxx', 'a+', 1);

CREATE TABLE acceptor (
    did int NOT NULL,
    name varchar(20) NOT NULL,
    gender char(1) NOT NULL,
    city varchar(20) NOT NULL,
    bg varchar(3) NOT NULL,
    amount int NOT NULL
);

INSERT INTO acceptor (did, name, gender, city, bg, amount) VALUES
    (2, 'maria', 'f', 'warne', 'a+', 9),
    (3, 'maria', 'm', 'warne', 'ab+', 8),
    (4, 'maria', 'm', 'warne', 'ab+', 3),
    (5, 'maria', 'f', 'warne', 'a+', 1),
    (1, 'maria', 'f', 'xxx', 'a+', 5);

-- gender, bg, count
-- f, a+, 3
-- f, ab+, 3
-- m, a+, 1
-- f, a-, 1
-- f, ab+, 2

select gender, bg, count(*) from(
    SELECT did, gender, bg FROM donor
    UNION
    SELECT did, gender, bg FROM acceptor
) everyone
    group by gender, bg
    order by gender, bg
