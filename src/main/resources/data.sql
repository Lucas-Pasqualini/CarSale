insert into brand(id, name) values(1, 'Peugeot');
insert into brand(id, name) values(2, 'BMW');
insert into brand(id, name) values(3, 'Ferrari');
insert into brand(id, name) values(4, 'Lamborghini');
insert into brand(id, name) values(5, 'Citroën');

insert into customer(id, name) values(1,  'Lucas');
insert into customer(id, name) values(2,  'Anais');
insert into customer(id, name) values(3,  'Julien');
insert into customer(id, name) values(4,  'Arthur');
insert into customer(id, name) values(5,  'Mathis');
insert into customer(id, name) values(6,  'Tristan');
insert into customer(id, name) values(7,  'Hugo');
insert into customer(id, name) values(8,  'Corentin');
insert into customer(id, name) values(9,  'Anthony');
insert into customer(id, name) values(10, 'kader');

insert into car(id, name, brand_id, customer_id) values(1, '207',        1, 1);
insert into car(id, name, brand_id, customer_id) values(2, '206',        1, 2);
insert into car(id, name, brand_id, customer_id) values(3, 'X5',         2, 3);
insert into car(id, name, brand_id, customer_id) values(4, '720 S',      3, 4);
insert into car(id, name, brand_id, customer_id) values(5, 'Urus',       4, 5);
insert into car(id, name, brand_id, customer_id) values(6, 'Picasso',    5, 6);
insert into car(id, name, brand_id, customer_id) values(7, 'Citroën C4', 5, 7);
insert into car(id, name, brand_id, customer_id) values(8, 'Aventador',  4, 8);
insert into car(id, name, brand_id, customer_id) values(9, 'Uracan',     4, 9);
insert into car(id, name, brand_id, customer_id) values(10, '3008',      1, 10);

insert into adress(id, adress) values(1,  'adress 1');
insert into adress(id, adress) values(2,  'adress 2');
insert into adress(id, adress) values(3,  'adress 3');
insert into adress(id, adress) values(4,  'adress 4');
insert into adress(id, adress) values(5,  'adress 5');

insert into concessionary(id, name, adress_id) values(1, 'concessionary 1', 1);
insert into concessionary(id, name, adress_id) values(2, 'concessionary 2', 2);
insert into concessionary(id, name, adress_id) values(3, 'concessionary 3', 3);
insert into concessionary(id, name, adress_id) values(4, 'concessionary 4', 4);
insert into concessionary(id, name, adress_id) values(5, 'concessionary 5', 5);
