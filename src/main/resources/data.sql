INSERT INTO person (personal_number, name, email) VALUES
(1234567890121, 'John Doe', 'john.doe@example.com'),
(1234567890122, 'Jane Smith', 'jane.smith@example.com'),
(1234567890123, 'Mike Johnson', 'mike.johnson@example.com'),
(1234567890124, 'Emily Davis', 'emily.davis@example.com'),
(1234567890125, 'Chris Brown', 'chris.brown@example.com'),
(1234567890126, 'Sarah Wilson', 'sarah.wilson@example.com'),
(1234567890127, 'David Martinez', 'david.martinez@example.com'),
(1234567890128, 'Laura Garcia', 'laura.garcia@example.com'),
(1234567890129, 'James Lee', 'james.lee@example.com'),
(1234567890130, 'Sophia Walker', 'sophia.walker@example.com'),
(1234567890131, 'Daniel Young', 'daniel.young@example.com'),
(1234567890132, 'Olivia Lewis', 'olivia.lewis@example.com'),
(1234567890133, 'Ethan Harris', 'ethan.harris@example.com'),
(1234567890134, 'Ava Clark', 'ava.clark@example.com'),
(1234567890135, 'Lucas Rodriguez', 'lucas.rodriguez@example.com'),
(1234567890136, 'Mia King', 'mia.king@example.com'),
(1234567890137, 'Liam Wright', 'liam.wright@example.com'),
(1234567890138, 'Amelia Scott', 'amelia.scott@example.com'),
(1234567890139, 'Noah Green', 'noah.green@example.com'),
(1234567890140, 'Chloe Adams', 'chloe.adams@example.com'),
(1234567890141, 'Benjamin Baker', 'benjamin.baker@example.com'),
(1234567890142, 'Isabella Hill', 'isabella.hill@example.com'),
(1234567890143, 'Matthew Turner', 'matthew.turner@example.com'),
(1234567890144, 'Ella Stewart', 'ella.stewart@example.com'),
(1234567890145, 'Henry Mitchell', 'henry.mitchell@example.com'),
(1234567890146, 'Zoe Carter', 'zoe.carter@example.com'),
(1234567890147, 'Alexander Phillips', 'alexander.phillips@example.com'),
(1234567890148, 'Sophie Evans', 'sophie.evans@example.com'),
(1234567890149, 'Samuel Cooper', 'samuel.cooper@example.com'),
(1234567890150, 'Grace Roberts', 'grace.roberts@example.com'),
(1234567890151, 'Nathan Perez', 'nathan.perez@example.com'),
(1234567890152, 'Victoria Hughes', 'victoria.hughes@example.com'),
(1234567890153, 'Isaac Foster', 'isaac.foster@example.com'),
(1234567890154, 'Harper Gray', 'harper.gray@example.com'),
(1234567890155, 'Elijah Butler', 'elijah.butler@example.com'),
(1234567890156, 'Abigail Simmons', 'abigail.simmons@example.com'),
(1234567890157, 'Gabriel Kelly', 'gabriel.kelly@example.com'),
(1234567890158, 'Samantha Patterson', 'samantha.patterson@example.com'),
(1234567890159, 'Jack Howard', 'jack.howard@example.com'),
(1234567890160, 'Aiden Ward', 'aiden.ward@example.com'),
(1234567890161, 'Emily Torres', 'emily.torres@example.com'),
(1234567890162, 'Joshua Cox', 'joshua.cox@example.com'),
(1234567890163, 'Lily Peterson', 'lily.peterson@example.com'),
(1234567890164, 'Andrew Bailey', 'andrew.bailey@example.com'),
(1234567890165, 'Madison Rivera', 'madison.rivera@example.com'),
(1234567890166, 'Caleb Flores', 'caleb.flores@example.com'),
(1234567890167, 'Charlotte Price', 'charlotte.price@example.com'),
(1234567890168, 'Mason Reed', 'mason.reed@example.com'),
(1234567890169, 'Hannah Long', 'hannah.long@example.com'),
(1234567890170, 'Oliver Morris', 'oliver.morris@example.com');



INSERT INTO person_roles (person_id, role) VALUES
(1, 'DRIVER'),
(1, 'PROGRAMMER'),
(2, 'COACH'),
(2, 'DESIGNER'),
(3, 'HUMAN_PLAYER'),
(3, 'BUILDER'),
(4, 'PHOTOGRAPHER'),
(4, 'MARKETER'),
(5, 'EDITOR'),
(5, 'ALUMNI'),
(6, 'MENTOR'),
(6, 'VOLUNTEER'),
(7, 'DRIVER'),
(8, 'PROGRAMMER'),
(9, 'COACH'),
(10, 'DESIGNER'),
(11, 'HUMAN_PLAYER'),
(12, 'BUILDER'),
(13, 'PHOTOGRAPHER'),
(14, 'MARKETER'),
(15, 'EDITOR'),
(16, 'ALUMNI'),
(17, 'MENTOR'),
(18, 'VOLUNTEER'),
(19, 'DRIVER'),
(20, 'PROGRAMMER'),
(21, 'COACH'),
(22, 'DESIGNER'),
(23, 'HUMAN_PLAYER'),
(24, 'BUILDER'),
(25, 'PHOTOGRAPHER'),
(26, 'MARKETER'),
(27, 'EDITOR'),
(28, 'ALUMNI'),
(29, 'MENTOR'),
(30, 'VOLUNTEER'),
(31, 'DRIVER'),
(32, 'PROGRAMMER'),
(33, 'COACH'),
(34, 'DESIGNER'),
(35, 'HUMAN_PLAYER'),
(36, 'BUILDER'),
(37, 'PHOTOGRAPHER'),
(38, 'MARKETER'),
(39, 'EDITOR'),
(40, 'ALUMNI'),
(41, 'MENTOR'),
(42, 'VOLUNTEER'),
(43, 'DRIVER'),
(44, 'PROGRAMMER'),
(45, 'COACH'),
(46, 'DESIGNER'),
(47, 'HUMAN_PLAYER'),
(48, 'BUILDER'),
(49, 'PHOTOGRAPHER'),
(50, 'MARKETER');

INSERT INTO team (name, national_id, international_id) VALUES
('Team Alpha', 'RO001', 101),
('Team Beta', 'EN001', 102),
('Team Gamma', 'ES001', 103),
('Team Delta', 'IT001', 104),
('Team Epsilon', 'US001', 105),
('Team Zeta', 'RO002', 106),
('Team Eta', 'EN002', 107),
('Team Theta', 'ES002', 108),
('Team Iota', 'IT002', 109),
('Team Kappa', 'US002', 110),
('Team Omega', 'RO010', 150);

INSERT INTO robot (name, engines_number, length, width, weight, expansion_hub, team_id) VALUES
('Robot Alpha1', 4, 1.5, 1.2, 50.0, TRUE, 1),
('Robot Beta1', 2, 1.7, 1.3, 45.0, FALSE, 2),
('Robot Gamma1', 6, 1.4, 1.1, 47.0, TRUE, 3),
('Robot Delta1', 3, 1.6, 1.4, 52.0, FALSE, 4),
('Robot Epsilon1', 5, 1.5, 1.2, 50.0, TRUE, 5),
('Robot Omega50', 4, 1.8, 1.3, 55.0, TRUE, 6);


INSERT INTO person_team (person_id, team_id) VALUES
(1, 1), (2, 1), (3, 2),
(4, 2), (5, 3), (6, 3),
(7, 4), (8, 4), (9, 5),
(10, 5), (11, 6), (12, 6);