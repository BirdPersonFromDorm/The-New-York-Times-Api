package com.example.servingwebcontent.Model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Docs {

    @JsonProperty("abstract")
    private String firstParagraph;

    @JsonProperty("lead_paragraph")
    private String leadParagraph;

    @JsonProperty("headline")
    private HeadLine headLine;

    @JsonProperty("multimedia")
    private ArrayList<Multimedia> multimedia;
}
