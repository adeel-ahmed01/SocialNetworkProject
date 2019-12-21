INSERT INTO public.user(id, email, nom, prenom, password) VALUES(0, 'adeel@cgi.com', 'AHMED', 'Adeel', '123');
INSERT INTO public.user(id, email, nom, prenom, password) VALUES(1, 'steven@cgi.com', 'GUILLOMET', 'Steven', '456');
INSERT INTO public.user(id, email, nom, prenom, password) VALUES(2, 'valentin@cgi.com', 'DEVERNOIS', 'Valentin', '789');

INSERT INTO public.topic(id, title, body, category, id_author) VALUES(0, 'Soiree boisson', 'Rendez-vous le samedi soir a 18h pour faire le plein de biere', 'AFTERWORK', 0);
INSERT INTO public.topic(id, title, body, category, id_author) VALUES(1, 'Rapport financier Q4-2019', 'Toujours aller plus loin', 'FINANCE', 2);
INSERT INTO public.topic(id, title, body, category, id_author) VALUES(2, 'Conférence sur Spring', 'Parce que vous en avez bien besoin!', 'CONFERENCE', 1);


INSERT INTO public.comment(id, content, id_author, id_topic, comment_date) VALUES(0, 'Super!', 1, 2, '2018-7-12');
INSERT INTO public.comment(id, content, id_author, id_topic, comment_date) VALUES(1, 'Bof', 0, 1, '2018-5-24');
INSERT INTO public.comment(id, content, id_author, id_topic, comment_date) VALUES(2, 'Pas mal!', 1, 0, '2019-5-27');
