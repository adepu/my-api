INSERT INTO metr.CUSTOMER
(first_name, last_name, address_1, address_2, city, state, zip, phone_number, email, date_created, last_login, last_updated, renter, rentee)
VALUES('Shashank', 'Adepu', '447 E 12th St', '128', 'Charlotte', 'NC', '28206', '6786549231', 'adepu.shashank@gmail.com',
                   now()-5, now(), now(),'YES', 'NO');
INSERT INTO metr.CUSTOMER
(first_name, last_name, address_1, address_2, city, state, zip, phone_number, email, date_created, last_login, last_updated, renter, rentee)
VALUES('Varun', 'Iyer', '123 Main St', '', 'Charlotte', 'NC', '28207', '6786549231', 'adepu.shashank@gmail.com',
                now()-5, now(), now(),'YES', 'NO');
INSERT INTO metr.CUSTOMER
(first_name, last_name, address_1, address_2, city, state, zip, phone_number, email, date_created, last_login, last_updated, renter, rentee)
VALUES('Tim', 'Thomas', '125 Main St', '', 'Raleigh', 'NC', '28207', '6786549231', 'adepu.shashank@gmail.com',
              now()-5, now(), now(),'YES', 'NO');
COMMIT;