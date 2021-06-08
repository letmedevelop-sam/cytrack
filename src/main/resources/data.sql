INSERT INTO admins (insert_date_time, insert_user_id, is_deleted, last_update_date_time, last_update_user_id,
                    first_name, last_name, email, gender)
VALUES ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Mike', 'Bravo', 'mike0@cydeo.com', 'M'),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 2, 'Omer', 'Uslu', 'omer0@cydeo.com', 'M')

    ON CONFLICT DO NOTHING;

INSERT INTO intructors (insert_date_time, insert_user_id, is_deleted, last_update_date_time, last_update_user_id,
                        first_name, last_name, email, gender)
VALUES ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Ozzy', 'Canli', 'ozzy0@cydeo.com', 'M'),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 2, 'Jamal', 'Demir', 'jamal0@cydeo.com', 'M'),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 3, 'Muhtar', 'Cool', 'muhtar0@cydeo.com', 'M'),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 4, 'Asiye', 'Mamat', 'asiye0@cydeo.com', 'F')

ON CONFLICT DO NOTHING;

INSERT INTO cybertek_mentors (insert_date_time, insert_user_id, is_deleted, last_update_date_time, last_update_user_id,
                              first_name, last_name, email, password, phone, enabled, birthday, country, gender, mentor_working_status)

VALUES  ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Baha', 'Tas', 'baha@cydeo.com', 'Abc123',
    '5398463219', 'true', '1980-05-05 00:00:00', 'UK', 'M','FULL_TIME'),
        ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Sam', 'Kar', 'sam@cydeo.com', 'Abc123',
    '9745631987', 'true', '1960-06-01 00:00:00', 'SPAIN', 'M','FULL_TIME'),
        ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Matt', 'Dmn', 'matt@cydeo.com', 'Abc123',
    '5741365789', 'true', '1981-09-19 00:00:00', 'UK', 'M','FULL_TIME'),
        ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Cht', 'Ypc', 'baggio@cydeo.com', 'Abc123',
    '6319873521', 'true', '1974-11-05 00:00:00', 'GERMANY', 'M','PART_TIME'),
        ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Snn', 'Shn', 'snn@cydeo.com', 'Abc123',
    '5135746821', 'true', '1990-06-22 00:00:00', 'FRANCE', 'M','PART_TIME')

ON CONFLICT DO NOTHING;

INSERT INTO alumni_mentors (insert_date_time, insert_user_id, is_deleted, last_update_date_time, last_update_user_id,
                              first_name, last_name, email, password, phone, enabled, birthday, country, gender, mentor_working_status)

VALUES  ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Cagri', 'Tem', 'cagri@cydeo.com', 'Abc123',
         '5398463219', 'true', '1980-05-05 00:00:00', 'UK', 'M','FULL_TIME'),
        ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Muhit', 'Tanb', 'muhit@cydeo.com', 'Abc123',
         '9745631987', 'true', '1960-06-01 00:00:00', 'SPAIN', 'M','FULL_TIME'),
        ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Pln', 'Ylmz', 'pln@cydeo.com', 'Abc123',
         '5741365789', 'true', '1981-09-19 00:00:00', 'UK', 'M','FULL_TIME'),
        ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Emrh', 'Blt', 'emrh@cydeo.com', 'Abc123',
         '6319873521', 'true', '1974-11-05 00:00:00', 'GERMANY', 'M','PART_TIME'),
        ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Kdr', 'Cmn', 'kdr@cydeo.com', 'Abc123',
         '5135746821', 'true', '1990-06-22 00:00:00', 'FRANCE', 'M','PART_TIME')

ON CONFLICT DO NOTHING;


INSERT INTO studentds (insert_date_time, insert_user_id, is_deleted, last_update_date_time, last_update_user_id,
                       first_name, last_name, email, password, phone, enabled, birthday, country, gender,
                       student_working_status, student_status, group_id)
VALUES ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Christiano', 'Ronaldo', 'cronaldo@ju.com', 'Abc123',
        '5398756325', 'true', '1990-06-22 00:00:00', 'ITALY', 'M', 'NOT_WORKING', 'NEW',
        (select g.id from groups g where group_name='Group-1')),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Lionel', 'Messi', 'lmessi@ba.com', 'Abc123',
        '5135745698', 'true', '1991-07-24 00:00:00', 'SPAIN', 'M', 'NOT_WORKING', 'NEW',
        (select g.id from groups g where group_name='Group-1')),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Andres', 'Iniesta', 'ainiesta@ba.com', 'Abc123',
        '6321478951', 'true', '1999-08-24 00:00:00', 'SPAIN', 'M', 'FULL_TIME', 'RETAKING',
        (select g.id from groups g where group_name='Group-1')),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Franck', 'Ribery', 'fribery@bm.com', 'Abc123',
        '5987569841', 'true', '1989-07-29 00:00:00', 'GERMANY', 'M', 'NOT_WORKING', 'NEW',
        (select g.id from groups g where group_name='Group-1')),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Luka', 'Modric', 'lmodric@rm.com', 'Abc123',
        '2156987412', 'true', '1994-07-12 00:00:00', 'SPAIN', 'M', 'NOT_WORKING', 'NEW',
        (select g.id from groups g where group_name='Group-1')),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Robert', 'Lewandowski', 'rlewandowski@bm.com', 'Abc123',
        '3552698774', 'true',  '2001-07-24 00:00:00', 'GERMANY', 'M', 'PART_TIME', 'RETURNING',
        (select g.id from groups g where group_name='Group-2')),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Neymar', 'Neymar', 'nneymar@psg.com', 'Abc123',
        '9877456669', 'true', '2011-11-11 00:00:00', 'FRANCE', 'M', 'NOT_WORKING', 'NEW',
        (select g.id from groups g where group_name='Group-2')),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Kevin', 'De Bruyne', 'kdbruyne@mc.com', 'Abc123',
        '2155698455', 'true', '1996-12-21 00:00:00', 'UK', 'M', 'FULL_TIME', 'RETURNING',
        (select g.id from groups g where group_name='Group-2')),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Kylian', 'Mbappe', 'kmbappe@psg.com', 'Abc123',
        '6985215547', 'true', '1993-07-07 00:00:00', 'FRANCE', 'M', 'FULL_TIME', 'RETAKING',
        (select g.id from groups g where group_name='Group-2'))

    ON CONFLICT DO NOTHING;


INSERT INTO batches (insert_date_time, insert_user_id, is_deleted, last_update_date_time, last_update_user_id,
                     batch_name, batch_start_date, batch_end_date, batch_notes, batch_status)
VALUES ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'EU-2', '2019-01-01', '2019-12-12','Note-1','COMPLETED'),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'EU-3', '2020-01-01', '2020-12-12','Note-2','COMPLETED'),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'EU-4', '2021-01-01', '2021-12-12','Note-3','ACTIVE')

ON CONFLICT DO NOTHING;


INSERT INTO groups (insert_date_time, insert_user_id, is_deleted, last_update_date_time, last_update_user_id,
                    group_name, group_mascot, mentor_id, batch_id)
VALUES ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Group-1', 'Eagles',
        (select m.id from mentors m where m.first_name='Baha'),
        (select b.id from batches b where b.batch_name='EU-4')),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Group-2', 'Falcons',
        (select m.id from mentors m where m.first_name='Sam'),
        (select b.id from batches b where b.batch_name='EU-4')),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Group-3', 'Hawks',
        (select m.id from mentors m where m.first_name='Cht'),
        (select b.id from batches b where b.batch_name='EU-4')),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Group-4', 'Panthers',
        (select m.id from mentors m where m.first_name='Snn'),
        (select b.id from batches b where b.batch_name='EU-4')),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Group-5', 'Lions',
        (select m.id from mentors m where m.first_name='Matt'),
        (select b.id from batches b where b.batch_name='EU-4'))

ON CONFLICT DO NOTHING;

INSERT INTO tasks (id, task_name, task_assign_date, task_due_date, task_lesson, task_status)
VALUES (1, 'RecordingDay1', '2021-06-05', '2021-06-06', 'Java', 'ON_GOING'),
       (2, 'RecordingDay2', '2021-06-06', '2021-06-07', 'Selenium', 'ON_GOING')

ON CONFLICT DO NOTHING;