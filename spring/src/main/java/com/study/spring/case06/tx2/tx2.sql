-- 交易 Demo 所需的資料表

CREATE TABLE if not exists book1(
    bid INTEGER NOT NULL auto_increment, -- 主鍵序號
    bname varchar(20) not null, -- 書名
    price INTEGER, -- 價格 
    ct timestamp default current_timestamp, -- 建檔時間
    PRIMARY KEY (bid)
);

CREATE TABLE if not exists stock1 (
    sid INTEGER NOT NULL auto_increment, -- 主鍵序號
    bid INTEGER NOT NULL,
    amount INTEGER, -- 數量 
    PRIMARY KEY (sid)
);

CREATE TABLE if not exists wallet1(
    wid INTEGER NOT NULL auto_increment, -- 主鍵序號
    money INTEGER, -- 數量 
    PRIMARY KEY (wid)
);

Insert into wallet1(money) values(100);
Insert into book1(bname, price) values('Java', 80);
Insert into stock1(bid, amount) values(1, 3);

