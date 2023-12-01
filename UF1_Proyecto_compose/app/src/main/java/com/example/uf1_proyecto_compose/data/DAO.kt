package com.example.uf1_proyecto_compose.data

import com.google.gson.Gson

val json = """
{
    "version": "https://jsonfeed.org/version/1.1",
    "user_comment": "This feed allows you to read the posts from this site in any feed reader that supports the JSON Feed format. To add this feed to your reader, copy the following URL -- https://nhdiario.es/feed/json -- and add it your reader.",
    "next_url": "https://nhdiario.es/feed/json?paged=2",
    "home_page_url": "https://nhdiario.es",
    "feed_url": "https://nhdiario.es/feed/json",
    "language": "es",
    "title": "NH Diario",
    "icon": "https://nhdiario.es/wp-content/uploads/2019/02/NH-DIARIO-favicon.png",
    "items": [
        {
            "id": "https://nhdiario.es/?p=265122",
            "url": "https://nhdiario.es/la-armada-recibe-el-submarino-s-81-isaac-peral-vanguardia-tecnologica-naval/",
            "title": "La Armada recibe el submarino S-81 \u2018Isaac Peral\u2019, vanguardia tecnol\u00f3gica naval",
            "content_html": "<img width=\"799\" height=\"533\" src=\"https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/submarino-s81.jpg?fit=799%2C533&amp;ssl=1\" class=\"webfeedsFeaturedVisual wp-post-image\" alt=\"\" decoding=\"async\" style=\"display: block; margin: auto; margin-bottom: 10px; max-width: 100%;\" srcset=\"https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/submarino-s81.jpg?w=799&amp;ssl=1 799w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/submarino-s81.jpg?resize=225%2C150&amp;ssl=1 225w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/submarino-s81.jpg?resize=768%2C512&amp;ssl=1 768w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/submarino-s81.jpg?resize=585%2C390&amp;ssl=1 585w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/submarino-s81.jpg?resize=263%2C175&amp;ssl=1 263w\" sizes=\"(max-width: 799px) 100vw, 799px\" />\n<p>La Armada ha recibido en el Arsenal de Cartagena el submarino S-81 &#8216;Isaac Peral&#8217; en un acto presidido por la ministra de Defensa, Margarita Robles, una entrega que supone un momento esencial para la historia reciente de la Armada y de la industria de defensa, con el que Espa\u00f1a entra en el club de la decena de pa\u00edses con capacidad para dise\u00f1ar y construir submarinos.</p>\n\n\n\n<p>El &#8216;Isaac Peral&#8217; es el primero de los cuatro submarinos S-80 de \u00faltima generaci\u00f3n, un programa que supone para la Armada espa\u00f1ola estar entre las mejores dotadas del mundo en cuanto al arma submarina, y para Navantia consolidarse entre las empresas punteras internacionales.</p>\n\n\n\n<p>Robles ha dado las gracias por su implicaci\u00f3n en el proyecto a la ciudad de Cartagena, a la Armada y a todo el personal de Navantia y del Ministerio de Defensa. Adem\u00e1s, ha tenido unas palabras de recuerdo para el fallecido AJEMA, almirante general Antonio Martorell: \u00abCreo que hoy, all\u00e1 donde est\u00e9, va a sentirse tan orgulloso como nos sentimos todos\u00bb.</p>\n\n\n\n<p>En el acto solemne se ha procedido a la firma de la documentaci\u00f3n de entrega y transferencia entre Navantia y la Direcci\u00f3n General de Armamento y Material del Ministerio de Defensa y de \u00e9sta \u00faltima al Arsenal de Cartagena. Adem\u00e1s, ha tomado posesi\u00f3n el que ser\u00e1 el primer comandante de la unidad, el capit\u00e1n de corbeta Manuel Corral, y se ha entregado la Bandera al buque.</p>\n<p>La entrada <a rel=\"nofollow\" href=\"https://nhdiario.es/la-armada-recibe-el-submarino-s-81-isaac-peral-vanguardia-tecnologica-naval/\">La Armada recibe el submarino S-81 &#8216;Isaac Peral&#8217;, vanguardia tecnol\u00f3gica naval</a> se public\u00f3 primero en <a rel=\"nofollow\" href=\"https://nhdiario.es\">NH Diario</a>.</p>\n",
            "content_text": "La Armada ha recibido en el Arsenal de Cartagena el submarino S-81 &#8216;Isaac Peral&#8217; en un acto presidido por la ministra de Defensa, Margarita Robles, una entrega que supone un momento esencial para la historia reciente de la Armada y de la industria de defensa, con el que Espa\u00f1a entra en el club de la decena de pa\u00edses con capacidad para dise\u00f1ar y construir submarinos.\n\n\n\nEl &#8216;Isaac Peral&#8217; es el primero de los cuatro submarinos S-80 de \u00faltima generaci\u00f3n, un programa que supone para la Armada espa\u00f1ola estar entre las mejores dotadas del mundo en cuanto al arma submarina, y para Navantia consolidarse entre las empresas punteras internacionales.\n\n\n\nRobles ha dado las gracias por su implicaci\u00f3n en el proyecto a la ciudad de Cartagena, a la Armada y a todo el personal de Navantia y del Ministerio de Defensa. Adem\u00e1s, ha tenido unas palabras de recuerdo para el fallecido AJEMA, almirante general Antonio Martorell: \u00abCreo que hoy, all\u00e1 donde est\u00e9, va a sentirse tan orgulloso como nos sentimos todos\u00bb.\n\n\n\nEn el acto solemne se ha procedido a la firma de la documentaci\u00f3n de entrega y transferencia entre Navantia y la Direcci\u00f3n General de Armamento y Material del Ministerio de Defensa y de \u00e9sta \u00faltima al Arsenal de Cartagena. Adem\u00e1s, ha tomado posesi\u00f3n el que ser\u00e1 el primer comandante de la unidad, el capit\u00e1n de corbeta Manuel Corral, y se ha entregado la Bandera al buque.\nLa entrada La Armada recibe el submarino S-81 &#8216;Isaac Peral&#8217;, vanguardia tecnol\u00f3gica naval se public\u00f3 primero en NH Diario.",
            "date_published": "2023-12-01T00:17:00+01:00",
            "date_modified": "2023-12-01T01:37:24+01:00",
            "authors": [
                {
                    "name": "Redacci\u00f3n",
                    "url": "https://nhdiario.es/author/super/",
                    "avatar": "https://secure.gravatar.com/avatar/a329803e0b9b2130cec902974c9a4aea?s=512&d=mm&r=g"
                }
            ],
            "author": {
                "name": "Redacci\u00f3n",
                "url": "https://nhdiario.es/author/super/",
                "avatar": "https://secure.gravatar.com/avatar/a329803e0b9b2130cec902974c9a4aea?s=512&d=mm&r=g"
            },
            "image": "https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/submarino-s81.jpg?fit=799%2C533&ssl=1",
            "tags": [
                "Espa\u00f1a"
            ]
        },
        {
            "id": "https://nhdiario.es/?p=265100",
            "url": "https://nhdiario.es/el-supremo-ruso-prohibe-el-movimiento-lgbt/",
            "title": "El Supremo ruso proh\u00edbe el movimiento LGBT",
            "content_html": "<img width=\"712\" height=\"408\" src=\"https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/Oleg-Nefedov.jpg?fit=712%2C408&amp;ssl=1\" class=\"webfeedsFeaturedVisual wp-post-image\" alt=\"\" decoding=\"async\" style=\"display: block; margin: auto; margin-bottom: 10px; max-width: 100%;\" srcset=\"https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/Oleg-Nefedov.jpg?w=712&amp;ssl=1 712w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/Oleg-Nefedov.jpg?resize=262%2C150&amp;ssl=1 262w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/Oleg-Nefedov.jpg?resize=585%2C335&amp;ssl=1 585w\" sizes=\"(max-width: 712px) 100vw, 712px\" />\n<p>El Tribunal Supremo de Rusia prohibi\u00f3 este jueves el movimiento internacional LGBT en este pa\u00eds, al considerarlo una \u00aborganizaci\u00f3n extremista\u00bb a petici\u00f3n del Ministerio de Justicia.</p>\n\n\n\n<p>\u00abReconocer el movimiento internacional c\u00edvico LGBT como una organizaci\u00f3n extremista y prohibir sus actividades en territorio de Rusia\u00bb, dictamin\u00f3 el juez, Oleg Nef\u00e9dov, seg\u00fan informa la agencia Interfax.</p>\n\n\n\n<p>La medida, que tiene efecto \u00abinmediato\u00bb, proh\u00edbe la propaganda, la publicidad, el generar inter\u00e9s y animar a integrar las filas del movimiento LGBT.</p>\n\n\n\n<p>Eso s\u00ed, seg\u00fan la fuente, el fallo \u00abno afecta al derecho de los ciudadanos a la vida privada\u00bb, ya que la homosexualidad dej\u00f3 de ser un delito en este pa\u00eds en 1993.</p>\n\n\n\n<p>La vista transcurri\u00f3 a puerta cerrada y solo cont\u00f3 con la presencia de representantes del Ministerio de Justicia, que remitieron la demanda el pasado 17 de noviembre.</p>\n\n\n\n<p>Activistas LGBT crearon en el \u00faltimo momento la organizaci\u00f3n Movimiento Internacional C\u00edvico LGBT, que hasta entonces no exist\u00eda, con el fin de defender los derechos del movimiento, pero no fueron invitados a la vista.</p>\n<p>La entrada <a rel=\"nofollow\" href=\"https://nhdiario.es/el-supremo-ruso-prohibe-el-movimiento-lgbt/\">El Supremo ruso proh\u00edbe el movimiento LGBT</a> se public\u00f3 primero en <a rel=\"nofollow\" href=\"https://nhdiario.es\">NH Diario</a>.</p>\n",
            "content_text": "El Tribunal Supremo de Rusia prohibi\u00f3 este jueves el movimiento internacional LGBT en este pa\u00eds, al considerarlo una \u00aborganizaci\u00f3n extremista\u00bb a petici\u00f3n del Ministerio de Justicia.\n\n\n\n\u00abReconocer el movimiento internacional c\u00edvico LGBT como una organizaci\u00f3n extremista y prohibir sus actividades en territorio de Rusia\u00bb, dictamin\u00f3 el juez, Oleg Nef\u00e9dov, seg\u00fan informa la agencia Interfax.\n\n\n\nLa medida, que tiene efecto \u00abinmediato\u00bb, proh\u00edbe la propaganda, la publicidad, el generar inter\u00e9s y animar a integrar las filas del movimiento LGBT.\n\n\n\nEso s\u00ed, seg\u00fan la fuente, el fallo \u00abno afecta al derecho de los ciudadanos a la vida privada\u00bb, ya que la homosexualidad dej\u00f3 de ser un delito en este pa\u00eds en 1993.\n\n\n\nLa vista transcurri\u00f3 a puerta cerrada y solo cont\u00f3 con la presencia de representantes del Ministerio de Justicia, que remitieron la demanda el pasado 17 de noviembre.\n\n\n\nActivistas LGBT crearon en el \u00faltimo momento la organizaci\u00f3n Movimiento Internacional C\u00edvico LGBT, que hasta entonces no exist\u00eda, con el fin de defender los derechos del movimiento, pero no fueron invitados a la vista.\nLa entrada El Supremo ruso proh\u00edbe el movimiento LGBT se public\u00f3 primero en NH Diario.",
            "date_published": "2023-12-01T00:16:00+01:00",
            "date_modified": "2023-12-01T01:08:32+01:00",
            "authors": [
                {
                    "name": "Fran Lago",
                    "url": "https://nhdiario.es/author/fran/",
                    "avatar": "https://secure.gravatar.com/avatar/0d3f6648ca943c3ab1d5f7ec1754086f?s=512&d=mm&r=g"
                }
            ],
            "author": {
                "name": "Fran Lago",
                "url": "https://nhdiario.es/author/fran/",
                "avatar": "https://secure.gravatar.com/avatar/0d3f6648ca943c3ab1d5f7ec1754086f?s=512&d=mm&r=g"
            },
            "image": "https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/Oleg-Nefedov.jpg?fit=712%2C408&ssl=1",
            "tags": [
                "Internacional"
            ]
        },
        {
            "id": "https://nhdiario.es/?p=265118",
            "url": "https://nhdiario.es/nadia-calvino-mas-cerca-de-presidir-el-banco-europeo-de-inversiones/",
            "title": "Nadia Calvi\u00f1o m\u00e1s cerca de presidir el Banco Europeo de Inversiones",
            "content_html": "<img width=\"704\" height=\"399\" src=\"https://i0.wp.com/nhdiario.es/wp-content/uploads/2022/08/Nadia-Calvino.jpg?fit=704%2C399&amp;ssl=1\" class=\"webfeedsFeaturedVisual wp-post-image\" alt=\"\" decoding=\"async\" style=\"display: block; margin: auto; margin-bottom: 10px; max-width: 100%;\" srcset=\"https://i0.wp.com/nhdiario.es/wp-content/uploads/2022/08/Nadia-Calvino.jpg?w=704&amp;ssl=1 704w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2022/08/Nadia-Calvino.jpg?resize=265%2C150&amp;ssl=1 265w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2022/08/Nadia-Calvino.jpg?resize=696%2C394&amp;ssl=1 696w\" sizes=\"(max-width: 704px) 100vw, 704px\" />\n<p>La vicepresidenta primera del Gobierno espa\u00f1ol, Nadia Calvi\u00f1o, ha reunido los apoyos necesarios, seg\u00fan confirman fuentes conocedoras, por lo que ser\u00e1 propuesta por el\u00a0ministro de Finanzas de B\u00e9lgica y coordinador de los trabajos, Vincent Van Peteghem, para que sea ratificada en el cargo por los ministros europeos de Econom\u00eda y Finanzas (Ecofin) en la reuni\u00f3n del pr\u00f3ximo 8 de diciembre. Calvi\u00f1o se disputa la presidencia del BEI con la hasta ahora vicepresidenta ejecutiva de la Comisi\u00f3n Europea y responsable de Competencia, la liberal danesa\u00a0Margrethe Vestager;\u00a0el exministro de Finanzas italiano\u00a0Daniele Franco;\u00a0y dos de los actuales vicepresidentes del BEI: la polaca\u00a0Teresa Czerwinska\u00a0y el sueco\u00a0Thomas Ostros. No obstante,\u00a0seg\u00fan las consultas previas realizadas por Van Peteghem durante los \u00faltimos meses, Calvi\u00f1o es\u00a0la \u00fanica candidata que re\u00fane los apoyos suficientes\u00a0para lograr un consenso.</p>\n<p>La entrada <a rel=\"nofollow\" href=\"https://nhdiario.es/nadia-calvino-mas-cerca-de-presidir-el-banco-europeo-de-inversiones/\">Nadia Calvi\u00f1o m\u00e1s cerca de presidir el Banco Europeo de Inversiones</a> se public\u00f3 primero en <a rel=\"nofollow\" href=\"https://nhdiario.es\">NH Diario</a>.</p>\n",
            "content_text": "La vicepresidenta primera del Gobierno espa\u00f1ol, Nadia Calvi\u00f1o, ha reunido los apoyos necesarios, seg\u00fan confirman fuentes conocedoras, por lo que ser\u00e1 propuesta por el\u00a0ministro de Finanzas de B\u00e9lgica y coordinador de los trabajos, Vincent Van Peteghem, para que sea ratificada en el cargo por los ministros europeos de Econom\u00eda y Finanzas (Ecofin) en la reuni\u00f3n del pr\u00f3ximo 8 de diciembre. Calvi\u00f1o se disputa la presidencia del BEI con la hasta ahora vicepresidenta ejecutiva de la Comisi\u00f3n Europea y responsable de Competencia, la liberal danesa\u00a0Margrethe Vestager;\u00a0el exministro de Finanzas italiano\u00a0Daniele Franco;\u00a0y dos de los actuales vicepresidentes del BEI: la polaca\u00a0Teresa Czerwinska\u00a0y el sueco\u00a0Thomas Ostros. No obstante,\u00a0seg\u00fan las consultas previas realizadas por Van Peteghem durante los \u00faltimos meses, Calvi\u00f1o es\u00a0la \u00fanica candidata que re\u00fane los apoyos suficientes\u00a0para lograr un consenso.\nLa entrada Nadia Calvi\u00f1o m\u00e1s cerca de presidir el Banco Europeo de Inversiones se public\u00f3 primero en NH Diario.",
            "date_published": "2023-12-01T00:15:00+01:00",
            "date_modified": "2023-12-01T01:30:31+01:00",
            "authors": [
                {
                    "name": "Fran Lago",
                    "url": "https://nhdiario.es/author/fran/",
                    "avatar": "https://secure.gravatar.com/avatar/0d3f6648ca943c3ab1d5f7ec1754086f?s=512&d=mm&r=g"
                }
            ],
            "author": {
                "name": "Fran Lago",
                "url": "https://nhdiario.es/author/fran/",
                "avatar": "https://secure.gravatar.com/avatar/0d3f6648ca943c3ab1d5f7ec1754086f?s=512&d=mm&r=g"
            },
            "image": "https://i0.wp.com/nhdiario.es/wp-content/uploads/2022/08/Nadia-Calvino.jpg?fit=704%2C399&ssl=1",
            "tags": [
                "Espa\u00f1a"
            ]
        },
        {
            "id": "https://nhdiario.es/?p=265094",
            "url": "https://nhdiario.es/hamas-libero-a-ocho-rehenes-en-el-septimo-dia-de-tregua/",
            "title": "Ham\u00e1s liber\u00f3 a ocho rehenes en el s\u00e9ptimo d\u00eda de tregua",
            "content_html": "<img width=\"782\" height=\"404\" src=\"https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/familiares-de-rehenes-gaza.jpg?fit=782%2C404&amp;ssl=1\" class=\"webfeedsFeaturedVisual wp-post-image\" alt=\"\" decoding=\"async\" style=\"display: block; margin: auto; margin-bottom: 10px; max-width: 100%;\" srcset=\"https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/familiares-de-rehenes-gaza.jpg?w=782&amp;ssl=1 782w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/familiares-de-rehenes-gaza.jpg?resize=267%2C138&amp;ssl=1 267w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/familiares-de-rehenes-gaza.jpg?resize=768%2C397&amp;ssl=1 768w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/familiares-de-rehenes-gaza.jpg?resize=780%2C404&amp;ssl=1 780w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/familiares-de-rehenes-gaza.jpg?resize=585%2C302&amp;ssl=1 585w\" sizes=\"(max-width: 782px) 100vw, 782px\" />\n<p>Seis rehenes de Ham\u00e1s\u00a0fueron liberados este jueves\u00a0y entregados a personal de la Cruz Roja Internacional, inform\u00f3 el Ej\u00e9rcito israel\u00ed, tras la liberaci\u00f3n de otras dos rehenes israel\u00edes durante el s\u00e9ptimo d\u00eda de tregua entre Israel y el grupo islamista. El Ej\u00e9rcito tambi\u00e9n inform\u00f3 de la liberaci\u00f3n de otras dos mujeres: la abogada israel\u00ed Amit Soussana, de 40 a\u00f1os, y la franco-israel\u00ed Mia Schem, de 21 a\u00f1os, la primera reh\u00e9n de la que\u00a0Ham\u00e1s public\u00f3 un video pocos d\u00edas despu\u00e9s de su captura, el 7 de octubre, en el que aparec\u00eda con una herida en un brazo y ped\u00eda a Israel su liberaci\u00f3n. Entre el total de ocho israel\u00edes liberados este jueves se encuentran dos menores y seis mujeres, algunos de ellos con doble nacionalidad (mexicana, rusa y uruguaya), inform\u00f3 por su parte el portavoz del Ministerio de Exteriores de Catar, Majed al Ansari.</p>\n<p>La entrada <a rel=\"nofollow\" href=\"https://nhdiario.es/hamas-libero-a-ocho-rehenes-en-el-septimo-dia-de-tregua/\">Ham\u00e1s liber\u00f3 a ocho rehenes en el s\u00e9ptimo d\u00eda de tregua</a> se public\u00f3 primero en <a rel=\"nofollow\" href=\"https://nhdiario.es\">NH Diario</a>.</p>\n",
            "content_text": "Seis rehenes de Ham\u00e1s\u00a0fueron liberados este jueves\u00a0y entregados a personal de la Cruz Roja Internacional, inform\u00f3 el Ej\u00e9rcito israel\u00ed, tras la liberaci\u00f3n de otras dos rehenes israel\u00edes durante el s\u00e9ptimo d\u00eda de tregua entre Israel y el grupo islamista. El Ej\u00e9rcito tambi\u00e9n inform\u00f3 de la liberaci\u00f3n de otras dos mujeres: la abogada israel\u00ed Amit Soussana, de 40 a\u00f1os, y la franco-israel\u00ed Mia Schem, de 21 a\u00f1os, la primera reh\u00e9n de la que\u00a0Ham\u00e1s public\u00f3 un video pocos d\u00edas despu\u00e9s de su captura, el 7 de octubre, en el que aparec\u00eda con una herida en un brazo y ped\u00eda a Israel su liberaci\u00f3n. Entre el total de ocho israel\u00edes liberados este jueves se encuentran dos menores y seis mujeres, algunos de ellos con doble nacionalidad (mexicana, rusa y uruguaya), inform\u00f3 por su parte el portavoz del Ministerio de Exteriores de Catar, Majed al Ansari.\nLa entrada Ham\u00e1s liber\u00f3 a ocho rehenes en el s\u00e9ptimo d\u00eda de tregua se public\u00f3 primero en NH Diario.",
            "date_published": "2023-12-01T00:14:00+01:00",
            "date_modified": "2023-12-01T01:03:29+01:00",
            "authors": [
                {
                    "name": "Fran Lago",
                    "url": "https://nhdiario.es/author/fran/",
                    "avatar": "https://secure.gravatar.com/avatar/0d3f6648ca943c3ab1d5f7ec1754086f?s=512&d=mm&r=g"
                }
            ],
            "author": {
                "name": "Fran Lago",
                "url": "https://nhdiario.es/author/fran/",
                "avatar": "https://secure.gravatar.com/avatar/0d3f6648ca943c3ab1d5f7ec1754086f?s=512&d=mm&r=g"
            },
            "image": "https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/familiares-de-rehenes-gaza.jpg?fit=782%2C404&ssl=1",
            "tags": [
                "Internacional"
            ]
        },
        {
            "id": "https://nhdiario.es/?p=265112",
            "url": "https://nhdiario.es/israel-llama-a-consultas-a-su-embajadora-en-espana-rodica-radian-gordon/",
            "title": "Israel llama a consultas a su embajadora en Espa\u00f1a Rodica Radian-Gordon",
            "content_html": "<img width=\"845\" height=\"454\" src=\"https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/pedro-sanchez-en-tve1.jpg?fit=845%2C454&amp;ssl=1\" class=\"webfeedsFeaturedVisual wp-post-image\" alt=\"\" decoding=\"async\" style=\"display: block; margin: auto; margin-bottom: 10px; max-width: 100%;\" srcset=\"https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/pedro-sanchez-en-tve1.jpg?w=845&amp;ssl=1 845w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/pedro-sanchez-en-tve1.jpg?resize=267%2C143&amp;ssl=1 267w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/pedro-sanchez-en-tve1.jpg?resize=768%2C413&amp;ssl=1 768w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/pedro-sanchez-en-tve1.jpg?resize=585%2C314&amp;ssl=1 585w\" sizes=\"(max-width: 845px) 100vw, 845px\" />\n<p>Lo hace tras las declaraciones del presidente del Gobierno espa\u00f1ol, Pedro S\u00e1nchez, quien ha asegurado en una entrevista en RTVE que ante la alta cifra de muertos en Gaza tiene \u00abseries dudas de que Israel est\u00e9 cumpliendo con el derecho internacional humanitario\u00bb.</p>\n\n\n\n<p>\u00abTras las indignantes palabras del presidente del Gobierno de Espa\u00f1a, que repite acusaciones infundadas, decid\u00ed llamar a la embajadora de Israel en Espa\u00f1a\u00bb, Rodica Radian-Gordon, \u00abpara que volviera a Jerusal\u00e9n\u00bb en una nueva llamada a consultas, ha anunciado el ministro de Exteriores israel\u00ed, Eli Cohen, en la red social X.</p>\n\n\n\n<p>Adem\u00e1s, el primer ministro de Israel,\u00a0Benjam\u00edn Netanyahu, ha ordenado \u00abal ministro de Exteriores\u00a0que invitara a la embajadora espa\u00f1ola en Israel [Ana Salom\u00f3n] a una conversaci\u00f3n de reprimenda tras la vergonzosa declaraci\u00f3n\u00bb de S\u00e1nchez \u00abel d\u00eda en que los\u00a0terroristas de Ham\u00e1s est\u00e1n matando a israel\u00edes en Jerusal\u00e9n\u00bb, ha anunciado la oficina Netanyahu en un comunicado.</p>\n<p>La entrada <a rel=\"nofollow\" href=\"https://nhdiario.es/israel-llama-a-consultas-a-su-embajadora-en-espana-rodica-radian-gordon/\">Israel llama a consultas a su embajadora en Espa\u00f1a Rodica Radian-Gordon</a> se public\u00f3 primero en <a rel=\"nofollow\" href=\"https://nhdiario.es\">NH Diario</a>.</p>\n",
            "content_text": "Lo hace tras las declaraciones del presidente del Gobierno espa\u00f1ol, Pedro S\u00e1nchez, quien ha asegurado en una entrevista en RTVE que ante la alta cifra de muertos en Gaza tiene \u00abseries dudas de que Israel est\u00e9 cumpliendo con el derecho internacional humanitario\u00bb.\n\n\n\n\u00abTras las indignantes palabras del presidente del Gobierno de Espa\u00f1a, que repite acusaciones infundadas, decid\u00ed llamar a la embajadora de Israel en Espa\u00f1a\u00bb, Rodica Radian-Gordon, \u00abpara que volviera a Jerusal\u00e9n\u00bb en una nueva llamada a consultas, ha anunciado el ministro de Exteriores israel\u00ed, Eli Cohen, en la red social X.\n\n\n\nAdem\u00e1s, el primer ministro de Israel,\u00a0Benjam\u00edn Netanyahu, ha ordenado \u00abal ministro de Exteriores\u00a0que invitara a la embajadora espa\u00f1ola en Israel [Ana Salom\u00f3n] a una conversaci\u00f3n de reprimenda tras la vergonzosa declaraci\u00f3n\u00bb de S\u00e1nchez \u00abel d\u00eda en que los\u00a0terroristas de Ham\u00e1s est\u00e1n matando a israel\u00edes en Jerusal\u00e9n\u00bb, ha anunciado la oficina Netanyahu en un comunicado.\nLa entrada Israel llama a consultas a su embajadora en Espa\u00f1a Rodica Radian-Gordon se public\u00f3 primero en NH Diario.",
            "date_published": "2023-12-01T00:13:00+01:00",
            "date_modified": "2023-12-01T01:25:27+01:00",
            "authors": [
                {
                    "name": "Fran Lago",
                    "url": "https://nhdiario.es/author/fran/",
                    "avatar": "https://secure.gravatar.com/avatar/0d3f6648ca943c3ab1d5f7ec1754086f?s=512&d=mm&r=g"
                }
            ],
            "author": {
                "name": "Fran Lago",
                "url": "https://nhdiario.es/author/fran/",
                "avatar": "https://secure.gravatar.com/avatar/0d3f6648ca943c3ab1d5f7ec1754086f?s=512&d=mm&r=g"
            },
            "image": "https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/pedro-sanchez-en-tve1.jpg?fit=845%2C454&ssl=1",
            "tags": [
                "Espa\u00f1a"
            ]
        },
        {
            "id": "https://nhdiario.es/?p=265106",
            "url": "https://nhdiario.es/la-aerolinea-emirates-ampliara-su-red-con-centenares-de-nuevos-aviones/",
            "title": "La aerol\u00ednea Emirates ampliar\u00e1 su red con centenares de nuevos aviones",
            "content_html": "<img width=\"740\" height=\"348\" src=\"https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/emirates.jpg?fit=740%2C348&amp;ssl=1\" class=\"webfeedsFeaturedVisual wp-post-image\" alt=\"\" decoding=\"async\" style=\"display: block; margin: auto; margin-bottom: 10px; max-width: 100%;\" srcset=\"https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/emirates.jpg?w=740&amp;ssl=1 740w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/emirates.jpg?resize=267%2C126&amp;ssl=1 267w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/emirates.jpg?resize=585%2C275&amp;ssl=1 585w\" sizes=\"(max-width: 740px) 100vw, 740px\" />\n<p>La aerol\u00ednea Emirates arranc\u00f3 la semana en el Dubai Airshow anunciando que aumenta su flota con un pedido de 90 aviones Boeing 777X por valor de 47 000 millones de euros.</p>\n\n\n\n<p>El presidente de Emirates, Sir Tim Clarke, declar\u00f3 en conversaciones con Euronews: \u00abEn total hemos encargado 245 aviones Boeing y 50 A350 que empezar\u00e1n a entregarse el a\u00f1o que viene. Todo esto forma parte del plan de expansi\u00f3n de nuestra red en los pr\u00f3ximos 10 a 15 a\u00f1os\u00bb. Tras unos a\u00f1os de cautela, Clarke afirma que \u00abla demanda sigue siendo s\u00f3lida\u00bb para el sector de la aviaci\u00f3n y que \u00abOriente Medio es ahora una potencia en t\u00e9rminos de actividad econ\u00f3mica, hay una gran inversi\u00f3n interna y una fuerte generaci\u00f3n de riqueza en Arabia Saud\u00ed y en los estados de alrededor\u00bb.</p>\n\n\n\n<p>La meta de los objetivos de sostenibilidad de la industria es alcanzar las cero emisiones netas para 2050.\u00a0En cuanto a los retos a los que se enfrentar\u00e1n las aerol\u00edneas en los pr\u00f3ximos a\u00f1os, afirma que el mayor reto de Emirates es su incapacidad para expandirse al ritmo deseado. Y su consejo para el futuro: \u00abEste sector est\u00e1 aqu\u00ed para quedarse. Haz lo correcto, conc\u00e9ntrate y conoce los puntos fuertes del producto. Conc\u00e9ntrate en hacer lo que consideras que vas a aportar y a\u00f1adir valor a los accionistas y a ti mismo\u00bb.</p>\n<p>La entrada <a rel=\"nofollow\" href=\"https://nhdiario.es/la-aerolinea-emirates-ampliara-su-red-con-centenares-de-nuevos-aviones/\">La aerol\u00ednea Emirates ampliar\u00e1 su red con centenares de nuevos aviones</a> se public\u00f3 primero en <a rel=\"nofollow\" href=\"https://nhdiario.es\">NH Diario</a>.</p>\n",
            "content_text": "La aerol\u00ednea Emirates arranc\u00f3 la semana en el Dubai Airshow anunciando que aumenta su flota con un pedido de 90 aviones Boeing 777X por valor de 47 000 millones de euros.\n\n\n\nEl presidente de Emirates, Sir Tim Clarke, declar\u00f3 en conversaciones con Euronews: \u00abEn total hemos encargado 245 aviones Boeing y 50 A350 que empezar\u00e1n a entregarse el a\u00f1o que viene. Todo esto forma parte del plan de expansi\u00f3n de nuestra red en los pr\u00f3ximos 10 a 15 a\u00f1os\u00bb. Tras unos a\u00f1os de cautela, Clarke afirma que \u00abla demanda sigue siendo s\u00f3lida\u00bb para el sector de la aviaci\u00f3n y que \u00abOriente Medio es ahora una potencia en t\u00e9rminos de actividad econ\u00f3mica, hay una gran inversi\u00f3n interna y una fuerte generaci\u00f3n de riqueza en Arabia Saud\u00ed y en los estados de alrededor\u00bb.\n\n\n\nLa meta de los objetivos de sostenibilidad de la industria es alcanzar las cero emisiones netas para 2050.\u00a0En cuanto a los retos a los que se enfrentar\u00e1n las aerol\u00edneas en los pr\u00f3ximos a\u00f1os, afirma que el mayor reto de Emirates es su incapacidad para expandirse al ritmo deseado. Y su consejo para el futuro: \u00abEste sector est\u00e1 aqu\u00ed para quedarse. Haz lo correcto, conc\u00e9ntrate y conoce los puntos fuertes del producto. Conc\u00e9ntrate en hacer lo que consideras que vas a aportar y a\u00f1adir valor a los accionistas y a ti mismo\u00bb.\nLa entrada La aerol\u00ednea Emirates ampliar\u00e1 su red con centenares de nuevos aviones se public\u00f3 primero en NH Diario.",
            "date_published": "2023-12-01T00:12:00+01:00",
            "date_modified": "2023-12-01T01:17:18+01:00",
            "authors": [
                {
                    "name": "Fran Lago",
                    "url": "https://nhdiario.es/author/fran/",
                    "avatar": "https://secure.gravatar.com/avatar/0d3f6648ca943c3ab1d5f7ec1754086f?s=512&d=mm&r=g"
                }
            ],
            "author": {
                "name": "Fran Lago",
                "url": "https://nhdiario.es/author/fran/",
                "avatar": "https://secure.gravatar.com/avatar/0d3f6648ca943c3ab1d5f7ec1754086f?s=512&d=mm&r=g"
            },
            "image": "https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/emirates.jpg?fit=740%2C348&ssl=1",
            "tags": [
                "Internacional"
            ]
        },
        {
            "id": "https://nhdiario.es/?p=265052",
            "url": "https://nhdiario.es/el-pleno-de-a-laracha-da-luz-verde-al-impuesto-de-plusvalia-municipal/",
            "title": "El Pleno de A Laracha da luz verde al impuesto de plusval\u00eda municipal",
            "content_html": "<img width=\"2048\" height=\"1051\" src=\"https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/11/Pleno-A-Laracha-Novembro-23-scaled-e1701370358441.jpg?fit=2048%2C1051&amp;ssl=1\" class=\"webfeedsFeaturedVisual wp-post-image\" alt=\"\" decoding=\"async\" style=\"display: block; margin: auto; margin-bottom: 10px; max-width: 100%;\" />\n<p>El Pleno ordinario celebrado este jueves acord\u00f3 aprobar la nueva ordenanza fiscal reguladora del impuesto sobre el incremento de valor de los terrenos de naturaleza urbana. Se hizo con la abstenci\u00f3n de los tres concejales del grupo municipal del BNG y en contra de la \u00fanica concejala presente del PSOE.</p>\n\n\n\n<p>El conocido c\u00f3mo impuesto de plusval\u00eda municipal es el tributo directo que graba el incremento de valor que experimentan los terrenos de naturaleza urbana -est\u00e1n excluidos los terrenos r\u00fasticos- durante el tiempo en el que se tienen en propiedad, y que debe liquidarse \u00fanicamente en caso de transmisi\u00f3n del bien por venta, donaci\u00f3n o herencia, y solo si efectivamente existe dicho aumento de valor.</p>\n\n\n\n<p>La cuota del impuesto propuesta acordada en el Pleno ser\u00e1 el resultado de aplicar el tipo de gravamen del 27% a la base imponible, constituida por el incremento del valor de los terrenos puesto de manifiesto en el momento del devengo y experimentado a lo largo de un per\u00edodo m\u00e1ximo de veinte a\u00f1os. La ordenanza hab\u00eda contemplado la bonificaci\u00f3n del 50% en las transmisiones por causa de fallecimiento de la persona titular de los bienes.</p>\n\n\n\n<p>Asimismo, tambi\u00e9n se aprob\u00f3 la delegaci\u00f3n de la gesti\u00f3n de este impuesto en la Diputaci\u00f3n de A Coru\u00f1a al igual que se recaudan otros tributos municipales, igualmente con la abstenci\u00f3n del BNG y el voto en contra del PSOE.</p>\n\n\n\n<figure class=\"wp-block-image size-large\"><img decoding=\"async\" width=\"1170\" height=\"610\" src=\"https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/11/Pleno-ordinario-A-Laracha-Novembro-23.jpg?resize=1170%2C610&#038;ssl=1\" alt=\"\" class=\"wp-image-265048\" data-recalc-dims=\"1\"/></figure>\n\n\n\n<p><em>La sesi\u00f3n comenz\u00f3 con la lectura por parte de la concejala de Igualdad, Roc\u00edo L\u00f3pez, de la declaraci\u00f3n institucional del Ayuntamiento de A Laracha de rechazo de la violencia contra las mujeres que hab\u00eda sido rubricada por los tres grupos municipales en torno a la conmemoraci\u00f3n de 25 de noviembre . A continuaci\u00f3n se guard\u00f3 un minuto de silencio en memoria de las v\u00edctimas de esa problem\u00e1tica social.</em></p>\n<p>La entrada <a rel=\"nofollow\" href=\"https://nhdiario.es/el-pleno-de-a-laracha-da-luz-verde-al-impuesto-de-plusvalia-municipal/\">El Pleno de A Laracha da luz verde al impuesto de plusval\u00eda municipal</a> se public\u00f3 primero en <a rel=\"nofollow\" href=\"https://nhdiario.es\">NH Diario</a>.</p>\n",
            "content_text": "El Pleno ordinario celebrado este jueves acord\u00f3 aprobar la nueva ordenanza fiscal reguladora del impuesto sobre el incremento de valor de los terrenos de naturaleza urbana. Se hizo con la abstenci\u00f3n de los tres concejales del grupo municipal del BNG y en contra de la \u00fanica concejala presente del PSOE.\n\n\n\nEl conocido c\u00f3mo impuesto de plusval\u00eda municipal es el tributo directo que graba el incremento de valor que experimentan los terrenos de naturaleza urbana -est\u00e1n excluidos los terrenos r\u00fasticos- durante el tiempo en el que se tienen en propiedad, y que debe liquidarse \u00fanicamente en caso de transmisi\u00f3n del bien por venta, donaci\u00f3n o herencia, y solo si efectivamente existe dicho aumento de valor.\n\n\n\nLa cuota del impuesto propuesta acordada en el Pleno ser\u00e1 el resultado de aplicar el tipo de gravamen del 27% a la base imponible, constituida por el incremento del valor de los terrenos puesto de manifiesto en el momento del devengo y experimentado a lo largo de un per\u00edodo m\u00e1ximo de veinte a\u00f1os. La ordenanza hab\u00eda contemplado la bonificaci\u00f3n del 50% en las transmisiones por causa de fallecimiento de la persona titular de los bienes.\n\n\n\nAsimismo, tambi\u00e9n se aprob\u00f3 la delegaci\u00f3n de la gesti\u00f3n de este impuesto en la Diputaci\u00f3n de A Coru\u00f1a al igual que se recaudan otros tributos municipales, igualmente con la abstenci\u00f3n del BNG y el voto en contra del PSOE.\n\n\n\n\n\n\n\nLa sesi\u00f3n comenz\u00f3 con la lectura por parte de la concejala de Igualdad, Roc\u00edo L\u00f3pez, de la declaraci\u00f3n institucional del Ayuntamiento de A Laracha de rechazo de la violencia contra las mujeres que hab\u00eda sido rubricada por los tres grupos municipales en torno a la conmemoraci\u00f3n de 25 de noviembre . A continuaci\u00f3n se guard\u00f3 un minuto de silencio en memoria de las v\u00edctimas de esa problem\u00e1tica social.\nLa entrada El Pleno de A Laracha da luz verde al impuesto de plusval\u00eda municipal se public\u00f3 primero en NH Diario.",
            "date_published": "2023-12-01T00:07:00+01:00",
            "date_modified": "2023-11-30T22:59:27+01:00",
            "authors": [
                {
                    "name": "Redacci\u00f3n",
                    "url": "https://nhdiario.es/author/super/",
                    "avatar": "https://secure.gravatar.com/avatar/a329803e0b9b2130cec902974c9a4aea?s=512&d=mm&r=g"
                }
            ],
            "author": {
                "name": "Redacci\u00f3n",
                "url": "https://nhdiario.es/author/super/",
                "avatar": "https://secure.gravatar.com/avatar/a329803e0b9b2130cec902974c9a4aea?s=512&d=mm&r=g"
            },
            "image": "https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/11/Pleno-A-Laracha-Novembro-23-scaled-e1701370358441.jpg?fit=2560%2C1314&ssl=1",
            "tags": [
                "Costa da Morte"
            ]
        },
        {
            "id": "https://nhdiario.es/?p=265064",
            "url": "https://nhdiario.es/el-centro-civico-de-malpica-acogera-la-exposicion-madeiras-do-mar/",
            "title": "El Centro C\u00edvico de Malpica acoger\u00e1 la exposici\u00f3n \u2018Madeiras do mar\u2019",
            "content_html": "<img width=\"1493\" height=\"646\" src=\"https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/11/madeiras-do-mar.jpg?fit=1493%2C646&amp;ssl=1\" class=\"webfeedsFeaturedVisual wp-post-image\" alt=\"\" decoding=\"async\" style=\"display: block; margin: auto; margin-bottom: 10px; max-width: 100%;\" srcset=\"https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/11/madeiras-do-mar.jpg?w=1493&amp;ssl=1 1493w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/11/madeiras-do-mar.jpg?resize=1280%2C554&amp;ssl=1 1280w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/11/madeiras-do-mar.jpg?resize=267%2C116&amp;ssl=1 267w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/11/madeiras-do-mar.jpg?resize=768%2C332&amp;ssl=1 768w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/11/madeiras-do-mar.jpg?resize=1170%2C506&amp;ssl=1 1170w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/11/madeiras-do-mar.jpg?resize=585%2C253&amp;ssl=1 585w\" sizes=\"(max-width: 1493px) 100vw, 1493px\" />\n<p>El Ayuntamiento de Malpica sigue siendo referente en actividades culturales. El Centro C\u00edvico acoger\u00e1 desde este viernes la exposici\u00f3n \u00abMadeiras do mar\u00bb de Ruth Beltr\u00e1n.</p>\n\n\n\n<p>Hace tres a\u00f1os, naci\u00f3 Madera Zombi, un proyecto art\u00edstico que recupera maderas abandonadas para dotarlas de una nueva vida a trav\u00e9s de su conversi\u00f3n en peque\u00f1as obras de arte.</p>\n\n\n\n<p>Estas son maderas del mar. Maderas recogidas en las playas y en las rocas que tuvieron antes una vida \u00fatil, vinculada a oficios y paisajes. Son tambi\u00e9n un homenaje a la tradici\u00f3n marinera y a las historias de personas y empresas que con su esfuerzo vital fortalecieron el v\u00ednculo de Galicia con el mar. \u00a0Algunas de las fotos recogen momentos del pasado como embarcaciones, industrias, oficios. Otras son im\u00e1genes de la propia vida marina. Cada una de ellas es transferida despu\u00e9s a la madera escogida de forma artesanal. Todas son \u00fanicas e irrepetibles.</p>\n\n\n\n<p>La muestra podr\u00e1 visitarse desde el 1 de diciembre del 2023 hasta el 14 de enero del 2024. La actividad est\u00e1 organizada por la concejal\u00eda de Cultura del Ayuntamiento de Malpica.</p>\n<p>La entrada <a rel=\"nofollow\" href=\"https://nhdiario.es/el-centro-civico-de-malpica-acogera-la-exposicion-madeiras-do-mar/\">El Centro C\u00edvico de Malpica acoger\u00e1 la exposici\u00f3n &#8216;Madeiras do mar&#8217;</a> se public\u00f3 primero en <a rel=\"nofollow\" href=\"https://nhdiario.es\">NH Diario</a>.</p>\n",
            "content_text": "El Ayuntamiento de Malpica sigue siendo referente en actividades culturales. El Centro C\u00edvico acoger\u00e1 desde este viernes la exposici\u00f3n \u00abMadeiras do mar\u00bb de Ruth Beltr\u00e1n.\n\n\n\nHace tres a\u00f1os, naci\u00f3 Madera Zombi, un proyecto art\u00edstico que recupera maderas abandonadas para dotarlas de una nueva vida a trav\u00e9s de su conversi\u00f3n en peque\u00f1as obras de arte.\n\n\n\nEstas son maderas del mar. Maderas recogidas en las playas y en las rocas que tuvieron antes una vida \u00fatil, vinculada a oficios y paisajes. Son tambi\u00e9n un homenaje a la tradici\u00f3n marinera y a las historias de personas y empresas que con su esfuerzo vital fortalecieron el v\u00ednculo de Galicia con el mar. \u00a0Algunas de las fotos recogen momentos del pasado como embarcaciones, industrias, oficios. Otras son im\u00e1genes de la propia vida marina. Cada una de ellas es transferida despu\u00e9s a la madera escogida de forma artesanal. Todas son \u00fanicas e irrepetibles.\n\n\n\nLa muestra podr\u00e1 visitarse desde el 1 de diciembre del 2023 hasta el 14 de enero del 2024. La actividad est\u00e1 organizada por la concejal\u00eda de Cultura del Ayuntamiento de Malpica.\nLa entrada El Centro C\u00edvico de Malpica acoger\u00e1 la exposici\u00f3n &#8216;Madeiras do mar&#8217; se public\u00f3 primero en NH Diario.",
            "date_published": "2023-12-01T00:06:00+01:00",
            "date_modified": "2023-11-30T22:55:50+01:00",
            "authors": [
                {
                    "name": "Redacci\u00f3n",
                    "url": "https://nhdiario.es/author/super/",
                    "avatar": "https://secure.gravatar.com/avatar/a329803e0b9b2130cec902974c9a4aea?s=512&d=mm&r=g"
                }
            ],
            "author": {
                "name": "Redacci\u00f3n",
                "url": "https://nhdiario.es/author/super/",
                "avatar": "https://secure.gravatar.com/avatar/a329803e0b9b2130cec902974c9a4aea?s=512&d=mm&r=g"
            },
            "image": "https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/11/madeiras-do-mar.jpg?fit=1493%2C646&ssl=1",
            "tags": [
                "Costa da Morte"
            ]
        },
        {
            "id": "https://nhdiario.es/?p=265150",
            "url": "https://nhdiario.es/galicia-sera-la-primera-region-de-europa-en-regular-por-ley-el-uso-de-la-inteligencia-artificial/",
            "title": "Galicia ser\u00e1 la primera regi\u00f3n de Europa en regular por ley el uso de la inteligencia artificial",
            "content_html": "<img width=\"931\" height=\"522\" src=\"https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/rueda-30.jpg?fit=931%2C522&amp;ssl=1\" class=\"webfeedsFeaturedVisual wp-post-image\" alt=\"\" decoding=\"async\" style=\"display: block; margin: auto; margin-bottom: 10px; max-width: 100%;\" srcset=\"https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/rueda-30.jpg?w=931&amp;ssl=1 931w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/rueda-30.jpg?resize=267%2C150&amp;ssl=1 267w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/rueda-30.jpg?resize=768%2C431&amp;ssl=1 768w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/rueda-30.jpg?resize=585%2C328&amp;ssl=1 585w\" sizes=\"(max-width: 931px) 100vw, 931px\" />\n<p>El presidente de la Xunta, Alfonso Rueda, anunci\u00f3 este jueves que el Consello autoriz\u00f3 el inicio de la tramitaci\u00f3n del Anteproyecto de ley para el desarrollo e impulso de la inteligencia artificial (IA), que convertir\u00e1 a \u201cGalicia en la primera regi\u00f3n europea en regular por ley el uso\u201d de esta tecnolog\u00eda. \u201cEl objetivo es garantizar que los sistemas de inteligencia artificial que se utilizan en la comunidad son fiables y respetuosos con los derechos fundamentales de las personas\u201d, resalt\u00f3.</p>\n\n\n\n<p>La ley establecer\u00e1 los principios \u00e9ticos para el dise\u00f1o, adquisici\u00f3n implementaci\u00f3n y uso de sistemas de IA por parte de la Administraci\u00f3n bajo criterios de diligencia, auditabilidad, explicabilidad, transparencia, imparcialidad, ausencia de sesgos, seguridad o privacidad.</p>\n\n\n\n<p>Entre los principios \u00e9ticos rectores, destaca tambi\u00e9n el principio de reserva de la humanidad y de revisi\u00f3n humana, principio de fiabilidad y de responsabilidad y el principio de evaluaci\u00f3n de impacto en las personas, en la sociedad y en el ambiente. Garantizar\u00e1, asimismo, los derechos de libertad, igualdad y reacci\u00f3n frente al dise\u00f1o, adquisici\u00f3n, implementaci\u00f3n y uso de sistemas de inteligencia artificial, as\u00ed como el ejercicio de los derechos de la ciudadan\u00eda.</p>\n\n\n\n<p>Con la tramitaci\u00f3n de esta ley, la Xunta avanza en su compromiso de aprobar entre 2020 y 2024 la normativa necesaria para facilitar la incorporaci\u00f3n de tecnolog\u00edas digitales de alto impacto, de acuerdo con el objetivo de la Estrategia Galicia Digital 2030 de especializaci\u00f3n tecnol\u00f3gica y atracci\u00f3n de inversiones y talento digital.</p>\n<p>La entrada <a rel=\"nofollow\" href=\"https://nhdiario.es/galicia-sera-la-primera-region-de-europa-en-regular-por-ley-el-uso-de-la-inteligencia-artificial/\">Galicia ser\u00e1 la primera regi\u00f3n de Europa en regular por ley el uso de la inteligencia artificial</a> se public\u00f3 primero en <a rel=\"nofollow\" href=\"https://nhdiario.es\">NH Diario</a>.</p>\n",
            "content_text": "El presidente de la Xunta, Alfonso Rueda, anunci\u00f3 este jueves que el Consello autoriz\u00f3 el inicio de la tramitaci\u00f3n del Anteproyecto de ley para el desarrollo e impulso de la inteligencia artificial (IA), que convertir\u00e1 a \u201cGalicia en la primera regi\u00f3n europea en regular por ley el uso\u201d de esta tecnolog\u00eda. \u201cEl objetivo es garantizar que los sistemas de inteligencia artificial que se utilizan en la comunidad son fiables y respetuosos con los derechos fundamentales de las personas\u201d, resalt\u00f3.\n\n\n\nLa ley establecer\u00e1 los principios \u00e9ticos para el dise\u00f1o, adquisici\u00f3n implementaci\u00f3n y uso de sistemas de IA por parte de la Administraci\u00f3n bajo criterios de diligencia, auditabilidad, explicabilidad, transparencia, imparcialidad, ausencia de sesgos, seguridad o privacidad.\n\n\n\nEntre los principios \u00e9ticos rectores, destaca tambi\u00e9n el principio de reserva de la humanidad y de revisi\u00f3n humana, principio de fiabilidad y de responsabilidad y el principio de evaluaci\u00f3n de impacto en las personas, en la sociedad y en el ambiente. Garantizar\u00e1, asimismo, los derechos de libertad, igualdad y reacci\u00f3n frente al dise\u00f1o, adquisici\u00f3n, implementaci\u00f3n y uso de sistemas de inteligencia artificial, as\u00ed como el ejercicio de los derechos de la ciudadan\u00eda.\n\n\n\nCon la tramitaci\u00f3n de esta ley, la Xunta avanza en su compromiso de aprobar entre 2020 y 2024 la normativa necesaria para facilitar la incorporaci\u00f3n de tecnolog\u00edas digitales de alto impacto, de acuerdo con el objetivo de la Estrategia Galicia Digital 2030 de especializaci\u00f3n tecnol\u00f3gica y atracci\u00f3n de inversiones y talento digital.\nLa entrada Galicia ser\u00e1 la primera regi\u00f3n de Europa en regular por ley el uso de la inteligencia artificial se public\u00f3 primero en NH Diario.",
            "date_published": "2023-12-01T00:05:00+01:00",
            "date_modified": "2023-12-01T02:16:55+01:00",
            "authors": [
                {
                    "name": "Redacci\u00f3n",
                    "url": "https://nhdiario.es/author/super/",
                    "avatar": "https://secure.gravatar.com/avatar/a329803e0b9b2130cec902974c9a4aea?s=512&d=mm&r=g"
                }
            ],
            "author": {
                "name": "Redacci\u00f3n",
                "url": "https://nhdiario.es/author/super/",
                "avatar": "https://secure.gravatar.com/avatar/a329803e0b9b2130cec902974c9a4aea?s=512&d=mm&r=g"
            },
            "image": "https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/rueda-30.jpg?fit=931%2C522&ssl=1",
            "tags": [
                "Galicia"
            ]
        },
        {
            "id": "https://nhdiario.es/?p=265068",
            "url": "https://nhdiario.es/carballo-sufre-graves-lesiones-tras-cortarse-en-un-brazo-oleada-de-robos-en-coches/",
            "title": "Carballo | Sufre graves lesiones tras cortarse en un brazo | Oleada de robos en coches",
            "content_html": "<img width=\"1594\" height=\"824\" src=\"https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/suceso-gran-via.jpg?fit=1594%2C824&amp;ssl=1\" class=\"webfeedsFeaturedVisual wp-post-image\" alt=\"\" decoding=\"async\" style=\"display: block; margin: auto; margin-bottom: 10px; max-width: 100%;\" srcset=\"https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/suceso-gran-via.jpg?w=1594&amp;ssl=1 1594w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/suceso-gran-via.jpg?resize=1280%2C662&amp;ssl=1 1280w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/suceso-gran-via.jpg?resize=267%2C138&amp;ssl=1 267w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/suceso-gran-via.jpg?resize=768%2C397&amp;ssl=1 768w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/suceso-gran-via.jpg?resize=1536%2C794&amp;ssl=1 1536w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/suceso-gran-via.jpg?resize=1170%2C605&amp;ssl=1 1170w, https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/suceso-gran-via.jpg?resize=585%2C302&amp;ssl=1 585w\" sizes=\"(max-width: 1594px) 100vw, 1594px\" />\n<p>Un vecino de la localidad ha tenido que ser atendido de urgencia tras un corte profundo en un brazo, presuntamente originado por la rotura del cristal de una ventana. Los hechos ocurrieron sobre las ocho y media de la tarde de este jueves en un edificio situado a la altura del n\u00famero 106 de la calle Gran V\u00eda. Vecinos de la zona dieron la voz de alarma al 112 y al lugar acud\u00eda en primera instancia una patrulla de la Polic\u00eda Local. El hombre, de mediana edad, presentaba un corte profundo en un brazo por lo que fue necesario realizarle un torniquete de urgencia para que no se desangrase y posteriormente fue evacuado en ambulancia. Las autoridades investigan que es lo que pudo ocurrir para producirse este suceso, a su llegada comprobaron que una de las ventanas de la vivienda que da a la calle estaba rota y los cristales en la acera, por lo que la desgracia pudo haber sido mayor si llegase a pasar cualquier persona por el lugar en ese momento, en una zona comercial c\u00e9ntrica y por lo tanto muy concurrida.</p>\n\n\n\n<p>Varios usuarios de la Avenida de Berganti\u00f1os han sido v\u00edctimas de una nueva oleada de robos en coches. El m\u00e1s alarmante ocurr\u00eda en la madrugada de este mi\u00e9rcoles donde al menos cuatro turismos que estaban estacionados en la misma zona fueron pasto de los delincuentes que les rompieron las ventanillas para tratar de llevarse objetos de valor de su interior.</p>\n<p>La entrada <a rel=\"nofollow\" href=\"https://nhdiario.es/carballo-sufre-graves-lesiones-tras-cortarse-en-un-brazo-oleada-de-robos-en-coches/\">Carballo | Sufre graves lesiones tras cortarse en un brazo | Oleada de robos en coches</a> se public\u00f3 primero en <a rel=\"nofollow\" href=\"https://nhdiario.es\">NH Diario</a>.</p>\n",
            "content_text": "Un vecino de la localidad ha tenido que ser atendido de urgencia tras un corte profundo en un brazo, presuntamente originado por la rotura del cristal de una ventana. Los hechos ocurrieron sobre las ocho y media de la tarde de este jueves en un edificio situado a la altura del n\u00famero 106 de la calle Gran V\u00eda. Vecinos de la zona dieron la voz de alarma al 112 y al lugar acud\u00eda en primera instancia una patrulla de la Polic\u00eda Local. El hombre, de mediana edad, presentaba un corte profundo en un brazo por lo que fue necesario realizarle un torniquete de urgencia para que no se desangrase y posteriormente fue evacuado en ambulancia. Las autoridades investigan que es lo que pudo ocurrir para producirse este suceso, a su llegada comprobaron que una de las ventanas de la vivienda que da a la calle estaba rota y los cristales en la acera, por lo que la desgracia pudo haber sido mayor si llegase a pasar cualquier persona por el lugar en ese momento, en una zona comercial c\u00e9ntrica y por lo tanto muy concurrida.\n\n\n\nVarios usuarios de la Avenida de Berganti\u00f1os han sido v\u00edctimas de una nueva oleada de robos en coches. El m\u00e1s alarmante ocurr\u00eda en la madrugada de este mi\u00e9rcoles donde al menos cuatro turismos que estaban estacionados en la misma zona fueron pasto de los delincuentes que les rompieron las ventanillas para tratar de llevarse objetos de valor de su interior.\nLa entrada Carballo | Sufre graves lesiones tras cortarse en un brazo | Oleada de robos en coches se public\u00f3 primero en NH Diario.",
            "date_published": "2023-12-01T00:05:00+01:00",
            "date_modified": "2023-12-01T00:28:05+01:00",
            "authors": [
                {
                    "name": "Fran Lago",
                    "url": "https://nhdiario.es/author/fran/",
                    "avatar": "https://secure.gravatar.com/avatar/0d3f6648ca943c3ab1d5f7ec1754086f?s=512&d=mm&r=g"
                }
            ],
            "author": {
                "name": "Fran Lago",
                "url": "https://nhdiario.es/author/fran/",
                "avatar": "https://secure.gravatar.com/avatar/0d3f6648ca943c3ab1d5f7ec1754086f?s=512&d=mm&r=g"
            },
            "image": "https://i0.wp.com/nhdiario.es/wp-content/uploads/2023/12/suceso-gran-via.jpg?fit=1594%2C824&ssl=1",
            "tags": [
                "Costa da Morte"
            ]
        }
    ]
}

    """

var listaNoticias = Gson().fromJson<List<Noticia>>(json, ListaNoticias::class.java)


fun getNews() {
    print(listaNoticias.size)
}

