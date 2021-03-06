package moe.anitrack.thirdparties.thirdparty.kitsu.objects.media;

import java.time.LocalDate;
import java.util.Map;

import org.immutables.value.Value.Immutable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import moe.anitrack.thirdparties.thirdparty.kitsu.objects.media.common.AgeRating;
import moe.anitrack.thirdparties.thirdparty.kitsu.objects.media.common.CreatedAndUpdated;
import moe.anitrack.thirdparties.thirdparty.kitsu.objects.media.common.MultipleSizeImageRef;
import moe.anitrack.thirdparties.thirdparty.kitsu.objects.media.common.ScreeningStatus;
import moe.anitrack.thirdparties.thirdparty.kitsu.objects.media.common.SubType;
import moe.anitrack.thirdparties.thirdparty.kitsu.objects.media.common.Titles;

@Immutable
@JsonSerialize(as = ImmutableAnime.class)
@JsonDeserialize(as = ImmutableAnime.class)
public interface Anime extends CreatedAndUpdated {

    String getSlug();

    String getSynopsis();

    Titles getTitles();

    String getCanonicalTitle();

    String[] getAbbreviatedTitles();

    String getAverageRating();

    Map<String, String> getRatingFrequencies();

    int getUserCount();

    int getFavoritesCount();

    LocalDate getStartDate();

    LocalDate getEndDate();

    int getPopularityRank();

    int getRatingRank();

    AgeRating getAgeRating();

    String getAgeRatingGuide();

    SubType getSubtype();

    @JsonProperty("status")
    ScreeningStatus getScreeningStatus();

    String getTba();

    MultipleSizeImageRef getPosterImage();

    MultipleSizeImageRef getCoverImage();

    int getEpisodeCount();

    @JsonProperty("episodeLength")
    int getEpisodeLengthMinutes();

    @JsonProperty("youtubeVideoId")
    String getYoutubeTrailerVideoId();

}
