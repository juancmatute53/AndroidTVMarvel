package com.example.tvplayer;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            "Series",
            "Accion",
            "Comedia",
            "Drama",
            "Misterio",
            "Suspenso",
    };

    private static List<Movie> list;
    private static long count = 0;

    public static List<Movie> getList() {
        if (list == null) {
            list = setupMovies();
        }
        return list;
    }

    public static List<Movie> setupMovies() {
        list = new ArrayList<>();
        String title[] = {
                "The Falcon and the Winter Soldier",
                "Loki",
                "WandaVision",
                "What If...?",
                "Hawkeye"
        };


        String description = "El Universo cinematográfico de Marvel es una franquicia de medios y un universo compartido, centrada en"
                + "una serie de películas de superhéroes producidas independientemente por Marvel Studios. Las películas están basadas en personajes que aparecen en los"
                + "cómics estadounidenses publicados por Marvel Comics. La franquicia también incluye series de televisión, cortometrajes, series digitales y literatura.";
        String studio[] = {
                "Studio Zero", "Studio One", "Studio Two", "Studio Three", "Studio Four"
        };
        String videoUrl[] = {
                "https://storage.googleapis.com/androidtvplus/y2meta.com-Falcon%20y%20el%20Soldado%20del%20Invierno%20_%20Marvel%20Studios%20_%20Tr%C3%A1iler%20final%20doblado%20_%20Disney%2B-(480p).mp4",
                "https://storage.googleapis.com/androidtvplus/y2meta.com-LOKI%20Tr%C3%A1iler%20Espa%C3%B1ol%20Latino%20DOBLADO%20(2021)%20Marvel-(480p).mp4",
                "https://storage.googleapis.com/androidtvplus/y2meta.com-WANDAVISION%20Tr%C3%A1iler%20Espa%C3%B1ol%20(2020)-(480p).mp4",
                "https://storage.googleapis.com/androidtvplus/y2meta.com-What%20If..._%20(2021)%20Marvel%20Serie%20Tr%C3%A1iler%20Oficial%20Espa%C3%B1ol%20Latino-(480p).mp4",
                "https://storage.googleapis.com/androidtvplus/y2meta.com-OJO%20DE%20HALC%C3%93N%20Tr%C3%A1iler%20Espa%C3%B1ol%20(2021)-(480p).mp4"
        };
        String bgImageUrl[] = {
                "https://i2.wp.com/codigoespagueti.com/wp-content/uploads/2021/04/The-Falcon-and-the-Winter-Soldier-El-final-mostro-la-trampa-de-Disney.jpg?fit=1280%2C720&quality=80&ssl=1",
                "https://phantom-marca.unidadeditorial.es/7d3da19ceffaea0d8ca5c4d7d60394cd/resize/1320/f/jpg/assets/multimedia/imagenes/2021/06/15/16237735308830.jpg",
                "https://larepublica.pe/resizer/kgwzKNa0mge6D3c_T8OQy6sfCRs=/1250x735/top/smart/cloudfront-us-east-1.images.arcpublishing.com/gruporepublica/PUMQSPYJIFAJZPQOHARQODMH7M.jpg",
                "https://larepublica.pe/resizer/MGENkyYal3NpihDyUllPcVLlSzw=/480x282/top/smart/cloudfront-us-east-1.images.arcpublishing.com/gruporepublica/6RVLZMRYWBCEZJRNXK4STPO5RQ.jpg",
                "https://www.latercera.com/resizer/0iD7tmtosm_ryrjQQKrsN02KawQ=/arc-anglerfish-arc2-prod-copesa/public/HPYSKBBJJNF57HGCC375HV5IJM.jpg",
        };
        String cardImageUrl[] = {
                "https://i0.wp.com/cinemedios.com/wp-content/uploads/2021/02/falcon-y-el-soldado-del-invierno-cinemedios.jpg?fit=1024%2C576&ssl=1",
                "https://estaticos.muyinteresante.es/media/cache/1140x_thumb/uploads/images/article/60bf49905bafe885f65a70cc/1140loki-3000-191617-tileart-l178-en_0.png",
                "https://i.blogs.es/32b385/scale/450_1000.jpg",
                "https://phantom-marca.unidadeditorial.es/f1d63cd185e5d26b77660d99f1c70bdc/resize/1320/f/jpg/assets/multimedia/imagenes/2021/08/11/16286396508670.jpg",
                "https://www.mundopeliculas.tv/wp-content/uploads/2021/12/hawkeye-serie.jpg",
        };

        for (int index = 0; index < title.length; ++index) {
            list.add(
                    buildMovieInfo(
                            title[index],
                            description,
                            studio[index],
                            videoUrl[index],
                            cardImageUrl[index],
                            bgImageUrl[index]));
        }

        return list;
    }

    private static Movie buildMovieInfo(
            String title,
            String description,
            String studio,
            String videoUrl,
            String cardImageUrl,
            String backgroundImageUrl) {
        Movie movie = new Movie();
        movie.setId(count++);
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(backgroundImageUrl);
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}