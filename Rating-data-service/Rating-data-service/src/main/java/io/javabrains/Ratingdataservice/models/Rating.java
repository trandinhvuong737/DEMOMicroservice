package io.javabrains.Ratingdataservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Rating {
    private String movieId;
    private int rating;


}
