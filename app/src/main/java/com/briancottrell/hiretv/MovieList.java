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
            "Peronalizeda",
            "All Companies",
            "Top Rated Companies by Metro",
            "Top Rated for Women",
            "Top Rated for Diverse Employees",
            "Recently Answered Q&A"
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
                "15XDna94DF8",
                "59Eeo4-7m30",
                "hLd32Fb2uy8",
                "VQ2sFiBFnxw",
                "tXyT94Yw_Qs",
                "tXyT94Yw_Qs"
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


        String percentage[] = {
                "CEORating A\nExecutiveTeam A-\nProfessionalDevelopment B+",
                "55%",
                "89%",
                "74%",
                "82%",
                "52%"
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
                            chart[index]
                    ));
        }

        return list;
    }

    private static Movie buildMovieInfo(String category, String title,
                                        String description, String studio, String videoUrl, String cardImageUrl,
                                        String backgroundImageUrl, String match, int chart) {
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
        movie.setChart(chart);
        return movie;
    }
}