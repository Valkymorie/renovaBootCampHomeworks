INSERT INTO MUDUR(islem_zaman, ad,soyad) VALUES (LOCALTIMESTAMP, 'Ahmet', 'Guclu');
INSERT INTO MUDUR(islem_zaman, ad,soyad) VALUES (LOCALTIMESTAMP, 'Ali', 'Bilir');

INSERT INTO OKUL(islem_zaman, ad, okul_tipi) VALUES (LOCALTIMESTAMP, 'Istanbul Uskudar Lisesi', 'ANADOLU_LISESI');
INSERT INTO OKUL(islem_zaman, ad, okul_tipi) VALUES (LOCALTIMESTAMP, 'Ataturk Fen Lisesi', 'FEN_LISESI');

INSERT INTO OGRETMEN(islem_zaman, ad, soyad, ders ,okul_id) VALUES (LOCALTIMESTAMP, 'Mehmet', 'Tanriverdi', 'Turkce', '1');
INSERT INTO OGRETMEN(islem_zaman, ad, soyad, ders ,okul_id) VALUES (LOCALTIMESTAMP, 'Veli', 'Bicak', 'Matematik', '2');

INSERT INTO OGRENCI(islem_zaman, ad, soyad, numara, sinif, mudur_id, ogretmen_id) VALUES (LOCALTIMESTAMP, 'Emir', 'Alay', '759', '4', '1', '2');
INSERT INTO OGRENCI(islem_zaman, ad, soyad, numara, sinif, mudur_id, ogretmen_id) VALUES (LOCALTIMESTAMP, 'Taha Berkay', 'Alay', '652', '1', '2', '1');