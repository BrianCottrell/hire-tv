/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.briancottrell.hiretv;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            "Featured Companies",
            "Just For You",
            "Top Rated Companies in Los Angeles",
            "Top Rated for Women",
            "Recently Updated",
            "Top Rated for Diverse Employees",
            "Companies with the Least Candidates"
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
                "Comparably",
                "Facebook",
                "Google",
                "Microsoft",
                "Amazon",
                "LinkedIn"
        };

        String description[] = {
                "Making Work Transparent & Rewarding.",
                "Facebook's mission is to give people the power to share and make the world more open and connected. People use Facebook to stay connected with friends and family, to discover what's going on in the world, and to share and express what matters to them",
                "Organize the world's information and make it universally accessible and useful",
                "Microsoft, a software corporation that develops, manufactures, licenses, supports, and sells a range of software products and services.",
                "Amazon is guided by four principles: customer obsession rather than competitor focus, passion for invention, commitment to operational excellence, and long-term thinking. Customer reviews, 1-Click shopping, personalized recommendations, Prime, Fulfillment by Amazon, AWS, Kindle Direct Publishing, Kindle, Fire tablets, Fire TV, Amazon Echo, and Alexa are some of the products and services pioneered by Amazon.",
                "To connect the world's professionals to make them more productive and successful. When you join LinkedIn, you get access to people, jobs, news, updates, and insights that help you be great at what you do.",

        };
        String studio[] = {
                "B- (75/100)", "A+ (79/100)", "A+ (78/100)", "B+ (71/100)", "B+ (71/100)", "A (77/100)"
        };
        String videoUrl[] = {
                "https://www.youtube.com/embed/fUUM4lKHmlA",
                "https://www.youtube.com/embed/4mmuIHiwupk",
                "https://www.youtube.com/embed/oZ6URVPefKQ",
                "https://www.youtube.com/embed/ARA0AxrnHdM",
                "https://www.youtube.com/embed/6xGLQ_NY0QE",
                "https://www.youtube.com/embed/ZVlUwwgOfKw"
        };
        String bgImageUrl[] = {
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/2916/2916_profile_comparably.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/7642/7642_profile_facebook.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/23906/23906_profile_google.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/25042/25042_profile_microsoft.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/25287/25287_profile_amazon.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/25914/25914_profile_linkedin.png",
        };
        String cardImageUrl[] = {
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/2916/2916_logo_comparably.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/facebook-logo.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/google-logo.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/25042/25042_logo_microsoft.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/amazon-logo.jpg",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/linkedin-logo.png"
        };

        String match[] = {
                "98%",
                "55%",
                "89%",
                "74%",
                "82%",
                "52%"
        };


        String comparably[] = {
                "https://www.youtube.com/embed/ZR9Wg-KWJ8k",
                "https://www.youtube.com/embed/59Eeo4-7m30",
                "https://www.youtube.com/embed/hLd32Fb2uy8",
                "https://www.youtube.com/embed/VQ2sFiBFnxw",
                "https://www.youtube.com/embed/tXyT94Yw_Qs",
                "https://www.youtube.com/embed/tXyT94Yw_Qs"
        };

        int chart[] = {
                R.mipmap.r1c1,
                R.mipmap.r1c2,
                R.mipmap.r1c3,
                R.mipmap.r1c4,
                R.mipmap.r1c5,
                R.mipmap.r1c6,
        };


        for (int index = 0; index < title.length; ++index) {
            list.add(
                    buildMovieInfo(
                            "category",
                            title[index],
                            description[index],
                            studio[index],
                            videoUrl[index],
                            cardImageUrl[index],
                            bgImageUrl[index],
                            match[index],
                            comparably[index],
                            chart[index]
                    ));
        }

        return list;
    }

    public static List<Movie> setupMovies2() {
        list = new ArrayList<>();
        String title[] = {
                "PepsiCo",
                "Comparably",
                "Asana",
                "Salesforce",
                "Striim",
                "The Trade Desk, Inc."
        };
        String description[] = {
                "At PepsiCo we believe that business and society can thrive together. ",
                "Making Work Transparent & Rewarding.",
                "Help humanity thrive by enabling all teams to work together effortlessly.",
                "Salesforce, the Customer Success Platform, and world's #1 CRM empowers companies to connect with their customers in a whole new way.",
                "Striim is pronounced stream, with two i's for integration and intelligence. The company was founded in 2012 as WebAction, with a mission to help companies make data useful the instant it's born.",
                "The Trade Desk is the fastest-growing adtech platform for a reason – our people. We’re here because we believe we're building something special, and we're looking for good people to pitch in.",
        };
        String studio[] = {
                "B+ (71/100)", "B- (75/100)", "A+ (87/100)", "A+ (80/100)", "A+ (93/100)", "A- (80/100)"
        };
        String videoUrl[] = {
                "https://www.youtube.com/embed/nXjU9UEwV9w",
                "https://www.youtube.com/embed/15XDna94DF8",
                "https://www.youtube.com/embed/rk8nPWmXsRo",
                "https://www.youtube.com/embed/32C2cTkwGuM",
                "https://www.youtube.com/embed/UAB9wyKZGf8",
                "https://www.youtube.com/embed/gqNIIJfZA3E"
        };
        String bgImageUrl[] = {
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/33002/33002_profile_pepsico.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/2916/2916_profile_comparably.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/61336/61336_profile_asana.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/16050/16050_profile_salesforce.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/48446/48446_profile_striim.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/27794/27794_profile_the-trade-desk--inc-.png"
        };
        String cardImageUrl[] = {
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/33002/33002_logo_pepsico.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/2916/2916_logo_comparably.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/61336/logo.jpg",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/salesforce-logo.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/48446/logo.jpg",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/27794/27794_logo_the-trade-desk--inc-.png"
        };
        String match[] = {
                "85%",
                "98%",
                "74%",
                "85%",
                "78%",
                "81%"
        };
        String comparably[] = {
                "https://www.youtube.com/embed/59Eeo4-7m30",
                "https://www.youtube.com/embed/fUUM4lKHmlA",
                "https://www.youtube.com/embed/hLd32Fb2uy8",
                "https://www.youtube.com/embed/VQ2sFiBFnxw",
                "https://www.youtube.com/embed/tXyT94Yw_Qs",
                "https://www.youtube.com/embed/tXyT94Yw_Qs"
        };
        int chart[] = {
                R.mipmap.r2c2,
                R.mipmap.r1c1,
                R.mipmap.r2c3,
                R.mipmap.r2c4,
                R.mipmap.r2c5,
                R.mipmap.r2c6,
        };

        for (int index = 0; index < title.length; ++index) {
            list.add(
                    buildMovieInfo(
                            "category",
                            title[index],
                            description[index],
                            studio[index],
                            videoUrl[index],
                            cardImageUrl[index],
                            bgImageUrl[index],
                            match[index],
                            comparably[index],
                            chart[index]
                    ));
        }
        return list;
    }
    public static List<Movie> setupMovies3() {
        list = new ArrayList<>();
        String title[] = {
                "Leaf Group",
                "Criteria Corp",
                "The Walt Disney Company",
                "PeerStreet",
                "Forever 21",
                "The Cheesecake Factory"
        };
        // add more here
        String description[] = {
                "Our mission is to build platforms across our media and marketplace properties to enable communities of creators to reach passionate audiences in large and growing lifestyle categories, while also helping advertisers find innovative ways to engage with their customers.",
                "Criteria is a leading provider of web-based pre-employment testing services. Our mission is to make high-quality pre-employment testing solutions accessible to companies of all sizes.",
                "The mission of The Walt Disney Company is to be one of the world’s leading producers and providers of entertainment and information.",
                "We are a group of cross-industry experts who quit our day jobs to transform real estate finance in a way that creates a better deal for everyone.",
                "FOREVER 21 is the 5th largest specialty retailer in the United States. FOREVER 21 has seen some remarkable accomplishments over the past 30 years.",
                "We're known for our cheesecakes and fresh food, but it's our people that make us special. With over 250 menu items made fresh from scratch daily, our top-of-the-line chefs and superstar servers are the best at what they do because they're expected to deliver the best to our guests.",
        };
        String studio[] = {
                "A (82/100)", "B (68/100)", "B (69/100)", "A+ (91/100)", "B (69/100)", "B+ (71/100)"
        };
        String videoUrl[] = {
                "https://www.youtube.com/embed/6N1IfOhwvus",
                "https://www.youtube.com/embed/q3SkMWaeKjQ",
                "https://www.youtube.com/embed/f_PwPK_zKKU",
                "https://www.youtube.com/embed/LfufsQSEVyg",
                "https://www.youtube.com/embed/LfufsQSEVyg",
                "https://www.youtube.com/embed/Znv1Gpa5Zms"
        };
        String bgImageUrl[] = {
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/529460/26488_profile_demand-media.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/40060/bg.jpg",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/28423/28423_profile_the-walt-disney-company.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/74142/bg.jpg",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/121258/bg.jpg",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/309664/309664_profile_the-cheesecake-factory.png"
        };
        String cardImageUrl[] = {
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/529460/26488_logo_demand-media.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/40060/logo.jpg",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/28423/28423_logo_the-walt-disney-company.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/74142/logo.jpg",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/121258/logo.jpg",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/309664/logo.jpg"
        };
        String match[] = {
                "87%",
                "98%",
                "88%",
                "76%",
                "90%",
                "75%"
        };
        String comparably[] = {
                "https://www.youtube.com/embed/6N1IfOhwvus",
                "https://www.youtube.com/embed/MMfF2wUtSDU",
                "https://www.youtube.com/embed/NxRrfgdW0FA",
                "https://www.youtube.com/embed/LfufsQSEVyg",
                "https://www.youtube.com/embed/xO0_Mavr-kU",
                "https://www.youtube.com/embed/Znv1Gpa5Zms"
        };
        int chart[] = {
                R.mipmap.r3c1,
                R.mipmap.r3c2,
                R.mipmap.r3c3,
                R.mipmap.r3c4,
                R.mipmap.r3c5,
                R.mipmap.r3c6,
        };
        for (int index = 0; index < title.length; ++index) {
            list.add(
                    buildMovieInfo(
                            "category",
                            title[index],
                            description[index],
                            studio[index],
                            videoUrl[index],
                            cardImageUrl[index],
                            bgImageUrl[index],
                            match[index],
                            comparably[index],
                            chart[index]
                    ));
        }
        return list;
    }

    public static List<Movie> setupMovies4() {
        list = new ArrayList<>();
        String title[] = {
                "DuMont Project",
                "Parsons Corporation",
                "Penske Media Corporation",
                "Ytel",
                "PeerStreet",
                "HyreCar"
        };
        // add more here
        String description[] = {
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
        };
        String studio[] = {
                "A (85/100)", "A+ (97/100)", "B (68/100)", "A+ (92/100)", "B+ (73/100)", "A (86/100)"
        };
        String videoUrl[] = {
                " ",
                " ",
                " ",
                " ",
                " ",
                " "
        };
        String bgImageUrl[] = {
                "https://www.comparably.com/static/skins/comparably_light/mixins/companies/profile/header/img/bg.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/158175/bg.jpg",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/159091/bg.jpg",
                "https://www.comparably.com/static/skins/comparably_light/mixins/companies/profile/header/img/bg.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/74142/bg.jpg",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/130759/bg.jpg"
        };
        String cardImageUrl[] = {
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/421655/421655_logo_the-dumont-project.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/158175/logo.jpg",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/159091/logo.jpg",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/323913/323913_logo_ytel.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/74142/logo.jpg",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/130759/logo.jpg"
        };
        String match[] = {
                "73%",
                "91%",
                "78%",
                "94%",
                "68%",
                "73%"
        };
        String comparably[] = {
                "https://www.youtube.com/embed/6N1IfOhwvus",
                "https://www.youtube.com/embed/MMfF2wUtSDU",
                "https://www.youtube.com/embed/NxRrfgdW0FA",
                "https://www.youtube.com/embed/LfufsQSEVyg",
                "https://www.youtube.com/embed/xO0_Mavr-kU",
                "https://www.youtube.com/embed/Znv1Gpa5Zms"
        };
        int chart[] = {
                R.mipmap.r3c1,
                R.mipmap.r3c2,
                R.mipmap.r3c3,
                R.mipmap.r3c4,
                R.mipmap.r3c5,
                R.mipmap.r3c6,
        };
        for (int index = 0; index < title.length; ++index) {
            list.add(
                    buildMovieInfo(
                            "category",
                            title[index],
                            description[index],
                            studio[index],
                            videoUrl[index],
                            cardImageUrl[index],
                            bgImageUrl[index],
                            match[index],
                            comparably[index],
                            chart[index]
                    ));
        }
        return list;
    }

    private static Movie buildMovieInfo(String category, String title,
                                        String description, String studio, String videoUrl, String cardImageUrl,
                                        String backgroundImageUrl, String match, String comparably, int chart) {
        Movie movie = new Movie();
        movie.setId(count++);
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCategory(category);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(backgroundImageUrl);
        movie.setVideoUrl(videoUrl);
        movie.setMatch(match);
        movie.setComparably(comparably);
        movie.setChart(chart);
        return movie;
    }
}