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
            "Peronalized",
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
                "Making Work Transparent & Rewarding.",
                "Making Work Transparent & Rewarding.",
                "Making Work Transparent & Rewarding.",
                "Making Work Transparent & Rewarding.",

        };
        String studio[] = {
                "B- (75/100)", "A+ (79/100)", "B+ (71/100)", "B+ (71/100)", "Studio Four", "B+ (71/100)"
        };
        String videoUrl[] = {
                "https://youtu.be/fUUM4lKHmlA",
                "https://www.youtube.com/watch?v=59Eeo4-7m30",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue.mp4",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole.mp4",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose.mp4",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose.mp4"
        };
        String bgImageUrl[] = {
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue/bg.jpg",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/25042/25042_profile_microsoft.png",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose/bg.jpg",
                "http://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose/bg.jpg",
        };
        String cardImageUrl[] = {
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/2916/2916_logo_comparably.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/facebook-logo.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/google-logo.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/25042/25042_logo_microsoft.png",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/amazon-logo.jpg",
                "https://s3-us-west-1.amazonaws.com/companies.comparably.com/linkedin-logo.png"
        };

        String companyUrl[] = {
                "https://www.comparably.com",
                "https://www.comparably.com/companies/facebook",
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
                            bgImageUrl[index]));
        }

        return list;
    }

    private static Movie buildMovieInfo(String category, String title,
                                        String description, String studio, String videoUrl, String cardImageUrl,
                                        String backgroundImageUrl) {
        Movie movie = new Movie();
        movie.setId(count++);
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCategory(category);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(backgroundImageUrl);
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}