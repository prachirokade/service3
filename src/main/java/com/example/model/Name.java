package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;

import javax.validation.constraints.NotNull;

/**
 * @author prokade
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Name {

    @NotNull
    String firstName;

    @NotNull
    String lastName;

}
