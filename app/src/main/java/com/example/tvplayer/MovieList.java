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
                "https://00f74ba44bb421613d72866af8e26b9b378afdc46d-apidata.googleusercontent.com/download/storage/v1/b/androidtvplus/o/y2meta.com-Falcon%20y%20el%20Soldado%20del%20Invierno%20_%20Marvel%20Studios%20_%20Tr%C3%A1iler%20final%20doblado%20_%20Disney%2B-(480p).mp4?jk=AFshE3W0gmGoNkpGh3Snwe8rUoMB51NjRekpJK29tcBe1sc1qlSKvjXLwdSAE3CdFREYeb2Q8J64f2CnB6mM8DqsqAZLqrQd8So7eD0jO6H5GeSPbNk80oy3ryxZrD_wKC7mhQJ7-HLoq8qGhEg-DVqYro-9T6-T0NwPeqrpH4dHYqzBpbYcTcd6X3EE134yy4Pfkk9dVFJjhEMWOS_qCYKrI38-L-0UXHVXq7wmpgXtYEoSL8bbb6dV_ae7qrRA_-1OeIgOHC6ZGAekNIfPVvzCJ4CEpL_HEsqlJGgLMkm3m_CJ13_iGJOClXoDL3gKseqKNspgxZf27AGptxt83y2ojxS3aIYHpRLMQBugBX8o_wDa50w-StsrsaRYiUJ71AWaImsLX9cwmobW0lFRvqxmdJlf214TbpfilExyfPXiBXg0tRz_OMAeWB1gYyOSuKsjxmpFxC6IaCuYmePdbn78FEO66eFGH1VSXza1oEd1OWWXCS4udOWpMCSNg4qwSGnzWBZz8WBoXiHxdT28IiwK0PmxQYFwHBO6Lcuxbfc91Mgs4sgxaI7gDVqRD_Y28wPVMzyP4p7BB-cfdClrylGOBrZIRBjmywlCKM2gUxrIRDc3GBIS2xxaIZx3b6r2uQY8vf8hJIp4uEd0K-DcZQv6fP41dc54NrJRU9c_doi7osptb0726Gqp3Dx2ZiZIEyM2oPXS7G_gZYtl3UVPr37zV_3la5DuoNHlD7oEVuU2K5b48_hUZ3xrXF3ml4FKgP3ZgilQm7v7Au_QAsD9SoLqtMdlkPwTroV7mO9LwGktT9x0sxQwl-W34pExre6B0w06VkOimLmy1H5pbac_lKXQIgRkmUutU7T92doU3DQFHfjGSOYPqPn7cSvdj0JY8xNoLDX-pxD2NJ_jFkK6grkRuGHC8m0YbEOnzlybiLVCHIFeC7qklFYQ9veHe8VgJr81NxjT949-xm3n_vzK07NoVvr9W5V_Xg5nBvMmsctDOOd_WUln_RLsZU_oWkk72Af8h138IRkY71ky3H_579Vqis64F8zRE6Y_xScx0pOhoQh7T-_29a8wTboJp_8du8SvcMXvKQO3Kx5ebd22ApNud1niebensLq-dAve1eMDvSCb&isca=1",
                "https://00f74ba44b67d8fe117848162878e84690164f9859-apidata.googleusercontent.com/download/storage/v1/b/androidtvplus/o/y2meta.com-LOKI%20Tr%C3%A1iler%20Espa%C3%B1ol%20Latino%20DOBLADO%20(2021)%20Marvel-(480p).mp4?jk=AFshE3Vd5jZA5DWgESM_rXVa9RIUVpBjtwmV0gzas9z5sw2oICPIg6TZyIEzTBi_pi9U2a89usoCqzb5tuj-1b6xYpxcl7TPQS_7daMCV0pMYPXrgUpzMRR7kX0Xg1Wv1xI6ZctU78JyV72EADisKZ0o-SwDUlcw3rXDT0WupGuiMS96COVDE9xeZXNRKNHst4O46If5L1QyTG-hWCA7lba36q3MYvuaitQoOlfVU4WvvOdnNQn58Tahe9uwhbEnHRNjRju9QEhJHAUvSafiJ6qLc34FEkVJdYB12iLmiQ7nsYk6HjfNfElEjwznMLTi2WADctdFsfwGgM5kRVb5kh7faqaLvhANB5tNGrQx7ebZmltyU02Ln9dsFk8fgSTPq-3ocP3AUwm5hNsc9AYmIAHb0pnb4eujnYDLuGyGdqQ2wkmDW5Mtyycg6X978DdLv9aSuweHhwKTK2SZNa74DgEebZxV7p01ICS6UVuB-Yl4nAdytFPymYoENm1F_NfhRVPzRp6mb-h2W6vnP0YNi6aLrQJ_sIz5aY7rkw8z6e7_F41ShpGdXrnFGnIPyKqlGAYRfUw0ew298tGdgwtqlfnCMuv-WGp5901D5ulJkfBDLNX5UnM8lDuL0DZHMHHRRy-PqOCKDtDCHLknvWrnOlvhxzNmWRc6wApykAnynv0MzQp63VOdB_-z4kG5l1Tu_qHlRVdnuTxbGHd2ZMUoMLXqSKQqVbaz7G89MA9QgOe2rB0M0lQ5hhWSZS75qJtfY5xoIs-Sfgm3OxR6VGHAcxw1NmaNGVJX6gZhtdmpDRv2uwHYIoKuK5GQORFyGiOcnhsQdd0MH-xgwFCptPre2436uhbHm7JUPRWRF-tAYS0KoPa6hPLJv6Wz8OiyGRjaGswR6j3-jOQscgsAfM4teSXftT_p3N8Ruli1l7glhryFfOjbtUuLhjbdI0HsNXJb4TsDWp3Eq7sxybHyV12ozrika3VkU6ZmrGFlDo1stLzWrmne44xMzE6serpsbrS6EDphsOf2yjffvz9IFfo8y0bS2mmauxczHWd9bAljl0yHFB55TA&isca=1",
                "https://00f74ba44b98de2847ed493f71441876122dc34aaa-apidata.googleusercontent.com/download/storage/v1/b/androidtvplus/o/y2meta.com-WANDAVISION%20Tr%C3%A1iler%20Espa%C3%B1ol%20(2020)-(480p).mp4?jk=AFshE3UuLNOZFN2MfJnBVKZCv2C-8D6zrndV7tWgzPFYXXMRTn0yV0j5im9No7YUc6G7m2ya1U6QsYmgqbNbcU8LORuYo9pYBqc763o3hre1DmTesPS2ZnLWorDbU8FLwsOxEGNKE4HY7nYzFjnCo8d7my-BD030ieESb0E_xYqs4dW9-WBUnga7E5a4Nr8Bp2a5YGHJ6QpLFR0-GqwDGQTX1W0m-JYdFreBJ6xwf8AvjP0rp37_qt929x1IbIJlXHMsX__YRKPJM3NbjW0ABQbV6q1ETIEaCd-lpV-2fTfFwB8Jx2CuFq0mxhPhuuPxE3CJhBarHPV5DICebqfJOUi0YjXOMWgm9_G4CyqM8cTXGdU8QaV4u77UMOr5D-4Qe8BtOGA0DzBrsdvxB7dUqO00pd41gJE6w9kNqDjpxs--uSBy4UqmuFhFUYeLy3ISI8thxn4_U4YhNmj1EpUXyydpfhmytfkwfOCI8f2TV6hTLcG6sC90HYvAEaK4MGGoUGpWwtx1S-AELBus5B9po0joFxBgnw4eJLuGRcKB0S5PIbuwUL7eEbpOQAaBU_sPhBUkh3YJQ_TowNOvsahaKVeundBxfomxCFFMMQrSS5_zUJfM56wii_LjWVMgB-n-IHVHbBKZuPq6xs9B3K52yQaVu0kTxqaYQu8RcAOTij5Rilg2bp8fb89gvgnRBF8Jmot_K9Kd-qV61JVGrhVRyJ4k8LjJs4AK5HvK-Lh0WlKdI09EW_6PccL7DvZIdxRcwjVkNKGqy2c3ZSeYFayz3JktE2Ux58OU1EwOHMZ6xNH675g9v2sh-MeEmAa55QxsjxvG2wKNNuDsSA40KJTo26QThbOI2JPkArGbrlaBmf4E5Y-1BA4ddEnGFq2yRIb56XxsJlb84uSrS33LObRRmcf5qEESXnF0ReFT5gvjTp5BeTEc3eryvcdEXXJLMVc_L3nU958iZBqr3eXJCrkr8OTLigOQNB5CUNRgBoj7JhmoQ9kUIvi4PvAdQM2vcvdAYWDz6CVgyVGl8gvUmDN10g&isca=1",
                "https://00f74ba44b7db27689859d8588de6c81a37b14eff8-apidata.googleusercontent.com/download/storage/v1/b/androidtvplus/o/y2meta.com-What%20If..._%20(2021)%20Marvel%20Serie%20Tr%C3%A1iler%20Oficial%20Espa%C3%B1ol%20Latino-(480p).mp4?jk=AFshE3VcnlWxMKsuQ1R0DfWObUlybmCh00nLRkecCxoEfBBylgAqiNGZxnkLTOM38BO5F1PwOwjf0s_lkL16RWxQfQ4ZmPXoNVO1A88LflZAZEg7aspZqINcI9tnrkD9EmcyzzWWbroTzozu9X68PTsYFBL4Ybvog2NY5JIkzbNCPazKN9LK6n-takHVvSDuPsqGs0xkR6d-gx_4HA1nEf_w5_bNSb3T9ozA73HxozlVifH8q8q8FOo1jS47VVCbAS-OmanU-3VL21VokbKggwhftnTPPsUc4s2ca7Qly_uZByPxXzIY6mz2m6YWX6XHkBQzmJJaNLCroPAl4659TotfcHYLav1w0D5EBxOL-9_ytaZY0e5NiHWB3BJLYnFwf5xqUcEUlYkFr7g5cnumNIksxAStSZ-pyeRPS7Uq9ccqaLUYDFFbrag6mt5Jb2OZofUGSqXy-Vp1wxeXfZWtWFDp2SmT_FSrVkOQq6gozwUf23kGbWjdk0J_xAEVO7XnWAppFIfhgfUd_s6oLTOp2KkNG8kLbOrfFzl8z7_pFTW1cdHBJG_32hIb7WBqsLib52l0yd-6ZNvSOzHiNPGwx2XXNoVgLYJbpqazPIqVzixFY7cvLxUtFsOx8X6P-T0kebmK4Kiv2QLgjcGq6zzgs1WnC7I1B1PsZUsRuvCfTIEsU84yBEaqLn7VFhLY8WOlWAinPMx-dj93BjWpBlg1xwipuBwa8JrN62k13VeGbQTwVaVtoWX6UMm2GthkwIEHnV-UY_AkyT79dm_KAhckucGKGvGYbm66T42dJCKyqJ55S3VHc34lNZHFJiASkqyJqqL4JbcyHFf-OibCmwY3Ia0YubkOnj1Xr0pugWT9qzPyFHTCMFt-8CBdkU9tr13VwAjv85i7uMI43v0qJcfRrRhs_LaYDqE2RQsaXnYap_gkDe80f-_OW5GMtyfTXSE7WZEme7bnSulxcQwSwbuZqjUyV-eTKH_fybeoMD6WU_419KOlyzYRS98MU_mJBdJxo0y7lS9lL0ePbgNqELgYoyWLM_J7u6IB2HwpRen0auneoXVm8YaIrQL-pJOvltTMWKmGjkJ9&isca=1",
                "https://00f74ba44b8f11833fa3552853c8ab869fe0e3a8ec-apidata.googleusercontent.com/download/storage/v1/b/androidtvplus/o/y2meta.com-OJO%20DE%20HALC%C3%93N%20Tr%C3%A1iler%20Espa%C3%B1ol%20(2021)-(480p).mp4?jk=AFshE3VqoTc2cUeo53zAG7smhcmhgYIu6Ewb_nbnTRGUzE1ikqyZTdvhthmDacfmOsf1G-oIko18hP3xnIdQLdRggcUV7Qk9FOg4gr6dquJrqC99xmorRSTZoxAZii5gBaOI8L4ZDwpj2S2Ehk1A9R1AoyNnUoXGw1abt8T4ZyykHnKXtb8KnGZe7iGLrj5qHbiWgu6hRlaqkJU-Jph_hMz5lDK64RaNnjltmgIKHaMrnXlSmPgG7mo6D0_SXzNNF-LXybETZI0iMM8L6iwukvG8HnhHU1GuyrfuSuXoXmXPlR9g_qUKyDSAarSOJNm6xps3gDDuzgPmEWRHTjb8rrsElLdXXrx0tt8zDy6gt8OUOjFFf0qtSeEX8tZMgfl29LkZ5mmyr4e1Gb5edf8usVipz7vKS5JIIv_s_BsTHZTfkUNrT6GUSpglXm0ttyhD67FmOGxCG8jpEKAezESZGh6ft-dmwfa6-sqsrKOHjutc-R_FjVCsJcFMX9Rcg9SmQ9rBPwzvvHXVBG57eCA788BOIwYvrBu4l0000in5znO8J31BNRbUJVXq3cDbkk4XXNo7TRcs5IxXUT-ELoFIT6QWzyyWl60UmrB6Ih3Av0-Zqho7vUtVPESvphzI-xZlwK2EA4_ipPpYVRSX-1BERjJI4j7f9NlhCZK9NVi1otucqldrYPl3FoPHxOnqWBzx0HJdZBmESMS4EZleV5vE5aW9EUJhE_gMOt9SRc2-jLozEIQ3dNT026juPhvFVLzQ3t7dPzhUqPaiMikOLcPPr9s5FOBAam-cNLbsNm0sLTNN6_4UqCCbpaQU5isIpTf9nqTHLyGFhvtzLld_Z7Tjq3FxCZd-7-kPfwNfyFTgxSDeHoXoyzSSNfOYiOVUC2A_SDqS_mu8XPXUVCMG6Pcn38WviE7fU4pYLOU771z60mRCRX7aAYw6WjcHR68PvspRP43ywOGlzebwAcPZkd6TK75XYvmt9N7jIl_TqcWaFXkjQiZ0-Jvo0gL2gMLZgkIvHz9_mafu4-5FQluCWmc9e5Eo6SIDaHsynkfp&isca=1"
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