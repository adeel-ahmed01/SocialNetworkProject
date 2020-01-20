INSERT INTO public.user(id, email, nom, prenom, password, access) VALUES(0, 'adeel@cgi.com', 'AHMED', 'Adeel', '$2y$10$QhpNdExT8yEMl36xIMXX.eeFp4o6I4m4X9X6BpKFxU1Y1qS5XyyJG', 'ROLE_ADMIN');
INSERT INTO public.user(id, email, nom, prenom, password, access) VALUES(1, 'steven@cgi.com', 'GUILLOMET', 'Steven', '$2y$10$rt9UuKhQaL.Aph3Dgp/qOeEDJBhzlB0konh1TkwpLp.qWVj6pSa/G', 'ROLE_USER');
INSERT INTO public.user(id, email, nom, prenom, password, access) VALUES(2, 'valentin@cgi.com', 'DEVERNOIS', 'Valentin', '$2y$10$ZjpwtoMcM8uluGjrRwO0DOko5/tzC5FcW3U5PpUQCR/YaUEV9aI1e', 'ROLE_RANDOM');

INSERT INTO public.topic(id, title, post_date, body, category, id_author) VALUES(0, 'Soiree boisson', '2018-7-12', 'Rendez-vous le samedi soir a 18h pour faire le plein de biere', 'AFTERWORK', 0);
INSERT INTO public.topic(id, title, post_date, body, category, id_author) VALUES(1, 'Rapport financier Q4-2019', '2018-5-24', 'Toujours aller plus loin', 'FINANCE', 2);
INSERT INTO public.topic(id, title, post_date, body, category, id_author) VALUES(2, 'Conférence sur Spring', '2019-5-27', 'Parce que vous en avez bien besoin!', 'CONFERENCE', 1);


INSERT INTO public.comment(id, content, id_author, id_topic, comment_date) VALUES(0, 'Super!', 1, 2, '2018-7-12');
INSERT INTO public.comment(id, content, id_author, id_topic, comment_date) VALUES(1, 'Bof', 0, 1, '2018-5-24');
INSERT INTO public.comment(id, content, id_author, id_topic, comment_date) VALUES(2, 'Pas mal!', 1, 0, '2019-5-27');
